// Take an array of names as input from the user and print them on the screen.
import java.util.*;
class QArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        // sc.nextLine();      //although there is no use of this coz, in print there is not sc.nextLine() instead of sc.next().
        //consume the new-line character left in Buffer!.

        String Name[] = new String [size];

        System.out.print("Enter the names: ");
        for(int i=0;i<size;i++){
            Name[i] = sc.next();
        }

        System.out.print("Output of the given names: ");
        for(int i=0;i<size;i++){
            System.out.print(Name[i]+" ");
        }
    }
}