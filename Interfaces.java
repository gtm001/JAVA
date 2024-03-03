// ----------------------interface------------------------------------
// It is use for pure Abstraction.
// Non-abstracted method is not allowed inside interface class.
// implements key-word is use to link interface class.

// Properties of interfaces:-
// 1. All the fields in interfaces are public, static and final bydefault.
// 2. All methods are public and abstract bydefault.
// 3. A class that implements an interface must implement all the methods declared in the interface.
// 4. interfaces support the functionality of multiple inheritance.

// Note:- Here,In JAVA Multiple Inheritance can only be done through Interfaces It'll not possible with Inheritance.


interface Animal{
    int eye = 2;  //property 1.
    void walk();  // property 2.
}

interface Herbivore{

}

class Horse implements Animal, Herbivore{   // proprty 4 (multiple inheritance).
    public void walk(){
        System.out.println("Walks on 4 legs.");
    }
}

class Interfaces{
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}