package com.grupo4.proyecto_facturacion.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")

public class UsuarioEntitie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer usuarioId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "docuemnt")
    private Long docuemnt;

    @Column(name = "cantHijos")
    private Integer cantHijos ;

    @Column(name = "fehaNacimiento")
    private Date fehaNacimiento;

    public UsuarioEntitie(Integer usuarioId, String name, String surname, Long docuemnt, Integer cantHijos, Date fehaNacimiento) {
        this.usuarioId = usuarioId;
        this.name = name;
        this.surname = surname;
        this.docuemnt = docuemnt;
        this.cantHijos = cantHijos;
        this.fehaNacimiento = fehaNacimiento;
    }
    public UsuarioEntitie() {

    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getDocuemnt() {
        return docuemnt;
    }

    public void setDocuemnt(Long docuemnt) {
        this.docuemnt = docuemnt;
    }

    public Integer getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(Integer cantHijos) {
        this.cantHijos = cantHijos;
    }

    public Date getFehaNacimiento() {
        return fehaNacimiento;
    }

    public void setFehaNacimiento(Date fehaNacimiento) {
        this.fehaNacimiento = fehaNacimiento;
    }
}
