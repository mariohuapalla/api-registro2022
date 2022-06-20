package pe.com.ciberelectrik.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name = "Categoria") //nombre de la entidad
@Table(name ="t_categoria") //nombre de la tabla
public class Categoria implements  Serializable{
    private static final long serialVersionUID=1L;
    @Id //define la clave primaria
    @Column(name = "codcat") //nombre de los campos de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremento
    private long codigo;
    @Column(name = "nomcat")
    private String nombre;
    @Column(name = "estcat")
    private boolean estado;

    public Categoria() {
    }

    public Categoria(long codigo, String nombre, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
