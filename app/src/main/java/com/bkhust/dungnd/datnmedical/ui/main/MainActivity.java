package com.bkhust.dungnd.datnmedical.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.ActivityMainBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding> {
    private MainViewModel mainViewModel;

    @Override
    protected void inits() {

    }

    @Override
    protected int getLayoutMain() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    }

    public Toolbar getToolBar() {
        return binding.toolbar;
    }
}
