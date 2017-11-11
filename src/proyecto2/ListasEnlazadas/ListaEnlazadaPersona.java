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
    
    NodoPersona head;
    NodoPersona last;
    int size;
    
    public ListaEnlazadaPersona(){
        head = null;
        last = null;
        size = 0;
    }
    
    public boolean Vacia(){
        return(head==null)?true:false;
    }
    
    public void add(Persona prod){
        if(Vacia() == true){
            head = new NodoPersona(prod);
            last = head;
        } else {
            NodoPersona temp = head;
            NodoPersona nuevo = new NodoPersona(prod);
            nuevo.setSiguiente(temp);
            head = nuevo;
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public Persona getValor(int index){
        NodoPersona temporal = head;
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
        NodoPersona aux = head;
        NodoPersona siguiente = head.getSiguiente();
        NodoPersona anterior = head;

//        while(true){
//            if(aux.getValor().getNoServer()==tipo){
//                aux.getValor().setCantidad(aux.getValor().getCantidad()-cantidad);
//            }
//        }
    }
    
//    public NodoPersona buscar(int id){
//        NodoPersona n = head;
//        while(true){
//            if(n.getValor().getNoServer()==id){
//                return n;
//            }
//            if(n==last){
//                break;
//            }
//            n = n.getSiguiente();
//        }
//        return null;
//    }
}
