package springBoot.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tusers")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nommT", length = 100,nullable = false)
    private String nomUtilisateur;

    @NotNull
    @Size(min=1, max = 100)
    @Column(name = "prenom", nullable = false, length = 100)
    private String prenomUtilisateur;

    @NotNull
    @Size(min = 5, max = 100)
    @Column(name = "eamil", nullable = false, length = 100)
    private String emailUtilisateur;

    @NotNull
    @Size(min = 6, max = 100)
    @Column(name = "mdp", nullable = false, length = 100)
    private String mdpUtilisateur;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNomUtilisateur() { return nomUtilisateur; }

    public void setNomUtilisateur(String nomUtilisateur) { this.nomUtilisateur = nomUtilisateur; }

    public String getPrenomUtilisateur() { return prenomUtilisateur; }

    public void setPrenomUtilisateur(String prenomUtilisateur) { this.prenomUtilisateur = prenomUtilisateur; }

    public String getEmailUtilisateur() { return emailUtilisateur; }

    public void setEmailUtilisateur(String emailUtilisateur) {this.emailUtilisateur = emailUtilisateur; }

    public String getMdpUtilisateur() { return mdpUtilisateur; }

    public void setMdpUtilisateur(String mdpUtilisateur) {this.mdpUtilisateur = mdpUtilisateur;}


    @Override
    public String toString() {
        return "User{" +
                "email='" + emailUtilisateur + '\'' +
                ", firstName='" + nomUtilisateur + '\'' +
                ", lastName='" + prenomUtilisateur + '\'' +
                ", mdp='" + mdpUtilisateur + '\'' +
                "}";
    }
}
