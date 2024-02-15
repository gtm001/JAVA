// TW0-D ARRAY
// in this memory consuption by a cell is: (row X column) X data-type size 

// Declaration
// ---for 1-D array we do:--
// int num[] = new int[size]........., but for 2-D there is some changes:-

// ----for 2-D array-------
// int num[][] = new int[size of row][size of column]


// Taking input and print output for the 2-D array.
// import java.util.*;
// class TdArray{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of rows: ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter the size of columns: ");
//         int num2 = sc.nextInt();

//         int Numbers[][] = new int[num1][num2] ;

//         System.out.println("Enter the input: ");

//         for(int i=0;i<num1;i++){   // for taking input
//             for(int j=0;j<num2;j++){
//                 Numbers[i][j]=sc.nextInt();
//             }
//         }

//         System.out.println("The output is : ");
//         for(int i=0;i<num1;i++){ //for the output.
//             for(int j=0;j<num2;j++){
//                 System.out.print(Numbers[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

//     }
// }

// Take a matrix as input from the user. search for the given num of x and
// print out their indices.

// import java.util.*;
// class TdArray{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the num of rows: ");
//         int num1  = sc.nextInt();
//         System.out.print("Enter the num of columns: ");
//         int num2 = sc.nextInt();
//         int numbers[][] = new int[num1][num2];
        
//         for(int i= 0; i<num1;i++){
//             for(int j= 0;j<num2;j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter the num whose indices you want: ");
//         int num = sc.nextInt();
//         for(int i =0;i<num1;i++){
//             for(int j=0;j<num2;j++){
//                 if(numbers[i][j]==num){
//                     System.out.println("its indices is "+ i+" ,"+j);
//                 }
//             }
//         }
//     }
// }
