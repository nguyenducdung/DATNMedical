package com.bkhust.dungnd.datnmedical.ui.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {
    protected T binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getLayoutMain());
        FirebaseApp.initializeApp(this);
        inits();
    }

    protected abstract void inits();
    protected abstract int getLayoutMain();
}
