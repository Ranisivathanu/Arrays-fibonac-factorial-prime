package week3.day1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//initialize the value
	int  range,firstNum,secNum,sum;
	range=8;
	firstNum=0;
	secNum=1;
	
	//print first number & second number
	System.out.println(firstNum);
	System.out.println(secNum);
	//iterate from 1 to the range
	for (int i = 1; i <=range; i++) {
		//add first and second number assign to sum
		sum=firstNum+secNum;
		//assign second number to first
		firstNum=secNum;
		//assign sum to the second number
		secNum=sum;
		//print sum
		System.out.println(sum);
		
		
		
	}
	
	
	
	}

}
