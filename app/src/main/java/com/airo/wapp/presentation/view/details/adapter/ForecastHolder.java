package com.airo.wapp.presentation.view.details.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airo.wapp.R;
import com.airo.wapp.presentation.presenter.details.adapter.ForecastHolderPresenter;
import com.airo.wapp.presentation.presenter.details.adapter.ForecastHolderPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ForecastHolder extends RecyclerView.ViewHolder implements ForecastHolderView {

    @BindView(R.id.item_forecast_date_text_view) TextView dateTextView;
    @BindView(R.id.item_forecast_average_temp_text_view) TextView averageTempTextView;
    @BindView(R.id.item_forecast_text_condition_text_view) TextView textConditionTextView;
    @BindView(R.id.item_forecast_icon_condition_image_view) ImageView iconConditionImageView;

    private ForecastHolderPresenter presenter;

    public ForecastHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        presenter = new ForecastHolderPresenterImpl(this);
    }

    @Override
    public void setDate(String date) {
        dateTextView.setText(date);
    }

    @Override
    public void setAverageTemp(String averageTemp) {
        averageTempTextView.setText(averageTemp);
    }

    @Override
    public void setTextCondition(String textCondition) {
        textConditionTextView.setText(textCondition);
    }

    @Override
    public void setIconCondition(String iconConditionUrl) {
        // TODO: 22.05.2018 Загружаем с помощью Picasso
    }

    public ForecastHolderPresenter getPresenter() {
        return presenter;
    }
}
