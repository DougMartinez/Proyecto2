/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Objeto.Servidor;
import proyecto2.ListasEnlazadas.ListaEnlazada;
import proyecto2.ListasEnlazadas.ListaEnlazadaInventario;
import proyecto2.ListasEnlazadas.ListaEnlazadaPersona;
import proyecto2.ListasEnlazadas.ListaEnlazadaServer;
import proyecto2.Nodos.Nodo;
import proyecto2.Nodos.NodoInventario;
import proyecto2.Nodos.NodoPersona;

/**
 *
 * @author Douglas
 */
public class PackProcesor {
    
    ListaEnlazada listaprod;
    ListaEnlazadaInventario listainvent;
    ListaEnlazadaPersona listapersona;
    ListaEnlazadaServer listaserver;
    NodoPersona auxPersona;
    public boolean respuestaserver;
    
    public PackProcesor(ListaEnlazada listaprod, ListaEnlazadaInventario listainvent, ListaEnlazadaPersona personalista, ListaEnlazadaServer serverlista){
        this.listaprod =  listaprod;
        this.listapersona = personalista;
        this.listaserver = serverlista;
    }
    
    public void AgregarInv (NodoInventario auxInventario){
            new Thread(){
                @Override
                public void run(){
                    while(true){
                        try{
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
                            listaprod.getValor(idProd - 1).setCantidad(listaprod.getValor(idProd - 1).getCantidad() + cant);System.out.println("Agrego del producto "+(auxInventario.getValor().getProducto() - 1));
                            try{System.out.println("TIEMPO ES " + auxInventario.getValor().getTiempo());
                                Thread.sleep(auxInventario.getValor().getTiempo() * 1000);
                            } catch (Exception e){
                                System.out.println("No se pudo");
                            }
                        } catch(Exception e){System.out.println(e);
                            System.out.println("Sale en vacas");
                        }
                    }
                }
            }.start();
    }
    
    public void generarPersonas1server(NodoPersona auxPersona){
        new Thread(){
            @Override
            public void run(){
                while(true){
                    try{
                        listaserver.getLast().getValor().setContadorus(listaserver.getLast().getValor().getContadorus() + auxPersona.getValor().getTasaLlegada());System.out.println("Agrego " + auxPersona.getValor().getTasaLlegada() + " al servidor " + listaserver.getLast().getValor().getNoServer());
                        try{
                            Thread.sleep(auxPersona.getValor().getTiempo() * 1000);
                        } catch (Exception e){
                            System.out.println("No se pudo");
                        }
                    } catch(Exception e){
                        System.out.println("Sale en vacas");
                    }
                }
            }
        }.start();
    }
    
    public void Procesar(Servidor s){
        Thread cliente = new Thread(){
            @Override
            public void run(){
                while(s.getContadorus() > 0){
                    int cantidad = (int)(Math.random()*8)+1;
                    if(cantidad==9){
                        cantidad = 8;
                    }
                    int tipo = (int)(Math.random()*3);
                    if(tipo==3){
                        tipo = 2;
                    }
                    System.out.println("           " + listaprod.buscar(tipo).getValor().getNombre() + " tenia: " + listaprod.buscar(tipo).getValor().getCantidad());
                    while(listaprod.buscar(tipo).getValor().getCantidad() < cantidad){
                        
                    }
                    listaprod.buscar(tipo).getValor().setCantidad(listaprod.buscar(tipo).getValor().getCantidad() - cantidad);
                    System.out.println("          A " + listaprod.getValor(tipo).getNombre() + " se le quitaron " + cantidad + " y ahora quedan: " + listaprod.getValor(tipo).getCantidad());
                    
                    s.setContadorus(s.getContadorus() - 1);
                    s.setDisponible(true);
                    
                    try {
                    Thread.sleep(s.getLlegada() * 1000);
                    } catch(Exception e){
                        System.out.println("Sale en vaqueros");
                    }
                }
            }
        };
        cliente.suspend();
        while(respuestaserver != true){
            cliente.resume();
        }
    }
}