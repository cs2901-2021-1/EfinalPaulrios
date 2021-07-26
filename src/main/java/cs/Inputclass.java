package cs;

import java.util.Scanner;

public class Inputclass {
    Scanner a = new Scanner(System.in);

    public String getpass()
    {
        System.out.print("Contraseña: \n");
        return a.nextLine();
    }
    public String getuser()
    {
        System.out.print("Usuario: \n");
        return a.nextLine();
    }
    public int getstate()
    {
        System.out.print("state: \n");
        return a.nextInt();
    }
}
