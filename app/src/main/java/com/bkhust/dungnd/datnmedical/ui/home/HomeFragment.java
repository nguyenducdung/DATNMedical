package com.bkhust.dungnd.datnmedical.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentHomeBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

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
        if (getActivity() != null) {
            getActivity().setTitle(R.string.app_name);
            hideButtonBack();
            showToolbar();
        }
        binding.ccDiseas.setOnClickListener(this);
        binding.ccChineseMedicine.setOnClickListener(this);
        binding.ccFood.setOnClickListener(this);
        binding.ccLogin.setOnClickListener(this);
        binding.ccMedicine.setOnClickListener(this);
        binding.ccNews.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ccDiseas:
                navController.navigate(R.id.action_homeFragment_to_diseasFragment);
                break;
            case R.id.ccChineseMedicine:
                navController.navigate(R.id.action_homeFragment_to_chineseMedicineFragment);
                break;
            case R.id.ccFood:
                navController.navigate(R.id.action_homeFragment_to_foodFragment);
                break;
            case R.id.ccLogin:
                navController.navigate(R.id.action_homeFragment_to_loginFragment);
                break;
            case R.id.ccMedicine:
                navController.navigate(R.id.action_homeFragment_to_medicineFragment);
                break;
            case R.id.ccNews:
                navController.navigate(R.id.action_homeFragment_to_newsFragment);
                break;
            default:
                break;
        }
    }
}
