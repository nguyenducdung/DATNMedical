package com.bkhust.dungnd.datnmedical.ui.diseas;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentDiseasBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class DiseasFragment extends BaseFragment<FragmentDiseasBinding, DiseasViewModel> {
    @Override
    protected Class<DiseasViewModel> getModelClass() {
        return DiseasViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_diseas;
    }
}
