package org.example.activad1_1.carrera;

public class Carrera extends Thread{

    String nombre;

    public Carrera(int prioridad, String nombre) {
        this.nombre = nombre;
        setPriority(prioridad);
    }

    @Override
    public void run() {
        for (int c=1; c<=30; c++) {
            System.out.print(c+"mt ");
            this.yield(); //Hace que si uno tiene mayor prioridad, se espere el de menos prioridad
                          // y se ejecute el que tenga más
        }
        System.out.println("\n Llego a la meta " +nombre);
    }
}
