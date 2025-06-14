package hw2;

public class Hw2_7 {
    //請設計一隻Java程式,輸出結果為以下:
    //A
    //BB
    //CCC
    //DDDD
    //EEEEE
    //FFFFFF
    public static void main(String[] args){
        int n = 65;

        for(int i = 1 ; i <= 6 ;i++){
            char eng = (char)n;
            System.out.print(eng);
            for(int j = 2 ; j <= i; j++){
                System.out.print(eng);
            }
            System.out.print("\n");
            n++;
        }
    }
}
