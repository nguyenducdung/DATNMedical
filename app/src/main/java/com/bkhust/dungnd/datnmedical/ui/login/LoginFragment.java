package com.bkhust.dungnd.datnmedical.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentLoginBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class LoginFragment extends BaseFragment<FragmentLoginBinding, LoginViewModel> {
    @Override
    protected Class<LoginViewModel> getModelClass() {
        return LoginViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_login;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_login);
            showButtonBack();
        }
    }
}
