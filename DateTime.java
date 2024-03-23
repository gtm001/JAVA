
// this is mutable.
// import java.util.Date; // library to deal with date and time in java.
// class DateTime{
//     public static void main(String args[]){
//         // System.out.println(System.currentTimeMillis()); // return total sec until now since 1970 in Milli sec.
//         Date d = new Date();
//         System.out.println(d); // gives current date and time.
//         System.out.println(d.getTime()); // give time in milisecond.
//         System.out.println(d.getDate()); // give today's date.
//         System.out.println(d.getSeconds()); // give current second of the hour.
//         System.out.println(d.getHours()); // give current hour.
//         System.out.println(d.getYear()); // count of year after 1900.

//     }
// }

// -----------Local time------------------------
// import java.time.*;
// class DateTime{
//     public static void main(String args[]){
//         // LocalDate ld = LocalDate.now();
//         // System.out.println(ld);

//         // Scanner sc = new Scanner(System.in);
//         LocalDate ld = LocalDate.of(2021,3,1);
//         // System.out.println(ld);

//         // LocalTime lt = LocalTime.now();
//         LocalTime lt = LocalTime.of(02,1);
//         // System.out.println(ld);

//         // LocalDateTime ldt = LocalDateTime.of(ld,lt);
//         // System.out.println(ldt);

//     }
// }

//-----------------DateTimeFormatter-------------------
// import java.util.*;
// import java.time.*;
// import java.time.format.DateTimeFormatter;
// class DateTime{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int n3 = sc.nextInt();
//         LocalDate dt = LocalDate.of(n1,n2,n3);
//         // LocalDate dt = LocalDate.of(2010,07,2);
//         DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//         String date = dt.format(df);
//         String month = dt.getMonth().name();
//         System.out.println(date);
//         System.out.println(month);
//     }
// }

// ----------questions--------------------
// use date class to print 21:32:45.
import java.time.*;
class DateTime{
    public static void main(String args[]){
        LocalTime lt = LocalTime.of(21,32,45);
        System.out.println(lt);

    }
}

 