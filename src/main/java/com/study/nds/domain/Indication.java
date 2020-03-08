package com.study.nds.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Indication {
    private int idIndication;
    private Date dateInd;
    private Time timeInd;
    private double temperature;

    @Id
    @Column(name = "idIndication")
    public int getIdIndication() {
        return idIndication;
    }

    public void setIdIndication(int idIndication) {
        this.idIndication = idIndication;
    }

    @Basic
    @Column(name = "dateInd")
    public Date getDateInd() {
        return dateInd;
    }

    public void setDateInd(Date dateInd) {
        this.dateInd = dateInd;
    }

    @Basic
    @Column(name = "timeInd")
    public Time getTimeInd() {
        return timeInd;
    }

    public void setTimeInd(Time timeInd) {
        this.timeInd = timeInd;
    }

    @Basic
    @Column(name = "temperature")
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Indication that = (Indication) o;

        if (idIndication != that.idIndication) return false;
        if (Double.compare(that.temperature, temperature) != 0) return false;
        if (dateInd != null ? !dateInd.equals(that.dateInd) : that.dateInd != null) return false;
        if (timeInd != null ? !timeInd.equals(that.timeInd) : that.timeInd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idIndication;
        result = 31 * result + (dateInd != null ? dateInd.hashCode() : 0);
        result = 31 * result + (timeInd != null ? timeInd.hashCode() : 0);
        temp = Double.doubleToLongBits(temperature);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
