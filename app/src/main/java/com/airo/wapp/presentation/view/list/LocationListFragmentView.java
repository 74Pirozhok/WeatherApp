package com.airo.wapp.presentation.view.list;

import com.airo.wapp.domain.GeonameModel;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

import java.util.List;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface LocationListFragmentView extends MvpView {
    void updateRecyclerView(List<GeonameModel> locationList);
}
