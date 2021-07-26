package cs;

public class Main {

    public static void main(String[] args) {
        AppVac mainU = AppVac.getInstance();
        Inputclass input = new Inputclass();
        boolean login;
        do
        {
            System.out.print("Ingrese: \n");

            login = mainU.login(input.getuser(), input.getpass());
        }while(login);

        while (mainU.state)
        {
            int a = input.getstate();
            System.out.print("1. Mirar progreso\n" +
                    "2. Crear centro\n" +
                    "3. Cerrar un centro\n" +
                    "4. Cerrar cesion\n");
            if(a == 1)
            {
                System.out.print("Centros: " + mainU.centers);
                System.out.print("Cobertura: " + (mainU.left/mainU.totalPeople));
                System.out.print("Numero de personas vacunadas: " + mainU.left);
            }
            else if(a==2)
            {
                mainU.centerList.add(new Center(String.valueOf(mainU.centers)));
                mainU.centers =+ 1;
            }
            else if(a==4)
            {
                mainU.logout();
            }
            for (int i=0; i < mainU.centers;++i)
            {
                var curr = mainU.centerList.get(i).addingrandomVac(mainU.left);
                mainU.left =- curr;
            }


        }
    }

}
