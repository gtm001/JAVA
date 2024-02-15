// Enter 3 numbers from the user & make a function to print their average.

// import java.util.*;
// class Qprac{
//     public static double Average(int a,int b,int c){
//         double avg = (a+b+c)/3;
//         return avg;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number1: ");
//         int num1 = sc.nextInt();
//         System.out.println("enter the number2: ");
//         int num2 = sc.nextInt();
//         System.out.println("enter the number3: ");
//         int num3 = sc.nextInt();

//         double x= Average(num1,num2,num3);
//         System.out.print("the average is: "+ x);
//     }
// }

// Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.*;
// class Qprac{
//     public static int Oddsum(int n){
//         int sum = 0;
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the num upto which odd sum tou want: ");
//         int num = sc.nextInt();
//         int x = Oddsum(num);
//         System.out.print("The odd sum upto "+num+" is :"+x);
//     }

// }

// Write a function which takes in 2 numbers and returns the greater of those two.

// import java.util.*;
// class Qprac{
//     public static void Compare(int n1, int n2){
//             if(n1>n2){
//                 System.out.print(n1+ " is greater than "+n2);
//             }
//             else{
//                 System.out.print(n2+ " is greater than "+n1);
//             }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first num: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter the second num: ");
//         int num2 = sc.nextInt();
//         Compare(num1,num2);
//     }

// }

// Write an infinite loop using do while condition.


// class Qprac{
//     public static void main(String args[]){

//         do{
//            int n1= 2;
//            int n2= 3;
//             System.out.print(n1*n2);
//         }while(true);
//     }
// }



/* Write a program to enter the numbers till the user wants and at the 
 end it should display the count of positive, negative and zeros entered.*/

// import java.util.*;
// class Qprac {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int CountPositive = 0;
//         int CountNegative = 0;
//         int CountZero = 0;
//         char a;
//         int num;

//         do {
//             System.out.print("Wanna Enter anything (Y/N): ");
//             a = sc.next().charAt(0);

//             if(a=='n'|| a=='N'){
//                 break;
//             }

//             System.out.println("entered num: ");
//             num = sc.nextInt();

//             if (num > 0) {
//                 CountPositive++;
//             } else if (num < 0) {
//                 CountNegative++;
//             } else {
//                 CountZero++;
//             }
//         } while (a == 'Y' || a == 'y');

//         System.out.println("Total num of +ve num is: " + CountPositive);
//         System.out.println("Total num of -ve num is: " + CountNegative);
//         System.out.println("Total num of 0 is: " + CountZero);
//     }
// }

// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;
class Qprac{
    public static int Power(int x, int n){
//         if(x==0){
//             return 1;
//         }
        int pow = 1;
        for(int i=1;i<=n;i++){
            pow = pow*x;            
        }
        return pow;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num whose pow you want: ");
        int a = sc.nextInt();
        System.out.println("Enter the num upto pow you want: ");
        int b = sc.nextInt();
        int c = Power(a,b);
        System.out.print("The number "+a+" to the power "+b+" is: " +c);
    }
}

// Write a function that calculates the Greatest Common Divisor of 2 numbers. 
// import java.util.*;
// class Qprac{
//     public static int  Gcd(int a, int b){
//         int gcd = 1;  // we cam't just write it "int gcd" because in java it's take default value of int i.e 0, so, we write "in gcd = 1;"
//         for(int i=1;i<=a && i<=b;i++){
//             if(a%i==0 && b%i==0){
//                 gcd =i;
//             }
//         }
//         return gcd;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first num: ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter the second num: ");
//         int num2 = sc.nextInt();

//         int num = Gcd(num1,num2);
//         System.out.print("The gcd of "+num1+" ,"+num2+"  is: "+num);

//     }
// }


// Write a program to print Fibonacci series of n terms where n is input by user :-
// so, while doing this we have to first make first term as 0, and the second term as 1.
// and then a variable with names next-term that will be th esum of first and sec term,
// and to proceed thi sequece we just have to convet secterm into first term and the second term
// as the sum of firstAndsecond term.

 
