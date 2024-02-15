
// class Array{
//     public static void main(String args[]){
//         // int[] marks = new int[5];
//         int marks[] = new int[3];
//         marks[0]=27;
//         marks[1]=28;
//         marks[2]=30;
//         // System.out.println(marks[0]) ;
//         // System.out.println(marks[1]) ;
//         // System.out.println(marks[2]) ;

//         for(int i=0;i<3;i++){  // if we are not taking input from the user then
//         //  we can directly give size as arrayname.length
//             System.out.println(marks[i]);
//         }
//     }
// }

// WHAT HAPPENS TO THE MEMORY!
// '''Actually each size of array contains 4 byte so, in above case it'll store memory 
// of 12 byte., memory always allocate in linear fashion.(means it'll be in continuous form like 1000,10001,10002..and so on.)'''

// Although there is another way to store element inside arrray!

// class Array{
//     public static void main(String args[]){
//         // int[] marks = new int[5];
//         int marks[] = {27,28,30};
//         // marks[0]=27;
//         // marks[1]=28;
//         // marks[2]=30;
//         // System.out.println(marks[0]) ;
//         // System.out.println(marks[1]) ;
//         // System.out.println(marks[2]) ;

//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// TAKING INPUT FROOM THE USER.

// import java.util.*;
// class Array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int size = sc.nextInt(); //takig size from the user.
//         int marks[] = new int[size];

//         for(int i=0;i<size;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

//As after executing the above code, we'll find that whenever user give the input of the --
// size of the array, it'll automatically print the num of 0 upto the given size by the user.

// the reason is there is a default value of dataTypes in the java.
// int - 0.
// boolean - false
// float - 0.0
// String - " "

// Taking element of java as input from the user.

// import java.util.*;
// class Array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int size = sc.nextInt(); //takig size from the user.
//         int marks[] = new int[size];
        
//         for(int i=0;i<size;i++){
//             marks[i] = sc.nextInt();
//         }

//         for(int i=0;i<size;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// TAKE INPUT FROM THE USER AND THEN FROM THE GIVEN ELEMENT CHHOOSE ONE ELEMET 
// AND COMMAND TO TYPE IT'S INDEX NUMBBER.
// this type of searchhing is called linear search.

// import java.util.*;
// class Array{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size: ");
//         int size = sc.nextInt(); //takig size from the user.
//         int marks[] = new int[size];
        
//         for(int i=0;i<size;i++){
//             marks[i] = sc.nextInt();
//         }
//         System.out.println("Enter the num whose index number your want: ");
//         int num = sc.nextInt();

//         for(int i=0;i<size;i++){
//             if (marks[i]==num){
//             System.out.println("the index number is: "+i);
//         }
//     }
// }
// }


