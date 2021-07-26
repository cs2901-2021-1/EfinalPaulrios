package cs;

import java.security.SecureRandom;

public class Center {
    private int current = 0;
    private String name;
    Center(String name)
    {
        this.name = name;
    }
    SecureRandom myrandom = new SecureRandom();

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int addingrandomVac(int left)
    {
        if(left != 0)
        {
            current = myrandom.nextInt(1500) + 1000;
            if(left < current)
            {
                return left;
            }
            else {return current;}
        }
        return 0;
    }
}
