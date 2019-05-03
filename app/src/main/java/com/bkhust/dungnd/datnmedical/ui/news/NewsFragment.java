package com.bkhust.dungnd.datnmedical.ui.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import com.bkhust.dungnd.datnmedical.R;
import com.bkhust.dungnd.datnmedical.databinding.FragmentNewsBinding;
import com.bkhust.dungnd.datnmedical.ui.ItemClick;
import com.bkhust.dungnd.datnmedical.ui.base.BaseFragment;
import com.bkhust.dungnd.datnmedical.ui.medicine.MedicineAdapter;

import java.util.Objects;

public class NewsFragment extends BaseFragment<FragmentNewsBinding, NewsViewModel> {
    private NewsAdapter newsAdapter;

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
            showToolbar();
        }
        setupRecycleView();
    }

    private void setupRecycleView() {
        newsAdapter = new NewsAdapter();
        binding.rvNews.setAdapter(newsAdapter);
        binding.rvNews.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        newsAdapter.setItemClick(new ItemClick() {
            @Override
            public void onItemClick(int position) {
                navController.navigate(R.id.action_newsFragment_to_newDetailFragment);
            }
        });
    }
}
