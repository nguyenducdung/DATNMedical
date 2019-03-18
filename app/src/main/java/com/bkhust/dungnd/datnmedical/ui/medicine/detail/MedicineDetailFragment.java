package com.bkhust.dungnd.datnmedical.ui.medicine.detail;

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
}
