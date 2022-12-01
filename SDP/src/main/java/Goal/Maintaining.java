package Goal;

import java.util.Iterator;
import java.util.List;

import User.User;
import org.jetbrains.annotations.NotNull;

public final class Maintaining extends WorkoutGoal {
    @NotNull
    private String goal;

    @NotNull
    public String getGoal() {

        return this.goal;
    }

    public void setGoal(@NotNull String goal) {
        this.goal = goal;
    }

    public void showList() {
        Iterator it = this.getUserList().iterator();

        while(it.hasNext()) {
            User items = (User)it.next();
            System.out.println(items.getfitLevel());
        }

    }

    public Maintaining(@NotNull List listUser) {
        super(listUser);
        this.goal = "Maintaining";
    }
}
