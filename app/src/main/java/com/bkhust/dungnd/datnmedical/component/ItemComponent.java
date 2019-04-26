package com.bkhust.dungnd.datnmedical.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.LayoutItemBinding;

/**
 * Created by DungND on 4/22/2019.
 */
public class ItemComponent extends CardView {
    private Context mContext;
    private LayoutItemBinding binding;

    public ItemComponent(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ItemComponent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
        setParams(attrs);
    }

    public ItemComponent(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
        setParams(attrs);
    }

    private void init(Context context) {
        mContext = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        binding = LayoutItemBinding.inflate(inflater, this, true);
    }

    private void setParams(AttributeSet attrs) {
        TypedArray a = mContext.getTheme().obtainStyledAttributes(attrs, R.styleable.ItemComponent, 0, 0);

        String title = a.getString(R.styleable.ItemComponent_ic_text);
        setText(title);

        int image = a.getResourceId(R.styleable.ItemComponent_ic_src_image, -1);
        if (image != -1) {
            setImage(image);
        }
        a.recycle();
    }

    public ItemComponent setImage(int reId) {
        binding.ivItem.setImageResource(reId);
        return this;
    }

    public ItemComponent setText(String title) {
        binding.tvItem.setText(title);
        return this;
    }

    public ItemComponent setVisibleBack(boolean visibleBack) {
        binding.ivBack.setVisibility(visibleBack ? VISIBLE : GONE);
        return this;
    }



}
