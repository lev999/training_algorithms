package from_Exam;

/**
 * Created by pc-users on 6/22/2015.
 */
public class Clock_angle {
    public static void main(String[] args) {
        int hour,minute;
        hour=12;
        minute=30;
        System.out.println(hour+" h"+","+minute+" min");
        System.out.println("Answer: angle: "+(Math.abs(angleHour(hour,minute)-angleMinute(minute))));
        System.out.println("Exact solution: "+Math.abs((5.5*minute-30*hour))+"(5.5*minute-30*hour)");
    }

    private static double angleMinute(int minute) {

        return minute*6;
    }

    private static double angleHour(int hour, int minute) {
        return (hour*30)+((double)minute/60)*30;
    }



}
