import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Java8Instance {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);




        Instant instant1 = Instant.parse("2017-02-03T11:25:30.00Z");
        instant1 = instant1.minus(Duration.ofDays(125));
        System.out.println(instant1);


        Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");
        Instant inst2 = inst1.plus(Duration.ofDays(125));
        System.out.println(inst2);


        Instant inst = Instant.parse("2017-02-03T11:35:30.00Z");
        System.out.println(inst.isSupported(ChronoUnit.DAYS));
        System.out.println(inst.isSupported(ChronoUnit.YEARS));
    }
}
