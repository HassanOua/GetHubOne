package methods;


/**
 * 1.	Write a method that takes 3 parameters (2 double value and 1 char value). The method should perform calculation (addition, subtraction, multiplication, division and modulus). 
a.	Depending the math operation sign character ( + , -. / , *, %) passed to the method it should perform appropriate calculation and should print the result of operation 
b.	If user enters invalid math operation sign, then it should print error message.
 Method Name: calculate
Method Return Type: void
Parameter 1 = double numOne
Parameter 2 = double numTwo 
Parameter 2 = char mathOperationSign

  *
 */
public class Calculator {
	
	public static void main(String[] args) {
		double a = 2.0;
		double b = 4.0;		  
		calculator(a, b, '+');
		calculator(a, b, '-');
		calculator(a, b, '*');
		calculator(a, b, '/');
		calculator(a, b, '%');
		calculator(a, b, '@');
	}
	
	public static void calculator (double numOne, double numTwo, char mathOperationSign) {	
		//check the matheOperationsign 
		
		if(mathOperationSign == '+') {
			System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
		} else if (mathOperationSign == '-') {
			System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
		} else if (mathOperationSign == '*') {
			System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
		} else if (mathOperationSign == '/') {
			System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
		} else if (mathOperationSign == '%') {
			System.out.println(numOne + " % " + numTwo + " = " + (numOne % numTwo));
		} else {
			System.out.println(" ERROR... No operation");
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		calculate(10, 2, '!');
//		calculate(10, 2, '+');
//		calculate(10, 2, '-');
//		calculate(10, 2, '*');
//		calculate(10, 3, '%');
//	}
//
//	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
//
//		if (mathOperationSign == '+') {
//			System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
//		} else if (mathOperationSign == '-') {
//			System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
//		} else if (mathOperationSign == '/') {
//			System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
//		} else if (mathOperationSign == '%') {
//			System.out.println(numOne + " % " + numTwo + " = " + (numOne % numTwo));
//		} else if (mathOperationSign == '*') {
//			System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
//		} else {
//			System.out.println("wrong sign");
//		}
//	}
}
