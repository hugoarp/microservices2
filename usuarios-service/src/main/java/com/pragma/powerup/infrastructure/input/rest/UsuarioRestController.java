package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.dto.response.UsuarioResponseDto;
import com.pragma.powerup.application.handler.IUsuarioHandler;
import com.pragma.powerup.application.handler.IValidacionUsuarioHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioRestController {
    private final IUsuarioHandler usuarioHandler;
    private final IValidacionUsuarioHandler validacionUsuario;

    @Operation(summary = "Add a new user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created", content = @Content),
            @ApiResponse(responseCode = "409", description = "User already exists", content = @Content)
    })

    @PostMapping("/")
    public ResponseEntity<Void> saveUser(@Valid @RequestBody UsuarioRequestDto usuarioRequestDto) {
        if (!validacionUsuario.esTelefonoValido(usuarioRequestDto.getCelular())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        usuarioHandler.saveUser(usuarioRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Operation(summary = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All users returned",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = UsuarioResponseDto.class)))),
            @ApiResponse(responseCode = "404", description = "No data found", content = @Content)
    })
    @GetMapping("/")
    public ResponseEntity<List<UsuarioResponseDto>> getAllUsers() {
        return ResponseEntity.ok(usuarioHandler.getAllUsers());
    }
}
