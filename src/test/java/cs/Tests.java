package cs;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.String;
import java.util.logging.Logger;
public class Tests {

    @Test
    public void test1()
    {
        Center a = new Center("a");
        var temp = a.getCurrent();
        a.setCurrent(1000);
        var temps = a.getName();
        a.setName("temp");
        temp = a.addingrandomVac(10000);
        temp = a.addingrandomVac(0);
    }
    @Test
    public void test2()
    {
        AppVac vac = AppVac.getInstance();
        vac.login("hola", "no");

        vac.login("hola", "aloh");
        vac.logout();
        var temp = vac.getCenters();
        temp = vac.getLeft();
        temp = vac.getTotalPeople();
        vac.setLeft(310);
        vac.setCenters(20);
    }
    @Test
    public void test3()
    {
        var  main = new Main();
        Main.main(new String[]{"xd"});
    }



}
