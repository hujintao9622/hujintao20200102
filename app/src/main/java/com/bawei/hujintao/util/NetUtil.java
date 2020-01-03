package com.bawei.hujintao.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.widget.ImageView;

import com.bawei.hujintao.widget.Api;
import com.bumptech.glide.Glide;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 8:51
 */
public class NetUtil {
    private static final String baseurl="http://172.17.8.100/";
    private final Api api;

    //单例封装
    private static final class SingleHolder{
        private static final NetUtil NET_UTIL=new NetUtil();
    }
    private final OkHttpClient okHttpClient;

    private NetUtil(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        api = retrofit.create(Api.class);
    }

    public static NetUtil getInstance() {
        return SingleHolder.NET_UTIL;
    }

    //是否有网
    public boolean hasNet(Context context){
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        if (networkInfo != null&&networkInfo.isAvailable()) {
            return true;
        }else {
            return false;
        }
    }
    //获取图片
    public void getPhoto(String bit, ImageView img){
        Glide.with(img).load(bit).into(img);
    }

    public Api getApi() {
        return api;
    }
}
