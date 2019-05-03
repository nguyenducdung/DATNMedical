package com.bkhust.dungnd.datnmedical.ui.food;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentFoodBinding;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

import java.util.Objects;

public class FoodFragment extends BaseFragment<FragmentFoodBinding, FoodViewModel> {

    private FoodAdapter adapter;

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
        setupRecycleView();
        showToolbar();
    }

    private void setupRecycleView() {
        adapter = new FoodAdapter();
        binding.rvFood.setAdapter(adapter);
        binding.rvFood.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(Objects.requireNonNull(getContext()), DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(Objects.requireNonNull(ContextCompat.getDrawable(getContext(), R.drawable.devider)));
        binding.rvFood.addItemDecoration(dividerItemDecoration);
        adapter.setItemClick(new ItemClick() {
            @Override
            public void onItemClick(int position) {
                navController.navigate(R.id.action_foodFragment_to_foodDetailFragment);
            }
        });
    }
}
