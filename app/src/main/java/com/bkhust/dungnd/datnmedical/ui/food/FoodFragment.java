package com.bkhust.dungnd.datnmedical.ui.food;

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
}
