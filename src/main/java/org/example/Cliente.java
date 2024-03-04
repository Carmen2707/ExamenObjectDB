package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Long total;
    private String estado;

    public Cliente(Long id, String nombre, Long total, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.total = total;
        this.estado = estado;
    }
}
