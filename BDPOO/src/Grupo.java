
public class Grupo {
		@Id
		
		
		private Integer id;
		private String nome;
		private String opiniões;
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
		public String getOpiniões() {
			return opiniões;
		}
		public void setOpiniões(String opiniões) {
			this.opiniões = opiniões;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((opiniões == null) ? 0 : opiniões.hashCode());
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
			if (opiniões == null) {
				if (other.opiniões != null)
					return false;
			} else if (!opiniões.equals(other.opiniões))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Grupo [id=" + id + ", nome=" + nome + ", opiniões=" + opiniões + ", getId()=" + getId()
					+ ", getNome()=" + getNome() + ", getOpiniões()=" + getOpiniões() + ", hashCode()=" + hashCode()
					+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
		}		
}