/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ListasEnlazadas;

import proyecto2.Nodos.NodoPersona;
import Objeto.Persona;

/**
 *
 * @author Douglas
 */
public class ListaEnlazadaPersona {
    
    private NodoPersona head;
    private NodoPersona last;
    private int size;
    
    public ListaEnlazadaPersona(){
        head = null;
        last = null;
        size = 0;
    }
    
    public boolean Vacia(){
        return(getHead()==null)?true:false;
    }
    
    public void add(Persona prod){
        if(Vacia() == true){
            setHead(new NodoPersona(prod));
            setLast(getHead());
        } else {
            NodoPersona temp = getHead();
            NodoPersona nuevo = new NodoPersona(prod);
            nuevo.setSiguiente(temp);
            setHead(nuevo);
        }
        setSize(getSize() + 1);
    }
    
    public int size(){
        return getSize();
    }
    
    public Persona getValor(int index){
        NodoPersona temporal = getHead();
        int contador = 0;
        while(contador < index){
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.getValor();
    }
    
    public void eliminar(int tipo, int cantidad){
        int cont = 0;
        NodoPersona aux = getHead();
        NodoPersona siguiente = getHead().getSiguiente();
        NodoPersona anterior = getHead();
    }

    /**
     * @return the head
     */
    public NodoPersona getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoPersona head) {
        this.head = head;
    }

    /**
     * @return the last
     */
    public NodoPersona getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoPersona last) {
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
}
