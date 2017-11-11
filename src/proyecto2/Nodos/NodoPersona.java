/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.Nodos;

import Objeto.Persona;

/**
 *
 * @author Douglas
 */
public class NodoPersona {
    
    private Persona valor;
    private NodoPersona siguiente;
    
    public NodoPersona (Persona valor){
         this.valor = valor;
         this.siguiente = null;
    }
    
    public Persona getValor(){
        return valor;
    }
    
    public void setSiguiente(NodoPersona n){
        siguiente = n;
    }
    
    public NodoPersona getSiguiente(){
        return siguiente;
    }
}
