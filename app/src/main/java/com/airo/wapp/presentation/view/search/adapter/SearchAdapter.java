package com.airo.wapp.presentation.view.search.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.airo.wapp.R;
import com.airo.wapp.presentation.presenter.search.adapter.SearchAdapterPresenter;
import com.airo.wapp.presentation.presenter.search.adapter.SearchAdapterPresenterImpl;

public class SearchAdapter extends RecyclerView.Adapter<SearchHolder> implements SearchAdapterView {

    private SearchAdapterPresenter presenter;

    public SearchAdapter() {
        presenter = new SearchAdapterPresenterImpl(this);
    }

    @NonNull
    @Override
    public SearchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_search_list, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SearchHolder holder, int position) {
        holder.getPresenter().setPosition(position);
        holder.getPresenter().setAdapterPresenter(presenter);
        holder.getPresenter().onBind();
    }

    @Override
    public int getItemCount() {
        return presenter.getItemCount();
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    public SearchAdapterPresenter getPresenter() {
        return presenter;
    }
}
