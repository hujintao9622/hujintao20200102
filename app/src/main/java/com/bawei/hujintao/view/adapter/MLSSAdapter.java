package com.bawei.hujintao.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.hujintao.R;
import com.bawei.hujintao.model.bean.ListBean;
import com.bawei.hujintao.util.NetUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 9:18
 */
public class MLSSAdapter extends RecyclerView.Adapter<MLSSAdapter.MyViewHolder> {


    private List<ListBean.ResultBean.MlssBean.CommodityListBeanXX> list;

    public MLSSAdapter(List<ListBean.ResultBean.MlssBean.CommodityListBeanXX> mlss) {

        list = mlss;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ListBean.ResultBean.MlssBean.CommodityListBeanXX commodityListBeanXX = list.get(position);
        holder.name.setText(commodityListBeanXX.getCommodityName());
        holder.price.setText(commodityListBeanXX.getPrice()+"");
        NetUtil.getInstance().getPhoto(commodityListBeanXX.getMasterPic(),holder.img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img)
        ImageView img;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.price)
        TextView price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
