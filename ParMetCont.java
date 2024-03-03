// CONSTRUCTOR
//---------------------- Parametrised Constructor -------------------

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Parametrised Constructor.
    Student(String name, int age){
        this.name = name;  // this.name--name of object , name-- name of parameter.
        this.age = age;  
    }
}

class ParMetCont{
    public static void main(String args[]){

        Student s1 = new Student("gautam" , 21); // calling PARAMETRISED constructor!
        s1.printInfo();

    }
}