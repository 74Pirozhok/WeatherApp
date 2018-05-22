package com.airo.wapp.presentation.presenter.search.adapter;

public interface SearchHolderPresenter {
    void setPosition(int position);
    void setAdapterPresenter(SearchAdapterPresenter adapterPresenter);
    void onBind();
}
