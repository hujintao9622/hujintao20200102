package com.bawei.hujintao.model;

import com.bawei.hujintao.contract.IHomeContract;
import com.bawei.hujintao.model.bean.JavaBean;
import com.bawei.hujintao.model.bean.ListBean;
import com.bawei.hujintao.util.NetUtil;
import com.google.gson.Gson;

/**
 * 功能:  M层页面
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 8:48
 */
public class HomeModel implements IHomeContract.IModel {
    @Override
    public void getHomeData(final IModelCallback iModelCallback) {
        String st="http://172.17.8.100/small/commodity/v1/commodityList";
        NetUtil.getInstance().getJsonGet(st, new NetUtil.MyCallback() {
            @Override
            public void onGetJson(String json) {
                ListBean listBean = new Gson().fromJson(json, ListBean.class);
                iModelCallback.onSuccess(listBean);
            }

            @Override
            public void onError(Throwable e) {
                iModelCallback.onFailure(e);
            }
        });
    }

    @Override
    public void getHomeBannerData(final IModelBannerCallback iModelBannerCallback) {
        String s="http://172.17.8.100/small/commodity/v1/bannerShow";
        NetUtil.getInstance().getJsonGet(s, new NetUtil.MyCallback() {
            @Override
            public void onGetJson(String json) {
                JavaBean javaBean = new Gson().fromJson(json, JavaBean.class);
                iModelBannerCallback.onBannerSuccess(javaBean);
            }

            @Override
            public void onError(Throwable e) {
                iModelBannerCallback.onBannerFailure(e);
            }
        });
    }



}
