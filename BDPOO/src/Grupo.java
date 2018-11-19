
public class Grupo {
		@Id
		
		
		private Integer id;
		private String nome;
		private String opini�es;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getOpini�es() {
			return opini�es;
		}
		public void setOpini�es(String opini�es) {
			this.opini�es = opini�es;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((opini�es == null) ? 0 : opini�es.hashCode());
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
			Grupo other = (Grupo) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (opini�es == null) {
				if (other.opini�es != null)
					return false;
			} else if (!opini�es.equals(other.opini�es))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Grupo [id=" + id + ", nome=" + nome + ", opini�es=" + opini�es + ", getId()=" + getId()
					+ ", getNome()=" + getNome() + ", getOpini�es()=" + getOpini�es() + ", hashCode()=" + hashCode()
					+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
		}		
}