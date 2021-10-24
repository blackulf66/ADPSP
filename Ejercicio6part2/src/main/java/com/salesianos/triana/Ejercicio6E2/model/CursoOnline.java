package com.salesianos.triana.Ejercicio6E2.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class CursoOnline {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private int puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor", foreignKey = @ForeignKey(name = "FK_CURSOONLINE_PROFESOR"))
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

    //Helpers para Video

    public void addVideo(Video v){
        v.setCursoOnline(this);
        videos.add(v);
    }

    public void removeVideo(Video v){
        videos.remove(v);
        v.setCursoOnline(null);
    }

    //Helpers para Profesor

    public void addProfesor(Profesor p){
        profesor = p;
            p.setCursosOnline(new ArrayList<>());
            p.getCursosOnline().add(this);
        }

    public void removeProfesor(Profesor p){
        p.getCursosOnline().remove(this);
        profesor = null;
    }
}
