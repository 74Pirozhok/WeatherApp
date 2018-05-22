package com.airo.wapp.presentation.presenter.search.adapter;

import com.airo.wapp.domain.GeonameModel;

import java.util.List;

public interface SearchAdapterPresenter {
    void onUpdateData(List<GeonameModel> resultList);
    GeonameModel getItemAt(int position);
    int getItemCount();
}
