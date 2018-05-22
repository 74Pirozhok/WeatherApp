package com.airo.wapp.presentation.view.search.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.airo.wapp.R;
import com.airo.wapp.presentation.presenter.search.adapter.SearchHolderPresenter;
import com.airo.wapp.presentation.presenter.search.adapter.SearchHolderPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchHolder extends RecyclerView.ViewHolder implements SearchHolderView {

    @BindView(R.id.item_search_name_text_view) TextView nameTextView;
    @BindView(R.id.item_search_region_text_view) TextView regionTextView;
    @BindView(R.id.item_search_country_text_view) TextView countryTextView;
    @BindView(R.id.item_search_feature_code_name_text_view) TextView featureCodeNameTextView;

    private SearchHolderPresenter presenter;

    public SearchHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        presenter = new SearchHolderPresenterImpl(this);
    }

    @Override
    public void setName(String name) {
        nameTextView.setText(name);
    }

    @Override
    public void setRegion(String region) {
        regionTextView.setText(region);
    }

    @Override
    public void setCountry(String country) {
        countryTextView.setText(country);
    }

    @Override
    public void setFeatureCodeName(String featureCodeName) {
        featureCodeNameTextView.setText(featureCodeName);
    }

    public SearchHolderPresenter getPresenter() {
        return presenter;
    }
}
