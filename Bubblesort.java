// Bubble short
//Time-complexity O(n^2).........(coz, it's tracing (n-1)(n-2)(n-2) )


// class Bubblesort{
//     public static void printArry(int []Array){
//         for(int i =0;i<Array.length;i++){
//             System.out.print(Array[i]+" ");
//         }
//     }

//     public static void main(String args[]){
// int arr[]={88,45,230,11,100};
// for(int i =0;i<arr.length-1;i++){ //upper loop
//     for(int j =0;j<arr.length-i-1;j++){ //sorting loop
//         if(arr[j]>arr[j+1]){
//             //swap
//             int temp = arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//         }
//     }
// }
// printArry(arr);
// }
// }

// it's a bad time-complexity.

class Bubblesort{
    public static void PrintArr(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String args[]){
    int Arr[]={35,14,78,9,11,100};
    for(int i =0;i<Arr.length-1;i++){
        for(int j =0;j<Arr.length-i-1;j++){
            if(Arr[j]>Arr[j+1]){
                //swap
                int temp = Arr[j];
                Arr[j]=Arr[j+1];
                Arr[j+1]=temp;
            }
        }
    }
    PrintArr(Arr);
}
}