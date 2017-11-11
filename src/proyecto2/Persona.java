/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Douglas
 */
public class Persona {
    private int x;
    private int y;
    private int tasaLlegada;
    private int tiempo;
    private int radio;
    
    public Persona(){
        x = 0;
        y = 0;
        tasaLlegada = 0;
        tiempo = 0;
        radio = 0;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the tasaLlegada
     */
    public int getTasaLlegada() {
        return tasaLlegada;
    }

    /**
     * @param tasaLlegada the tasaLlegada to set
     */
    public void setTasaLlegada(int tasaLlegada) {
        this.tasaLlegada = tasaLlegada;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
}
