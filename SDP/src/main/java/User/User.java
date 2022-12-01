package User;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
/*
@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BG\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005J\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0012J\u0006\u0010\u001b\u001a\u00020\tJ\u001a\u0010\u001c\u001a\u00020\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001e"},
        d2 = {"LUser;", "", "age", "", "weight", "", "height", "bodyFat", "goal", "", "gender", "time", "rate", "(IDDDLjava/lang/String;Ljava/lang/String;DD)V", "fitLevel", "heartRate", "walkTime", "workout", "", "VO2Max", "extractWorkout", "", "getBodyFat", "getGoal", "getHeight", "getWeight", "getWorkout", "getfitLevel", "setWorkout", "workouts", "FitnessApp"}
)

 */
public final class User {
    private int age;
    private double weight;
    private double height;
    private double bodyFat;
    private String gender;
    private String goal;
    private double walkTime;
    private double heartRate;
    private String fitLevel;
    private Map workout;

    public User() {

    }

    public final double getWeight() {
        return this.weight;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getBodyFat() {
        return this.bodyFat;
    }

    @NotNull
    public final String getGoal() {
        return this.goal;
    }

    public final void setWorkout(@NotNull Map workouts) {
        this.workout = workouts;
    }

    @NotNull
    public final String getfitLevel() {
        return this.fitLevel();
    }

    public final void extractWorkout() {
    }

    @NotNull
    public final Map getWorkout() {
        return this.workout;
    }

    public final double VO2Max() {
        double value = 132.853 - 0.07769 * this.weight - 0.3877 * (double)this.age;
        double temp = 0.0;
        if (this.gender.equals("Male")) {
            temp = 6.315;
        }

        double value2 = temp - 3.2649 * this.walkTime - 0.1565 * this.heartRate;
        value += value2;
        return value;
    }

    @NotNull
    public final String fitLevel() {
        double vO2Max = this.VO2Max();
        if (this.gender.equals("Male")) {
            if (this.age > 13 && this.age < 19) {
                if (vO2Max < 25.0) {
                    return "Very Poor";
                }

                if (vO2Max >= 25.0 && vO2Max < (double)31) {
                    return "Poor";
                }

                if (vO2Max >= 31.0 && vO2Max < (double)35) {
                    return "Fair";
                }

                if (vO2Max >= 35.0 && vO2Max < (double)39) {
                    return "Good";
                }

                if (vO2Max >= 39.0 && vO2Max < (double)42) {
                    return "Excellent";
                }

                return "Superior";
            }

            if (this.age >= 20 && this.age < 30) {
                if (vO2Max < 23.6) {
                    return "Very Poor";
                }

                if (vO2Max >= 23.6 && vO2Max < (double)29) {
                    return "Poor";
                }

                if (vO2Max >= (double)29 && vO2Max < (double)33) {
                    return "Fair";
                }

                if (vO2Max >= (double)33 && vO2Max < (double)37) {
                    return "Good";
                }

                if (vO2Max >= (double)37 && vO2Max < (double)41) {
                    return "Excellent";
                }

                return "Superior";
            }

            if (this.age >= 30 && this.age < 40) {
                if (vO2Max < 22.8) {
                    return "Very Poor";
                }

                if (vO2Max >= 22.8 && vO2Max < (double)27) {
                    return "Poor";
                }

                if (vO2Max >= (double)27 && vO2Max < 31.5) {
                    return "Fair";
                }

                if (vO2Max >= 31.5 && vO2Max < 35.7) {
                    return "Good";
                }

                if (vO2Max >= 35.7 && vO2Max < 40.1) {
                    return "Excellent";
                }

                return "Superior";
            }

            if (this.age >= 40 && this.age < 50) {
                if (vO2Max < 21.0) {
                    return "Very Poor";
                }

                if (vO2Max >= 21.0 && vO2Max < 24.5) {
                    return "Poor";
                }

                if (vO2Max >= 24.5 && vO2Max < (double)29) {
                    return "Fair";
                }

                if (vO2Max >= 29.0 && vO2Max < 32.9) {
                    return "Good";
                }

                if (vO2Max >= 32.9 && vO2Max < (double)37) {
                    return "Excellent";
                }

                return "Superior";
            }
        }

        if (this.gender.equals("Female")) {
            if (this.age > 13 && this.age < 19) {
                if (vO2Max < 35.0) {
                    return "Very Poor";
                }

                if (vO2Max >= 35.0 && vO2Max < 38.4) {
                    return "Poor";
                }

                if (vO2Max >= 38.4 && vO2Max < 45.2) {
                    return "Fair";
                }

                if (vO2Max >= 45.2 && vO2Max < (double)51) {
                    return "Good";
                }

                if (vO2Max >= 51.0 && vO2Max < (double)56) {
                    return "Excellent";
                }

                return "Superior";
            }

            if (this.age >= 20 && this.age < 30) {
                if (vO2Max < 33.0) {
                    return "Very Poor";
                }

                if (vO2Max >= 33.0 && vO2Max < 36.5) {
                    return "Poor";
                }

                if (vO2Max >= 36.5 && vO2Max < 42.5) {
                    return "Fair";
                }

                if (vO2Max >= 42.5 && vO2Max < 46.5) {
                    return "Good";
                }

                if (vO2Max >= 46.5 && vO2Max < 52.5) {
                    return "Excellent";
                }

                return "Superior";
            }

            if (this.age >= 30 && this.age < 40) {
                if (vO2Max < 31.5) {
                    return "Very Poor";
                }

                if (vO2Max >= 31.5 && vO2Max < 35.5) {
                    return "Poor";
                }

                if (vO2Max >= 35.5 && vO2Max < (double)41) {
                    return "Fair";
                }

                if (vO2Max >= 41.0 && vO2Max < (double)45) {
                    return "Good";
                }

                if (vO2Max >= (double)45 && vO2Max < 49.5) {
                    return "Excellent";
                }

                return "Superior";
            }

            if (this.age >= 40 && this.age < 50) {
                if (vO2Max < 30.2) {
                    return "Very Poor";
                }

                if (vO2Max >= 30.2 && vO2Max < 33.6) {
                    return "Poor";
                }

                if (vO2Max >= 33.6 && vO2Max < (double)39) {
                    return "Fair";
                }

                if (vO2Max >= 39.0 && vO2Max < 43.8) {
                    return "Good";
                }

                if (vO2Max >= 43.8 && vO2Max < 48.1) {
                    return "Excellent";
                }

                return "Superior";
            }
        }

        return "Not enough variables";
    }

    public User(int age, double weight, double height, double bodyFat, @NotNull String goal, @NotNull String gender, double time, double rate) {
        super();
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bodyFat = bodyFat;
        this.goal = goal;
        this.gender = gender;
        this.walkTime = time;
        this.heartRate = rate;
        this.fitLevel = this.fitLevel();
    }
}
