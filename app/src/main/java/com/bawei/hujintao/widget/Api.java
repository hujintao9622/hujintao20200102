package com.bawei.hujintao.widget;

import com.bawei.hujintao.model.bean.BannerBean;
import com.bawei.hujintao.model.bean.ListBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/1/3 0003 上午 8:45
 */
public interface Api {
    @GET("small/commodity/v1/commodityList")
    Observable<ListBean> listvp();
    @GET("small/commodity/v1/bannerShow")
    Observable<BannerBean> ban();

}
