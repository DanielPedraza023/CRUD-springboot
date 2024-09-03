package xyzCRUDBACKEND.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.authenticator.SavedRequest;

@Entity
@Table(name = "persona")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Para generar id secuenciales y automaticos
    private int id;
    @Column(name = "nombre_completo") //Permite asignar el nombre en la base de datos
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    @ManyToOne  //Establece la relacion de las tablas. Pais --> muchos a uno
    @JoinColumn(name = "id_pais")
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;


}


