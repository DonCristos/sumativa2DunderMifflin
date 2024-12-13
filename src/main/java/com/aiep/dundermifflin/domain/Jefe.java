package com.aiep.dundermifflin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Jefe.
 */
@Entity
@Table(name = "jefe")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Jefe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "nombre_jefe", nullable = false)
    private String nombreJefe;

    @NotNull
    @Column(name = "telefono_jefe", nullable = false)
    private String telefonoJefe;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "jefe")
    @JsonIgnoreProperties(value = { "empleados", "jefe" }, allowSetters = true)
    private Set<Departamento> departamentos = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Jefe id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreJefe() {
        return this.nombreJefe;
    }

    public Jefe nombreJefe(String nombreJefe) {
        this.setNombreJefe(nombreJefe);
        return this;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public String getTelefonoJefe() {
        return this.telefonoJefe;
    }

    public Jefe telefonoJefe(String telefonoJefe) {
        this.setTelefonoJefe(telefonoJefe);
        return this;
    }

    public void setTelefonoJefe(String telefonoJefe) {
        this.telefonoJefe = telefonoJefe;
    }

    public Set<Departamento> getDepartamentos() {
        return this.departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        if (this.departamentos != null) {
            this.departamentos.forEach(i -> i.setJefe(null));
        }
        if (departamentos != null) {
            departamentos.forEach(i -> i.setJefe(this));
        }
        this.departamentos = departamentos;
    }

    public Jefe departamentos(Set<Departamento> departamentos) {
        this.setDepartamentos(departamentos);
        return this;
    }

    public Jefe addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
        departamento.setJefe(this);
        return this;
    }

    public Jefe removeDepartamento(Departamento departamento) {
        this.departamentos.remove(departamento);
        departamento.setJefe(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Jefe)) {
            return false;
        }
        return getId() != null && getId().equals(((Jefe) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Jefe{" +
            "id=" + getId() +
            ", nombreJefe='" + getNombreJefe() + "'" +
            ", telefonoJefe='" + getTelefonoJefe() + "'" +
            "}";
    }
}
