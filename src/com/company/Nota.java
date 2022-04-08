package com.company;

public class Nota {
    private final int ID_Nota;
    private static int ID = 1;
    private String texto;

    public Nota(String texto){
        ID_Nota = ID;
        this.texto = texto;
        ID++;
    }

    public int getID_Nota() {return ID_Nota;}

    public String getTexto() {return texto;}

    public void setTexto(String texto) {this.texto = texto;}

    @Override
    public String toString() {
        return "\tNota nº"+ID_Nota+".--> "+ texto+"\n";

    }
}