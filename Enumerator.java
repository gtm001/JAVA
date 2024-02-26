// enum Direction{North,northeast,south,southeast,east,West;}
// class Enumerator{
//     public static void main(String...args){
//         for(Direction d:Direction.values()){
//             System.out.println(d);
//         }
//         System.out.println("value of North:- "+Direction.valueOf("North"));
//         System.out.println("Index of South:- "+Direction.valueOf("south").ordinal());
//     }
// }



// Enumeration.--------
// class Enumerator {
//     public static void main(String... args) {
//         for (Direction d : Direction.values()) {
//             System.out.println(d);
//         }
//         System.out.println("value of North: " + Direction.valueOf("North"));
//         System.out.println("Index of South: " + Direction.valueOf("South").ordinal());
//     }
// }

//Enum constructor---------
// enum Direction {North, Northeast, South, Southeast, East, West;}

// class Enumerator {
//     enum Dress{
//         jeans(80),tshirt(78),frock(23),coat(10);
//         private int x;
//         private Dress(int y)//enum constructor
//         {
//             x=y;
//         }
//     }
//     public static void main(String... args) {
//         for (Dress d : Dress.values()) {
//         // System.out.println(d);
//         System.out.println(d+"\t"+d.x);
//     }
// }
// }

// Enum without Class--------
// enum color{
//     black,white,pink,purple,red,blue,organge,green,yellow;

//     public static void main(String...shruti){
//         color c = color:purple;
//         System.out.println(c);
//     }
// }

// VarArguments--------
// class Enumerator{
//     static void show(int a,String... s){
//         System.out.println("Value of mandatory arguments is :- "+a);
//         for(String value:s){
//             System.out.println(value);
//         }
//     }


// public static void main(String args[]){
//     show(67);
//     show(78,"Hello");
//     show(90,"Hello","Java");
//     show(56,"I","am","Varargs");
// }
// }

 



