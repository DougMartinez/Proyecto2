/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ListasEnlazadas;

import Objeto.Inventario;
import proyecto2.Nodos.NodoInventario;

/**
 *
 * @author Douglas
 */
public class ListaEnlazadaInventario {
    private NodoInventario primero;
    private NodoInventario ultimo;
    
    public ListaEnlazadaInventario(){
        primero = null;
        ultimo = null;
    }
    
    public void insertarFinal(Inventario p){
        NodoInventario nuevo = new NodoInventario(p);
        if(getPrimero() == null){
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(ultimo);
            ultimo = nuevo;
        }
    }
    
    public Inventario Sacar(){
        Inventario cliente = getPrimero().getValor();
        setPrimero(getPrimero().getSiguiente());
        return cliente;
    }

    /**
     * @return the primero
     */
    public NodoInventario getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoInventario primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoInventario getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoInventario ultimo) {
        this.ultimo = ultimo;
    }
}
