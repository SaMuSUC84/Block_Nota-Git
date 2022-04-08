package com.company;

import java.util.*;

public class Bloc_Notas {

    Scanner input = new Scanner(System.in);
    private ArrayList<Nota> blocNotas;

    public Bloc_Notas(){ blocNotas = new ArrayList<>();}

    public void introducirNota (Nota nota) {this.blocNotas.add(nota);}

    public void mostrarBloc() {
        System.out.println();
        System.out.println("\t\t    BLOC DE NOTAS");
        System.out.println("\t\t<------------------->\n");
        blocNotas.forEach(blocnotas -> System.out.print(blocnotas + " "));
        System.out.println();
    }
    public void borrarNota() {
        System.out.println("Introduce el nº de la nota a borrar: ");
        int indice = input.nextInt()-1;
        for (int i = 0; i >= blocNotas.size(); i++) {
            Nota eliminar = blocNotas.get(i);
            if (eliminar.getID_Nota() == indice) {indice = i;}
        }
        if (indice >= 0) {blocNotas.remove(indice);}
        System.out.println("LA nota se ha borrado");
        mostrarBloc();
    }

    public void cantidadNotas() {System.out.println("El total de Notas en el bloc es de: " + blocNotas.size());System.out.println();}
}