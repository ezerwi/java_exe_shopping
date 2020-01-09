package com.wjh.shop;

import java.util.ArrayList;

public class InputClass extends InfoClass {

    // 상품data 저장 : InfoClass(String g, int p, int d, int df, String s)
    ArrayList<InfoClass> ic = new ArrayList<InfoClass>();

    // 사용자 data 저장 :
    ArrayList<InfoClass> ud = new ArrayList<InfoClass>();

    public InputClass() {

        this.ic.add(new InfoClass("제이버드 VISTA 비스타 완전 무선 이어폰(16시간 재생, IPX7 방수등급)", 254000, 30000, 0, "에스라이즈"));
        this.ic.add(new InfoClass("프리어블탭 USB 충전형 1구 휴대용 멀티탭찜하기", 13900, 23800, 0, "에이블루"));
        this.ic.add(new InfoClass("샤프전자 로보혼 ROBOHON 스마트 로봇. IOT시대의 친구와 같은 역할", 3029200, 245000, 80000, "지유노네"));
        this.ic.add(new InfoClass("갤럭시폴드 케이스 울트라하이브리드", 32900/3, 3000, 2500, "슈피겐"));
        this.ic.add(new InfoClass("반지수 작가의 아이패드로 그리는 일상의 풍경", 130000, 0, 0, "노트폴리오 아카데미"));

    }

}
