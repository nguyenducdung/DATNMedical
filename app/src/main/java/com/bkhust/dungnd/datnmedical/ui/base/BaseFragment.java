package com.bkhust.dungnd.datnmedical.ui.base;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.ui.main.MainActivity;
import com.bkhust.dungnd.datnmedical.ui.main.MainViewModel;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;

import java.util.Objects;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public abstract class BaseFragment<Binding extends ViewDataBinding, V extends ViewModel> extends Fragment {
    protected Binding binding;
    protected V viewModel;
    protected MainViewModel mainViewModel;
    protected NavController navController;

    protected DatabaseReference reference;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayout(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        navController = Navigation.findNavController(Objects.requireNonNull(getActivity()), R.id.navHostFragment);
        mainViewModel = ViewModelProviders.of(getActivity()).get(MainViewModel.class);
        viewModel = ViewModelProviders.of(getActivity()).get(getModelClass());

    }

    protected abstract Class<V> getModelClass();

    protected abstract int getLayout();

    protected void setToolBarTitle(String title) {
        if (getActivity() != null) {
            ((MainActivity) getActivity()).getToolBar().setTitle(title);
        }
    }
}
