/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ListasEnlazadas;

import proyecto2.Nodos.Nodo;
import Objeto.Producto;

/**
 *
 * @author Douglas
 */
public class ListaEnlazada {
    private Nodo head;
    private Nodo last;
    private int size;
    
    public ListaEnlazada(){
        head = null;
        last = null;
        size = 0;
    }
    
    public boolean Vacia(){
        return(head==null)?true:false;
    }
    
    public void add(Producto prod){
        if(Vacia() == true){
            head = new Nodo(prod);
            last = head;
        } else {
            Nodo nuevo = new Nodo(prod);
            last.setSiguiente(nuevo);
            nuevo.setSiguiente(last);
            last = nuevo;
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public Producto getValor(int index){
        Nodo temporal = head;
        int contador = 0;
        while(contador < index){
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.getValor();
    }
    
    public void eliminar(int tipo, int cantidad){
        int cont = 0;
        Nodo aux = head;
        Nodo siguiente = head.getSiguiente();
        Nodo anterior = head;

        while(true){
            if(aux.getValor().getId()==tipo){
                aux.getValor().setCantidad(aux.getValor().getCantidad()-cantidad);
            }
        }
    }
    
    public Nodo buscar(int id){
        Nodo n = head;
        while(true){
            if(n.getValor().getId()==id){
                return n;
            }
            if(n==last){
                break;
            }
            n = n.getSiguiente();
        }
        return null;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
