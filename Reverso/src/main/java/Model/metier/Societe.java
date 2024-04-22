package Model.metier;


import MetierException.MetierException;

import java.util.regex.Pattern;

public abstract class Societe {
    private int identifiant;
    private String raison_sociale;
    private String num_rue;
    private String nom_rue;
    private String code_postal;
    private String ville;
    private String tel;
    private String email;
    private String commentaire;
    public static final Pattern PATTERN_MAIL=Pattern.compile("^(.+)@(.+)$");
    //Constructeur
    public Societe( int identifiant,String raison_sociale, String num_rue, String nom_rue,
                    String code_postal, String ville, String tel, String email, String commentaire) throws MetierException {
        setIdentifiant(identifiant);

        setRaison_sociale(raison_sociale);
        setNum_rue(num_rue);
        setNom_rue(nom_rue);
        setCode_postal(code_postal);
        setVille(ville);
        setTel(tel);
        setEmail(email);
        setCommentaire(commentaire);
    }

    public Societe() {

    }
    //les setters

    public void setIdentifiant(int identifiant) {

        this.identifiant = identifiant;
    }

    public void setRaison_sociale(String raison_sociale) throws MetierException {
        if(raison_sociale==null ||raison_sociale.isEmpty()){
            throw new MetierException("entrez la raison sociale");
        }
        this.raison_sociale = raison_sociale;
        System.out.println("1 \n");
    }

    public void setNum_rue(String num_rue) throws MetierException {
        if(num_rue==null||num_rue.isEmpty()){
            throw new MetierException("entrez un num de rue");
        }
        this.num_rue = num_rue;
        System.out.println("2 \n");
    }

    public void setNom_rue(String nom_rue) throws MetierException {
        if (nom_rue==null||nom_rue.isEmpty()){
            throw new MetierException("entrez un nom");
        }
        this.nom_rue = nom_rue;
        System.out.println("3 \n");
    }
    public void setCode_postal(String code_postal) throws MetierException {
        if (code_postal==null||code_postal.isEmpty()){
            throw new MetierException("entrez un code");
        }
        this.code_postal = code_postal;
        System.out.println("4 \n");
    }

    public void setVille(String ville) throws MetierException {
        if (ville==null||ville.isEmpty()){
            throw new MetierException("entrez une ville");
        }
        this.ville = ville;
        System.out.println("5 \n");
    }

    public void setTel(String tel) throws MetierException {
        if (tel==null||tel.isEmpty()){
            throw new MetierException("rentrez un tel");
        }
        if (tel.length()<=10){
            throw new MetierException("le num de tel est invalide");
        }
        this.tel = tel;
        System.out.println("6 \n");
    }

    public void setEmail(String email) throws MetierException{
        if (email==null||email.isEmpty()){
            throw new MetierException("entrez un mail");
        }
        if (!PATTERN_MAIL.matcher(email).matches()){
            throw new MetierException("format email incorrect");
        }
        this.email = email;
        System.out.println("7 \n");
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
        System.out.println("8 \n");
    }



    //les getters
    public int getIdentifiant() {
        return identifiant;
    }

    public String getRaison_sociale() {
        return raison_sociale;
    }

    public String getNum_rue() {
        return num_rue;
    }

    public String getNom_rue() {
        return nom_rue;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public String getVille() {
        return ville;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getCommentaire() {
        return commentaire;
    }
    public String toString(){
        return "cilent " + raison_sociale +" "+ nom_rue +" "+ num_rue + code_postal +" "+ ville +" "+ tel +" "+ email
                + " " + commentaire;
    }
}
