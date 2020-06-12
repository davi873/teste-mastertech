package br.com.teste.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity()
public class User implements Serializable {

    private static final long serialVersionUID = 362024889868951158L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private long cpf;
    private Date dateRegister;


    public User() {
        this.dateRegister = new Date(System.currentTimeMillis());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Date getDateRegister() {
        return dateRegister;
    }
}
