/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author rodriguez.markel
 */
public class Terminoa {
    private int id;
    private String euskaraz;
    private String gazteleraz;

    public Terminoa(int id, String euskaraz, String gazteleraz) {
        this.id = id;
        this.euskaraz = euskaraz;
        this.gazteleraz = gazteleraz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEuskaraz() {
        return euskaraz;
    }

    public void setEuskaraz(String euskaraz) {
        this.euskaraz = euskaraz;
    }

    public String getGazteleraz() {
        return gazteleraz;
    }

    public void setGazteleraz(String gazteleraz) {
        this.gazteleraz = gazteleraz;
    }

    @Override
    public String toString() {
        return "Terminoa{" + "id=" + id + ", euskaraz=" + euskaraz + ", gazteleraz=" + gazteleraz + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Terminoa other = (Terminoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.euskaraz, other.euskaraz)) {
            return false;
        }
        if (!Objects.equals(this.gazteleraz, other.gazteleraz)) {
            return false;
        }
        return true;
    }
    
    
}
