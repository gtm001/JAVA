// CONSTRUCTOR
// --------------------Copy-Constructor-------------------------------------
class Student{
    String name;
    int age;

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    public void display(){
        System.out.println("name is : "+name);
        System.out.println("age is : "+age);
    }

    Student (){

    }
}
public class CopyConst{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "gautam";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.display();
    }
}

// ----------------------------------------------------------------------------------