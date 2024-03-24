// -----------Runnable Interface (Thread) -------------
// class Lambdaex{
//     public static void main(String args[]){
//         Runnable r1=()->{
//             System.out.println("Thread is running");
//         };

//         Thread t1 = new Thread(r1);
//         t1.start();
//     }
// }

// -------------------------------------------------
class alphabet implements Runnable{
    public void run(){
        for(int i=65;i<92;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
        System.out.println("Alphabets class ended");
    }
}
class number implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){

            }
        }
        System.out.println("Number class ended");
    }
}
class Lambdaex{
    public static void main(String args[]){
        alphabet a = new alphabet();
        Thread t1 = new Thread(a);
        t1.start();
        number n = new number();
        Thread t2 = new Thread(n);
        t2.start();
    }
}