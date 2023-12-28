// Ask the user to enter the number of the month & print the name of the month.

import java.util.*;
class Month{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month numeric number: ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.print("Jan");
                break;
            case 2:
                System.out.print("Feb");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("Sept");
                break;
            case 10:
                System.out.print("Oct");
                break;
            case 11:
                System.out.print("Nov");
                break;
            case 12:
                System.out.print("Dec");
                break;
            default:
                System.out.print("Invalid Num entered!");
        }
    }
}