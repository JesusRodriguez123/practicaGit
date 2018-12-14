package nespresso;

import javax.swing.JOptionPane;

public class Nespresso {

    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera(1000, 0);



        System.out.println("la cafetera esta llena" + " " + cafetera.getCantidadactual(0) + "c.c");

        do {
            String accion = JOptionPane.showInputDialog("Que desea hacer? servir cafe, vaciar cafetera, llenar cafetera, ");

            if (accion.equals("llenar cafetera")) {
                cafetera.llenarcafetera();

            }
            if (accion.equals("vaciar cafetera")) {
                cafetera.vaciarcafetera();

            }
            if (accion.equals("servir cafe")) {
                cafetera.servircafe();

            }

        }while(cafetera.getCantidadactual(0)< 1001);
        
        //hola
    
    }

}
