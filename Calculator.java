
// Q.Make a Calculator. Take 2 numbers (a & b) from the user using if-else statement!.



// import java.util.*;
// class Calculator{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first num: ");
//         long a = sc.nextLong();
//         System.out.print("Enter second num: ");
//         long b = sc.nextLong();
//         System.out.print("Enter the opertion you want to do: ");
//         char operator = sc.next().charAt(0);           //here the statement will be intilly as string so, it will used to take the index at 0.
//         long result = 0;                               //initialise e statement with 0.
//         if(operator=='+'){
//             result = a+b;
//         }
//         else if(operator=='-'){
//             result = a-b;
//         }
//         else if(operator=='*'){
//             result = a*b;
//         }
//         else if(operator=='/'){
//             if(b==0){
//                 System.out.print("Can't divisible by 0!");
//                 return;
//             }
//             result = a/b;
//         }
//         else if(operator=='%'){
//             if(b==0){
//                 System.out.print("Can't do modulo operation with 0");
//                 return;
//             }
//             result = a%b;
//         }
//         else{
//             System.out.print("Invalid Opertor!");
//             return;
//         }

//         System.out.print("Result: "+ result);
        

//     }
    
// }










// Q.Make a Calculator. Take 2 numbers (a & b) from the user using Switch- Case statement!.


// import java.util.*;
// class Calculator{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the first number: ");
//         long a = sc.nextLong();
//         System.out.print("enter the second number: ");
//         long b = sc.nextLong();
//         System.out.print("enter the operation you want to do! :");
//         char operation = sc.next().charAt(0);
//         long result= 0;
//         switch(operation){
//             case '+':
//                 result = a+b;
//                 break;
//             case '-':
//                 result = a-b;
//                 break;
//             case '*':
//                 result = a*b;
//                 break;
//             case '/':
//                 if(b==0){
//                     System.out.print("Not divisible by 0 !");
//                     return;
//                 }
//                 result = a/b;
//                 break;
//             case '%':
//                 if(b==0){
//                     System.out.print("Can't find remainder with 0 !");   //here, we have to check the condition of 'not defined'!
//                     return;
//                 }
//                 result = a%b;
//                 break;
//             default:
//                 System.out.print("Invalid operation!");
            
//         }
//         System.out.print("Result: "+ result);
//     }
// }