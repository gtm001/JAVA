// Function code Explanation--

// returnType FunctionName (type arg1,arg2,arg3 )
/**
 * so, here we can give return type as int,float,long,double..etc,
 * for empty return we can give 'Void'.
 * 
 * now for argument we can give tpe as int,float,long,double...etc at the same time.
 */


// Q. write a function to call name.
// import java.util.*;
// class Function{
//     public static void YourName(String name){
//         System.out.print(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = sc.next();
//         YourName(name);
//     }
// }

// Function store memory in the form of Stack.

// Q.make two function to add the num and return the sum.
// import java.util.*;
// class Function{
//     public static int  Sum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first num: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter the second num: ");
//         int num2 = sc.nextInt();
//         int calculate = Sum(num1,num2);
//         System.out.print("The sum is : "+ calculate);
//     }
// }

// Q. take to num to multiply and return the product.
// import java.util.*;
// class Function{
//     public static int  Sum(int a, int b){
//         int multi = a*b;
//         return multi;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first num: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter the second num: ");
//         int num2 = sc.nextInt();
//         int calculate = Sum(num1,num2);
//         System.out.print("The product is : "+ calculate);
//     }
// }

// Q. To find the factorial of a number:-

// import java.util.*;
class Function{
    public static void Fact(int n){
        if(n==0){
            System.out.print("the factorial is 1 !");
        }
        else{
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        System.out.print("The factorial is: "+f);
        }
    }
    public static void main(String args[]){
        System.out.print("enter the num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Fact(num);
    }

}



//REMBER! , Function is Called Directly but Method is called via the object of a class.
