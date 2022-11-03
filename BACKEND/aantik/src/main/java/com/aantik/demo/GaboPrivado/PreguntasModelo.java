package com.aantik.demo.GaboPrivado;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "PreguntasBenchmarking")
public class PreguntasModelo {
  @Id
  @Column(name = "idPreguntas")
  private String id;

  @Column(name = "Preguntas")
  private String pregunta;

  @Column(name = "description")
  private String description;

    public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getPregunta() {
    return pregunta;
}

public void setPregunta(String pregunta) {
    this.pregunta = pregunta;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

    public PreguntasModelo(){
        
    }

    @Override
    public String toString() {
      return "PreguntasBenchmarking [id=" + id + ", Preguntas=" + pregunta + ", desc=" + description + "]";
    }
}
