package com.PRAGMA.Library.controller;

import com.PRAGMA.Library.Entity.Ubicacion;
import com.PRAGMA.Library.Service.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/version1/ubicaciones")
public class UbicacionController {
    @Autowired
    protected UbicacionService ubicacionService;
    @PostMapping
    public ResponseEntity<Ubicacion> register(@RequestBody Ubicacion record) {
        try {
            Ubicacion ubicacionRegistrada = ubicacionService.register(record);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(ubicacionRegistrada);
        } catch (Exception error) {
            String mensaje = "Error al registrar" + error.getMessage();
            Ubicacion ubicacionConError = new Ubicacion();
           ubicacionConError.setMensajeError(mensaje);
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ubicacionConError);
        }
    }
}
