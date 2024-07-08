public class Employe {
    private String nom;
    private String departement;
    int salaire;

    public Employe(String med, String sgh, double v) {
    }

    public Employe(String nom, String departement, int salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }



    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
