package hw1;

public class Hw1_4 {
    //請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
    public static void main(String[] args){
        final double pi = 3.1415;
        int r = 5;
        double area = r * r * pi;
        double l = 2 * r * pi;
        System.out.println("圓面積 = " + area);
        System.out.println("圓周長 = " + l);
    }
}
