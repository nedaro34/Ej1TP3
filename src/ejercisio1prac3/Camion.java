
package ejercisio1prac3;


public class Camion extends VehiculosCarga implements Alquiler{
 private ParqueAutomotor lugarcamion;
 private int kmrec; //kilometros recorridos
 private int dias;
 
 
Camion(int dia,int kmrec, String mercedezBenz, String lU255, int i, String alquiler) {
this.marca=mercedezBenz;
this.patente=lU255;
this.Preciobase=i;
this.Tipoventa=alquiler;
this.kmrec=kmrec;
this.dias=dia;
    }

    @Override
    public void precioalquiler() {
    double preciofinal;
    if(kmrec<50){
        preciofinal=Preciobase+300*dias;
    }
    else{
   preciofinal=(Preciobase+((kmrec-50)*20))*dias; //20 por km rec de mas
    }
    
   System.out.println("EL precio del alquiler sera de: "+preciofinal);

    }

    /**
     * @return the lugarcamion
     */
    public ParqueAutomotor getLugarcamion() {
        return lugarcamion;
    }

    /**
     * @param lugarcamion the lugarcamion to set
     */
    public void setLugarcamion(ParqueAutomotor lugarcamion) {
        this.lugarcamion = lugarcamion;
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

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }
    
}
