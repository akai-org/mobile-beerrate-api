package pl.akai.api.beer;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
class Beer {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String brewery;
    private String style;
    private String whereBought;
    private int ibu;
    private float alc;
    private float price;

}