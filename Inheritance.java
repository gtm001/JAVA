// -----------------------Inheritance----------------------------------
// Inharitence is of 4 types:-
// 1. Single-Level inheritance
// 2. Multi-Level inheritance
// 3. Hierarchical-Level inheritance
// 4. Hybrid inheritance

// -------------------Single-Level Inheritance-----------------------
// In this The property of a Class is inherit by the another class.
// (PARENT class--->DERIVED class, andSoOn)


// class Shape{
//     public void area(){
//         System.out.println("display area")
//     }
// }
// class Triangle extends Shape{        // inherit properties from Shape class
//     public void area(int h, int b){
//      System.out.println(1/2*b*h);
//     }
// }
// class Inheritance{
//     public static void main(String args[]){
//     }
// }
// -------------------------------------------------------------------------

// -----------------------Multiple-Level Inheritance-------------------
// // (PARENT class--->DERIVED class ---->SubDERIVED class, andSoOn)

// class Shape{
//     public void area(){
//         System.out.println("display area")
//     }
// }
// class Triangle extends Shape{          // inherit properties from Shape class
//     public void area(int h, int b){
//         System.out.println(1/2*b*h);
//     }
// }
// class EquilateralTriangle extends Shape{     // inherit properties from Triangle class
//     public void area(int h, int b){
//         System.out.println(1/2*b*h);
//     }
// }

// class Inheritance{
//     public static void main(String args[]){

//     }
// }

// ---------------------------Hirarcial-Level Inheritance----------------------
//(PARAENT --->CHILD1  ,PARAENT --->CHILD2 , andSoOn ) 

// class Shape{
//     public void area(){
//         System.out.println("display area")
//     }
// }
// class Triangle extends Shape{          // inherit properties from Shape class
//     public void area(int h, int b){
//         System.out.println(1/2*b*h);
//     }
// }
// class Circle extends Shape{     // inherit properties from Shape class
//     public void area(float r){
//         System.out.println(3.14*r*r);
//     }
// }

// class Inheritance{
//     public static void main(String args[]){

//     }
// }

// ------------------------HYBRID-Inheritance-----------------------------
// Having mixed inheritance of Above!