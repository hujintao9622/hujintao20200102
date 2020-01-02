package com.bawei.hujintao.model.bean;

import java.util.List;

/**
 * 功能:  页面
 * 作者:  胡锦涛
 * 时间:  2020/1/2 0002 上午 9:02
 */
public class ListBean {

    /**
     * result : {"rxxp":{"commodityList":[{"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg","price":189,"saleNum":30},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":350},{"commodityId":25,"commodityName":"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/ddx/1/1.jpg","price":158,"saleNum":23}],"id":1002,"name":"热销新品"},"pzsh":{"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":139},{"commodityId":7,"commodityName":"蓝色之恋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/5/1.jpg","price":29,"saleNum":29},{"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/1/1.jpg","price":3499,"saleNum":2010},{"commodityId":13,"commodityName":"贝览得美妆蛋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/3/1.jpg","price":44,"saleNum":5}],"id":1004,"name":"品质生活"},"mlss":{"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":12},{"commodityId":12,"commodityName":"Lara style美妆BB蛋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/2/1.jpg","price":22,"saleNum":4}],"id":1003,"name":"魔力时尚"}}
     * message : 查询成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        /**
         * rxxp : {"commodityList":[{"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg","price":189,"saleNum":30},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":350},{"commodityId":25,"commodityName":"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/ddx/1/1.jpg","price":158,"saleNum":23}],"id":1002,"name":"热销新品"}
         * pzsh : {"commodityList":[{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":139},{"commodityId":7,"commodityName":"蓝色之恋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/5/1.jpg","price":29,"saleNum":29},{"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/1/1.jpg","price":3499,"saleNum":2010},{"commodityId":13,"commodityName":"贝览得美妆蛋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/3/1.jpg","price":44,"saleNum":5}],"id":1004,"name":"品质生活"}
         * mlss : {"commodityList":[{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":12},{"commodityId":12,"commodityName":"Lara style美妆BB蛋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/2/1.jpg","price":22,"saleNum":4}],"id":1003,"name":"魔力时尚"}
         */

        private RxxpBean rxxp;
        private PzshBean pzsh;
        private MlssBean mlss;

        public RxxpBean getRxxp() {
            return rxxp;
        }

        public void setRxxp(RxxpBean rxxp) {
            this.rxxp = rxxp;
        }

        public PzshBean getPzsh() {
            return pzsh;
        }

        public void setPzsh(PzshBean pzsh) {
            this.pzsh = pzsh;
        }

        public MlssBean getMlss() {
            return mlss;
        }

        public void setMlss(MlssBean mlss) {
            this.mlss = mlss;
        }

        public static class RxxpBean {
            /**
             * commodityList : [{"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg","price":189,"saleNum":30},{"commodityId":5,"commodityName":"双头两用修容笔","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/3/1.jpg","price":39,"saleNum":350},{"commodityId":25,"commodityName":"秋冬季真皮兔毛女鞋韩版休闲平底毛毛鞋软底百搭浅口水钻加绒棉鞋毛毛鞋潮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/ddx/1/1.jpg","price":158,"saleNum":23}]
             * id : 1002
             * name : 热销新品
             */

            private int id;
            private String name;
            private List<CommodityListBean> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBean> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBean> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBean {
                /**
                 * commodityId : 21
                 * commodityName : 【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋
                 * masterPic : http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg
                 * price : 189
                 * saleNum : 30
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class PzshBean {
            /**
             * commodityList : [{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39,"saleNum":139},{"commodityId":7,"commodityName":"蓝色之恋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/5/1.jpg","price":29,"saleNum":29},{"commodityId":3,"commodityName":"Lara style女神的魔盒全套彩妆","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/cz/1/1.jpg","price":3499,"saleNum":2010},{"commodityId":13,"commodityName":"贝览得美妆蛋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/3/1.jpg","price":44,"saleNum":5}]
             * id : 1004
             * name : 品质生活
             */

            private int id;
            private String name;
            private List<CommodityListBeanX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanX {
                /**
                 * commodityId : 6
                 * commodityName : 轻柔系自然裸妆假睫毛
                 * masterPic : http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg
                 * price : 39
                 * saleNum : 139
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }

        public static class MlssBean {
            /**
             * commodityList : [{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88,"saleNum":12},{"commodityId":12,"commodityName":"Lara style美妆BB蛋","masterPic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/2/1.jpg","price":22,"saleNum":4}]
             * id : 1003
             * name : 魔力时尚
             */

            private int id;
            private String name;
            private List<CommodityListBeanXX> commodityList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CommodityListBeanXX> getCommodityList() {
                return commodityList;
            }

            public void setCommodityList(List<CommodityListBeanXX> commodityList) {
                this.commodityList = commodityList;
            }

            public static class CommodityListBeanXX {
                /**
                 * commodityId : 32
                 * commodityName : 唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋
                 * masterPic : http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg
                 * price : 88
                 * saleNum : 12
                 */

                private int commodityId;
                private String commodityName;
                private String masterPic;
                private int price;
                private int saleNum;

                public int getCommodityId() {
                    return commodityId;
                }

                public void setCommodityId(int commodityId) {
                    this.commodityId = commodityId;
                }

                public String getCommodityName() {
                    return commodityName;
                }

                public void setCommodityName(String commodityName) {
                    this.commodityName = commodityName;
                }

                public String getMasterPic() {
                    return masterPic;
                }

                public void setMasterPic(String masterPic) {
                    this.masterPic = masterPic;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getSaleNum() {
                    return saleNum;
                }

                public void setSaleNum(int saleNum) {
                    this.saleNum = saleNum;
                }
            }
        }
    }
}
