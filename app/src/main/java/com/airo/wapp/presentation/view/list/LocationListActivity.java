package com.airo.wapp.presentation.view.list;

import android.support.v4.app.Fragment;

import com.airo.wapp.presentation.view.base.ContainerActivity;

public class LocationListActivity extends ContainerActivity {
    @Override
    protected Fragment createFragment() {
        return LocationListFragment.getNewInstance();
    }
}
