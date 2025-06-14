package hw2;

public class Test4Numbers {
    public static void main(String[] args){
//使用for迴圈+ while迴圈
//        int i,j;
//        for( i = 1; i <= 9 ; i++){
//            j = 1;
//            while( j <= 9){
//                System.out.println(i +"*"+ j+"="+i*j);
//                j++;
//            }
//        }

//使用for迴圈+ do while迴圈
//        int i,j;
//        for( i = 1; i <= 9 ; i++){
//            j = 1;
//            do{
//                System.out.println(i +"*"+ j+"="+i*j);
//                j++;
//            } while( j <= 9);
//        }

//使用while迴圈+ do while迴圈
        int i,j;
        i = 1;
        while(i <= 9) {
                j = 1;
                do{
                    System.out.println(i + "*" + j + "=" + i * j);
                    j++;
                } while (j <= 9);
                i++;
        }
    }
}
