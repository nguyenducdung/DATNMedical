package com.bkhust.dungnd.datnmedical.ui.food.detail;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentFoodDetailBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

/**
 * Created by DungND on 4/22/2019.
 */
public class FoodDetailFragment extends BaseFragment<FragmentFoodDetailBinding, FoodDetailViewModel> {
    @Override
    protected Class<FoodDetailViewModel> getModelClass() {
        return FoodDetailViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_food_detail;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_food_detail);
            showButtonBack();
            showToolbar();
        }
    }
}
