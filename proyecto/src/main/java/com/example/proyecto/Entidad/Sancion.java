package com.example.proyecto.Entidad;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
@Entity
@Table(name="Sanciones")
public class Sancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 11)
    private int San_Pres_Id;

    @Column(nullable = false)
    private Date San_Fecha;

    @Column(nullable = false)
    private Time San_Hora;

    @Column(nullable = false, length = 11)
    private int San_tiempo;

    @Column(nullable = false, length = 1000)
    private String San_Descripcion;

    @OneToOne
    @JoinColumn(name = "pres_id")
    private Prestamo prestamo;

    public Sancion(int san_Pres_Id, Date san_Fecha, Time san_Hora, int san_tiempo, String san_Descripcion) {
        San_Pres_Id = san_Pres_Id;
        San_Fecha = san_Fecha;
        San_Hora = san_Hora;
        San_tiempo = san_tiempo;
        San_Descripcion = san_Descripcion;
    }

    public Sancion() {
    }

    public int getSan_Pres_Id() {
        return San_Pres_Id;
    }

    public void setSan_Pres_Id(int san_Pres_Id) {
        San_Pres_Id = san_Pres_Id;
    }

    public Date getSan_Fecha() {
        return San_Fecha;
    }

    public void setSan_Fecha(Date san_Fecha) {
        San_Fecha = san_Fecha;
    }

    public Time getSan_Hora() {
        return San_Hora;
    }

    public void setSan_Hora(Time san_Hora) {
        San_Hora = san_Hora;
    }

    public int getSan_tiempo() {
        return San_tiempo;
    }

    public void setSan_tiempo(int san_tiempo) {
        San_tiempo = san_tiempo;
    }

    public String getSan_Descripcion() {
        return San_Descripcion;
    }

    public void setSan_Descripcion(String san_Descripcion) {
        San_Descripcion = san_Descripcion;
    }

    @Override
    public String toString() {
        return "Sancion{" +
                "San_Pres_Id=" + San_Pres_Id +
                ", San_Fecha=" + San_Fecha +
                ", San_Hora=" + San_Hora +
                ", San_tiempo=" + San_tiempo +
                ", San_Descripcion='" + San_Descripcion + '\'' +
                '}';
    }
}
