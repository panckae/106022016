import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int number1, number2, sum;
   System.out.print("請輸入第一個數:");
   number1=input.nextInt();
   System.out.print("請輸入第二個數:");
   number2=input.nextInt();
   sum=number1+number2;
   System.out.printf("%d+%d=%d", number1,number2,sum);
   input.close();
System.out.print("");
	// write your code here
    }
}




