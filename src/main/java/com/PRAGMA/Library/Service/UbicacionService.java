package com.PRAGMA.Library.Service;

import com.PRAGMA.Library.Entity.Autor;
import com.PRAGMA.Library.Entity.Ubicacion;
import com.PRAGMA.Library.Repository.UbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionService implements GeneralService<Ubicacion> {
    @Autowired
    protected UbicacionRepository ubicacionRepository;

    @Override
    public List<Ubicacion> searchAll() throws Exception {
        return null;
    }

    @Override
    public Ubicacion searchforId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Ubicacion register(Ubicacion record) throws Exception {
        try{
            Ubicacion ubicacionRegistrada = ubicacionRepository.save(record);
            return ubicacionRegistrada;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Ubicacion update(Integer id, Ubicacion datanew) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }
}
