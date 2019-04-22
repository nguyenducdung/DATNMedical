package com.bkhust.dungnd.datnmedical.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.LayoutCardBinding;

/**
 * Created by DungND on 4/22/2019.
 */
public class CardComponent extends CardView {
    private Context mContext;
    private LayoutCardBinding binding;

    public CardComponent(Context context) {
        super(context);
        init(context);
    }

    public CardComponent(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
        setParams(attrs);
    }

    public CardComponent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
        setParams(attrs);
    }

    private void init(Context context) {
        mContext = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        binding = LayoutCardBinding.inflate(inflater, this, true);
    }

    private void setParams(AttributeSet attrs) {
        TypedArray a = mContext.getTheme().obtainStyledAttributes(attrs, R.styleable.CardComponent, 0, 0);

        String title = a.getString(R.styleable.CardComponent_cc_text);
        setText(title);

        int leftImage = a.getResourceId(R.styleable.CardComponent_cc_src_image, -1);
        if (leftImage != -1) {
            setImage(leftImage);
        }
        a.recycle();
    }

    public CardComponent setImage(int resourceId) {
        binding.iv.setImageResource(resourceId);
        return this;
    }

    public CardComponent setText(String text) {
        binding.tv.setText(text);
        return this;
    }
}
