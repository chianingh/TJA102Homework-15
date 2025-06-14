package hw1;

public class Hw1_3 {
	//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	    public static void main(String[] args){
	        int all = 256559;
	        int day, hour, min , sec;

	        day = all / (24*60*60);
	        int leftAfterDay = all % (24*60*60);
	        hour = leftAfterDay / (60*60);
	        int leftAfterHour = leftAfterDay % (60*60);
	        min = leftAfterHour / 60;
	        sec = leftAfterHour % 60;

	        System.out.println(all + "為" + day + "天" + hour + "小時" + min + "分" + sec + "秒");


	    }
	}
