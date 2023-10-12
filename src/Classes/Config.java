/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Admin
 */
public class Config {
        //General
    private int dayDuration;
    private int deliveryDays;
    //Bethesda
    private int initialNarrativa;
    private int initialNiveles;
    private int initialLogica;
    private int initialSprites;
    private int initialDLC;
    private int initialIntegradores;
    //Square Enix
    private int initialNarrativaSE;
    private int initialNivelesSE;
    private int initialLogicaSE;
    private int initialSpritesSE;
    private int initialDLCSE;
    private int initialIntegradoresSE;

    public Config() {
        this.dayDuration = 1000;
        this.deliveryDays = 30;
        this.initialNarrativa = 1;
        this.initialLogica = 1;
        this.initialSprites = 1;
        this.initialDLC = 1;
        this.initialIntegradores = 1;
        this.initialNarrativaSE = 1;
        this.initialLogicaSE = 1;
        this.initialSpritesSE = 1;
        this.initialDLCSE = 1;
        this.initialIntegradoresSE = 1;
    }

 
    
    //Getters and Setters
    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(int deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public int getInitialNarrativa() {
        return initialNarrativa;
    }

    public void setInitialNarrativa(int initialNarrativa) {
        this.initialNarrativa = initialNarrativa;
    }

    public int getInitialLogica() {
        return initialLogica;
    }

    public void setInitialLogica(int initialLogica) {
        this.initialLogica = initialLogica;
    }

    public int getInitialSprites() {
        return initialSprites;
    }

    public void setInitialSprites(int initialSprites) {
        this.initialSprites = initialSprites;
    }

    public int getInitialDLC() {
        return initialDLC;
    }

    public void setInitialDLC(int initialDLC) {
        this.initialDLC = initialDLC;
    }

    public int getInitialIntegradores() {
        return initialIntegradores;
    }

    public void setInitialIntegradores(int initialIntegradores) {
        this.initialIntegradores = initialIntegradores;
    }

    public int getInitialNarrativaSE() {
        return initialNarrativaSE;
    }

    public void setInitialNarrativaSE(int initialNarrativaSE) {
        this.initialNarrativaSE = initialNarrativaSE;
    }

    public int getInitialLogicaSE() {
        return initialLogicaSE;
    }

    public void setInitialLogicaSE(int initialLogicaSE) {
        this.initialLogicaSE = initialLogicaSE;
    }

    public int getInitialSpritesSE() {
        return initialSpritesSE;
    }

    public void setInitialSpritesSE(int initialSpritesSE) {
        this.initialSpritesSE = initialSpritesSE;
    }

    public int getInitialDLCSE() {
        return initialDLCSE;
    }

    public void setInitialDLCSE(int initialDLCSE) {
        this.initialDLCSE = initialDLCSE;
    }

    public int getInitialIntegradoresSE() {
        return initialIntegradoresSE;
    }

    public void setInitialIntegradoresSE(int initialIntegradoresSE) {
        this.initialIntegradoresSE = initialIntegradoresSE;
    }

    public int getInitialNiveles() {
        return initialNiveles;
    }

    public void setInitialNiveles(int initialNiveles) {
        this.initialNiveles = initialNiveles;
    }

    public int getInitialNivelesSE() {
        return initialNivelesSE;
    }

    public void setInitialNivelesSE(int initialNivelesSE) {
        this.initialNivelesSE = initialNivelesSE;
    }
    
    
   
}
