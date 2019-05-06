package com.bkhust.dungnd.datnmedical.ui.medicine.species;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentMedicineBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class MedicineFragment extends BaseFragment<FragmentMedicineBinding, MedicineViewModel> {


    @Override
    protected Class<MedicineViewModel> getModelClass() {
        return MedicineViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_medicine;
    }
}
