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
		club.creerEquipe();
		club.remplissageJoueurJoueur(club.getEquipe().get(0), club.getEquipe().get(1), club);
		assertNotNull("Aucun joueur n'a été pas enregistré", club.getEquipe().get(0).getJoueur());
		assertNotNull("Aucun joueur n'a été pas enregistré", club.getEquipe().get(1).getJoueur());
	}
	
	//Un test qui permet de verifier si manche existe dans Session d'un club.
	@Test
	public void testMancheExisteDansSession() {
		club.CreerSession();
		club.getSession().creerManche(2, club);
		System.out.println(club.getSession().getNombreManche().get(0));
		assertNotNull("Aucune manche n'a été pas crée", club.getSession().getNombreManche());
	}
	
	//Un test qui permet de verifier si les deux equipes existent dans Session d'un club.
	@Test
	public void testEquipe1Equipe2ExisteDansSession() {
		club.CreerSession();
		assertNotNull("Aucune manche n'a été pas crée", club.getSession().getEquipe1());
		assertNotNull("Aucune manche n'a été pas crée", club.getSession().getEquipe2());
	}
 

}
 