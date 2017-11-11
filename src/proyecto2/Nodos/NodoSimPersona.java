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
public class NodoSimPersona {
    
    private Persona valor;
    private NodoSimPersona siguiente;
    private NodoSimPersona anterior;
    
    public NodoSimPersona(Persona p){
        this.valor = p;
    }

    /**
     * @return the valor
     */
    public Persona getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Persona valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public NodoSimPersona getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSimPersona siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoSimPersona getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoSimPersona anterior) {
        this.anterior = anterior;
    }
}
