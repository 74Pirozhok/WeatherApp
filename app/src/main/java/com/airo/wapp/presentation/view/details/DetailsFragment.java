package com.airo.wapp.presentation.view.details;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airo.wapp.R;
import com.airo.wapp.presentation.presenter.details.DetailsPresenter;
import com.airo.wapp.presentation.view.details.adapter.ForecastAdapter;
import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class DetailsFragment extends MvpAppCompatFragment implements DetailsFragmentView {

    @InjectPresenter DetailsPresenter detailsPresenter;
    @BindView(R.id.details_name_text_view) TextView nameTextView;
    @BindView(R.id.details_region_text_view) TextView regionTextView;
    @BindView(R.id.details_country_text_view) TextView countryTextView;
    @BindView(R.id.details_temp_text_view) TextView tempTextView;
    @BindView(R.id.details_text_condition_text_view) TextView textConditionTextView;
    @BindView(R.id.details_humidity_text_view) TextView humidityTextView;
    @BindView(R.id.details_pressure_text_view) TextView pressureTextView;
    @BindView(R.id.details_wind_text_view) TextView windTextView;
    @BindView(R.id.details_visibility_text_view) TextView visibilityTextView;
    @BindView(R.id.details_icon_condition_image_view) ImageView iconConditionImageView;
    @BindView(R.id.forecast_recycler_view) RecyclerView forecastRecyclerView;

    private Unbinder unbinder;
    private ForecastAdapter adapter;

    public static DetailsFragment getNewInstance() {
        return new DetailsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_details, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        adapter = new ForecastAdapter();
        forecastRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        forecastRecyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
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
    public void setTemp(String temp) {
        tempTextView.setText(temp);
    }

    @Override
    public void setIconCondition(String iconConditionUrl) {
        // TODO: 22.05.2018 Picasso
    }

    @Override
    public void setTextCondition(String textCondition) {
        textConditionTextView.setText(textCondition);
    }

    @Override
    public void setHumidity(String humidity) {
        humidityTextView.setText(humidity);
    }

    @Override
    public void setPressure(String pressure) {
        pressureTextView.setText(pressure);
    }

    @Override
    public void setWind(String wind) {
        windTextView.setText(wind);
    }

    @Override
    public void setVisibility(String visibility) {
        visibilityTextView.setText(visibility);
    }
}
