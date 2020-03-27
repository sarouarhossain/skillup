package date_test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args){
        String x = "20000101";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd").withZone(ZoneId.of("UTC"));
        DateTimeFormatter DATASTREAM = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'");

        String y = LocalDate.parse(x,formatter).atStartOfDay(ZoneId.of("UTC")).toOffsetDateTime().format(DATASTREAM);
        System.out.println("Test: "+y);
    }
}
