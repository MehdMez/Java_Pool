import java.io.Serializable;

public class Toy implements Serializable{
  private String nom, style;
  private double prix;

  public Toy(String nom, String style, double prix) {
    this.nom = nom;
    this.style = style;
    this.prix = prix;
  }

  public String toString(){
    return "Nom du jouet : " + this.nom + "\n Style de jouet : "
	    + this.style + "\n Prix du jouet : " + this.prix + "\n";
  }
}
