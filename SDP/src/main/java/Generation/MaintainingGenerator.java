package Generation;

import Goal.Maintaining;

import java.util.*;

import User.User;
import org.jetbrains.annotations.NotNull;

public final class MaintainingGenerator {
    @NotNull
    private Maintaining Maintaining;
    @NotNull
    private Map<String, String> workouts;
    @NotNull
    private User user;
    @NotNull
    private final String nutrients;

    public MaintainingGenerator(@NotNull Maintaining Maintaining, @NotNull User user) {
        this.nutrients = "Reminder to consume about the same each as before!";
        //SQLExtraction temp = new SQLExtraction("root", "7230");
        this.Maintaining = Maintaining;
        //this.workouts = temp.extractWorkouts();
        this.user = user;
    }

    @NotNull
    public final Maintaining getMaintaining() {
        return this.Maintaining;
    }

    public final void setMaintaining(@NotNull Maintaining var1) {

        this.Maintaining = var1;
    }

    @NotNull
    public final Map getWorkouts() {
        return this.workouts;
    }

    public final void setWorkouts(@NotNull Map<String, String> workouts) {
        this.workouts = workouts;
    }

    @NotNull
    public final User getUser() {
        return this.user;
    }

    public final void setUser(@NotNull User user) {
        this.user = user;
    }

    @NotNull
    public final String getNutrients() {
        return this.nutrients;
    }

    public final void generate() {
        List temp = this.Maintaining.getUserList();
        String fitLevel = this.user.getfitLevel();
        List listComparison = new ArrayList<User>();
        Iterator it = temp.iterator();

        while(it.hasNext()) {
            User userTemp = (User)it.next();
            if (Math.abs(this.user.getBodyFat() - userTemp.getBodyFat()) <= (double)1 && Math.abs(this.user.getHeight() - userTemp.getHeight()) <= (double)5 && Math.abs(this.user.getWeight() - userTemp.getWeight()) <= (double)10) {
                listComparison.add(userTemp);
            }
        }

        Map listOfWorkouts = new HashMap<String, String>();
        Iterator it2 = listComparison.iterator();

        while(it2.hasNext()) {
            User userTempShortenList = (User)it2.next();
            if (listOfWorkouts.isEmpty()) {
                listOfWorkouts = userTempShortenList.getWorkout();
            } else {
                Map<String, String> tempUserWorkout = userTempShortenList.getWorkout();
                Iterator iteratorWorkout = tempUserWorkout.entrySet().iterator();
                while(iteratorWorkout.hasNext()) {
                    Map.Entry workouts = (Map.Entry)iteratorWorkout.next();
                    listOfWorkouts.put(workouts.getKey(), workouts.getValue());
                }
            }
        }

        Map<String, String> workoutRoutine = new HashMap<String, String>();
        Map.Entry workouts;
        Iterator workoutIterator;
        if (fitLevel.equals("Very Poor")) {
            workoutIterator = listOfWorkouts.entrySet().iterator();

            while(workoutIterator.hasNext()) {
                workouts = (Map.Entry) workoutIterator.next();
                String tempKey = (String) workouts.getKey();
                if (tempKey.endsWith("1") | tempKey.endsWith("2") | tempKey.endsWith("3")) {
                    workoutRoutine.put((String) workouts.getKey(), (String) workouts.getValue());
                }
            }
        } else if (fitLevel.equals("Poor")) {
            workoutIterator = listOfWorkouts.entrySet().iterator();

            while(workoutIterator.hasNext()) {
                workouts = (Map.Entry) workoutIterator.next();
                String tempKey = (String) workouts.getKey();
                if (tempKey.endsWith("1") | tempKey.endsWith("2") | tempKey.endsWith("3")) {
                    workoutRoutine.put((String) workouts.getKey(), (String) workouts.getValue());
                }
            }
        } else if (fitLevel.equals("Fair")) {
            workoutIterator = listOfWorkouts.entrySet().iterator();

            while(workoutIterator.hasNext()) {
                workouts = (Map.Entry) workoutIterator.next();
                String tempKey = (String) workouts.getKey();
                if (tempKey.endsWith("1") | tempKey.endsWith("2") | tempKey.endsWith("3") | tempKey.endsWith("4")) {
                    workoutRoutine.put((String) workouts.getKey(), (String) workouts.getValue());
                }
            }
        } else if (fitLevel.equals("Good")) {

            workoutIterator = listOfWorkouts.entrySet().iterator();

            while(workoutIterator.hasNext()) {
                workouts = (Map.Entry) workoutIterator.next();
                String tempKey = (String) workouts.getKey();
                if (tempKey.endsWith("1") | tempKey.endsWith("2") | tempKey.endsWith("3") | tempKey.endsWith("4")) {
                    workoutRoutine.put((String) workouts.getKey(), (String) workouts.getValue());
                }
            }
        } else if (fitLevel.equals("Excellent")) {
            workoutIterator = listOfWorkouts.entrySet().iterator();

            while(workoutIterator.hasNext()) {
                workouts = (Map.Entry) workoutIterator.next();
                String tempKey = (String) workouts.getKey();
                if (tempKey.endsWith("1") | tempKey.endsWith("2") | tempKey.endsWith("3") | tempKey.endsWith("4")) {
                    workoutRoutine.put((String) workouts.getKey(), (String) workouts.getValue());
                }
            }
        } else {
            workoutIterator = listOfWorkouts.entrySet().iterator();

            while(workoutIterator.hasNext()) {
                workouts = (Map.Entry) workoutIterator.next();
                String tempKey = (String) workouts.getKey();
                if (tempKey.endsWith("1") | tempKey.endsWith("2") | tempKey.endsWith("3") | tempKey.endsWith("4")) {
                    workoutRoutine.put((String) workouts.getKey(), (String) workouts.getValue());
                }
            }
        }

        this.user.setWorkout(workoutRoutine);

    }
}
