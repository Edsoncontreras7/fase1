package com.dbproject.analisis.dos.model.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "role_opcion")
@Data
@IdClass(RoleOpcionId.class)  // Clase PK compuesta
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class RoleOpcion {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdRole", nullable = false)
    private Role role;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdOpcion", nullable = false)
    private Opcion opcion;

    @Column(name = "Alta", nullable = false)
    private Boolean alta;

    @Column(name = "Baja", nullable = false)
    private Boolean baja;

    @Column(name = "Cambio", nullable = false)
    private Boolean cambio;

    @Column(name = "Imprimir", nullable = false)
    private Boolean imprimir;

    @Column(name = "Exportar", nullable = false)
    private Boolean exportar;

    @Column(name = "FechaCreacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "UsuarioCreacion", nullable = false, length = 100)
    private String usuarioCreacion;

    @Column(name = "FechaModificacion")
    private LocalDateTime fechaModificacion;

    @Column(name = "UsuarioModificacion", length = 100)
    private String usuarioModificacion;
}
