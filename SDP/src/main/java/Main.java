import Goal.Bulking;
import Goal.Cutting;
import Goal.Maintaining;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import User.User;
import org.jetbrains.annotations.NotNull;

public final class Main {
    public static final void main(@NotNull String[] args) {
        String var1 = "Hello World!";
        System.out.println(var1);
        System.out.println(var1);

        List bulkList = (List)(new ArrayList());
        List mainList = (List)(new ArrayList());
        List cutList = (List)(new ArrayList());
        Map dumSet = (Map)(new LinkedHashMap());
        dumSet.put("S1", "OverheadPress");
        dumSet.put("S2", "Lat Raise");
        dumSet.put("S3", "Hello");
        Set var6 = dumSet.keySet();
        System.out.println(var6);

        for(int tempAmountOfUsers = 100; tempAmountOfUsers > 0; --tempAmountOfUsers) {
            int gender = (new Random()).nextInt(0, 2);
            int goal = (new Random()).nextInt(0, 3);
            User tempUser = new User((new Random()).nextInt(16, 50), (new Random()).nextDouble(100.0, 300.0), (new Random()).nextDouble(150.0, 200.0), (new Random()).nextDouble(5.0, 30.0), goal(goal), gender(gender), (new Random()).nextDouble(10.0, 20.0), (new Random()).nextDouble(90.0, 153.0));
            if (goal(goal).equals("Cutting")) {
                cutList.add(tempUser);
            } else if (goal(goal).equals("Maintaining")) {
                mainList.add(tempUser);
            } else {
                bulkList.add(tempUser);
            }
        }

        new Bulking(bulkList);
        Maintaining mainGen = new Maintaining(mainList);
        new Cutting(cutList);
        mainGen.showList();
    }

    @NotNull
    public static final String goal(int goal) {
        if (goal == 0) {
            return "Cutting";
        } else {
            return goal == 1 ? "Bulking" : "Maintaining";
        }
    }

    @NotNull
    public static final String gender(int gender) {
        return gender == 0 ? "Male" : "Female";
    }
}
