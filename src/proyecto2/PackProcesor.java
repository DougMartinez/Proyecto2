/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Objeto.Persona;
import javax.swing.JOptionPane;
import proyecto2.ListasEnlazadas.ListaEnlazada;
import proyecto2.ListasEnlazadas.ListaEnlazadaInventario;
import proyecto2.ListasEnlazadas.ListaEnlazadaPersona;
import proyecto2.ListasEnlazadas.ListaEnlazadaServer;
import proyecto2.Nodos.Nodo;
import proyecto2.Nodos.NodoInventario;
import proyecto2.Nodos.NodoPersona;
import proyecto2.Nodos.NodoServer;

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
    
    public PackProcesor(ListaEnlazada listaprod, ListaEnlazadaPersona personalista, ListaEnlazadaServer serverlista){
        this.listaprod =  listaprod;
        this.listapersona = personalista;
        this.listaserver = serverlista;
    }
    
    public void AgregarInv (NodoInventario auxInventario){
//        auxInventario = n;
//        while(true){
System.out.println("FUERA DEL THREAD "+auxInventario.getValor().getProducto());
            new Thread(){
                @Override
                public void run(){
                    while(true){
                        try{
                            System.out.println("AUX INVENTARIO ES ->"+auxInventario.getValor().getProducto());
                            if(auxInventario.getValor().getProducto()==3){
                                Nodo aux2 = listaprod.getHead();
                                while(true){
                                    System.out.println("El producto "+aux2.getValor().getNombre()+" tiene "+aux2.getValor().getCantidad());
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
//                            System.out.println("Agrego del producto "+(auxInventario.getValor().getProducto() - 1));
                            try{
//                                System.out.println("TIEMPO ES " + auxInventario.getValor().getTiempo());
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
            }.start();
//            if(auxInventario == listainvent.getUltimo()){
                
//                break;
//            }
//            System.out.println("Del nodo " + auxInventario.getValor().getProducto() + " el siguiente id es " + auxInventario.getSiguiente().getValor().getProducto());
//            auxInventario = auxInventario.getSiguiente();
        
//        }    
    }
    
    public void generarPersonas1server(){
        auxPersona = listapersona.getLast();
            while(true){
                new Thread(){
                    @Override
                    public void run(){
                        while(true){
                            try{
                                listaserver.getLast().getValor().setContadorus(listaserver.getLast().getValor().getContadorus() + auxPersona.getValor().getTasaLlegada());
                                System.out.println("Agrego " + auxPersona.getValor().getTasaLlegada() + " al servidor " + listaserver.getLast().getValor().getNoServer());
                                System.out.println("La cantidad ahora es" + listaserver.getLast().getValor().getContadorus());
                                try{
                                    System.out.println("Se ingresan cada " + auxPersona.getValor().getTiempo() + " segundos");
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
            if(auxPersona==listapersona.getHead()){
                break;
            }
            auxPersona = auxPersona.getSiguiente();
        }
    }
    
//    public void Personas(){
//        Thread cliente = new Thread(){
//            @Override
//            public void run(){
//                int cantidad = (int)(Math.random()*8)+1;
//                if(cantidad==9){
//                    cantidad = 8;
//                }
//                int tipo = (int)(Math.random()*3);
//                if(tipo==3){
//                    tipo = 2;
//                }
//                System.out.println("           " + listaprod.getValor(tipo).getNombre() + " tenia: " + listaprod.getValor(tipo).getCantidad());
//                while(listaprod.getValor(tipo).getCantidad()<cantidad){
//                    
//                }
//                listaprod.getValor(tipo).setCantidad(listaprod.getValor(tipo).getCantidad() - cantidad);
//                System.out.println("          A " + listaprod.getValor(tipo).getNombre() + " se le quitaron " + cantidad + " y ahora quedan: " + listaprod.getValor(tipo).getCantidad());
//            }
//        };
//        cliente.suspend();
//        while(respuestaserver != true){
//            cliente.resume();
//        }
//    }
}