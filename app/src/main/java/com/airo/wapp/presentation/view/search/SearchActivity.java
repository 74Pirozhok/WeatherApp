package com.airo.wapp.presentation.view.search;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.airo.wapp.R;
import com.airo.wapp.presentation.view.base.ContainerActivity;

public class SearchActivity extends ContainerActivity {

    @Override
    protected Fragment createFragment() {
        return SearchFragment.getNewInstance();
    }
}
