import java.time.Period;
import java.time.ZonedDateTime;

public class Java8ZoneId3 {
    public static void main(String[] args) {
        ZonedDateTime zone =ZonedDateTime.now();
        System.out.println(zone.getZone());

        ZonedDateTime m = zone.minus(Period.ofDays(366));
        System.out.println(m);

        ZonedDateTime p = zone.plus(Period.ofDays(126));
        System.out.println(p);
    }
}
