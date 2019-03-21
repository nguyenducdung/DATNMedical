package com.bkhust.dungnd.datnmedical.ui.base;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;

public abstract class BaseActivity<T extends ViewDataBinding, V extends ViewModel> extends AppCompatActivity {
    protected T binding;
    protected V mainViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getLayoutMain());
        mainViewModel = ViewModelProviders.of(this).get(getModelClass());
        FirebaseApp.initializeApp(this);
        inits();
    }

    protected abstract Class<V> getModelClass();

    protected abstract void inits();
    protected abstract int getLayoutMain();
}
