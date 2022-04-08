package com.company;

import java.time.LocalTime;

public class Nota_Alarma extends Nota{

    private LocalTime horaAlarma;

    public Nota_Alarma(String texto,String horaAlarma){
        super(texto);
        this.horaAlarma = LocalTime.parse(horaAlarma);
    }

    public LocalTime getHoraAlarma() {return horaAlarma;}

    public void setHoraAlarma (LocalTime horaAlarma) {this.horaAlarma = horaAlarma;}

    @Override
    public String toString() {return "\tNota nº"+getID_Nota()+".--> "+getTexto()+" {la alarma sonará a las "+horaAlarma+"}\n";}
}
