package com.xiaoyv.framework.main.home;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.blankj.utilcode.util.ObjectUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.xiaoyv.cultureengine.module.main.home.BannerBean;
import com.xiaoyv.cultureengine.module.main.home.HomeItemBean;
import com.xiaoyv.framework.BaseFragment;
import com.xiaoyv.framework.R;
import com.xiaoyv.framework.main.MainActivity;
import com.xiaoyv.framework.main.MainFragment;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * 非遗文化 App
 *
 * @author 王怀玉
 * @since 2020/2/22
 */
public class MainHomeFragment extends BaseFragment<MainHomeContract.Presenter> implements MainHomeContract.View, View.OnClickListener {
    private BGABanner mainHomeBanner;
    private RecyclerView mainHomeFeaturedRecyclerView;
    private RecyclerView mainHomeArtistryRecyclerView;
    private MainHomeAdapter homeFeaturedAdapter;
    private MainHomeAdapter homeArtistryAdapter;
    private View mainHomeFunctionWord;
    private View mainHomeFunctionDance;
    private View mainHomeFunctionSong;
    private View mainHomeFunctionArt;
    private View mainHomeFunctionMedicine;
    private View mainHomeFunctionMusic;
    private View mainHomeFunctionDrama;
    private View mainHomeFunctionAcrobatics;
    private View mainHomeFunctionSkill;
    private View mainHomeFunctionFolklore;
    private View mainHomeFunction3d;
    private View mainHomeFunctionVr;
    private View mainHomeFunctionAr;
    private View mainHomeFunctionLearning;
    private View mainHomeFunctionCommunity;
    private View mainHomeFunctionExhibition;

    public static MainHomeFragment newInstance() {
        return new MainHomeFragment();
    }

