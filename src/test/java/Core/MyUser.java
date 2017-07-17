package Core;


import javax.persistence.*;

/**
 * Created by azhilin on 24.01.2017.
 */
@Entity
@Table(name = "myusers")
//@Entity(name="myusers")
public class MyUser {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;

    public MyUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
