package com.salesianos.triana.ejercicioE07.Model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class AddedToPK implements Serializable {

    long songId;

    long playlistId;

}
