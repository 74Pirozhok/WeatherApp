package com.airo.wapp.presentation.presenter.list.adapter;

import com.airo.wapp.domain.GeonameModel;

import java.util.List;

public interface LocationListAdapterPresenter {
    void onUpdateData(List<GeonameModel> locationList);
    GeonameModel getItemAt(int position);
    int getItemCount();
}
