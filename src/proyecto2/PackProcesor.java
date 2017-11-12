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
    NodoInventario auxInventario;
    NodoPersona auxPersona;
    public boolean respuestaserver;
    
    public PackProcesor(ListaEnlazada listaprod, ListaEnlazadaInventario listainvent, ListaEnlazadaPersona personalista, ListaEnlazadaServer serverlista){
        this.listaprod =  listaprod;
        this.listainvent = listainvent;
        this.listapersona = personalista;
        this.listaserver = serverlista;
    }
    
    public void AgregarInv (){
        auxInventario = listainvent.getPrimero();
        while(true){
            new Thread(){
                @Override
                public void run(){
                    while(true){
                        try{
                            listaprod.getValor(auxInventario.getValor().getProducto() - 1).setCantidad(listaprod.getValor(auxInventario.getValor().getProducto() - 1).getCantidad() + auxInventario.getValor().getCantidad());
                            System.out.println("Agrego del producto "+(auxInventario.getValor().getProducto() - 1));
                            try{
                                System.out.println("TIEMPO ES " + auxInventario.getValor().getTiempo());
                                Thread.sleep(auxInventario.getValor().getTiempo() * 1000);
                            } catch (Exception e){
                                System.out.println("No se pudo");
                            }
                        } catch(Exception e){
                            System.out.println("Sale en vacas");
                        }
                    }
                }
            }.start();
            if(auxInventario == listainvent.getUltimo()){
                
                break;
            }
        auxInventario = auxInventario.getSiguiente();
        }    
    }
    
    public void generarPersonas(){
        auxPersona = listapersona.getLast();
        while(true){
            Persona p = new Persona(auxPersona.getValor().getTasaLlegada(), auxPersona.getValor().getTiempo());
            listaserver.getHead().getValor().getColapersonas().insertarFinal(p);
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