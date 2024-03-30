// import java.time.LocalDate;
// class DateTime{
//     public static void main(String args[]){
//         LocalDate date = LocalDate.now();
//         System.out.println("Today date is:- "+date);
//         LocalDate yesterday = date.minusDays(2);
//         System.out.println("Yesterday's date :- "+yesterday);
//         LocalDate tommrow = date.plusDays(1);
//         System.out.println("Tommrow's date is :- "+tommrow);

//         System.out.println(date.getYear());
//         System.out.println(date.getMonth());
//         System.out.println(date.getMonthValue());
//         System.out.println(date.isLeapYear());
//         System.out.println(date.getDayOfMonth());
//         System.out.println(date.plusMonths(2));

//         LocalDate date1 = LocalDate.of(2024,4,10);
//         System.out.println(date1.getDayOfWeek());
//         System.out.println(date1.lengthOfYear());
//         System.out.println(date1.lengthOfMonth());
//         System.out.println(date1.getDayOfYear());

//         String str = "2026-05-24";
//         LocalDate date2 = LocalDate.parse(str);
//         System.out.println("Using parse method:-"+date2);

//     }
// }

// ------------------------------------
// import java.time.*;
// import java.time.LocalTime;
// class DateTime{
//     public static void main(String args[]){
//         LocalTime time1 = LocalTime.of(10,50,25);
//         System.out.println(time1);

//         LocalTime time2 = LocalTime.now();
//         System.out.println(time2);
//         System.out.println(time2.getHour());
//         System.out.println(time2.getMinute());
//         System.out.println(time2.getSecond());
//         System.out.println(time2.getNano());

//         LocalTime time3 = time2.minusHours(2);
//         System.out.println(time3);
//         LocalTime time4 = time2.minusMinutes(23);
//         System.out.println(time4);
//         System.out.println(time1.plusHours(2));
//         System.out.println(time1.plusMinutes(12));

//         ZoneId zone = ZoneId.of("Asia/Kolkata");
//         LocalTime lt = LocalTime.now(zone);
//         System.out.println(lt);
//     }
// }

// ------------------------------------------------------------------
// import java.time.*;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// class DateTime{
//     public static void main(String args[]){
//         LocalDateTime now = LocalDateTime.now();
//         System.out.println("Before Formatting:- "+now);
//         System.out.println(now.plusDays(100));
//         System.out.println(now.minusDays(50));

//         DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy mm:HH:ss");
//         String formatDateTime = now.format(df);
//         System.out.println("After formatting :- "+formatDateTime);
//     }
// }

// ----------------------------------------------------------------------
// import java.time.*;
// class DateTime{
//     public static void main(String args[]){
//         LocalDateTime ldt = LocalDateTime.of(2024,Month.MARCH,29,16,52);
//         ZonedDateTime zone = ZonedDateTime.now();
//         System.out.println(zone.getZone());
//     }
// }
// ------------------------------------------------------------------------