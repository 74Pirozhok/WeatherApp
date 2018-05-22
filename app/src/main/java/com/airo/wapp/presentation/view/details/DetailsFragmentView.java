package com.airo.wapp.presentation.view.details;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface DetailsFragmentView extends MvpView {
    void setName(String name);
    void setRegion(String region);
    void setCountry(String country);
    void setTemp(String temp);
    void setIconCondition(String iconConditionUrl);
    void setTextCondition(String textCondition);
    void setHumidity(String humidity);
    void setPressure(String pressure);
    void setWind(String wind);
    void setVisibility(String visibility);
}
