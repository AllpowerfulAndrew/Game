package basic.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "warrior")
public class Warrior {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name", unique = true)
    private String name;


}
