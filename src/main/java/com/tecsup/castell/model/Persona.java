package com.tecsup.castell.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @NotEmpty(message="Debe ingresar su apellido paterno.")
    @Column(name = "paterno")
    private String paterno;
    
    @NotEmpty(message="Debe ingresar su apellido materno.")
    @Column(name = "materno")
    private String materno;
    
    @NotEmpty(message="Debe ingresar sus nombres.")
    @Column(name = "nombres")
    private String nombres;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    
    @Email
    @NotEmpty(message="Debe ingresar su corre electronico.")
    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "persona", fetch = FetchType.LAZY)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getNombreCompleto(){
        return this.paterno +" "+ this.materno+" "+ this.nombres;
    }
}
