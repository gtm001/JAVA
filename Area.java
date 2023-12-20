/*
Q.Make a program that takes the radius of a circle as input,
 calculates its radius and area and prints it as output to the user.
 */

import java.util.*;
class Area{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius: ");
    int R = sc.nextInt();
    double area = 3.14*R*R;
    System.out.printf("Area of the circle: %.2f%n ",area);
}
}

// Note:- Here you can use printf so taht by using %.2f%n you can print upto two decimal places!