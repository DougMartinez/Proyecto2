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
    Nodo head;
    Nodo last;
    int size;
    
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
            Nodo temp = head;
            Nodo nuevo = new Nodo(prod);
            nuevo.setSiguiente(temp);
            head = nuevo;
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
    
//    public void eliminar(int index){
//        int contador = 0;
//        Nodo temporal = head;
//        if(index == 0){
//            head = head.getSiguiente();
//        } else {
//            while(contador < index-1){
//            temporal = temporal.getSiguiente();
//            contador++;
//            }
//        temporal.siguiente(temporal.getSiguiente().getSiguiente());
//        }
//        size--;
//    }
    
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
}
