package com.airo.wapp.presentation.presenter.details.adapter;

import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.view.details.adapter.ForecastHolderView;

public class ForecastHolderPresenterImpl implements ForecastHolderPresenter {

    private ForecastHolderView view;
    private int position;
    private ForecastAdapterPresenter adapterPresenter;

    public ForecastHolderPresenterImpl(ForecastHolderView view) {
        this.view = view;
    }

    @Override
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public void setAdapterPresenter(ForecastAdapterPresenter adapterPresenter) {
        this.adapterPresenter = adapterPresenter;
    }

    @Override
    public void onBind() {
        if (position >= 0 && adapterPresenter != null) {
            GeonameModel geonameModel = adapterPresenter.getItemAt(position);
            view.setDate(geonameModel.getName());
            view.setAverageTemp(geonameModel.getName());
            view.setTextCondition(geonameModel.getName());
            view.setIconCondition(geonameModel.getName());
        }
    }
}
