// Selection sort
// time complexity O(n^2).


// class Selectonsorting{
//     public static void PrintArr(int []arr){
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={23,56,11,90,65};
//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j; // this is done to update the index for the next iteration.
//                 }
//             }
//             // swap the values here!
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i]=temp;
//         }
//         PrintArr(arr);
//     }
// }


// Selection sort is also not optimise for sorting!