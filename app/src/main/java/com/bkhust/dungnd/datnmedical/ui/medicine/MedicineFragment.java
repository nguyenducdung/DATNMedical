package com.bkhust.dungnd.datnmedical.ui.medicine;

import android.os.Bundle;
import android.support.annotation.Nullable;

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
    }
}
