/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Interfaz.Principal;
import static Interfaz.Principal.jTextArea3;
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
                    try {
                        jTextArea3.append("\nIngresando productos a lista\n");
                        if(auxInventario.getValor().getProducto()==3){
                            Nodo aux5 = listaprod.getHead();
                            while(true){
                                if(aux5==listaprod.getLast()){
                                    break;
                                }
                                aux5 = aux5.getSiguiente();
                            }
                        }
                        int idProd = auxInventario.getValor().getProducto();
                        int cant = auxInventario.getValor().getCantidad();
                        int temp = auxInventario.getValor().getTiempo();
                        jTextArea3.append("   El producto actual que ingresa a la lista es: " + listaprod.getValor(idProd - 1).getNombre() + "\n");
                        listaprod.getValor(idProd - 1).setCantidad(listaprod.getValor(idProd - 1).getCantidad() + cant);
                        try {
                            Thread.sleep(auxInventario.getValor().getTiempo() * 1000);
                        } catch (Exception e){
                            System.out.println("No se pudo");
                        }
                    } catch(Exception e){
                        System.out.println(e);
                        System.out.println("Sale sola");
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
                    try {
                        jTextArea3.append("\nIngresando personas al supermercado\n");
                        listaserver.getHead().getValor().setContadorus(listaserver.getHead().getValor().getContadorus() + auxPersona.getValor().getTasaLlegada());
                        Principal.ingresan = Principal.ingresan + auxPersona.getValor().getTasaLlegada();
                        try{
                            Thread.sleep(auxPersona.getValor().getTiempo() * 1000);
                        } catch (Exception e){
                            System.out.println("No se pudo x2");
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
                    NodoServer n = listaserver.buscar(ns.getValor().getNoServer());
                        
                    while(n.getValor().getContadorus() > 0 && n.getValor().isDisponible()){
                        jTextArea3.append("Haciendo el proceso de compra\n");
                        NodoServer aux2 = listaserver.getHead();
                        while(true){
                            jTextArea3.append("   Servidor "+aux2.getValor().getNoServer()+" tiene en cola "+aux2.getValor().getContadorus() + " personas\n");
                            if(aux2==listaserver.getLast()){
                                break;
                            }
                            aux2 = aux2.getSiguiente();
                        }
                        
                        jTextArea3.append("   Actualmente se esta atendiendo en servidor " + n.getValor().getNoServer()+", tiene en cola "+n.getValor().getContadorus() + "\n");
                        n.getValor().setDisponible(false);
                        int cantidad = (int)(Math.random()*8)+1;
                        if(cantidad==9){
                            cantidad = 8;
                        }
                        int tipo = (int)(Math.random()*3)+1;
                        if(tipo==4){
                            tipo = 3;
                        }
                        jTextArea3.append("   Antes de procesar " + listaprod.buscar(tipo).getValor().getNombre() + " tenia: " + listaprod.buscar(tipo).getValor().getCantidad() + "\n");
                        while(listaprod.buscar(tipo).getValor().getCantidad() < cantidad){}
                            listaprod.buscar(tipo).getValor().setCantidad(listaprod.buscar(tipo).getValor().getCantidad() - cantidad);
                            jTextArea3.append("   Tras procesar " + listaprod.buscar(tipo).getValor().getNombre() + " ahora quedan: " + listaprod.buscar(tipo).getValor().getCantidad() + "\n");
                        
                        try {
                            Thread.sleep(n.getValor().getLlegada() * 1000);
                        } catch(Exception e){
                            System.out.println("Sale en vaqueros");
                        }
                        
                        if(n.getSiguiente()!=null){
                            jTextArea3.append("   Se traslada a servidor " + n.getSiguiente().getValor().getNoServer()+ " una persona a cola\n");
                            listaserver.buscar(n.getSiguiente().getValor().getNoServer()).getValor().setContadorus(listaserver.buscar(n.getSiguiente().getValor().getNoServer()).getValor().getContadorus()+1);
                            jTextArea3.append("   Ahora el servidor " + n.getSiguiente().getValor().getNoServer() + " tiene en cola " + n.getSiguiente().getValor().getContadorus() + " personas\n");
                        }else{
                            Principal.salen = Principal.salen + 1; 
                            jTextArea3.append("Servicio finalizado, un cliente saliendo del ultimo servidor\n");
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