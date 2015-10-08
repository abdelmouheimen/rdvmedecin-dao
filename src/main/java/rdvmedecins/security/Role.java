
package rdvmedecins.security;

import javax.persistence.Entity;
import javax.persistence.Table;

import rdvmedecins.entities.AbstractEntity;

@Entity
@Table(name = "ROLES")
public class Role extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String name;

	public Role() {
	}

	public Role(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return String.format("Role[%s]", name);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
