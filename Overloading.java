// ------------------------Polymorphism----------------------------------------
// it's of two type:-
// 1. OverLoading (compile-time polymorphism) 
// 2. OverRiding (Run-time polymorphism)

// in this we use function of same name for diffrent purpose.

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(int age){
        System.out.println("Age: "+age);
    }

    public void printInfo(String name){
        System.out.println("Name: "+name);
    }

    public void printInfo(int age, String name){
        System.out.println(name+" "+age);
    }

}
class Overloading{
    public static void main(String args[]){
        Student s = new Student("gautam",21);

        s.printInfo(s.age); // it'll print age.

        s.printInfo(s.name); // it'll print name.

        s.printInfo(s.age,s.name); // it'll print age and name.
    }
}

// Above is a example of Overloading.
// Overloading means "Many functions in a Single Class."

// it's a Compile-Time Polymorphism so, during the time of compilation it'll check that the 
// return type and the parameter of the function.
// like if the type of return and parameter is same then it'll not work!





