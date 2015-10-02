package rdvmedecins.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "creneaux")
public class Creneau extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	// caractÃ©ristiques d'un crÃ©neau de RV
	private int hdebut;
	private int mdebut;
	private int hfin;
	private int mfin;

	// un crÃ©neau est liÃ© Ã  un mÃ©decin
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_medecin")
	private Medecin medecin;

	// clÃ© Ã©trangÃ¨re
	@Column(name = "id_medecin", insertable = false, updatable = false)
	private long idMedecin;

	// constructeur par dÃ©faut
	public Creneau() {
	}

	// constructeur avec paramÃ¨tres
	public Creneau(Medecin medecin, int hdebut, int mdebut, int hfin, int mfin) {
		this.medecin = medecin;
		this.hdebut = hdebut;
		this.mdebut = mdebut;
		this.hfin = hfin;
		this.mfin = mfin;
	}

	// toString
	public String toString() {
		return String.format("CrÃ©neau[%d, %d, %d, %d:%d, %d:%d]", id, version, idMedecin, hdebut, mdebut, hfin, mfin);
	}

	// clÃ© Ã©trangÃ¨re
	public long getIdMedecin() {
		return idMedecin;
	}

	// setters - getters
	public int getHdebut() {
		return hdebut;
	}

	public void setHdebut(int hdebut) {
		this.hdebut = hdebut;
	}

	public int getMdebut() {
		return mdebut;
	}

	public void setMdebut(int mdebut) {
		this.mdebut = mdebut;
	}

	public int getHfin() {
		return hfin;
	}

	public void setHfin(int hfin) {
		this.hfin = hfin;
	}

	public int getMfin() {
		return mfin;
	}

	public void setMfin(int mfin) {
		this.mfin = mfin;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
}