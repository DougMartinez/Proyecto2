/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.Nodos;

import Objeto.Servidor;

/**
 *
 * @author Douglas
 */
public class NodoServer {
    
    private Servidor valor;
    private NodoServer siguiente;
    private NodoServer anterior;
    
    public NodoServer (Servidor valor){
         this.valor = valor;
         this.siguiente = null;
         this.anterior = null;
    };
    
    public void procesar(){
//        NodoServer that = this;
////           public void Procesar(){
////        n = listaserver.buscarNodo(ns);
//        new Thread(){
//            @Override
//            public void run(){
//                while(true){     
//                    System.out.println("El servidor "+that.valor.getNoServer()+" tiene en contador "+that.valor.getContadorus());
//                    while(that.valor.getContadorus() > 0 && that.valor.isDisponible()){
//                        that.valor.setDisponible(false);
//                        int cantidad = (int)(Math.random()*8)+1;
//                        if(cantidad==9){
//                            cantidad = 8;
//                        }
//                        int tipo = (int)(Math.random()*3)+1;
//                        if(tipo==4){
//                            tipo = 3;
//                        }
////                        System.out.println("O. " + listaprod.buscar(tipo).getValor().getNombre() + " tiene " + listaprod.buscar(tipo).getValor().getCantidad());
//                        System.out.println("Antes de procesar "+listaprod.buscar(tipo).getValor().getNombre() + " tenia: " + listaprod.buscar(tipo).getValor().getCantidad());
//                        while(listaprod.buscar(tipo).getValor().getCantidad() < cantidad){
//
//                        }
//                        listaprod.buscar(tipo).getValor().setCantidad(listaprod.buscar(tipo).getValor().getCantidad() - cantidad);
////                        System.out.println("Tras procesar "+listaprod.buscar(tipo).getValor().getNombre() + " tenia " + ", se le quitaron " + cantidad + " y ahora quedan: " + listaprod.buscar(tipo).getValor().getCantidad());
//
//
//                        try {
////                        Thread.sleep(n.getValor().getLlegada() * 1000);
//                        } catch(Exception e){
//                            System.out.println("Sale en vaqueros");
//                        }
//                        System.out.println(" el siguiente del servidor "+n.getValor().getNoServer()+" es "+n.getSiguiente().getValor().getNoServer());
//                        if(that.getSiguiente()!=null){
//                            System.out.println("le paso a servidor "+n.getSiguiente().getValor().getNoServer()+" le sumo 1");
////                            listaserver.buscarNodo(n.getSiguiente()).getValor().setContadorus(listaserver.buscarNodo(n.getSiguiente()).getValor().getContadorus()+1);
////                            n.getSiguiente().getValor().setContadorus(n.getSiguiente().getValor().getContadorus()+1);   
//                            that.siguiente.valor.setContadorus(that.siguiente.valor.getContadorus()+1);
//                            System.out.println("ahora el servidor "+n.getSiguiente().getValor().getNoServer()+" tiene en cola "+n.getSiguiente().getValor().getContadorus());
//                        }else{
//                            System.out.println("CLIENTE TERMINADOOOOO! saliendo del ultimo servidor");
//                        }
//                        n.getValor().setContadorus(n.getValor().getContadorus() - 1);
//                        n.getValor().setDisponible(true);
//                    }
//                }
//            }
//        }.start();  
 
    }

    public Servidor getValor(){
        return valor;
    }
    
    public void setSiguiente(NodoServer n){
        siguiente = n;
    }
    
    public NodoServer getSiguiente(){
        return siguiente;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Servidor valor) {
        this.valor = valor;
    }

    /**
     * @return the anterior
     */
    public NodoServer getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoServer anterior) {
        this.anterior = anterior;
    }
}
