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
    
    private NodoServer head;
    private NodoServer last;
    private int size;
    
    public ListaEnlazadaServer(){
        head = null;
        last = null;
        size = 0;
    }
    
    public boolean Vacia(){
        return(getHead()==null)?true:false;
    }
    
    public void add(Servidor prod){
        if(Vacia() == true){
            setHead(new NodoServer(prod));
            setLast(getHead());
        } else {
            NodoServer temp = getHead();
            NodoServer nuevo = new NodoServer(prod);
            nuevo.setSiguiente(temp);
            setHead(nuevo);
        }
        setSize(getSize() + 1);
    }
    
    public int size(){
        return getSize();
    }
    
//    public Servidor getValor(){
//        NodoServer temporal = head;
//        int contador = 0;
//        while(contador < index){
//            temporal = temporal.getSiguiente();
//            contador++;
//        }
//        return temporal.getValor();
//    }
    
    public void eliminar(int tipo, int cantidad){
        int cont = 0;
        NodoServer aux = getHead();
        NodoServer siguiente = getHead().getSiguiente();
        NodoServer anterior = getHead();
    }
    
    public NodoServer buscar(int id){
        NodoServer n = getHead();
        while(true){
            if(n.getValor().getNoServer()==id){
                return n;
            }
            if(n==getLast()){
                break;
            }
            n = n.getSiguiente();
        }
        return null;
    }

    /**
     * @return the head
     */
    public NodoServer getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoServer head) {
        this.head = head;
    }

    /**
     * @return the last
     */
    public NodoServer getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(NodoServer last) {
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
