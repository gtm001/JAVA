// Strings are Immutable in java (we can't add or delete]),
// To add and delete we have to make a new string that would take time.
// that's why we bought the consept of Strig Builder.

// Strings in JAVA are immutable(Some part of memory stored in stack and some are in heap).
// for exmp:- let (String str = "h"), then here, 'str' will store under stack and 'h' is under heap!

// difference b/w String and String-Builder ;-
// In case of string if we want to updrage it then the memory will continue creating and deleting but 
// in case of String-Builder it update String in creating & deleting in the same memory-space(here it's heap!)

// Syntax:-
// class String2{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);// to print

//         // System.out.println(sb.charAt(0)); // to print char at index 0.

        

//         // sb.setCharAt(0,'S'); // to replace char at 2 index;
//         // System.out.println(sb);

//         sb.insert(2,'n');  // to insert extra char "S" at the 0th index.
//         System.out.println(sb);

//         sb.delete(2,4);  // non-exclusive, does not affect the ending index. //2,3
//         // it is use to delete multiple index.
//         System.out.println(sb);

        
//     }
// }


// Append---------
// class String2{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("H");
//         sb.append("e");
//         sb.append("l");
//         sb.append("l"); //appending elements!
//         sb.append("0");
//         System.out.println(sb);// to print
//         System.out.println(sb.length());
//     }
// }

// To reverse a String-------------------
class String2{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;  //finding the front index of the string.
            int back = sb.length()-1-i;  //finding the last index of the string.

            char frontChar = sb.charAt(front); // front value with it's index.
            char backChar = sb.charAt(back); // back value with it's index.

            sb.setCharAt(front,backChar); // replacing the backchar at front index.
            sb.setCharAt(back,frontChar); // replacing the frontchar at back index.

        }

        System.out.print(sb);
    }
}