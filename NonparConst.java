// CONSTRUCTOR--------------
// -------------------------1.Non-parametariec Constructor.--------------------
class Pen{
    //bluePrint or properties of a fxn are defined here!
    String color;
    String type;

    // Function defined in a class is called METHOD.
    public void write(){
        System.out.println("Write Something!");
    }

    public void printcolor(){
        System.out.println(this.color); // here, 'this' indicates that the which object is gonna call this METHOD.
    }

    Pen(){
        System.out.println("Non-Parametarised Constructor");
    }

    // Together property and Method is Called DATA and MEMBER of a Class.
}
class NonparConst{
    public static void main(String args[]){
        Pen pen1 = new Pen(); // Constructor
        // Object of class Pen is created!
        
        pen1.color = "blue" ; //object
        pen1.type = "ball";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color ="black";
        pen2.type ="ballpoint";

        pen1.printcolor();
        pen2.printcolor();
        
        
    }
}
     