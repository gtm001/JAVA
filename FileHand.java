// ---------------------JAVA INPUT/OUTPUT-----------------------------------------------
// java.io Package is used.
// uses the concept of stream to make I/O operation fast!

// Stream is a sequence of data Composed of bytes.
// Example of type of stream:-
// System.out   (o/p stream).
// System.in    (i/p stream).
// System.err   (error stream).

// Read operation is done as InputStream from Source to java application and
// Write operation is done as OutputStream from java application to Destination.

// Note:- The Source/Destination may be TextFile or CMD.

// Methods of Output Stream Class are:-
// void write(int) throws IOException (use to write byte).
// void write(byte[]) throws IOException (use to write Array of byte).
// void flush() throws IOException (Flushes current stream).
// void close() throws IOException (closes current stream).

// Methods of Input Stream Class are:-
// int read() throws IOException    (read next byte).
// int available() throws IOException   (return number of available byte).
// void close()  throws IOException    (closes current InputStream).


// --------------------Code to create a new File--------------------------.
// import java.io.File;
// import java.io.IOException;
// class FileHand{
//     public static void main(String args[]){
//         try{
//         File file = new File("aef.txt");
//             file.createNewFile();
//         }
//         catch(Exception e){
//             e.printStackTrace();
//             System.out.println("Can't create file.");
//         }
//     }
// }

// -------------------Code to write in a file----------------------------
// import java.util.*;
// import java.io.FileWriter;
// import java.io.IOException;
// class FileHand{
//     public static void main(String args[]){
//         try{
//         FileWriter fw = new FileWriter("aef.txt");
//             fw.write("Hey!, How are you\nAre you fine?");
//             fw.close();
//         }
//         catch(Exception e){
//             System.out.println("Can't write");
//             e.printStackTrace();
//         }
//     }
// }

// ------------------code to reading a file---------------------
// import java.util.*;
// import java.io.File;
// import java.io.IOException;
// class FileHand{
//     public static void main(String args[]){
//         try{
//             File myfile = new File("aef.txt");
//             Scanner sc = new Scanner(myfile);
//             while(sc.hasNextLine()){
//                 String line = sc.nextLine();
//                 System.out.println(line);
//             }
//             sc.close();

//         }
//         catch(Exception e){
//             System.out.println("Can't Read!");
//         }
//     }
// }

// ------------------Deleting a File----------------------------------------
// import java.io.File;
// import java.io.IOException;
// class FileHand{
//     public static void main(String args[]){
//         try{
//         File myfile = new File("abf.txt");
//         myfile.delete();
//         System.out.println("File deleted "+myfile.getName());
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }

//     }
// }