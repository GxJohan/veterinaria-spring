package com.example.veterinaria.service;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.repository.MascotaRepositoy;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MascotaService {
    private final MascotaRepositoy mascotaRepositoy;

    public MascotaService(MascotaRepositoy mascotaRepositoy){
        this.mascotaRepositoy = mascotaRepositoy;
    }

    // 1. Listar todas las mascotas
    public List<Mascota> listarTodas(){
        return mascotaRepositoy.findAll();
    }

    // 2. Obtener mascota(s) por id
    public Optional<Mascota> buscarPorId(Integer id){
        return mascotaRepositoy.findById(id);
    }

    // 3. Crear Mascota
    public Mascota crearMascota(Mascota mascota){
        return mascotaRepositoy.save(mascota);
    }

    // 4. Actualizar Mascota
    public Mascota actualizarMascota(Integer id, Mascota mascota){
        mascota.setId(id);
        return mascotaRepositoy.save(mascota);
    }

    // 5. Eliminamos Mascota
    public void eliminarMascota(Integer id){
        mascotaRepositoy.deleteById(id);
    }





}
