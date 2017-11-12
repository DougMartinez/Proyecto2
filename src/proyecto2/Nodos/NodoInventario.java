/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.Nodos;

import Objeto.Inventario;

/**
 *
 * @author Douglas
 */
public class NodoInventario {

    private Inventario valor;
    private NodoInventario siguiente;
    private NodoInventario anterior;
    
    public NodoInventario (Inventario valor){
         this.valor = valor;
         this.siguiente = null;
         this.anterior = null;
    }
    
    public Inventario getValor(){
        return valor;
    }
    /**
     * @param valor the valor to set
     */
    public void setValor(Inventario valor) {
        this.valor = valor;
    }
    
    public void setSiguiente(NodoInventario n){
        siguiente = n;
    }
    
    public NodoInventario getSiguiente(){
        return siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoInventario getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoInventario anterior) {
        this.anterior = anterior;
    }
}
