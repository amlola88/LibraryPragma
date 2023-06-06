package com.PRAGMA.Library.controller;


import com.PRAGMA.Library.Entity.Categoria;
import com.PRAGMA.Library.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/version1/categorias")
public class CategoriaController {
    @Autowired
    protected CategoriaService categoriaService;
    @PostMapping
    public ResponseEntity<Categoria> register(@RequestBody Categoria record) {
        try {
            Categoria categoriaRegistrada = categoriaService.register(record);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(categoriaRegistrada);
        } catch (Exception error) {
            String mensaje = "Error al registrar" + error.getMessage();
            Categoria categoriaConError = new Categoria();
            categoriaConError.setMensajeError(mensaje);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(categoriaConError);
        }
    }
}
