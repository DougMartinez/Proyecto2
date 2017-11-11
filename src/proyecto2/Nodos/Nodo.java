/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.Nodos;

import Objeto.Producto;

/**
 *
 * @author Douglas
 */
public class Nodo {
    
    private Producto valor;
    private Nodo siguiente;
    
    public Nodo(Producto valor){
         this.valor = valor;
         this.siguiente = null;
    }
    
    public Producto getValor(){
        return valor;
    }
    
    public void setSiguiente(Nodo n){
        siguiente = n;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
}
