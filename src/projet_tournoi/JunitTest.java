package projet_tournoi;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author DELL
 *
 */
class JunitTest {

	Club club=new Club();
	
	//Un test qui permet de verifier si l'objet session existe dans l'objet  club.
	@Test
	public void testIsSession() {
		club.CreerSession();
		assertNotNull(club.getSession());
		
	}
	
	//Un test qui permet de verifier si un objet equipe existe dans l'objet  club.
	@Test
	public void testEquipeExiste() {
		club.creerEquipe();
		assertNotNull(club.getEquipe().get(0));
		
	}
	
	//Un test qui permet de verifier s'il ya des joueurs dans l'objet Equipe d'un club.
	@Test
	public void testJoueurExisteDansEquipe() {

		assertNotNull("Aucun joueur n'a été pas enregistré", club.getEquipe().get(0).getJoueur());
		assertNotNull("Aucun joueur n'a été pas enregistré", club.getEquipe().get(1).getJoueur());
	}


}
