package com.bkhust.dungnd.datnmedical.ui.diseas.detail;

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
}
