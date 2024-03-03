// --------------------Abstraction------------------------------------------------
abstract class Animal{
    public void walk(){

    }

    // abstract void walk();  it will not give access to th walk method and we'll get error!
    Animal(){ // Constructor
        System.out.println("You are creating a new Animal.");
    }

    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse!");
    }
    public void walk(){
        System.out.println("Walk with 4 legs!");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken created!");
    }
    public void main(){
        System.out.println("Walk witth 2 legs!");
    }
}

class Abstraction{
    public static void main(String args[]){
        Horse horse = new Horse(); // first base class Contructor is called and then sub-class constructor will called( it's called constructor chaining!).
    }
}

// Abstraction is just a Concept!
// Here Above, Animal class is just a Abstract concept or a Blue-print we can't use it!.

// Propeties of Abstract Class:-
// 1. A abstrcat class must be delacred with the abstract keyword.
// 2. It can have Abstract as well as Non-abstract methods also!
// 3. It can't be Initialised (if you do so, you'll get Run-time error!);
// 4. It can have Constructor and Static Methods also!.
// 5. It can have final method which will force the subclass not to change the body of the method. 
