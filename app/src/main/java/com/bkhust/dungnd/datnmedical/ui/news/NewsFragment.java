package com.bkhust.dungnd.datnmedical.ui.news;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentNewsBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

public class NewsFragment extends BaseFragment<FragmentNewsBinding, NewsViewModel> {
    @Override
    protected Class<NewsViewModel> getModelClass() {
        return NewsViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_news;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle(R.string.fragment_news);
            showButtonBack();
        }
    }
}
