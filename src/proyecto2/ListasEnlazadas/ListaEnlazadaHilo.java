/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ListasEnlazadas;

import proyecto2.Nodos.NodoHilo;

/**
 *
 * @author Douglas
 */
public class ListaEnlazadaHilo {
    
    private NodoHilo head;
    private NodoHilo last;
    private int size;
    
    public ListaEnlazadaHilo(){
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public NodoHilo getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoHilo head) {
        this.head = head;
    }

    /**
     * @return the last
     */
    public NodoHilo getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoHilo last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean Vacia(){
        return(getHead()==null)?true:false;
    }
    
    public void add(Thread hil){
        if(Vacia() == true){
            head = new NodoHilo(hil);
            last = head;
        } else {
            NodoHilo nuevo = new NodoHilo(hil);
            nuevo.setAnterior(last);
            last.setSiguiente(nuevo);
            last = nuevo;
        }
        setSize(getSize() + 1);
    }
}
