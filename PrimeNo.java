import java.util.*;
class PrimeNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num==0 || num==1){
            System.out.println("0 or 1 is not a prime number.");
        }
        else {
        for(int i=2;i<num;i++){
            if(num==0 || num==1){
            System.out.println("0 or 1 is not a prime number.");
        }
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        

        if(isPrime==true){
            System.out.println("This is a prime number.");

        }
        else{
            System.out.println("Not a prime number.");
        }
        }
    }
}

