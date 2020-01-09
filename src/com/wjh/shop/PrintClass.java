package com.wjh.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintClass extends OutputClass {

    public PrintClass() {

    }

    public void start(){

        System.out.println ("<즐거운 쇼핑!>\n무엇을 사셨나요?\n");
    }

    public void dataIn(){
        Scanner x = new Scanner(System.in);

        System.out.printf ("(구매할 수 있는 상품의 종류는 : %d)\n", ic.size());


        for(int i=0; i < ic.size(); i++){
            ud.add(new InfoClass());
            System.out.printf ("\n\t%d. %s\n\t>> 몇개 사셨죠? : ", (i+1), ic.get(i).goods);
            int n = x.nextInt();
            ud.get(i).ae = n;

            ud.get(i).goods = ic.get(i).goods;
            System.out.printf ("\n\t >> \'%s\' %d개 구입!\n", ud.get(i).goods, ud.get(i).ae);
        }
    }

    public void dataOut(){
        System.out.println("\n-----");
        System.out.println("\n구매내역을 확인합니다.\n -----");
        System.out.println("\n\t상품정보\n\t수량\t상품금액\t할인금액\t배송비\t판매자명\n");

        for(int i=0; i<ud.size(); i++){
            System.out.printf("\n%d\t%s\n\t%d 개\t%d 원\t%.0f 원\t%.0f 원\t<%s>\n", (i+1), ud.get(i).goods, ud.get(i).ae, sumPrice(i), ic.get(i).disPrice, ic.get(i).dilFee, ic.get(i).seller) ;
        }

        System.out.printf("\n\n총 상품금액\t: %d원\n", totalPrice());
        System.out.printf("총 배송비\t: %d원\n", sumDeli());
        System.out.printf("총 할인금액\t: %d원\n", sumDiscount());
        System.out.println("\n-----");
        System.out.printf("\n총 결제금액\t: %d원\n", totalValue());
        System.out.println("\n감사합니다!\n");


    }

}
