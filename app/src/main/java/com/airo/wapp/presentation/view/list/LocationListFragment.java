package com.airo.wapp.presentation.view.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airo.wapp.R;
import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.presenter.list.LocationListPresenter;
import com.airo.wapp.presentation.view.list.adapter.LocationListAdapter;
import com.airo.wapp.presentation.view.search.SearchActivity;
import com.airo.wapp.presentation.view.search.adapter.SearchAdapter;
import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class LocationListFragment extends MvpAppCompatFragment implements LocationListFragmentView {

    @InjectPresenter LocationListPresenter presenter;
    @BindView(R.id.location_recycler_view) RecyclerView locationRecyclerView;
    @BindView(R.id.location_search_fab) FloatingActionButton locationSearchFab;

    private Unbinder unbinder;
    private LocationListAdapter adapter;

    public static LocationListFragment getNewInstance() {
        return new LocationListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_location_list, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        adapter = new LocationListAdapter();
        locationRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        locationRecyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.location_search_fab)
    public void onClick() {
        Intent intent = new Intent(getActivity(), SearchActivity.class);
        startActivity(intent);
    }


    @Override
    public void updateRecyclerView(List<GeonameModel> locationList) {
        adapter.getPresenter().onUpdateData(locationList);
    }
}
