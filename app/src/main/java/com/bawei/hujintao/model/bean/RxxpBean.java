package com.bawei.hujintao.model.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 9:29
 */
@Entity
public class RxxpBean {
    @Id(autoincrement = true)
    private Long id;
    private String img;
    private String name;
    private String price;
    @Generated(hash = 589613366)
    public RxxpBean(Long id, String img, String name, String price) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.price = price;
    }
    @Generated(hash = 1813958071)
    public RxxpBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return this.price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
