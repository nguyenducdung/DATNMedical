package com.bkhust.dungnd.datnmedical.ui.home;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentHomeBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> {

    @Override
    protected Class<HomeViewModel> getModelClass() {
        return HomeViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }
}
