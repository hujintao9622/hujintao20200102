package com.bawei.hujintao.presenter;

import com.bawei.hujintao.base.BasePresenter;
import com.bawei.hujintao.contract.IHomeContract;
import com.bawei.hujintao.model.HomeModel;
import com.bawei.hujintao.model.bean.BannerBean;
import com.bawei.hujintao.model.bean.ListBean;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 9:07
 */
public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData() {
        homeModel.getHomeData(new IHomeContract.IModel.IModelCallback() {
            @Override
            public void onSuccess(ListBean listBean) {
                view.onSuccess(listBean);
            }

            @Override
            public void onFailure(Throwable throwable) {
                view.onFailure(throwable);
            }
        });
    }

    @Override
    public void getHomeBannerData() {
        homeModel.getHomeBannerData(new IHomeContract.IModel.IModelBannerCallback() {
            @Override
            public void onBannerSuccess(BannerBean bannerBean) {
                view.onBannerSuccess(bannerBean);
            }

            @Override
            public void onBannerFailure(Throwable throwable) {
                view.onBannerFailure(throwable);
            }
        });
    }
}
