package com.PRAGMA.Library.Service;

import java.util.List;

//Generacidad una interface de service a nivel generico con
//las funciones básicas.
public interface GeneralService <E> {
    //Utilizo mecanismos de excepciones para gestionar errores.
    //1. Busco datos en gral(todas las entidades)
    public List<E> searchAll() throws Exception;

    //2.Busco datos por Id de entidad
    public  E searchforId(Integer id)throws Exception;

    //3.Registrar datos
    public E register(E record) throws Exception;

    //4.Actualizar datos. (Primero busco, luego regristro)
    public E update(Integer id,E datanew) throws Exception;

    //5.Borrar datos
    public boolean delete(Integer id) throws Exception;

}
