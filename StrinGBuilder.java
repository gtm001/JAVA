// Strings are Immutable in java (we can't add or delete]),
// To add and delete we have to make a new string that would take time.
// that's why we bought the consept of Strig Builder.

// Strings in JAVA are immutable(Some part of memory stored in stack and some are in heap).
// for exmp:- let (String str = "h"), then here, 'str' will store under stack and 'h' is under heap!

// difference b/w String and String-Builder ;-
// In case of string if we want to updrage it then the memory will continue creating and deleting but 
// in case of String-Builder it update String in creating & deleting in the same memory-space(here it's heap!)

// Syntax:-
class StrinG2{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        
    }
}
