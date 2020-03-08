package com.study.nds.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sensor {
    private int idSensor;
    private String nameSensor;
    private double coordX;
    private double coordY;

    @Id
    @Column(name = "idSensor")
    public int getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(int idSensor) {
        this.idSensor = idSensor;
    }

    @Basic
    @Column(name = "nameSensor")
    public String getNameSensor() {
        return nameSensor;
    }

    public void setNameSensor(String nameSensor) {
        this.nameSensor = nameSensor;
    }

    @Basic
    @Column(name = "coordX")
    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    @Basic
    @Column(name = "coordY")
    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sensor sensor = (Sensor) o;

        if (idSensor != sensor.idSensor) return false;
        if (Double.compare(sensor.coordX, coordX) != 0) return false;
        if (Double.compare(sensor.coordY, coordY) != 0) return false;
        if (nameSensor != null ? !nameSensor.equals(sensor.nameSensor) : sensor.nameSensor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idSensor;
        result = 31 * result + (nameSensor != null ? nameSensor.hashCode() : 0);
        temp = Double.doubleToLongBits(coordX);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(coordY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
