package hw2;

public class Hw2_5 {
    //阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
    //輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
    public static void main(String[] args){
        int i;
        int count = 0;
        for(i = 1; i < 40; i++){
            if((i % 10) == 4){
                continue;
            }
            else{
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("共:" + count);
    }
}
