package Calendar;

import java.util.Map;

public class WorkoutDay {
    private String day;
    private Map<String, String> listofWorkouts;

    WorkoutDay(String day, Map<String, String> listofWorkouts) {
        this.day = day;
        this.listofWorkouts = listofWorkouts;
    }
}
