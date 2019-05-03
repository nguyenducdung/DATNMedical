package com.bkhust.dungnd.datnmedical.ui.chinese;

import android.os.Bundle;
import android.support.annotation.Nullable;

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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_chinese_medicine);
            showButtonBack();
        }
        showToolbar();
    }
}
