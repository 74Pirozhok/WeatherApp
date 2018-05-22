package com.airo.wapp.presentation.view.details;

import android.support.v4.app.Fragment;

import com.airo.wapp.presentation.view.base.ContainerActivity;

public class DetailsActivity extends ContainerActivity {
    @Override
    protected Fragment createFragment() {
        return DetailsFragment.getNewInstance();
    }
}
