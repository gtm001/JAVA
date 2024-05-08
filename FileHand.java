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

// // -----------------------File properties------------------------------------------------------

// // import java.io.File;
// // class FileHand
// // {
// // public static void main(String args[])
// // {
// // try
// // {
// // File obj=new File("qrt.txt");
// // if(obj.createNewFile())
// // {
// // System.out.println("File created");
// // }
// // else
// // {
// // System.out.println("File already exist");
// // }
// // File obj2=new File("ns.doc");
// // if(obj2.createNewFile())
// // {
// // System.out.println("File created");
// // }
// // else
// // {
// // System.out.println("File already exist");
// // }
// // System.out.println(obj.canWrite());
// // System.out.println("Changing permission:- "+ obj.setWritable(false));
// // System.out.println(obj.canWrite());
// // System.out.println(obj.canRead());
// // System.out.println(obj.canExecute());
// // System.out.println(obj.getName());
// // System.out.println(obj.getParent());
// // System.out.println(obj.getFreeSpace());
// // System.out.println(obj.isFile());
// // System.out.println(obj.isHidden());
// // System.out.println(obj.lastModified());
// // System.out.println(obj.exists());
// // System.out.println("---------List of files in folder K22BK---------");
// // File obj3=new File("bank");
// // String listoffile[]=obj3.list();
// // for(String list:listoffile)
// // {
// // System.out.println(list);
// // }
// // System.out.println("File Deleted."+obj2.delete());
// // System.out.println("-----Creating directory-------");
// // File obj4=new File("Directory");
// // obj4.mkdir();
// // System.out.println("Is it directory:- "+obj4.isDirectory());
// // }
// // catch(Exception e){
// // e.printStackTrace();}}}

// // --------------------writing using FileInputStream----------------------------------------------------------
// import java.io.FileInputStream;
// class FileHand {
// public static void main(String args[]) {
// try {
// FileInputStream fil=new FileInputStream("aef.txt");
// // int i=fil.read();
// // int i;
// // while((i=fil.read())!=-1){
// //     System.out.print((char)i); // to read the content of the file.
// // }
// // System.out.println(i);
// // System.out.println((char)i);
// // System.out.println((char)fil.read());
// // int x=fil.available();
// // System.out.println(x);
// // System.out.println(fil.getChannel());
// // System.out.println(fil.getFD());
// fil.close();
// }
// catch(Exception e) {
// System.out.println(e);
// }
// }}

// ------------------reading using FileOutputStream-------------------------
// import java.io.FileOutputStream;
// class FileHand {
// public static void main(String args[]) {
// try {
// FileOutputStream fout=new FileOutputStream("abf.txt");
// fout.write(66);
// fout.write(69);
// String s1="CSE310 Programming in JAVA";
// byte b[]=s1.getBytes();
// fout.write(b);
// fout.close();

// // FileOutputStream fout1=new FileOutputStream("D:\\dummy\\testanother.doc");
// // fout1.write(78);
// // fout1.write(92);
// // String s2="CSE406 Advance java programming";
// // byte b1[]=s2.getBytes();
// // fout1.write(b1);
// // fout1.close();

// System.out.println("Data written in file.");
// }
// catch(Exception e)
// {
// System.out.println(e);
// }
// }
// }

// -------------------reading/writing using ObjectInput/Output Stream------------------------------------------------------------
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// class FileHand
// {
// public static void main(String shruti[])
// {
// String s="Hello K22BK students";
// int arr[]={23,78,45,91,1,290};
// try
// {
// FileOutputStream fout=new FileOutputStream("object.doc");
// ObjectOutputStream obj=new ObjectOutputStream(fout);
// obj.writeObject(s);
// obj.writeObject(arr);
// for(int x:arr)
// {
// obj.writeInt(x);
// }
// obj.flush();

// ObjectInputStream objin=new ObjectInputStream(new FileInputStream("object.doc"));
// System.out.println((String)objin.readObject());

// int[] readArr = (int[]) objin.readObject(); // Reading the array
// for (int i : readArr) {
// System.out.print(i + " "); // Printing the elements of the array
// }

// int i=objin.available();
// System.out.println("Available bytes:- "+ i);


// }
// catch(Exception e)
// {
// System.out.println(e);
// }
// }
// }
