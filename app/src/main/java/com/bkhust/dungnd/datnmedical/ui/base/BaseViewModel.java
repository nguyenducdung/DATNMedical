package com.bkhust.dungnd.datnmedical.ui.base;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableBoolean;

public abstract class BaseViewModel extends ViewModel {
    protected ObservableBoolean isLoading = new ObservableBoolean(false);

    public boolean isLoading(){
        return isLoading.get();
    }
}
