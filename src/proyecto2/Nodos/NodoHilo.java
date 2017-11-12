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
public class NodoHilo {
    
    private Thread valor;
    private NodoHilo siguiente;
    private NodoHilo anterior;
    
    public NodoHilo(Thread th){
        this.valor = th;
        this.siguiente = null;
        this.anterior = null;
    }
}
