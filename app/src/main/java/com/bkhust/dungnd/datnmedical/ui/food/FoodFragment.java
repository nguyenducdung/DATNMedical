package com.bkhust.dungnd.datnmedical.ui.food;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentFoodBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class FoodFragment extends BaseFragment<FragmentFoodBinding, FoodViewModel> {
    @Override
    protected Class<FoodViewModel> getModelClass() {
        return FoodViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_food;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_food);
            showButtonBack();
        }
    }
}
