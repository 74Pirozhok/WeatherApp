package com.airo.wapp.presentation.presenter.search.adapter;

import com.airo.wapp.domain.GeonameModel;
import com.airo.wapp.presentation.view.search.adapter.SearchAdapterView;

import java.util.ArrayList;
import java.util.List;

public class SearchAdapterPresenterImpl implements SearchAdapterPresenter {

    private SearchAdapterView view;
    private List<GeonameModel> geonameModelList;

    public SearchAdapterPresenterImpl(SearchAdapterView view) {
        this.view = view;
        geonameModelList = new ArrayList<>();
    }

    @Override
    public void onUpdateData(List<GeonameModel> resultList) {
        geonameModelList.addAll(resultList);
        view.notifyAdapter();
    }

    @Override
    public GeonameModel getItemAt(int position) {
        return geonameModelList.get(position);
    }

    @Override
    public int getItemCount() {
        return geonameModelList.size();
    }
}
