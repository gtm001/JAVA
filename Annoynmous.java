// -------Annoynmous Class------------------------------
abstract class Student{
    abstract void detail();
}
class Annoynmous{
    public static void main(String args[]){
        Student obj = new Student(){
            void detail(){
                System.out.println("Univercity Lpu");
            }
        };
        obj.detail();
    }
}