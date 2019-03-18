package com.bkhust.dungnd.datnmedical.ui.chinese;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentChineseMedicineBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class ChineseMedicineFragment extends BaseFragment<FragmentChineseMedicineBinding, ChineseMedicineViewModel> {
    @Override
    protected Class<ChineseMedicineViewModel> getModelClass() {
        return ChineseMedicineViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_chinese_medicine;
    }
}
