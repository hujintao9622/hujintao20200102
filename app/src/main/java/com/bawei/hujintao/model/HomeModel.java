package com.bawei.hujintao.model;

import android.util.AndroidException;
import android.util.AndroidRuntimeException;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.bawei.hujintao.contract.IHomeContract;
import com.bawei.hujintao.model.bean.BannerBean;
import com.bawei.hujintao.model.bean.ListBean;
import com.bawei.hujintao.util.NetUtil;
import com.bumptech.glide.signature.AndroidResourceSignature;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * 功能:  M层页面
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 8:48
 */
public class HomeModel implements IHomeContract.IModel {
    @Override
    public void getHomeData(final IModelCallback iModelCallback) {
        NetUtil.getInstance().getApi().listvp()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ListBean value) {
                        iModelCallback.onSuccess(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallback.onFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void getHomeBannerData(final IModelBannerCallback iModelBannerCallback) {
        NetUtil.getInstance().getApi().ban()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BannerBean bannerBean) {
                        iModelBannerCallback.onBannerSuccess(bannerBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelBannerCallback.onBannerFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }



}
