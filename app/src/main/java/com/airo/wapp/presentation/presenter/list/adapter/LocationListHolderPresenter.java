package com.airo.wapp.presentation.presenter.list.adapter;

public interface LocationListHolderPresenter {
    void setPosition(int position);
    void setAdapterPresenter(LocationListAdapterPresenter adapterPresenter);
    void onBind();
}
