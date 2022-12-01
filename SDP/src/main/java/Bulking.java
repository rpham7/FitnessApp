
import java.util.Iterator;
import java.util.List;

import Goal.WorkoutGoal;
import User.User;
import org.jetbrains.annotations.NotNull;

public final class Bulking extends WorkoutGoal {
    @NotNull
    private String goal;

    @NotNull
    public String getGoal() {

        return this.goal;
    }

    public void setGoal(@NotNull String var1) {
        this.goal = var1;
    }

    public void showList() {
        Iterator var2 = this.getUserList().iterator();

        while(var2.hasNext()) {
            User items = (User)var2.next();
            String var3 = items.getfitLevel();
            System.out.println(var3);
        }

    }
    public Bulking(@NotNull List listUser) {
        super(listUser);
        this.goal = "bulking";
    }
}
