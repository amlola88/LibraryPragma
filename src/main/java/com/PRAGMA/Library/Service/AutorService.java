package com.PRAGMA.Library.Service;
//Logica del negocio.

import com.PRAGMA.Library.Entity.Autor;
import com.PRAGMA.Library.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutorService implements GeneralService<Autor> {
    //inyecto el repositorio.
    @Autowired
    protected AutorRepository autorRepository;

    @Override
    public List<Autor> searchAll() throws Exception {
        return autorRepository.findAll();
    }

    @Override
    public Autor searchforId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Autor register(Autor record) throws Exception {
     try{
         Autor autorRegistrado = autorRepository.save(record);
         return autorRegistrado;
     }catch (Exception error){
         throw new Exception(error.getMessage());
     }
    }

    @Override
    public Autor update(Integer id, Autor datanew) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }
}
