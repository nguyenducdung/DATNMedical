package com.bkhust.dungnd.datnmedical.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentHomeBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> implements View.OnClickListener {


    @Override
    protected Class<HomeViewModel> getModelClass() {
        return HomeViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        binding.fragmentDisease.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fragmentDisease:
                navController.navigate(R.id.action_homeFragment_to_diseasFragment);
                break;
            default:
                break;
        }
    }
}
