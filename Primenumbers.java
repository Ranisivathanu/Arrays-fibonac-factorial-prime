package week3.day1;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int input=13; //declare the input
	boolean flag= false; //Declare boolean variable
  
	for (int i =2; i < input/2; i++) { //assign iterate i=2 &assign half the input
	
		if(input%i==0){// getting remainder by divide the input with loop variable(13/2)=0
		flag=true; //set flag as true
		break; //break
	}}
	
	//check the flag and print
	if(flag==false) { 
	System.out.println("prime");
	}else {
		System.out.println(" Not prime");	

}}}
