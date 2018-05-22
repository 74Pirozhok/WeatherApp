package com.airo.wapp.presentation.view.details.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.airo.wapp.R;
import com.airo.wapp.presentation.presenter.details.adapter.ForecastAdapterPresenter;
import com.airo.wapp.presentation.presenter.details.adapter.ForecastAdapterPresenterImpl;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastHolder> implements ForecastAdapterView{

    private ForecastAdapterPresenter presenter;

    public ForecastAdapter() {
        presenter = new ForecastAdapterPresenterImpl(this);
    }

    @NonNull
    @Override
    public ForecastHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ForecastHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_forecast_list, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastHolder holder, int position) {
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

    public ForecastAdapterPresenter getPresenter() {
        return presenter;
    }
}
