package rdvmedecins.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client extends Personne {

	private static final long serialVersionUID = 1L;

	// constructeur par dÃ©faut
	public Client() {
	}

	// constructeur avec paramÃ¨tres
	public Client(String titre, String nom, String prenom) {
		super(titre, nom, prenom);
	}

	// identitÃ©
	public String toString() {
		return String.format("Client[%s]", super.toString());
	}

}
