package com.bkhust.dungnd.datnmedical.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by DungND on 4/16/2019.
 */
public class SystemUtils {
    /**
     * method is used for hide keyboard
     *
     * @param activity activity
     */
    public static void hideKeyboard(Activity activity) {
        if (activity != null) {
            InputMethodManager imm = (InputMethodManager) activity
                    .getSystemService(Activity.INPUT_METHOD_SERVICE);
            View view = activity.getCurrentFocus();
            if (view == null) {
                view = new View(activity);
            }
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /**
     * method is used for showDialogName keyboard
     *
     * @param view    edittext
     * @param context context
     */
    public static void showKeyboard(View view, Context context) {
        if (context != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context
                    .getSystemService(Context.INPUT_METHOD_SERVICE);
            if (view != null) {
                inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
            }
        }
    }

}
