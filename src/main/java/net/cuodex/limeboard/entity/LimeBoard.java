package net.cuodex.limeboard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
public class LimeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter @Setter
    private String title, description;

    @Getter @Setter
    private int theme;
    @Getter @Setter
    private boolean isPublic;
    @Getter @Setter
    private long timeFrom, timeTo;

    @Getter @JsonIgnore
    @OneToMany(mappedBy = "limeboard", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Lime> limes;

}
