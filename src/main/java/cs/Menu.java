package cs;

import java.util.logging.Logger;

public class Menu {
    static final Logger logger = Logger.getLogger(Menu.class.getName());
    Menu(Inputclass input) {
        AppVac mainU = AppVac.getInstance();
        boolean login;
        do {
            logger.info("Ingrese: \n");
            login = mainU.login(input.getuser(), input.getpass());
        } while (!login);

        while (mainU.getState()) {
            logger.info("1. Mirar progreso\n" +
                    "2. Crear centro\n" +
                    "3. Cerrar un centro\n" +
                    "4. Cerrar cesion\n");
            int a = input.getstate();

            if (a == 1) {
                logger.info("Centros: " + mainU.getCenters());
                logger.info("Cobertura: " + ((mainU.getTotalPeople()- mainU.getLeft()) / mainU.getTotalPeople()));
                logger.info("Numero de personas vacunadas: " + (mainU.getTotalPeople()- mainU.getLeft()));
            } else if (a == 2) {
                if (mainU.getCenters() == 50) {
                    logger.info("Llego a un limite");
                } else {
                    mainU.centerList.add(new Center(String.valueOf(mainU.getCenters())));
                    mainU.setCenters(mainU.getCenters() + 1);
                }
            } else if (a == 4) {
                mainU.logout();
            }
            for (int i = 0; i < mainU.getCenters(); ++i) {
                var curr = mainU.centerList.get(i).addingrandomVac(mainU.getLeft());
                mainU.setLeft(mainU.getLeft() - curr);
            }
        }
    }}
