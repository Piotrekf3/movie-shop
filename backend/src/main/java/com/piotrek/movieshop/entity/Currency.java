package com.piotrek.movieshop.entity;

public class Currency {
    private float plnToEur = 4.28f;
    private float eurToPln = 0.23f;

    public float getPlnToEur() {
        return plnToEur;
    }

    public void setPlnToEur(float plnToEur) {
        this.plnToEur = plnToEur;
    }

    public float getEurToPln() {
        return eurToPln;
    }

    public void setEurToPln(float eurToPln) {
        this.eurToPln = eurToPln;
    }
}
