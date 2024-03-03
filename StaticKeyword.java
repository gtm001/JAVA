//------------------------static key-word-----------------------------------------
// static keyword is used for the common property of the Class.
// static keyword can be use in four ways:-
// 1. used in properities.
// 2. used in function.
// 3. used in Block.
// 4. used in Nested class.

//Note:- For static thing Single memory is given but In case of object multiple momeroy is provided
/// so, in case of utilizing less memory we use STATIC. 

class Student{
    String name;
    static String school;

    public static void changeSchool(){  // static method.
        school ="sjjsgs";
    }
}

public class StaticKeyword{
    public static void main(String args[]){
        Student.school = "xyz";  // Accessing static member (classname.membername);
        Student st1 = new Student();
        st1.name = "gtm";
        System.out.println(st1.school); // Accessing static value .

    }
}