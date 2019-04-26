package com.bkhust.dungnd.datnmedical.ui.medicine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentMedicineBinding;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;
import com.bkhust.dungnd.datnmedical.ui.food.FoodAdapter;

import java.util.Objects;

public class MedicineFragment extends BaseFragment<FragmentMedicineBinding, MedicineViewModel> {
    private MedicineAdapter medicineAdapter;

    @Override
    protected Class<MedicineViewModel> getModelClass() {
        return MedicineViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_medicine;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_medicine);
            showButtonBack();
        }
        setupRecycleView();
    }

    private void setupRecycleView() {
        medicineAdapter = new MedicineAdapter();
        binding.rvMedicine.setAdapter(medicineAdapter);
        binding.rvMedicine.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        medicineAdapter.setItemClick(new ItemClick() {
            @Override
            public void onItemClick(int position) {
                navController.navigate(R.id.action_medicineFragment_to_medicineDetailFragment);
            }
        });
    }

}
