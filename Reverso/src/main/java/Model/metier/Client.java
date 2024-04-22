package Model.metier;


import MetierException.MetierException;

public class Client extends Societe{
    private Double chiffre_affaires;
    private int nb_employes;




    public Client( int identifiant,String raison_sociale, String num_rue, String nom_rue,
                   String code_postal, String ville, String tel, String mail, String commentaire,
                   Double chiffre_affaires, int nb_employes) throws MetierException {

        super(  identifiant,raison_sociale, num_rue, nom_rue, code_postal, ville, tel, mail, commentaire);
        setChiffre_affaires(chiffre_affaires);
        setNb_employes(nb_employes);
    }

    public Client() {

    }


    //les setters


    public void setChiffre_affaires(Double chiffre_affaires)  {
    /*    if (chiffre_affaires==null||chiffre_affaires.isNaN()){
            throw new MetierException("le champ de ca est vide ou non valide");
        }else if (chiffre_affaires<=200){
            throw new MetierException("le cf doit être su à 200");
        }*/
        this.chiffre_affaires=chiffre_affaires;
        System.out.println("9 \n");
    }

    public void setNb_employes(int nb_employes) throws MetierException {
        if (nb_employes<=0){
            throw new MetierException("le nombre ne doit pas être inferieur à 0");
        }
        this.nb_employes=nb_employes;
        System.out.println("10 \n");
    }

    //les getters


    public Double getChiffre_affaires() {
        return chiffre_affaires;
    }

    public int getNb_employes() {
        return nb_employes;
    }


    public String toString(){
        return "cilent [ "  +getIdentifiant() +"\t"+  getRaison_sociale()+"\t" + getNum_rue()+"\t" + getNom_rue() +"\t"
                + getCode_postal()+"\t" + getVille()+"\t" + getEmail() +"\t"+ getTel() +"\t"+ chiffre_affaires +"\t"
                +nb_employes+"\t"+ "]";
    }
}
