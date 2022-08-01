package ro.esolutions.testing.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
@Builder
public class Client {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    private Boolean isActive;

    @Enumerated(EnumType.STRING)
    private Type type;

    public enum Type {
        OLD, YOUNG
    }
}

