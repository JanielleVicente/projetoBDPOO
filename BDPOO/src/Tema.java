import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity 
public class Tema implements Identificavel {
	
	@Id
	private Long id;

	@ManyToMany
	@JoinColumn(name="Tema")
	private Set<Grupo> Tema;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Grupo> getTema() {
		return Tema;
	}

	public void setTema(ArrayList<Grupo> tema) {
		Tema = tema;
	}

	@Override
	public String toString() {
		return "Tema [id=" + id + ", Tema=" + Tema + ", getId()=" + getId() + ", getTema()=" + getTema()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Tema(Long id, ArrayList<Grupo> tema) {
		super();
		this.id = id;
		Tema = tema;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Tema == null) ? 0 : Tema.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tema other = (Tema) obj;
		if (Tema == null) {
			if (other.Tema != null)
				return false;
		} else if (!Tema.equals(other.Tema))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}