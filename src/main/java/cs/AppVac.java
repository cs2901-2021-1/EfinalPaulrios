package cs;

import java.util.ArrayList;
import java.util.List;

public final class AppVac {
    private static AppVac instance;
    List<Center> centerList;
    private int centers = 1;
    private int totalPeople = 22935533;
    private int left = 22935533;
    private boolean state;

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

    public int getCenters() {
        return centers;
    }

    public void setCenters(int centers) {
        this.centers = centers;
    }

    public int getTotalPeople() {
        return totalPeople;
    }

    public int getLeft() {
        return this.left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public boolean getState() {
        return state;
    }
}
