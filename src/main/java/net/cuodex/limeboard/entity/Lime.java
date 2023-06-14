package net.cuodex.limeboard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Table(name = "limes")
public class Lime {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "limeboard_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    @Getter @Setter
    private LimeBoard limeboard;

    @Column()
    @Getter @Setter
    private String title, description, location, host;

    @Column()
    @Getter @Setter
    private long timeStart, timeEnd;


}
