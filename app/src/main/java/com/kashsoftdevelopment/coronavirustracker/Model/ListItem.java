package com.kashsoftdevelopment.coronavirustracker.Model;

public class ListItem {
    private String country;
    private int cases, todayCases, death, todayDeath, recover;


    public ListItem(String country, int cases, int todayCases, int death, int todayDeath, int recover) {
        this.country = country;
        this.cases = cases;
        this.todayCases = todayCases;
        this.death = death;
        this.todayDeath = todayDeath;
        this.recover = recover;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getTodayDeath() {
        return todayDeath;
    }

    public void setTodayDeath(int todayDeath) {
        this.todayDeath = todayDeath;
    }

    public int getRecover() {
        return recover;
    }

    public void setRecover(int recover) {
        this.recover = recover;
    }
}
