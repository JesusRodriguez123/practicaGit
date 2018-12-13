package nespresso;

import javax.swing.JOptionPane;

public class Cafetera {

    private int capacidadmaxima = 0;
    private int cantidadactual = 0;

    public Cafetera() {
        
    }

    public Cafetera(int c, int a) {
        setCapacidadmaxima(c);        
        setCantidadactual(a);
    }

    public void setCapacidadmaxima(int c) {
        this.capacidadmaxima = c;

    }

    public int getCapacidadmaxima(int c) {
        return capacidadmaxima;
    }

    public void setCantidadactual(int a) {
        this.cantidadactual = a;

        if (cantidadactual > capacidadmaxima) {
            this.cantidadactual = capacidadmaxima;
        }
        
        
        
    }

    public int getCantidadactual(int a) {
        return cantidadactual;
    }

    public void llenarcafetera() {

        this.cantidadactual = capacidadmaxima;
        System.out.println("la cafetera esta llena " + cantidadactual + "c.c");
    }

    public void vaciarcafetera() {

        this.cantidadactual = 0;
        System.out.println("la cafetera esta vacia " + cantidadactual + "c.c");

    }

    public void servircafe() {

        String numero = JOptionPane.showInputDialog("cuanto cafe desea servir?");
        int num = Integer.parseInt(numero);

        if (num >= 1000) {
            this.cantidadactual = 0;
            System.out.println("la cafetera esta vacia " + cantidadactual + "c.c");

        } else {

            this.cantidadactual -= num;
            System.out.println("la cafetera ahora contiene " + cantidadactual + "c.c");

        }

    }
}
