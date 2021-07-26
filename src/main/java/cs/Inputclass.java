package cs;

import java.util.Scanner;
import java.util.logging.Logger;

public class Inputclass {
    static final Logger logger = Logger.getLogger(Inputclass.class.getName());
    Scanner a = new Scanner(System.in);

    public String getpass()
    {
        logger.info("Contraseña: \n");
        return a.nextLine();
    }
    public String getuser()
    {
        logger.info("Usuario: \n");
        return a.nextLine();
    }
    public int getstate()
    {
        logger.info("state: \n");
        return a.nextInt();
    }

}
