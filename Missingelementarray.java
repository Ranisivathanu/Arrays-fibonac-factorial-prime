package week3.day1;


import java.util.Arrays;

public class Missingelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] number = {1,2,3,4,7,6,8};
	        Arrays.sort(number);
	        System.out.println("Missing Number is:" + getMissingNumber(number));
	    }

	    private static Integer getMissingNumber(int[] number) {
	        Integer missed = null;
	        for (int i = 0; i < number.length; i++) {
	            int index = i + 1;
	            if (number[i] != index) {
	                missed = index;
	                break;
	            }
	        }
	        System.out.println(missed);
			return missed;
	    }
	}
	
	


