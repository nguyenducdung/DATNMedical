package com.bkhust.dungnd.datnmedical.ui.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.NotificationDialogBinding;

/**
 * Created by DungND on 4/16/2019.
 */
public class NotificationDialog {
    private NotificationDialogBinding binding;

    private static boolean shown = false;

    private AlertDialog dialog = null;

    public NotificationDialog(Context context) {
        if (context != null && !NotificationDialog.isShown()) {
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
            LayoutInflater inflater = LayoutInflater.from(context);
            binding = DataBindingUtil.inflate(inflater, R.layout.notification_dialog, null, false);
            View view = binding.getRoot();
            dialogBuilder.setView(view);
            dialogBuilder.setCancelable(false);
            dialog = dialogBuilder.create();
            dialog.setCanceledOnTouchOutside(false);
            if (dialog.getWindow() != null) {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            binding.tvTitle.setVisibility(View.GONE);
            binding.tvContent.setVisibility(View.GONE);
            binding.btnPositive.setVisibility(View.GONE);
            binding.btnNegative.setVisibility(View.GONE);
            binding.btnPrimary.setVisibility(View.GONE);
        }
    }

    public NotificationDialog setTitle(String title) {
        if (dialog != null && !TextUtils.isEmpty(title)) {
            binding.tvTitle.setVisibility(View.VISIBLE);
            binding.tvTitle.setText(title);
        }
        return this;
    }

    public NotificationDialog setContent(String content) {
        if (dialog!= null && !TextUtils.isEmpty(content)) {
            binding.tvContent.setVisibility(View.VISIBLE);
            binding.tvContent.setText(content);
        }
        return this;
    }

    public NotificationDialog setGravityContent(int gravity) {
        if (dialog!= null) {
            binding.tvContent.setGravity(gravity);
        }
        return this;
    }

    public NotificationDialog onClickPrimaryButton(String buttonText, final NotificationDialog.OnDialogPackingClickListener listener) {
        if (dialog != null) {
            binding.btnPrimary.setVisibility(View.VISIBLE);
            binding.btnPrimary.setText(buttonText);
            binding.btnPrimary.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    NotificationDialog.initialize();
                    if (listener != null) {
                        listener.onDialogButtonClick();
                    }
                }
            });
        }
        return this;
    }

    public NotificationDialog onClickPositiveButton(String buttonText, final NotificationDialog.OnDialogPackingClickListener listener) {
        if (dialog != null) {
            binding.btnPositive.setVisibility(View.VISIBLE);
            binding.btnPositive.setText(buttonText);
            binding.btnPositive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    NotificationDialog.initialize();
                    if (listener != null) {
                        listener.onDialogButtonClick();
                    }
                }
            });
        }
        return this;
    }

    public NotificationDialog onClickNegativeButton(String buttonText, final NotificationDialog.OnDialogPackingClickListener listener) {
        if (dialog != null) {
            binding.btnNegative.setVisibility(View.VISIBLE);
            binding.btnNegative.setText(buttonText);
            binding.btnNegative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    NotificationDialog.initialize();
                    if (listener != null) {
                        listener.onDialogButtonClick();
                    }
                }
            });
        }
        return this;
    }

    public void show() {
        if (!NotificationDialog.isShown() && dialog != null) {
            dialog.show();
            forceShown();
        }
    }

    public NotificationDialog setCanceledOnTouchOutside() {
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                    dialog.dismiss();
                    NotificationDialog.initialize();
                }
            });
        }
        return this;
    }

    public NotificationDialog closeDialog() {
        if (dialog != null) {
            dialog.dismiss();
            NotificationDialog.initialize();
        }
        return this;
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

    public interface OnDialogPackingClickListener {
        void onDialogButtonClick();
    }

}
