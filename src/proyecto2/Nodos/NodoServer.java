/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.Nodos;

import Objeto.Servidor;

/**
 *
 * @author Douglas
 */
public class NodoServer {
    
    private Servidor valor;
    private NodoServer siguiente;
    
    public NodoServer (Servidor valor){
         this.valor = valor;
         this.siguiente = null;
    }
    
    public Servidor getValor(){
        return valor;
    }
    
    public void setSiguiente(NodoServer n){
        siguiente = n;
    }
    
    public NodoServer getSiguiente(){
        return siguiente;
    }
}
