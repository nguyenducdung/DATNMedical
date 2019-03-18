package com.bkhust.dungnd.datnmedical.ui.login;

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
}
