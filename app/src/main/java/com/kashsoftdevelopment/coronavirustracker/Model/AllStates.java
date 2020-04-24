package com.kashsoftdevelopment.coronavirustracker.Model;

public class AllStates {
    private String state;
    private int cases, nri, death, recover;

    public AllStates(String state, int cases, int nri, int death, int recover) {
        this.state = state;
        this.cases = cases;
        this.nri = nri;
        this.death = death;
        this.recover = recover;
    }

    public AllStates() {

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getNri() {
        return nri;
    }

    public void setNri(int nri) {
        this.nri = nri;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getRecover() {
        return recover;
    }

    public void setRecover(int recover) {
        this.recover = recover;
    }
}
