import day1.Day1;
import day2.Day2;

public class AllDays {
    public static void main(String[] args) throws Exception {
        System.out.println("Running Day1\n");
        Day1 day1=new Day1();
        day1.main(new String[]{""});

        System.out.println("Running Day2\n");
        Day2 day2=new Day2();
        day2.main(new String[]{""});
    }
}
