package com.airo.wapp.presentation.presenter.details.adapter;

import com.airo.wapp.domain.GeonameModel;

import java.util.List;

public interface ForecastAdapterPresenter {
    void onUpdateData(List<GeonameModel> forecastList);
    GeonameModel getItemAt(int position);
    int getItemCount();
}
