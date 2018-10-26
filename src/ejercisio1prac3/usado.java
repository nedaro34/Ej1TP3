
package ejercisio1prac3;


public class usado extends Auto implements Venta  {
private Componente compusa;
 private ParqueAutomotor Lugarusa;

usado(ParqueAutomotor p2, Componente c2, String fiat, String aD3055, int i, String venta) {
this.Lugarusa=p2;
this.compusa=c2;
this.marca=fiat;
this.patente=aD3055;
this.Preciobase=i;
this.Tipoventa=venta;
    }
 
 
    @Override
    public void preciodeventa() {
    double preciofinal;
    compusa.Utilidad=0.35;

    Lugarusa.tipo="Venta";
        
    preciofinal=Preciobase+(Preciobase*compusa.Utilidad);
    
    
    System.out.println("El precio de venta es:  "+preciofinal);
    System.out.println("El auto esta disponible para: "+Lugarusa.tipo);

    
    
    }
    
    
    
    /*
     public void precioalquiler(){
         
     }
    public void preciodeventa(){
        
    }*/

    /**
     * @return the compusa
     */
    public Componente getCompusa() {
        return compusa;
    }

    /**
     * @param compusa the compusa to set
     */
    public void setCompusa(Componente compusa) {
        this.compusa = compusa;
    }

    /**
     * @return the Lugarusa
     */
    public ParqueAutomotor getLugarusa() {
        return Lugarusa;
    }

    /**
     * @param Lugarusa the Lugarusa to set
     */
    public void setLugarusa(ParqueAutomotor Lugarusa) {
        this.Lugarusa = Lugarusa;
    }
    
}
