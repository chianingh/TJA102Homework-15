package hw1;

public class Hw1_5 {
    //某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
    //金加利息共有多少錢 (用複利計算,公式請自行google)
//    【複利公式】FV ＝ PV×（1 ＋ R）n 次方FV 為期末本利和，PV 為期初本金，R 為每期利率，n 為期數
//　　也就是--期末本利和＝期初本金×（1＋利率）期數次方。
    public static void main(String[] args){
        double fv;
        double pv = 150;
        double r = 0.02;
        double n = 10;
        fv = pv * Math.pow(1 + r, n);
        System.out.printf("本金加利息共%.2f萬" , fv);

    }
}