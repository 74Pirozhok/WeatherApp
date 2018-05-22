package com.airo.wapp.presentation.presenter.details.adapter;

import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.view.details.adapter.ForecastAdapterView;

import java.util.ArrayList;
import java.util.List;

public class ForecastAdapterPresenterImpl implements ForecastAdapterPresenter {

    private ForecastAdapterView view;
    private List<GeonameModel> forecastList;

    public ForecastAdapterPresenterImpl(ForecastAdapterView view) {
        this.view = view;
        forecastList = new ArrayList<>();
    }

    @Override
    public void onUpdateData(List<GeonameModel> forecastList) {
        this.forecastList.clear();
        this.forecastList.addAll(forecastList);
        view.notifyAdapter();
    }

    @Override
    public GeonameModel getItemAt(int position) {
        return forecastList.get(position);
    }

    @Override
    public int getItemCount() {
        return forecastList.size();
    }
}
