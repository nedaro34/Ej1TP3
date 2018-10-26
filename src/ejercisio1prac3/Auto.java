/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisio1prac3;


public class Auto extends Vehiculo implements Alquiler{
public ParqueAutomotor au;
    @Override
    public void precioalquiler() {
        int preciofinal;
        
        preciofinal=Preciobase+(50*2);
        System.out.println("El precio del alquiler es:  "+preciofinal);
    }
    
    
}
