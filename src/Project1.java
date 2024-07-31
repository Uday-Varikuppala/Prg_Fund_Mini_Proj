
import java.util.Scanner;

public class Project1 {
//	1.Travel
//	2.Amstrong num
//	3.Palindrome
//	4.Reverse num
//	5.Table
//	6.EvenOdd
//	7.Factorial
//	8.Prime Num
//	9.digit_add
//	10.any one pattern
//	11.pyramid pattern
//	12.Diamond Pattern
//	13.Searching in array
//	14.Sorting
//	15.LeapYear

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char repeat;
		do {
			System.out.println("Please select a program to run: "); // allows user to choose the program 
			
			System.out.println("1.Travel");
			System.out.println("2.Amstrong number");
			System.out.println("3.Palindrome number");
			System.out.println("4.Reverse number");
			System.out.println("5.Number Table");
			System.out.println("6.Even or Odd");
			System.out.println("7.Factorial of a number");
			System.out.println("8.Prime Number");
			System.out.println("9.Digit_operations");
			System.out.println("10.Number Pattern");
			System.out.println("11.Pyramid pattern");
			System.out.println("12.Diamond Pattern");
			System.out.println("13.Searching in array");
			System.out.println("14.Sorting a array");
			System.out.println("15.LeapYear");
			System.out.println(" ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				calculateTravelTime();
				break;
			case 2:
				amstrong();
				
				break;
			case 3:
				palindromeNum();
				break;
			case 4:
				reverseNum();
				break;
			case 5:
				Numbertable();
				break;
			case 6:
				evenodd();
				break;
			case 7:
				factorial();
				break;
			case 8:
				primeNumber();
				break;
			case 9:
				digitAdd();
				break;
			case 10:
				numberPattern();
				break;
			case 11:
				pyramidPattern();
				break;
			case 12:
				diamondPattern();
				break;
			case 13:
				searching();
				break;
			case 14:
				sorting();
				break;
			case 15:
				leapyear();
				break;
			default:
				System.err.println("Invalid Choice!");
			}
			System.out.println("*****************************");
			System.out.println("Do you want to continue(y/n): ");
			repeat = sc.next().charAt(0);
			System.out.println("******************************");
			
		}while(repeat == 'y' || repeat == 'Y');	
	}
	
	
	
		
	// function definitions starts
	
	public static void calculateTravelTime(){				// 1st code
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle type Car(C) or Bus(B) or Train(T) or Flight(F):  ");
		char vehicle = Character.toLowerCase(sc.next().charAt(0));
		
		System.out.println("Enter distance: ");
		int d = sc.nextInt();

		
		switch(vehicle) {
		case 'c':
			double t1 = d/90; // t = time
			System.out.println("Time Taken(hr): " + t1 );break;
		case 'b':
			double t2 = d/60; // t = time
			System.out.println("Time Taken(hr): " + t2 );break;
		case 't':
			double t3 = d/70; // t = time
			System.out.println("Time Taken(hr): " + t3 );break;
		case 'f':
			double t4 = d/500; // t = time
			System.out.println("Time Taken(hr): " + t4 );break;

		
		default: System.err.println("Wrong Selection!");
		}
		System.out.println();
	}
	
	
	public static void amstrong() {						//2nd start
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int originalNumber = number;
		int sum = 0;
		
		while(number!=0) {
			int digit = number %10;
			sum = sum + (digit*digit*digit) ;
			System.out.println(sum);
         	number = number /10;	
		}
		
		if (originalNumber == sum) {
			System.out.println("It is an Armstrong Number");
		}else {
			System.out.println("It is not an Armstrong Number");			
		}
		System.out.println();
	}
	
	
	public static void palindromeNum(){					//3rd start
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number = sc.nextInt();
			
			int originalNum = number;
			int reverseNumber = 0;
			
			while(number!=0) {
				int digit = number %10;
				reverseNumber = reverseNumber*10 + digit;
				number = number /10;
			
			}if (originalNum == reverseNumber) {
				System.out.println(originalNum + " is a Palindrome");
			}else {
				System.out.println(originalNum + " is not a Palindrome");
			}
	}
	
	public static void reverseNum() {  					//4th starts
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int reverseNumber = 0;
		
		while(number!=0) {
			int digit = number %10;
			reverseNumber = reverseNumber*10 + digit;
			number = number /10;
			System.out.println(number);
			
		}
		System.out.println("result: " + reverseNumber);
	}
	
	public static void Numbertable() { 					//5th starts
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
	
		for(int i=1; i<=10; i++) {
			int table = number * i;
			System.out.println(number + " * " + i + " = " + table);
		}
	}
	
	public static void evenodd() { 						//6th starts
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		for(int i=num; i<=num; i++) {
			if(i%2 == 0) {
				System.out.println(i + " is Even");
			}else {
				System.out.println(i + " is Odd");
			}
		}
	}
	
	public static void factorial() {  				// 7th starts
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        int i = 1;
        while (i <= n) {
            int factorial = 1;
            int j = 1;
            while (j <= i) {
                factorial *= j;
                j++;
            }
            System.out.println("Factorial of " + i + " is: " + factorial);
            i++;
        }
	}
	
	
	public static void primeNumber() {					// 8th starts
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int num = sc.nextInt();
	    boolean flag = true;
	    
	    for(int i=2; i<num; i++) {
	    	if (num % i == 0) {
	    		flag = false;
	    		break;
	    	}
	    }
	    if (flag) { 
	    System.out.println("Prime");
	    }else {
	    	System.out.println("Not Prime");
	    }   
	}
	
	public static void digitAdd() {					//9th starts
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String number = sc.nextLine();
		
		
		System.out.println("Enter an operator (+, -, *, /): ");
		int operator = sc.next().charAt(0);
		
	    int result = Character.getNumericValue(number.charAt(0));   // new learn
		
		for(int i=1; i<number.length(); i++ ) {
			int digit = Character.getNumericValue(number.charAt(i));  // new learn
			
			switch(operator) {
				case '+':
					result += digit;
					break;
				case '-':
					result -= digit;
					break;
				case '*':
					result *= digit;
					break;
				case '/':
					if (digit !=0) {
						result /= digit;
					}else {
						System.err.println("Error: Division by zero");
						return;
					}
					break;
				default:
					System.out.println("Invalid operator");
					return;
			}
		}
		System.out.println("Result: " + result);
	}
	
	
	public static void numberPattern() {				//10th starts
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		 for (int i = 1; i <= num; i++) {
			 
			 for (int j = 1; j <=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
	        }
	}
	
	
	public static void pyramidPattern() {				//11th starts
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        // row looping
        for (int i = 1; i <= num; i++) {
            //  spaces looping
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // asterisks looping
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }  
	}
	
	public static void diamondPattern() {				//12th starts
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        /* to get numbers in diamond shape, 
        first divide diamond into two parts upper and lower parts for less */
        // upper part of diamond
        for (int i = 1; i <= num; i++) {
            // looping spaces 
            for (int j = num - i; j > 0; j--) {
                System.out.print("  ");
            }
            // Printing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "   ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = num - 1; i >= 1; i--) {
            // looping spaces 
            for (int j = num - i; j > 0; j--) {
                System.out.print("  ");
            }
            // Printing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "   ");
            }
            System.out.println();
        }
	}
	
	
	public static void searching() {				//13th starts
		int[] numbers= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 5 numbers: ");
		
		//Reading
		for(int i=0; i<5; i++) {
			numbers[i] = sc.nextInt();
		}
		
		//printing number
		System.out.print("Entered numbers are: ");
        for (int n : numbers) {
            System.out.print(n+ " ");
        }
		System.out.println();
		
		//searching a number
		System.out.println("Enter a number to seacrh: ");
		int key = sc.nextInt();
		boolean keyfound = false;
		
		for(int j=0; j<numbers.length; j++) {
			if(key == numbers[j]) {
				System.out.println("Key is found at index: " + j);
				keyfound = true;
				break; // remove break to locate multiple keys or same key found at two different places
			}
		}
		if(!keyfound) {
			System.out.println("Key no found!");
		}
	}
	
	public static void sorting() {					//14th starts
		int[] numbers= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 5 numbers: ");
		
		//Reading
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		//printing given number
		System.out.print("Entered number are: ");
        for (int n : numbers) {
            System.out.print(n+ " ");
        }
		System.out.println();
		
		//sorting numbers
		int temp;
		for (int i = 0; i < numbers.length - 1; i++) {
			//only for adjacent numbers
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
	                numbers[j] = numbers[j + 1];
	                numbers[j + 1] = temp;
		        }
		    }
		}
		System.out.print("Sorted numbers: " );
		for (int n : numbers) {
	        System.out.print( n + " ");
	    }
		System.out.println();
	}
	
	
	public static void leapyear() {					//15th starts
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		
		int year = sc.nextShort();
		
		if (year % 4 == 0) {
			System.out.println("Hurray! it's a Leap Year :)");
		}else {
			System.out.println("Ho No! it's Not a Leap Year :(");
		}
	}

	

}//end
