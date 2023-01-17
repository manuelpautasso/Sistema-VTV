package com.mpautasso.sistemavtv.model.dtos.inspector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InspectorRequest {
    private Long dni;
    private String nombre;
    private String apellido;
}
