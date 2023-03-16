package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.handler.IValidacionUsuarioHandler;
import org.springframework.stereotype.Service;

@Service
public class ValidacionUsuarioHandler implements IValidacionUsuarioHandler {
    @Override
    public boolean esTelefonoValido(String telefono) {
        if (telefono == null || telefono.length() > 13) {
            return false;
        }
        return telefono.matches("^\\+?[0-9]{1,13}$");
    }
}
