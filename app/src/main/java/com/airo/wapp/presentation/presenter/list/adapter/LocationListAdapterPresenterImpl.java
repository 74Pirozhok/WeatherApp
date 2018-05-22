package com.airo.wapp.presentation.presenter.list.adapter;

import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.view.list.adapter.LocationListAdapterView;

import java.util.ArrayList;
import java.util.List;

public class LocationListAdapterPresenterImpl implements LocationListAdapterPresenter {

    private LocationListAdapterView view;
    private List<GeonameModel> locationList;

    public LocationListAdapterPresenterImpl(LocationListAdapterView view) {
        this.view = view;
        locationList = new ArrayList<>();
    }

    @Override
    public void onUpdateData(List<GeonameModel> locationList) {
        // FIXME: 22.05.2018 Почему не просто присваивание???
        this.locationList.clear();
        this.locationList.addAll(locationList);
    }

    @Override
    public GeonameModel getItemAt(int position) {
        return locationList.get(position);
    }

    @Override
    public int getItemCount() {
        return locationList.size();
    }
}
