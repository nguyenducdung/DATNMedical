package com.bkhust.dungnd.datnmedical.ui.news;

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
}
