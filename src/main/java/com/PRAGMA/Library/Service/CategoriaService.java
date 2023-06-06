package com.PRAGMA.Library.Service;

import com.PRAGMA.Library.Entity.Autor;
import com.PRAGMA.Library.Entity.Categoria;
import com.PRAGMA.Library.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoriaService implements GeneralService <Categoria>{
    @Autowired
    protected CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> searchAll() throws Exception {
        return null;
    }

    @Override
    public Categoria searchforId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Categoria register(Categoria record) throws Exception {
        try{
            Categoria categoriaRegistrada = categoriaRepository.save(record);
            return categoriaRegistrada;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Categoria update(Integer id, Categoria datanew) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }
}
