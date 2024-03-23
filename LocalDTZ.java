import java.time.*;
import java.time.format.DateTimeFormatter;
// import java.time.Month;
class LocalDTZ{
    public static void main(String args[]){
        LocalDate ld = LocalDate.of(2021,02,1);
        // LocalDate ld = LocalDate.of(2011,Month.JANUARY,1);
        System.out.println(ld);
        // ld = ld.plusDays(1);
        // System.out.println(ld);


        // LocalTime lt = LocalTime.of(12,2);
        // System.out.println(lt);
        // lt = lt.plusMinutes(2);
        // System.out.println(lt);

        // LocalDateTime ldt = LocalDateTime.of(ld,lt);
        // // System.out.println(ldt);

        // ZonedDateTime zdt = ZonedDateTime.of(ldt,ZoneId.of("Asia/Ust-Nera"));
        // System.out.println(zdt);

        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD MM YYYY");
        // System.out.println(dtf.format(ld)); 




    }
}

// Note:- Local DTZ are Immutable.