package com.salesianos.triana.ejercicioE07.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class AddedTo {

    private LocalDate dateTime;

    private int order;

    @OneToMany(mappedBy = "song")
    private List<Song> songs = new ArrayList<>();
}