    @Override
    public void setPresenter(MainHomeContract.Presenter presenter) {
        super.setFragmentPresenter(presenter);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    @Override
    public void initView() {
        mainHomeBanner = findView(R.id.main_home_banner);
        mainHomeFeaturedRecyclerView = findView(R.id.main_home_featured_recycler_view);
        mainHomeArtistryRecyclerView = findView(R.id.main_home_artistry_recycler_view);

        mainHomeFunctionWord = findView(R.id.main_home_function_word);
        mainHomeFunctionDance = findView(R.id.main_home_function_dance);
        mainHomeFunctionSong = findView(R.id.main_home_function_song);
        mainHomeFunctionArt = findView(R.id.main_home_function_art);
        mainHomeFunctionMedicine = findView(R.id.main_home_function_medicine);
        mainHomeFunctionMusic = findView(R.id.main_home_function_music);
        mainHomeFunctionDrama = findView(R.id.main_home_function_drama);
        mainHomeFunctionAcrobatics = findView(R.id.main_home_function_acrobatics);
        mainHomeFunctionSkill = findView(R.id.main_home_function_skill);
        mainHomeFunctionFolklore = findView(R.id.main_home_function_folklore);
        mainHomeFunction3d = findView(R.id.main_home_function_3d);
        mainHomeFunctionVr = findView(R.id.main_home_function_vr);
        mainHomeFunctionAr = findView(R.id.main_home_function_ar);
        mainHomeFunctionLearning = findView(R.id.main_home_function_learning);
        mainHomeFunctionCommunity = findView(R.id.main_home_function_community);
        mainHomeFunctionExhibition = findView(R.id.main_home_function_exhibition);

    }

    @Override
    public void initData() {
        mainHomeFeaturedRecyclerView.setNestedScrollingEnabled(false);
        mainHomeArtistryRecyclerView.setNestedScrollingEnabled(false);
        homeFeaturedAdapter = new MainHomeAdapter(R.layout.fragment_main_home_item, new ArrayList<>());
        homeArtistryAdapter = new MainHomeAdapter(R.layout.fragment_main_home_item, new ArrayList<>());
        mainHomeFeaturedRecyclerView.setAdapter(homeFeaturedAdapter);
        mainHomeArtistryRecyclerView.setAdapter(homeArtistryAdapter);

        mainHomeFunctionWord.setOnClickListener(this);
        mainHomeFunctionDance.setOnClickListener(this);
        mainHomeFunctionSong.setOnClickListener(this);
        mainHomeFunctionArt.setOnClickListener(this);
        mainHomeFunctionMedicine.setOnClickListener(this);
        mainHomeFunctionMusic.setOnClickListener(this);
        mainHomeFunctionDrama.setOnClickListener(this);
        mainHomeFunctionAcrobatics.setOnClickListener(this);
        mainHomeFunctionSkill.setOnClickListener(this);
        mainHomeFunctionFolklore.setOnClickListener(this);
        mainHomeFunction3d.setOnClickListener(this);
        mainHomeFunctionVr.setOnClickListener(this);
        mainHomeFunctionAr.setOnClickListener(this);
        mainHomeFunctionLearning.setOnClickListener(this);
        mainHomeFunctionCommunity.setOnClickListener(this);
        mainHomeFunctionExhibition.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MainActivity mainActivity = (MainActivity) activity;
        MainFragment mainFragment = mainActivity.fragment;


        if (v.getId() == mainHomeFunctionWord.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(0, true);
        } else if (v.getId() == mainHomeFunctionDance.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(1, true);
        } else if (v.getId() == mainHomeFunctionSong.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(2, true);
        } else if (v.getId() == mainHomeFunctionArt.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(3, true);
        } else if (v.getId() == mainHomeFunctionMedicine.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(4, true);
        } else if (v.getId() == mainHomeFunctionMusic.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(5, true);
        } else if (v.getId() == mainHomeFunctionDrama.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(6, true);
        } else if (v.getId() == mainHomeFunctionAcrobatics.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(7, true);
        } else if (v.getId() == mainHomeFunctionSkill.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(8, true);
        } else if (v.getId() == mainHomeFunctionFolklore.getId()) {
            mainFragment.mainBottomView.setSelectedItemId(R.id.main_bottom_news);
            mainFragment.newsFragment.mainNewsViewpager.setCurrentItem(9, true);
        } else if (v.getId() == mainHomeFunction3d.getId()) {
            // 启动3D展示页面
            startActivity(new android.content.Intent(activity, com.xiaoyv.framework.threeD.ThreeDDisplayActivity.class));
        } else if (v.getId() == mainHomeFunctionVr.getId()) {
            ToastUtils.showShort("VR体验功能开发中...");
        } else if (v.getId() == mainHomeFunctionAr.getId()) {
            ToastUtils.showShort("AR体验功能开发中...");
        } else if (v.getId() == mainHomeFunctionLearning.getId()) {
            // 启动文化学习页面
            startActivity(new android.content.Intent(activity, com.xiaoyv.framework.learning.CultureLearningActivity.class));
        } else if (v.getId() == mainHomeFunctionCommunity.getId()) {
            ToastUtils.showShort("文化社区功能开发中...");
        } else if (v.getId() == mainHomeFunctionExhibition.getId()) {
            ToastUtils.showShort("文化展览功能开发中...");
        }

    }


    @Override
    public void onStart() {
        super.onStart();
        // 开始轮播
        mainHomeBanner.startAutoPlay();
    }

    @Override
    public void onStop() {
        super.onStop();
        // 结束轮播
        mainHomeBanner.stopAutoPlay();
    }

    @Override
    public void showBanner(BannerBean cultureData) {
        List<BannerBean.CultureData> dataBanner = cultureData.getBanner();
        if (ObjectUtils.isNotEmpty(dataBanner)) {
            mainHomeBanner.setData(dataBanner, null);
            mainHomeBanner.setAdapter((BGABanner.Adapter<ImageView, BannerBean.CultureData>) (banner, itemView, model, position) ->
                    Glide.with(activity).load(model.getImage()).into(itemView));
            mainHomeBanner.setDelegate((banner, itemView, model, position) -> ToastUtils.showShort(dataBanner.get(position).getImage()));
        }
    }

    @Override
    public void showFeaturedItem(HomeItemBean homeItemBean) {
        List<HomeItemBean.HomeItem> homeItems = homeItemBean.getHomeItems();
        if (ObjectUtils.isNotEmpty(homeItems)) {
            homeFeaturedAdapter.setNewData(homeItems);
        }
    }

    @Override
    public void showArtistryItem(HomeItemBean homeItemBean) {
        List<HomeItemBean.HomeItem> homeItems = homeItemBean.getHomeItems();
        if (ObjectUtils.isNotEmpty(homeItems)) {
            homeArtistryAdapter.setNewData(homeItems);
        }
    }

}
