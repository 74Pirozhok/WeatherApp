package com.airo.wapp.presentation.presenter.details.adapter;

public interface ForecastHolderPresenter {
    void setPosition(int position);
    void setAdapterPresenter(ForecastAdapterPresenter adapterPresenter);
    void onBind();
}
