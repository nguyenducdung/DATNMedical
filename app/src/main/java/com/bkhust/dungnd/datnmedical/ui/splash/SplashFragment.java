package com.bkhust.dungnd.datnmedical.ui.splash;

import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentSplashBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class SplashFragment extends BaseFragment<FragmentSplashBinding, SplashViewModel> {

    public static final int DELAY_TIME = 2000;
    private ActionBar actionBar;

    @Override
    protected Class<SplashViewModel> getModelClass() {
        return SplashViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_splash;
    }

    @Override
    public void onStart() {
        super.onStart();
        hideToolbar();
        goHomeFragment();
    }

    @Override
    public void onStop() {
        super.onStop();
        if (actionBar != null) {
            actionBar.show();
        }
    }

    private void goHomeFragment() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navController.navigate(R.id.action_splashFragment_to_homeFragment);
            }
        }, DELAY_TIME);
    }

    private void hideToolbar() {
        if (getActivity() != null) {
            actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
        }
    }
}
