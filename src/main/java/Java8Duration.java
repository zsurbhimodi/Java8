import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Java8Duration {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);
        System.out.println(d1.isNegative());
        Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d2.isNegative());

        Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d.get(ChronoUnit.SECONDS));


        
    }
}
