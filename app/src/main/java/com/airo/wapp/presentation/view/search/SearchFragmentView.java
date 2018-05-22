package com.airo.wapp.presentation.view.search;

import com.airo.wapp.domain.GeonameModel;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

import java.util.List;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface SearchFragmentView extends MvpView {
    void updateRecyclerView(List<GeonameModel> searchResultList);
}
