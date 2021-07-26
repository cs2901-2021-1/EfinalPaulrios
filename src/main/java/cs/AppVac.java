package cs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class AppVac {
    private static AppVac instance;
    public String username;
    List<Center> centerList;
    public int centers = 1;
    public int totalPeople = 22935533;
    public int left = 22935533;
    public boolean state;

    public AppVac() {
        centerList = new ArrayList<>();
        centerList.add(new Center("0"));
    }

    public static AppVac getInstance() {
        if (instance == null) {
            instance = new AppVac();
        }
        return instance;
    }

    public boolean login(String name, String password)
    {
        StringBuilder input1 = new StringBuilder(password);
        input1.reverse();
        if (name.equals(input1.toString()))
        {
          state = true;
          return true;
        }return false;
    }
    public void logout()
    {
        this.state = false;
    }
}
