/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Interfaz.Principal;
import Objeto.Servidor;
import proyecto2.ListasEnlazadas.ListaEnlazada;
import proyecto2.ListasEnlazadas.ListaEnlazadaInventario;
import proyecto2.ListasEnlazadas.ListaEnlazadaPersona;
import proyecto2.ListasEnlazadas.ListaEnlazadaServer;
import proyecto2.ListasEnlazadas.ListaEnlazadaHilo;
import proyecto2.Nodos.Nodo;
import proyecto2.Nodos.NodoInventario;
import proyecto2.Nodos.NodoPersona;
import proyecto2.Nodos.NodoServer;
import proyecto2.Nodos.NodoHilo;

/**
 *
 * @author Douglas
 */
public class PackProcesor {
    
    ListaEnlazada listaprod;
    ListaEnlazadaInventario listainvent;
    ListaEnlazadaPersona listapersona;
    ListaEnlazadaServer listaserver;
//    NodoPersona auxPersona; 
    public boolean respuestaserver;
    NodoServer n;
    
    public PackProcesor(ListaEnlazada listaprod, ListaEnlazadaInventario listainvent, ListaEnlazadaPersona personalista, ListaEnlazadaServer serverlista){
        this.listaprod =  listaprod;
        this.listapersona = personalista;
        this.listaserver = serverlista;
    }
    
    public void AgregarInv (NodoInventario auxInventario){
        Thread i = new Thread(){
            @Override
            public void run(){
                while(true){
                    try{
                        System.out.println("metiendo productos");
                        if(auxInventario.getValor().getProducto()==3){
                            Nodo aux2 = listaprod.getHead();
                            while(true){
                              if(aux2==listaprod.getLast()){
                                    break;
                                }
                                aux2 = aux2.getSiguiente();
                            }
                        }
                        int idProd = auxInventario.getValor().getProducto();
                        int cant = auxInventario.getValor().getCantidad();
                        int temp = auxInventario.getValor().getTiempo();
                        listaprod.getValor(idProd - 1).setCantidad(listaprod.getValor(idProd - 1).getCantidad() + cant);
                        try{
                            Thread.sleep(auxInventario.getValor().getTiempo() * 1000);
                        } catch (Exception e){
                            System.out.println("No se pudo");
                        }
                    } catch(Exception e){
                        System.out.println(e);
                        System.out.println("Sale en vacas");
                    }
                }
            }
        };
        i.start();
        Principal.listahilos.add(i);
    }
    
    public void generarPersonas1server(NodoPersona auxPersona){
        Thread o = new Thread(){
            @Override
            public void run(){
                while(true){
                    try{
                        System.out.println("metiendo personas");
                        listaserver.getHead().getValor().setContadorus(listaserver.getHead().getValor().getContadorus() + auxPersona.getValor().getTasaLlegada());
                        try{
                            Thread.sleep(auxPersona.getValor().getTiempo() * 1000);
                        } catch (Exception e){
                            System.out.println("No se pudo");
                        }
                    } catch(Exception e){
                        System.out.println(e);
                        System.out.println("Sale en vacas");
                    }
                }
            }
        };
        o.start();
        Principal.listahilos.add(o);
    }
    
    public void Procesar(NodoServer ns){
        Thread t = new Thread(){
            @Override
            public void run(){
                while(true){
                System.out.println("Llego el servidor "+ns.getValor().getNoServer());
                    NodoServer n = listaserver.buscar(ns.getValor().getNoServer());
                        
                    while(n.getValor().getContadorus() > 0 && n.getValor().isDisponible()){
                    System.out.println("haciendo el proceso");
                        NodoServer aux2 = listaserver.getHead();
                        while(true){
                            System.out.println("Servidor "+aux2.getValor().getNoServer()+" tiene en contador "+aux2.getValor().getContadorus());
                            if(aux2==listaserver.getLast()){
                                break;
                            }
                            aux2 = aux2.getSiguiente();
                        }
                    System.out.println("AHORA MISMO ESTA OPERANDO EL SERVIDOR "+n.getValor().getNoServer()+" tiene en contador "+n.getValor().getContadorus());
                        n.getValor().setDisponible(false);
                        int cantidad = (int)(Math.random()*8)+1;
                        if(cantidad==9){
                            cantidad = 8;
                        }
                        int tipo = (int)(Math.random()*3)+1;
                        if(tipo==4){
                            tipo = 3;
                        }
                        System.out.println("Antes de procesar "+listaprod.buscar(tipo).getValor().getNombre() + " tenia: " + listaprod.buscar(tipo).getValor().getCantidad());
                        while(listaprod.buscar(tipo).getValor().getCantidad() < cantidad){

                        }
                        listaprod.buscar(tipo).getValor().setCantidad(listaprod.buscar(tipo).getValor().getCantidad() - cantidad);
                        System.out.println("Tras procesar "+listaprod.buscar(tipo).getValor().getNombre() + " tenia " + ", se le quitaron " + cantidad + " y ahora quedan: " + listaprod.buscar(tipo).getValor().getCantidad());


                        try {
                        Thread.sleep(n.getValor().getLlegada() * 1000);
                        } catch(Exception e){
                            System.out.println("Sale en vaqueros");
                        }
                        if(n.getSiguiente()!=null){
                            System.out.println("le paso a servidor "+n.getSiguiente().getValor().getNoServer()+" le sumo 1");
                            listaserver.buscar(n.getSiguiente().getValor().getNoServer()).getValor().setContadorus(listaserver.buscar(n.getSiguiente().getValor().getNoServer()).getValor().getContadorus()+1);
                          System.out.println("ahora el servidor "+n.getSiguiente().getValor().getNoServer()+" tiene en cola "+n.getSiguiente().getValor().getContadorus());
                        }else{
                            System.out.println("CLIENTE TERMINADOOOOO! saliendo del ultimo servidor");
                        }
                        n.getValor().setContadorus(n.getValor().getContadorus() - 1);
                        n.getValor().setDisponible(true);
                    }
                }
            }
        };
        t.start();
        Principal.listahilos.add(t);
    }
}