package com.study.nds.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Region {
    private int idRegion;
    private String nameRegion;

    @Id
    @Column(name = "idRegion")
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Basic
    @Column(name = "nameRegion")
    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Region region = (Region) o;

        if (idRegion != region.idRegion) return false;
        if (nameRegion != null ? !nameRegion.equals(region.nameRegion) : region.nameRegion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRegion;
        result = 31 * result + (nameRegion != null ? nameRegion.hashCode() : 0);
        return result;
    }
}
