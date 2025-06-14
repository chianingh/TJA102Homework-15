package hw1;

public class Hw1_2 {
	//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	    public static void main(String[] args){
	        int all = 200;
	        int dozen;
	        int left;
	        dozen = all / 12;
	        left = all % 12;
	        System.out.println("共是"+ dozen +"打"+ left +"顆");
	    }
	}