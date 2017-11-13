/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.Nodos;

/**
 *
 * @author Douglas
 */
public class NodoHilo {
    
    private Thread valor;
    private NodoHilo siguiente;
    private NodoHilo anterior;
    
    public NodoHilo(Thread t){
        this.valor = t;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * @return the valor
     */
    public Thread getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Thread valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public NodoHilo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoHilo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoHilo getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoHilo anterior) {
        this.anterior = anterior;
    }
    
}
