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
    private Nodo anterior;    
    
    public Nodo(Producto valor){
         this.valor = valor;
         this.siguiente = null;
         this.anterior = null;
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

    /**
     * @return the anterior
     */
    public Nodo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
