package com.company;

public class Prueba {
    public static void main(String[] args) {

        Bloc_Notas mibloc = new Bloc_Notas();

        mibloc.introducirNota(new Nota("Médico mañana en Jamaica"));
        mibloc.introducirNota(new Nota("Cena con Laura en el Guachinche"));
        mibloc.introducirNota((new Nota_Alarma("Almuerzo de empresa","13:33")));
        mibloc.introducirNota((new Nota_Alarma("Entregar tarea de programación", "23:39")));



        mibloc.mostrarBloc();
        mibloc.cantidadNotas();
        mibloc.borrarNota();


    }
}




