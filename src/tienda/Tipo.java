/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Estudiante
 */
public class Tipo {
    public Tipo(int ped,double iba){
        this.pedido=ped;
        this.iva=iba;
    }

    double iva;
private int cactual;
private int cdeseada;
private int pedido;
private double precio;
private int precioinicial;
private int cpedir;
    

public void Capedir (int cactual,int cdeseada){
    cpedir=cactual-cdeseada;
    
    
}
public void Precio(int pedido,double iva,int precioinicial){
    precio=pedido*iva*precioinicial;
}
}
