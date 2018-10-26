
package ejercisio1prac3;


public class Camioneta extends VehiculosCarga implements Alquiler{
private int kmrec;
private int dias;
    Camioneta(int dia,int i, String ford, String pA6699, int i0, String alquiler) {
    this.kmrec=i;
    this.marca=ford;
    this.patente=pA6699;
    this.Preciobase=i0;
    this.Tipoventa=alquiler;
    this.dias=dia;
    }

    @Override
    public void precioalquiler() {
        double preciofinal;
        if(kmrec<50){
        preciofinal=(Preciobase+300)*dias;
    }
    else{
   preciofinal=(Preciobase+((kmrec-50)*20))*dias; //20 por km rec de mas
    }
        
        System.out.println("El precio de alquiler es: "+preciofinal);
    }

    /**
     * @return the kmrec
     */
    public int getKmrec() {
        return kmrec;
    }

    /**
     * @param kmrec the kmrec to set
     */
    public void setKmrec(int kmrec) {
        this.kmrec = kmrec;
    }
    
}
