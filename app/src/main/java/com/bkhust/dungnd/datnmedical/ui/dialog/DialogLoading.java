package com.bkhust.dungnd.datnmedical.ui.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.DialogLoadingBinding;

public class DialogLoading {
    private static boolean shown = false;

    private AlertDialog dialog = null;

    private DialogLoadingBinding binding;

    private static DialogLoading instance = null;

    private Context context;

    public static DialogLoading getInstance(Context context) {
        if (instance != null) {
            return instance;
        } else {
            instance = new DialogLoading(context);
            return instance;
        }
    }

    private DialogLoading(Context context) {
        this.context = context;
        if (context != null && !DialogLoading.isShown()) {
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            binding = DataBindingUtil.inflate(layoutInflater, R.layout.dialog_loading, null, false);
            View dialogView = binding.getRoot();
            dialogBuilder.setView(dialogView);
            dialogBuilder.setCancelable(false);
            dialog = dialogBuilder.create();
            if (dialog.getWindow() != null) {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            binding.pbLoading.getIndeterminateDrawable().setColorFilter(context.getColor(R.color.colorPrimary),
                    PorterDuff.Mode.SRC_IN);
        }
    }

    public void show() {
        if (!((Activity) context).isFinishing()) {
            if (!DialogLoading.isShown() && dialog != null) {
                forceShown();
                dialog.show();
            }
        }
    }

    public void hidden() {
        if (DialogLoading.isShown() && dialog != null && dialog.isShowing()) {
            initialize();
            dialog.dismiss();
        }
    }

    private static boolean isShown() {
        return shown;
    }

    private static void forceShown() {
        shown = true;
    }

    private static void initialize() {
        shown = false;
    }

    public void destroyLoadingDialog() {
        instance = null;
    }
}
