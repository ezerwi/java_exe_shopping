package com.wjh.shop;

public class InfoClass {
    String goods, seller; int ae;
    double price, disPrice, dilFee, totalPrice, totalDilFee, totalDisPrice, totalValue;

    public InfoClass() {

    }

    // 상품정보 저장 form
    public InfoClass(String g, int p, int d, int df, String s){

        this.goods     =g;
        this.price     =p;
        this.disPrice  =d;
        this.dilFee    =df;
        this.seller    =s;

    }

    // 사용자 data 저장 form
    public InfoClass(String g, int a) {
        this.goods  =g;
        this.ae     =a;
    }
}
