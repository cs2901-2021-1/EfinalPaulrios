package cs;

import java.security.SecureRandom;

public class Center {
    public int current = 0;
    public String name;
    Center(String name)
    {
        this.name = name;
    }
    SecureRandom myrandom = new SecureRandom();

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
