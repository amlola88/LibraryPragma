package com.PRAGMA.Library.controller;

import com.PRAGMA.Library.Entity.Autor;
import com.PRAGMA.Library.Service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/version1/autores")
public class AutorController {
    @Autowired
    protected AutorService autorService;
    @PostMapping
    public ResponseEntity<Autor> register(@RequestBody Autor record) {
        try {
            Autor autorRegistrado = autorService.register(record);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(autorRegistrado);
        } catch (Exception error) {
            String mensaje = "Error al registrar" + error.getMessage();
            Autor autorConError = new Autor();
            autorConError.setMensajeError(mensaje);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(autorConError);
        }
    }
}
