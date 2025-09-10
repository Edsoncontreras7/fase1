package com.dbproject.analisis.dos.model.entity;

import java.io.Serializable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleOpcionId implements Serializable {
    private Integer role;
    private Integer opcion;
}
