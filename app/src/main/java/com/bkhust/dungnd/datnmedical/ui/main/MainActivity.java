package com.bkhust.dungnd.datnmedical.ui.main;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.ActivityMainBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseActivity;
import com.bkhust.dungnd.datnmedical.ui.dialog.NotificationDialog;
import com.bkhust.dungnd.datnmedical.utils.SystemUtils;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {

    private NavHostFragment navHostFragment;
    private NavController navController;

    @Override
    protected void inits() {

    }

    @Override
    protected int getLayoutMain() {
        return R.layout.activity_main;
    }

    @Override
    protected Class<MainViewModel> getModelClass() {
        return MainViewModel.class;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        navController = Navigation.findNavController(this, R.id.navHostFragment);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onBackPressed() {
        SystemUtils.hideKeyboard(this);
        if (navController.getCurrentDestination() != null) {
            if (navController.getCurrentDestination().getId() == R.id.homeFragment ) {
                showDialogExitApp();
            } else {
                super.onBackPressed();
            }
        }

    }

    private void showDialogExitApp() {
        final NotificationDialog dialog = new NotificationDialog(this);
        dialog.setContent(getString(R.string.exit_app))
                .onClickPositiveButton(getString(R.string.ok), new NotificationDialog.OnDialogPackingClickListener() {
                    @Override
                    public void onDialogButtonClick() {
                        finish();
                    }
                })
                .onClickNegativeButton(getString(R.string.exit), new NotificationDialog.OnDialogPackingClickListener() {
                    @Override
                    public void onDialogButtonClick() {
                        dialog.setCanceledOnTouchOutside();
                    }
                })
                .show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public Toolbar getToolBar() {
        return binding.toolbar;
    }

    public void showButtonBack() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }

    public void hideButtonBack() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(false);
        }
    }

    public void hideToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void showToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().show();
        }
    }
}
