
package ejercisio1prac3;


public class ParqueAutomotor {
    public String tipo;
    public int precioalquiler;
    public int dias;
    //aca defino autos para designar si estan o no para la venta

    
    ParqueAutomotor(){
        
    }
            
            
    ParqueAutomotor(int i) {
this.dias=i;
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
