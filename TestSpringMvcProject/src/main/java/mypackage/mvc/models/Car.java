package mypackage.mvc.models;

import lombok.*;

import javax.persistence.*;

@ToString(exclude = "owner")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "model")
    private String model;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
}
