package com.bkhust.dungnd.datnmedical.ui.diseas.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentDiseaseDetailBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class DiseasDetailFragment extends BaseFragment<FragmentDiseaseDetailBinding, DiseaseDetailViewModel> {
    @Override
    protected Class<DiseaseDetailViewModel> getModelClass() {
        return DiseaseDetailViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_disease_detail;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_disease_detail);
            showButtonBack();
        }
    }
}
