package com.airo.wapp.presentation.view.list.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.airo.wapp.R;
import com.airo.wapp.presentation.presenter.list.adapter.LocationListAdapterPresenter;
import com.airo.wapp.presentation.presenter.list.adapter.LocationListAdapterPresenterImpl;

public class LocationListAdapter extends RecyclerView.Adapter<LocationListHolder> implements
        LocationListAdapterView {

    private LocationListAdapterPresenter presenter;

    public LocationListAdapter() {
        presenter = new LocationListAdapterPresenterImpl(this);
    }

    @NonNull
    @Override
    public LocationListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LocationListHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_location_list, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull LocationListHolder holder, int position) {
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

    public LocationListAdapterPresenter getPresenter() {
        return presenter;
    }
}
