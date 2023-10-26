import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1
       /* System.out.println("please Enter your number");
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            num = input.nextInt();
            if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else {
                System.out.println("your number is not Multi");

            }
        }*/
        //2

      /*  System.out.println("please Enter your Text :");
        String text = input.next();
        String text2="";

        for(int i=0;i<text.length();i++)
            text2=text.charAt(i)+text2;

        System.out.println( "Revers Text "+ text2);*/
//3
      /*  System.out.println("please Enter posetive Number :");
        int number = input.nextInt();
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;}

        System.out.println("Factorial is :"+factorial);*/

//4
     /*   System.out.println("please Enter Number :");
        int num1 = input.nextInt();
        System.out.println("please Enter Power  :");
        int num2 = input.nextInt();
        int powerNum=1;
        for(int i=1;i<=num2;i++){
            powerNum=powerNum*num1;

        }
        System.out.println("the power of number :"+powerNum);*/



//5
     /*   System.out.println("please Enter integers :");
        int inpu1=input.nextInt();
        int num6;
        int EvenNum=0;
        int OddNum=0;
                for( int i=1;i<=inpu1;i++) {
                    System.out.println("enter the number("+i+"):") ;
                    num6=input.nextInt();
                    if (num6 % 2 == 0)
                        EvenNum = EvenNum + num6;
                    else
                        OddNum = OddNum + num6;
                }
                        System.out.println("sum of Even Number :"+EvenNum);
                        System.out.println("sum of Odd Number :"+OddNum);*/

        //6


       /* int PrinNum;
        System.out.print("Enter the positive integer ");
        PrinNum = input.nextInt();

        boolean flag = true;

        for(int i = 2; i < PrinNum; i++)
        {
            if(PrinNum % i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag && PrinNum > 1)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");}*/
        //7
        /*
         int weeks=4;
        int days = 7;

        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);}}*/

        //8
        System.out.println("please Enter word");
        String str=input.next();
        String  reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength-1); i >=0; --i) {

            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome");
        }
        else {
            System.out.println(str + " is not a Palindrome ");
        }
            }}






