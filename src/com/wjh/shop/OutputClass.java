package com.wjh.shop;

import java.util.ArrayList;

public class OutputClass extends InputClass {


    public OutputClass(){


    }

    // 상품금액
    public int sumPrice(int i){
        int sum=0;
            sum = (int) (ud.get(i).ae * ic.get(i).price);
        return sum;
    }

    public int totalPrice(){
        int sum = 0;

        for(int i=0; i<ud.size(); i++){
            if(ud.get(i).ae!=0){
                totalPrice += sumPrice(i);
            }
        }

        sum = (int) totalPrice;
        return sum;
    }

    public int sumDiscount(){
        int sum=0; totalDisPrice = 0;
        for(int i=0; i < ud.size() ;i++) {
            if (ud.get(i).ae!=0){
                totalDisPrice += ic.get(i).disPrice;
            }
        }
        sum = (int) totalDisPrice;
        return sum;
    }

    public int sumDeli() {
        int sum=0; totalDilFee = 0;
        for(int i=0; i < ud.size() ;i++) {
            if (ud.get(i).ae!=0){
                totalDilFee += ic.get(i).dilFee;
            }
        }
        sum = (int) totalDilFee;
        return sum;
    }

    public int totalValue() {
        int sum=0; totalValue = 0;

        totalValue = totalPrice() + sumDeli() - sumDiscount();

        sum = (int) totalValue;
        return sum;
    }

}
