// ------------------Fibonacci series--------------------------------//

// so, while doing this we have to first make first term as 0, and the second term as 1.
// and then a variable with names next-term that will be th esum of first and sec term,
// and to proceed thi sequece we just have to convet secterm into first term and the second term
// as the sum of firstAndsecond term.

import java.util.*;
class Fibonacci{
    public static void Fib(int n){
        int firsTerm = 0;
        int secTerm = 1;
        for(int i=0;i<n;i++){
            System.out.print(firsTerm+" ");
            int nexTerm = firsTerm + secTerm;
            firsTerm = secTerm;
            secTerm = nexTerm;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num upto which fib series you want: ");
        int num= sc.nextInt();
        
        // System.out.print("The sequence is: "+Fib(num)+" ");  
        // you can't use this in print statement coz, it's void.
        
        System.out.println("The fibonacci series is: ");
        Fib(num);
    }
}