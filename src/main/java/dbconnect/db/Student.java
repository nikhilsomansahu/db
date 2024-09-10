package dbconnect.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENTS")

public class Student {
    

    @Id
    @Column(name="ID")
    private int id ;


    @Column(name="MARK")
    private int mark;


    @Column(name="NAME")
    private String name;



}
