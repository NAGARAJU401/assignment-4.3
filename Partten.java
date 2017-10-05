package Xpartten;
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program

public class Partten {
	//public is a Java keyword which declares a member's access as public.
	//class can be defined as a template that describes the state that the object of its type support.
	//Highest is class name.
	//declares a class called Xpattern
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Public is a keyword that is used as an access modifier for methods and variables.
	//static used to prepare a field,method or inner classes as a class field.
	//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
	//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		Scanner sc=new Scanner(System.in);
		//here we are using scanner to scan the values which we initilize.
		System.out.print("Enter N:\n");
		//system : system is a class in java language.lang package
		//out : out is the static member of system class.It's type PrintStream
		//println: which is used to print the output.
		//Inside the brackets is value which to be printed
		int n=sc.nextInt();//it will scans next token of the input as int
		int arr[][]=new int[n][n];
		//inserting values in array
		for(int i=0;i<n;i++)//starting value for i=0
		{
			for (int s=0;s<n;s++)
			{
				if(i==s || (i+s)==(n-1))//here i value is equal to j and those values 
					//sum is equal to number -1
					System.out.print('*');// printing the value
				else//to test various conditions
					System.out.print(' ');
			}
			System.out.println(' ');
			//system : system is a class in java language.lang package
			//out : out is the static member of system class.It's type PrintStream
			//println: which is used to print the output.
			//Inside the brackets is value which to be printed

			}
	}

}
