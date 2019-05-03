package com.bkhust.dungnd.datnmedical.ui.medicine.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentMedicineDetailBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class MedicineDetailFragment extends BaseFragment<FragmentMedicineDetailBinding, MedicineDetailViewModel> {
    @Override
    protected Class<MedicineDetailViewModel> getModelClass() {
        return MedicineDetailViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_medicine_detail;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        hideToolbar();
        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigateUp();
            }
        });
    }
}
