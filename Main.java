
import static java.lang.System.*;
import java.util.Scanner;// if we want to get from user

public class Main
{
	public static void main(String args[])
	{
		//instantiate an AtCounter

//receiving in put from user. Here I am getting only one size and creating square //matrix. I cam also do that as rows and columns since the  functions can handle it
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter any number: ");// we can also get  rows and column differently
int size = keyboard.nextInt();
AtCounter acSizeFromKeyboard = new AtCounter(size,size);
// I am choosing  the half of both rows and columns of matrix as a starting poing
 int countforkeyboard = acSizeFromKeyboard.countAts(size/2,size/2);
   System.out.println(  size/2  + " "  + size/2  + " has  " +  countforkeyboard );
   System.out.println("this is the matrix whose size given by user");
   System.out.println(acSizeFromKeyboard.toString());

// here I am testing a fixed size  10x10 matrix
     AtCounter ac = new AtCounter(10,10);
     // test data  for whicg index will be choosen as a start for calculation of connected @s
     int r =0 ;
     int c=0;
      int r1 =2;
      int c1=5;
      int r2 =5;
      int c2=0;
      int r3 =9;
      int c3=9;
      int r4 =3;
      int c4=0;
    // int c = 4;
     int count = ac.countAts(r,c);
     int count1 = ac.countAts(r1,c1);
     int count2 = ac.countAts(r2,c2);
     int count3 = ac.countAts(r3,c3);
     int count4 = ac.countAts(r4,c4);
   System.out.println("tests for fixed size 10x10 matrix");
      System.out.println(  r  + " "  + c  + " has  " +  count );
      System.out.println(  r1  + " "  + c1 + " has  " +  count1 );
      System.out.println(  r2  + " "  + c2 + " has  " +  count2 );
      System.out.println(  r3  + " "  + c3 + " has  " +  count3 );
      System.out.println(  r4  + " "  + c4 + " has  " +  count4 );
      System.out.println("this is the matrix defined as 10x10 fix size");
      System.out.println(ac.toString());
    

//System.out.println(atCounter.toString());
		//test the code
	}
}