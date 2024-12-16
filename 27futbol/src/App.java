import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Entrenador entrenadorEspaña = new Entrenador(1, "Luis Enrique", "Martínez",
                "1970-05-08", 75.0, 1.83, 1001);
        Entrenador entrenadorArgentina = new Entrenador(2, "Lionel Scaloni",
                "Scaloni", "1978-05-16", 78.0, 1.85, 1002);

        Futbolista futbolistaEspaña1 = new Futbolista(1, "Sergio Ramos", "Ponce",
                "1986-03-30", 80.0, 1.82, 4, "Defensa");
        Futbolista futbolistaEspaña2 = new Futbolista(2, "David de Gea", "Fernández",
                "1990-11-07", 95.0, 1.92, 1, "Portero");
        Futbolista futbolistaEspaña3 = new Futbolista(3, "Gerard Piqué", "Moya",
                "1987-02-04", 85.0, 1.94, 3, "Defensa");
        Futbolista futbolistaEspaña4 = new Futbolista(4, "Andrés Iniesta", "Luján",
                "1984-05-11", 68.0, 1.71, 6, "Centrocampista");
        Futbolista futbolistaEspaña5 = new Futbolista(5, "Iker Casillas",
                "Fernández", "1981-05-20", 84.0, 1.87, 13, "Portero");
        Futbolista futbolistaEspaña6 = new Futbolista(6, "Cesc Fàbregas", "Soler",
                "1987-05-04", 74.0, 1.80, 10, "Centrocampista");
        Futbolista futbolistaEspaña7 = new Futbolista(7, "Xavi Hernández", "Cruz",
                "1980-01-25", 70.0, 1.70, 8, "Centrocampista");
        Futbolista futbolistaArgentina1 = new Futbolista(8, "Lionel Messi",
                "Cuccittini", "1987-06-24", 72.0, 1.70, 10, "Delantero");
        Futbolista futbolistaArgentina2 = new Futbolista(9, "Sergio Agüero", "Del Castillo", "1988-06-02", 80.0, 1.73,
                9, "Delantero");
        Futbolista futbolistaArgentina3 = new Futbolista(10, "Ángel Di María",
                "Hernández", "1988-02-14", 75.0, 1.80, 11, "Extremo");
        Futbolista futbolistaArgentina4 = new Futbolista(11, "Gonzalo Higuaín",
                "González", "1987-12-10", 88.0, 1.85, 9, "Delantero");
        Futbolista futbolistaArgentina5 = new Futbolista(12, "Ezequiel Garay",
                "Ramos", "1986-10-10", 85.0, 1.88, 22, "Defensa");
        Futbolista futbolistaArgentina6 = new Futbolista(13, "Javier Mascherano",
                "Pereyra", "1984-06-08", 75.0, 1.74, 14, "Centrocampista");
        Futbolista futbolistaArgentina7 = new Futbolista(14, "Nicolás Otamendi",
                "Pérez", "1988-02-12", 80.0, 1.85, 17, "Defensa");

        // SeleccionFutbol seleccionEspaña = new SeleccionFutbol(1, "España");
        // SeleccionFutbol seleccionArgentina = new SeleccionFutbol(2, "Argentina");

        // seleccionEspaña.addPersona(entrenadorEspaña);
        // seleccionArgentina.addPersona(entrenadorArgentina);

        // seleccionEspaña.addPersona(futbolistaEspaña1);
        // seleccionEspaña.addPersona(futbolistaEspaña2);
        // seleccionEspaña.addPersona(futbolistaEspaña3);
        // seleccionEspaña.addPersona(futbolistaEspaña4);
        // seleccionEspaña.addPersona(futbolistaEspaña5);
        // seleccionEspaña.addPersona(futbolistaEspaña6);
        // seleccionEspaña.addPersona(futbolistaEspaña7);

        // seleccionArgentina.addPersona(futbolistaArgentina1);
        // seleccionArgentina.addPersona(futbolistaArgentina2);
        // seleccionArgentina.addPersona(futbolistaArgentina3);
        // seleccionArgentina.addPersona(futbolistaArgentina4);
        // seleccionArgentina.addPersona(futbolistaArgentina5);
        // seleccionArgentina.addPersona(futbolistaArgentina6);
        // seleccionArgentina.addPersona(futbolistaArgentina7);

        Mundial mundial2024 = new Mundial(1, 2024);

        mundial2024.addSeleccion(1, "España");
        mundial2024.addSeleccion(2, "Argentina");

        mundial2024.getSeleccion(1).addPersona(entrenadorEspaña);
        mundial2024.getSeleccion(1).addPersona(futbolistaEspaña1);
        mundial2024.getSeleccion(1).addPersona(futbolistaEspaña2);
        mundial2024.getSeleccion(1).addPersona(futbolistaEspaña3);
        mundial2024.getSeleccion(1).addPersona(futbolistaEspaña4);
        mundial2024.getSeleccion(1).addPersona(futbolistaEspaña5);
        mundial2024.getSeleccion(1).addPersona(futbolistaEspaña6);
        mundial2024.getSeleccion(1).addPersona(futbolistaEspaña7);

        mundial2024.getSeleccion(2).addPersona(entrenadorArgentina);
        mundial2024.getSeleccion(2).addPersona(futbolistaArgentina1);
        mundial2024.getSeleccion(2).addPersona(futbolistaArgentina2);
        mundial2024.getSeleccion(2).addPersona(futbolistaArgentina3);
        mundial2024.getSeleccion(2).addPersona(futbolistaArgentina4);
        mundial2024.getSeleccion(2).addPersona(futbolistaArgentina5);
        mundial2024.getSeleccion(2).addPersona(futbolistaArgentina6);
        mundial2024.getSeleccion(2).addPersona(futbolistaArgentina7);

        mundial2024.getSeleccion(1).listFutbolistasSobrepeso();

        // seleccionEspaña.listFutbolistasSobrepeso();

        // System.out.println();

        // seleccionArgentina.listFutbolistasSobrepeso();

        // System.out.println();

        System.out.println(futbolistaArgentina3.tieneSobrepeso() ? "sobrepeso" : "no sobrepeso");

    }
}
