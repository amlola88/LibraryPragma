package com.PRAGMA.Library.Service;

import com.PRAGMA.Library.Entity.Editorial;
import com.PRAGMA.Library.Repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService implements GeneralService<Editorial> {
    @Autowired
    protected EditorialRepository editorialRepository;
    @Override
    public List<Editorial> searchAll() throws Exception {
     return null;
   }

    @Override
    public Editorial searchforId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Editorial register(Editorial record) throws Exception {
        try{
          if (record.getNombre().length() < 2 || record.getNombre().length() >30){
              throw new Exception("El nombre de la Editorial debe contener entre dos y 30 caracteres");
          }


          Editorial editorialregistrada=editorialRepository.save(record);
          return editorialregistrada;
        }catch (Exception error){
            throw new Exception(error .getMessage());
        }
    }

    @Override
    public Editorial update(Integer id, Editorial datanew) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }
}
