import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        System.out.println("Period: start " + start + " end " + end);
        start.setMonth(8);
        RecordPeriod recordPeriod = new RecordPeriod(LocalDate.now(), LocalDate.now());
        System.out.println("RecordPeriod " +recordPeriod);
        for (Color color : Color.values()) {
            color.printDescription();
        }
    }
}
