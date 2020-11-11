/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3_cono;

/**
 * Contains the data of a cone and calculates its volume.
 * @author Sasha
 */
public class Cone {
    private float radio, height;

    public Cone(float radio, float height) {
        this.radio = radio;
        this.height = height;
    }

    public Cone() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float calculateVolume(){
        return (float)(Math.PI*Math.pow(radio, 2)*height)/3;
    }
}
