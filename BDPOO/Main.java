import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ChatDebate");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Professor p = new Professor();
		p.setComentario("digite seu comentario");
		p.setGrupo("nome do grupo");
		p.setOpiniões("exponha sua opinião");
		p.setPessoas ("quantidade de integrantes");
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}