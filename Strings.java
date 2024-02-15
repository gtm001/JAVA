// taking String as input from the user and print the out-put.
import java.util.*;
class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next(); // to print only single word
        String name = sc.nextLine(); // to print word containing spaces.
        System.out.println("my name is "+name);

        // to print the num of length:-
        System.out.println("the length is "+name.length());

        // charAt
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        //comparing String.
        // S1>S2 = positive value
        // S1<S2 = negative value
        // S1=S2 = 0
        // String name1="gautam";
        // String name="gautam";
        // if(name1.compareTo(name)==0){
        //     System.out.println("Strings are equal!");
        // }
        // else{
        //     System.out.println("Strings are not equal!");
        // }

        // also, to compare string: A<B (inc from A to Z).

        // We should avoid using "==" instead of ".comapreTo()" because in many cases it'll give hidden-testcase Errror!


        // Substring:-
        String sentance ="i am gautam";
        // System.out.print(sentance.substring(5)); or,
        // System.out.print(sentance.substring(5,sentance.length()));
        System.out.print(sentance.substring(2,4));

        // Remember that in this substring(beg inex, end index)  the ending index will never included 
        // for ex- let substring(0,4)  , then it'll take index from 0 to 3 only!(it'll ingnore the last index).


    }
}