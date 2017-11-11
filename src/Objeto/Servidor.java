/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import proyecto2.ListasEnlazadas.Cola;

/**
 *
 * @author Douglas
 */
public class Servidor {
    
    private int noServer;
    private int sigServer;
    private int x;
    private int y;
    private int alto;
    private int ancho;
    private int llegada;
    private boolean disponible;
    private Cola colapersonas;
    
    public Servidor(){
        noServer = 0;
        sigServer = 0;
        x = 0;
        y = 0;
        alto = 0;
        ancho = 0;
        llegada = 0;
        disponible = false;
        colapersonas = new Cola();
    }

    /**
     * @return the noServer
     */
    public int getNoServer() {
        return noServer;
    }

    /**
     * @param aNoServer the noServer to set
     */
    public void setNoServer(int aNoServer) {
        noServer = aNoServer;
    }

    /**
     * @return the sigServer
     */
    public int getSigServer() {
        return sigServer;
    }

    /**
     * @param aSigServer the sigServer to set
     */
    public void setSigServer(int aSigServer) {
        sigServer = aSigServer;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param aX the x to set
     */
    public void setX(int aX) {
        x = aX;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param aY the y to set
     */
    public void setY(int aY) {
        y = aY;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param aAlto the alto to set
     */
    public void setAlto(int aAlto) {
        alto = aAlto;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param aAncho the ancho to set
     */
    public void setAncho(int aAncho) {
        ancho = aAncho;
    }

    /**
     * @return the llegada
     */
    public int getLlegada() {
        return llegada;
    }

    /**
     * @param aLlegada the llegada to set
     */
    public void setLlegada(int aLlegada) {
        llegada = aLlegada;
    }

    /**
     * @return the colapersonas
     */
    public Cola getColapersonas() {
        return colapersonas;
    }

    /**
     * @param colapersonas the colapersonas to set
     */
    public void setColapersonas(Cola colapersonas) {
        this.colapersonas = colapersonas;
    }
    
}
