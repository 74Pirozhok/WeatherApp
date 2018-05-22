package com.airo.wapp.presentation.presenter.search.adapter;

import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.view.search.adapter.SearchHolderView;

public class SearchHolderPresenterImpl implements SearchHolderPresenter {

    private SearchHolderView view;
    private int position;
    private SearchAdapterPresenter adapterPresenter;

    public SearchHolderPresenterImpl(SearchHolderView view) {
        this.view = view;
    }

    @Override
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public void setAdapterPresenter(SearchAdapterPresenter adapterPresenter) {
        this.adapterPresenter = adapterPresenter;
    }

    @Override
    public void onBind() {
        if (position >= 0 && adapterPresenter != null) {
            GeonameModel geonameModel = adapterPresenter.getItemAt(position);
            view.setName(geonameModel.getName());
            view.setRegion(geonameModel.getName());
            view.setCountry(geonameModel.getName());
            view.setFeatureCodeName(geonameModel.getName());
        }
    }
}
