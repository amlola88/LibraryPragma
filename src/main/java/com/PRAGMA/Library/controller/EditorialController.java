package com.PRAGMA.Library.controller;

import com.PRAGMA.Library.Entity.Editorial;
import com.PRAGMA.Library.Service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/editoriales")
public class EditorialController {
    @Autowired
    protected EditorialService editorialService;

    @PostMapping
    public ResponseEntity<Editorial> register(@RequestBody Editorial record) {
        try {
            Editorial editorialRegistrada = editorialService.register(record);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(editorialRegistrada);
        } catch (Exception error) {
            String mensaje = "Error al registrar" + error.getMessage();
            Editorial editorialConError = new Editorial();
            editorialConError.setMensajeError(mensaje);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(editorialConError);
        }
    }
}


