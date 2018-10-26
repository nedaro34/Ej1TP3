
package ejercisio1prac3;


public class nuevo0km extends Auto implements Venta{
private Componente comp;
 private ParqueAutomotor Lugar;
 
 
//constructor
nuevo0km(ParqueAutomotor lugar,Componente c1,String marca1,String patente1,int preciobase1,String tipo){
    this.Lugar=lugar;
    this.comp=c1;
    this.marca=marca1;
    this.patente=patente1;
    this.Preciobase=preciobase1;
    this.Tipoventa=tipo;
}
    @Override
    public void preciodeventa() {
        double preciofinal;
        
    comp.Aireacondicionado=0.02;
    comp.LevantaCristales=0.05;
    comp.Alarma=0.01;
    comp.Utilidad=0.5;
    
    Lugar.tipo="Venta";
    
    preciofinal=Preciobase+(Preciobase*comp.Aireacondicionado)+(Preciobase*comp.LevantaCristales)+(Preciobase*comp.Alarma)+(Preciobase*comp.Utilidad);
        
    System.out.println("El precio de venta es:  "+preciofinal);//recibe
    System.out.println("El auto esta disponible para: "+Lugar.tipo);
  
        
    }

    
    public Componente getComp() {
        return comp;
    }

    
    public void setComp(Componente comp) {
        this.comp = comp;
    }

    /**
     * @return the Lugar
     */
    public ParqueAutomotor getLugar() {
        return Lugar;
    }

    /**
     * @param Lugar the Lugar to set
     */
    public void setLugar(ParqueAutomotor Lugar) {
        this.Lugar = Lugar;
    }
     
   
    
}
