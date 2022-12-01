package Goal;

import java.util.List;

import User.User;
import org.jetbrains.annotations.NotNull;

public abstract class WorkoutGoal {
    private List<Object> userList;

    @NotNull
    public abstract String getGoal();

    public abstract void setGoal(@NotNull String var1);

    public final @NotNull List getUserList() {
        return this.userList;
    }

    public final void setUserList(@NotNull List var1) {
        this.userList = var1;
    }

    public final void addUser(@NotNull User person) {
        this.userList.add(person);
    }

    public abstract void showList();

    public WorkoutGoal(@NotNull List listUser) {
        super();
        this.userList = listUser;
    }
}
