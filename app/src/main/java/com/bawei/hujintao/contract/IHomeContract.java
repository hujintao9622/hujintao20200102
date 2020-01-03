package com.bawei.hujintao.contract;

import com.bawei.hujintao.model.bean.BannerBean;
import com.bawei.hujintao.model.bean.ListBean;

/**
 * 功能:  契约
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 8:50
 */
public interface IHomeContract {
    interface IView{
        void onSuccess(ListBean listBean);
        void onFailure(Throwable throwable);
        void onBannerSuccess(BannerBean bannerBean);
        void onBannerFailure(Throwable throwable);
    }
    interface IPresenter{
        void getHomeData();
        void getHomeBannerData();
    }
    interface IModel{
        void getHomeData(IModelCallback iModelCallback);
        void getHomeBannerData(IModelBannerCallback iModelBannerCallback);
        interface IModelCallback{
            void onSuccess(ListBean listBean);
            void onFailure(Throwable throwable);
        }
        interface IModelBannerCallback{
            void onBannerSuccess(BannerBean bannerBean);
            void onBannerFailure(Throwable throwable);
        }
    }
}
