package com.airo.wapp.presentation.view.list.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airo.wapp.R;
import com.airo.wapp.presentation.presenter.list.adapter.LocationListHolderPresenter;
import com.airo.wapp.presentation.presenter.list.adapter.LocationListHolderPresenterImpl;

import butterknife.BindView;

public class LocationListHolder extends RecyclerView.ViewHolder implements LocationListHolderView {

    @BindView(R.id.item_location_name_text_view) TextView nameTextView;
    @BindView(R.id.item_location_temp_text_view) TextView tempTextView;
    @BindView(R.id.item_location_text_condition_text_view) TextView textConditionTextView;
    @BindView(R.id.item_location_icon_condition_image_view) ImageView iconConditionImageView;

    private LocationListHolderPresenter presenter;

    public LocationListHolder(View itemView) {
        super(itemView);
        presenter = new LocationListHolderPresenterImpl(this);
    }

    @Override
    public void setName(String name) {
        nameTextView.setText(name);
    }

    @Override
    public void setTemp(String temp) {
        tempTextView.setText(temp);
    }

    @Override
    public void setTextCondition(String textCondition) {
        textConditionTextView.setText(textCondition);
    }

    @Override
    public void setIconCondition(String iconConditionUrl) {
        // TODO: 22.05.2018 Используем Picasso для загрузки изображения
    }

    public LocationListHolderPresenter getPresenter() {
        return presenter;
    }
}
