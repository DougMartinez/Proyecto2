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
    private NodoPersona anterior;
    
    public NodoPersona (Persona valor){
         this.valor = valor;
         this.siguiente = null;
         this.anterior = null;
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

    /**
     * @param valor the valor to set
     */
    public void setValor(Persona valor) {
        this.valor = valor;
    }

    /**
     * @return the anterior
     */
    public NodoPersona getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoPersona anterior) {
        this.anterior = anterior;
    }
}
