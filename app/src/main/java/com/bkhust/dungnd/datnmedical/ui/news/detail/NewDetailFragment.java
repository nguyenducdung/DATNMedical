package com.bkhust.dungnd.datnmedical.ui.news.detail;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentNewsDetailBinding;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;

/**
 * Created by DungND on 4/22/2019.
 */
public class NewDetailFragment extends BaseFragment<FragmentNewsDetailBinding, NewsDetailViewModel> {
    @Override
    protected Class<NewsDetailViewModel> getModelClass() {
        return NewsDetailViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_news_detail;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity() != null) {
            getActivity().setTitle("Chi tiết Báo");
            showButtonBack();
        }
    }
}
