/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ListasEnlazadas;

import proyecto2.Nodos.NodoServer;
import Objeto.Servidor;

/**
 *
 * @author Douglas
 */
public class ListaEnlazadaServer {
    
    NodoServer head;
    NodoServer last;
    int size;
    
    public ListaEnlazadaServer(){
        head = null;
        last = null;
        size = 0;
    }
    
    public boolean Vacia(){
        return(head==null)?true:false;
    }
    
    public void add(Servidor prod){
        if(Vacia() == true){
            head = new NodoServer(prod);
            last = head;
        } else {
            NodoServer temp = head;
            NodoServer nuevo = new NodoServer(prod);
            nuevo.setSiguiente(temp);
            head = nuevo;
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public Servidor getValor(int index){
        NodoServer temporal = head;
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
        NodoServer aux = head;
        NodoServer siguiente = head.getSiguiente();
        NodoServer anterior = head;

//        while(true){
//            if(aux.getValor().getNoServer()==tipo){
//                aux.getValor().setCantidad(aux.getValor().getCantidad()-cantidad);
//            }
//        }
    }
    
    public NodoServer buscar(int id){
        NodoServer n = head;
        while(true){
            if(n.getValor().getNoServer()==id){
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
