
package ejercisio1prac3;

public class Minibus extends  VehiculosPasajeros implements Alquiler{

Minibus(String citroen, String dC3055, int i, String alquiler) {
this.marca=citroen;
this.patente=dC3055;
this.Preciobase=i;
this.Tipoventa=alquiler;

    }

    @Override
    public void precioalquiler() {
        
        int preciofinal=0;
        preciofinal=Preciobase+50+250;
        System.out.println("EL precio de alquiler es:   "+preciofinal);
    }
    
}
