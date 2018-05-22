package com.airo.wapp.presentation.presenter.list.adapter;

import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.view.list.adapter.LocationListHolderView;

public class LocationListHolderPresenterImpl implements LocationListHolderPresenter {

    private LocationListHolderView view;
    private int position;
    private LocationListAdapterPresenter adapterPresenter;

    public LocationListHolderPresenterImpl(LocationListHolderView view) {
        this.view = view;
    }

    @Override
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public void setAdapterPresenter(LocationListAdapterPresenter adapterPresenter) {
        this.adapterPresenter = adapterPresenter;
    }

    @Override
    public void onBind() {
        if (position >= 0 && adapterPresenter != null) {
            GeonameModel geonameModel = adapterPresenter.getItemAt(position);
            view.setName(geonameModel.getName());
            view.setTemp(geonameModel.getName());
            view.setTextCondition(geonameModel.getName());
            view.setIconCondition(geonameModel.getName());
        }
    }
}
