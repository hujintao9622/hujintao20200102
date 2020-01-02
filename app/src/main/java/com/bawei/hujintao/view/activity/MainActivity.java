package com.bawei.hujintao.view.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.hujintao.R;
import com.bawei.hujintao.base.BaseActivity;
import com.bawei.hujintao.contract.IHomeContract;
import com.bawei.hujintao.database.DaoMaster;
import com.bawei.hujintao.database.DaoSession;
import com.bawei.hujintao.database.RxxpBeanDao;
import com.bawei.hujintao.model.bean.JavaBean;
import com.bawei.hujintao.model.bean.ListBean;
import com.bawei.hujintao.model.bean.RxxpBean;
import com.bawei.hujintao.presenter.HomePresenter;
import com.bawei.hujintao.util.NetUtil;
import com.bawei.hujintao.view.adapter.MyAdapter;
import com.bawei.hujintao.view.adapter.MyAdapter2;
import com.stx.xhb.androidx.XBanner;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<HomePresenter> implements IHomeContract.IView {
    @BindView(R.id.ma_ban)
    XBanner maBan;
    @BindView(R.id.marc)
    RecyclerView marc;
    private RxxpBeanDao rxxpBeanDao;

    @Override
    protected HomePresenter providePresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initData() {
        if (NetUtil.getInstance().hasNet(this)){
            mpresenter.getHomeData();
        }else {
            List<RxxpBean> list = rxxpBeanDao.queryBuilder().list();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
            marc.setLayoutManager(linearLayoutManager);
            MyAdapter2 myAdapter = new MyAdapter2(list);
            marc.setAdapter(myAdapter);
        }

        mpresenter.getHomeBannerData();
    }

    @Override
    protected void initView() {
        DaoSession daoSession = DaoMaster.newDevSession(this, "app.db");
        rxxpBeanDao = daoSession.getRxxpBeanDao();
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onSuccess(ListBean listBean) {
        ListBean.ResultBean result = listBean.getResult();
        ListBean.ResultBean.RxxpBean rxxp = result.getRxxp();
        List<ListBean.ResultBean.RxxpBean.CommodityListBean> commodityList = rxxp.getCommodityList();
        for (int i = 0; i <commodityList.size() ; i++) {
            ListBean.ResultBean.RxxpBean.CommodityListBean listbea = commodityList.get(i);
            String commodityName = listbea.getCommodityName();
            String masterPic = listbea.getMasterPic();
            int price = listbea.getPrice();
            RxxpBean rxxpBean = new RxxpBean(null, masterPic, commodityName, price + "");
            rxxpBeanDao.insert(rxxpBean);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        marc.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(commodityList);
        marc.setAdapter(myAdapter);
    }

    @Override
    public void onFailure(Throwable throwable) {
        Log.e("xx",throwable.getMessage());
    }

    @Override
    public void onBannerSuccess(JavaBean javaBean) {
        final List<JavaBean.ResultBean> result = javaBean.getResult();
        maBan.setBannerData(result);
        maBan.loadImage(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                JavaBean.ResultBean resultBean = result.get(position);
                NetUtil.getInstance().getPhoto(resultBean.getImageUrl(),(ImageView) view);
            }
        });
    }

    @Override
    public void onBannerFailure(Throwable throwable) {
        Log.e("xx",throwable.getMessage());
    }

}
