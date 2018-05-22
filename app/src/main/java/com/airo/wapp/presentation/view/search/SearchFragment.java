package com.airo.wapp.presentation.view.search;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airo.wapp.R;
import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.presenter.search.SearchPresenter;
import com.airo.wapp.presentation.view.search.adapter.SearchAdapter;
import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class SearchFragment extends MvpAppCompatFragment implements SearchFragmentView {

    @InjectPresenter SearchPresenter presenter;
    @BindView(R.id.search_result_recycler_view) RecyclerView searchResultRecyclerView;

    private Unbinder unbinder;
    private SearchAdapter adapter;

    public static SearchFragment getNewInstance() {
        return new SearchFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        adapter = new SearchAdapter();
        searchResultRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        searchResultRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        searchResultRecyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void updateRecyclerView(List<GeonameModel> searchResultList) {
        adapter.getPresenter().onUpdateData(searchResultList);
    }
}
