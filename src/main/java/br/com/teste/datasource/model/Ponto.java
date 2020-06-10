package br.com.teste.datasource.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity()
public class Ponto implements Serializable {

    private static final long serialVersionUID =462024889868951158L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    @JoinColumn(name = "fk_idUser")
    private User user;
    private Date dateRegister;
    private char register;

    public Ponto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public char getRegister() {
        return register;
    }

    public void setRegister(char register) {
        this.register = register;
    }
}
