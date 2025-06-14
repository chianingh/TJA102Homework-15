package hw2;

public class Hw2_1 {
    //請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
    public static void main(String[] args){
        int i;
        int sum = 0;
        for(i = 2; i <= 1000; i = i + 2){
            sum += i;
        }
        System.out.println(sum);
    }
}
