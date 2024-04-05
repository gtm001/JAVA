// There are Three types of Erros:-
// 1. Syntax error
// 2. Logical error
// 3. Runtime-Error

// Note:- Syntax and Logical errors are done by Programmers but Runtime-error occur by user.

// --------------Exception-------------------------
// 1. Checked Exception (compile the exception, handled by compilor)
// 2. Unchecked Exception (Runtime Exception)

// Few Commonly Occuring exceptions in java.
// 1. Null pointer exception
// 2. Arithematic exception
// 3. ArrayOutOfBound exception
// 4, Illegel Argument exception
// 5. Number format exception

// -----------try-catch Block-----------------
// class ErrHandling{
// public static void main(String args[]){
// int a = 6;
// int b = 0;

// try{
// int c = a/b;
// System.out.println(c);
// }
// catch(Exception e){
//     System.out.println("Not possible because:- "+e);
// }
// System.out.println("End of code");
// }
// }
// -----------------------------------------------

// ------------Handeling Specific Exception in java-------------
// import java.util.*;
// class ErrHandling{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int arr[] = new int[3];
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;

//         System.out.println("Enter index: ");
//         int n = sc.nextInt();
//         System.out.println("Enter number ");
//         int num = sc.nextInt();
//         try{
//         System.out.println("Result is - "+arr[n]/num);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Arithmetc Error: "+e);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array Out of bond: "+e);
//         }
//         catch(Exception e){
//             System.out.println("Other errors: "+e);
//         }

//     }
// }
// ------------------------------------------------------------------
// --------Nested Try-Catch Block-------------------------

// This progrrame is run untill while condition got true!
// import java.util.*;
// class ErrHandling{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     boolean flag = true;
//         int arr[] = new int[3];
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//     while(flag){
//     System.out.println("Enter index: ");
//     int n = sc.nextInt();
//     System.out.println("Enter number ");
//     int num = sc.nextInt();
//     try{
//     System.out.println("Result:- "+arr[n]/num);
//     flag = false;
//     }
//     catch(Exception e){
//         System.out.println("Not possible!");
//         System.out.println(e);
//     }
//     }
// }
// }
// -------------------- Using Nested try-catch Loop!------------------
// import java.util.*;
// class ErrHandling{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     boolean flag = true;
//         int arr[] = new int[3];
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//     while(flag){
//     System.out.println("Enter index: ");
//     int n = sc.nextInt();
//     System.out.println("Enter number ");
//     int num = sc.nextInt();
//     try{
//     try{
//     System.out.println("Result:- "+arr[n]/num);
//     flag = false;
//     }
//     catch(Exception e){
//         System.out.println("Not possible!");
//         System.out.println(e);
//     }
//     }
//     catch(Exception e){
//         System.out.println("Outer exception! "+e);
//     }
//     }
// }
// }
// -------------------------------------------------------

// ----------------The Exception Class-----------------------------
// import java.util.*;
// class Myexception extends Exception{
//         public String toString(){
//             return "This is toString method";
//         }
//         public String getMessage(){
//             return "This is getMessage method";
//         }
// }
// class ErrHandling{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         if(a<9){
//             try{
//                 // throw new Myexception();
//                 throw new ArithmeticException("This is Arithmetic Exception");
//             }
//             catch(Exception e){
//                 System.out.println(e.toString());
//                 System.out.println(e.getMessage());
//                 // System.out.println(e);// gives toString method.
//                 e.printStackTrace();
//                 System.out.println("finished");
//             }
//         }
//     }
// }
// --------------------------Throw vs Throws-------------------------
// class ErrHandling{
//     public static int divide(int a,int b) throws ArithmeticException{
//         int result = a/b;
//         return result;
//     }
//     public static void main(String args[]){
//         try{
//         int c = divide(4,0);
//         System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println("Exception");
//         }
//     }
// }
// -----------------
    // class NegativeRadiusException extends Exception{
    //     public String toString(){
    //         return "Radius can't be negative!";
//         }
//         public String getMessage(){
//             return "Radius can't be negative!";
//         }
//     }
// class ErrHandling{
//     public static int divide(int a,int b) throws ArithmeticException{
    //     int result = a/b;
    //     return result;
    // }
    // public double area(double r) throws NegativeRadiusException{
    //     if(r<0){
    //         throw new NegativeRadiusException();
    //     }
    //     return Math.PI*r*r;
    // }
    // public static void main(String args[]){
    //     try{
    //     int c = divide(4,0);
    //     System.out.println(c);
    //     }
    //     catch(Exception e){
    //         System.out.println("Exception");
    //     }

        // try{
        //     ErrHandling er = new ErrHandling();
        //     double res = er.area(2.0);
        //     System.out.println(res);
        // }
        // catch(Exception e){
        //     e.toString();
        // }
    // }
// }
// -------------------------Finally block-------------------
// class ErrHandling{
//     public static int divide(int a,int b) throws ArithmeticException{
//         return a/b;
//     }
//     public static void main(String args[]){
//         try{
//         int a = divide(4,0);
//         System.out.println(a);
//         }
//         catch(Exception e){
//             System.out.println("Can't divide!");
//         }
//         // finally{
//         //     System.out.println("Finished!");
//         // }

//         System.out.println("Finished!"); //used directly instead of finally block.
//     }
// }
// ----------
// class ErrHandling{
//     public static int divide(){
//         try{
//          int a = 8;
//          int b = 4;
//          int c = a/b;
//          return c;
//         }
//         catch(Exception e){
//             System.out.println("Can't divide!");
//         }
//         finally{
//             System.out.println("Finished!"); // Can't type "finished" directly, have to use finally keyword!
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//          int x = divide();
//          System.out.println(x);
//     }
// }


// Note:- finally block will execute in Every condition, Even if it's written
//  in a Loop after the break statement.

// NOTE:- try block can't be present alone!
// try block can be execute with finally block even in the absense of catch block!
