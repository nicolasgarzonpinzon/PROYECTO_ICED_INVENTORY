package com.example.proyecto.Servicios;

import com.example.proyecto.Entidad.Equipo;
import com.example.proyecto.Repositorio.RepositorioEquipos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEquipos {
    private RepositorioEquipos repositorio;

    public ServicioEquipos(RepositorioEquipos repositorio) {
        this.repositorio = repositorio;
    }

    public List<Equipo> mostrarTodos() {
        return repositorio.findAll();
    }

    public Equipo BuscarEquipo(int Equ_Id) {
        if (repositorio.findById(String.valueOf(Equ_Id)).isPresent())
            return repositorio.findById(String.valueOf(Equ_Id)).get();
        else
            return null;
    }

    public String eliminar(String codigo) {
        if (repositorio.findById(codigo).isPresent()) {
            repositorio.deleteById(codigo);
            return "El Dispositivo con el codigo " + codigo + " fue eliminado exitosamente";
        } else {
            return "No se encontró ningún Dispositivo con el codigo " + codigo;
        }
    }
}
