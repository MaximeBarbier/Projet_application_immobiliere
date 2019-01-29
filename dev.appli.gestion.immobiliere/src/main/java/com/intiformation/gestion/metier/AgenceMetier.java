package com.intiformation.gestion.metier;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.gestion.dao.IAgenceDAO;
import com.intiformation.gestion.entity.Agent;
import com.intiformation.gestion.entity.BienImmobilier;
import com.intiformation.gestion.entity.ClasseStd;
import com.intiformation.gestion.entity.Client;
import com.intiformation.gestion.entity.Proprietaire;
import com.intiformation.gestion.entity.Visite;

@Service("serviceBean")
public class AgenceMetier implements IAgenceMetier{
	
	@Autowired
	private IAgenceDAO agenceDAO;
	

	public void setAgenceDAO(IAgenceDAO agenceDAO) {
		this.agenceDAO = agenceDAO;
	}

	@Transactional
	public int ajouterProprietaire(Proprietaire p) {
	
		return agenceDAO.ajouterProprietaire(p);
	}
	@Transactional
	public List<Proprietaire> listProprietaires() {
		
		return agenceDAO.listProprietaires();
	}
	@Transactional
	public Proprietaire getProprietairebyId(int id) {
	
		return agenceDAO.getProprietairebyId(id);
	}
	@Transactional
	public void supprimerProprietaire(int id) {
		agenceDAO.supprimerProprietaire(id);
		
	}
	@Transactional
	public void modifierProprietaire(Proprietaire p) {
		agenceDAO.modifierProprietaire(p);
		
	}
	@Transactional
	public int ajouterBI(BienImmobilier bi, int idProp) {
		
		return agenceDAO.ajouterBI(bi, idProp);
	}
	@Transactional
	public BienImmobilier getBibyId(int id) {
		
		return agenceDAO.getBibyId(id);
	}
	@Transactional
	public void supprimerBi(int id) {
		agenceDAO.supprimerBi(id);
		
	}
	@Transactional
	public void modifierBi(BienImmobilier bi) {
		agenceDAO.modifierBi(bi);
		
	}
	@Transactional
	public List<BienImmobilier> getListBIByIdPropietaire(int idProp) {
		
		return agenceDAO.getListBIByIdPropietaire(idProp);
	}
	@Transactional
	public int ajouterClient(Client c) {
		
		return agenceDAO.ajouterClient(c);
	}
	@Transactional
	public List<Client> listClients() {
		
		return agenceDAO.listClients();
	}
	@Transactional
	public Client getClientbyId(int id) {
		
		return agenceDAO.getClientbyId(id);
	}
	@Transactional
	public void supprimerClient(int id) {
		agenceDAO.supprimerClient(id);
		
	}
	@Transactional
	public void modifierClient(Client c) {
		agenceDAO.modifierClient(c);
		
	}
	@Transactional
	public String ajouterCS(ClasseStd cs) {
		
		return agenceDAO.ajouterCS(cs);
	}
	@Transactional
	public List<ClasseStd> listCSByClient(int idClient) {
		
		return agenceDAO.listCSByClient(idClient);
	}
	@Transactional
	public void supprimerCS(int id) {
		agenceDAO.supprimerCS(id);
		
	}
	@Transactional
	public void modifierCS(ClasseStd cs) {
		agenceDAO.modifierCS(cs);
		
	}
	@Transactional
	public int ajouterAI(Agent ai) {
		
		return agenceDAO.ajouterAI(ai);
	}
	@Transactional
	public List<Agent> getListAgentByBienImmobilier(int idBI) {
	
		return agenceDAO.getListAgentByBienImmobilier(idBI);
	}
	@Transactional
	public void supprimerAI(int id) {
		agenceDAO.supprimerAI(id);
		
	}
	@Transactional
	public Agent getAgentbyId(int id) {
		
		return agenceDAO.getAgentbyId(id);
	}
	@Transactional
	public void modifierAI(Agent ai) {
		agenceDAO.modifierAI(ai);
		
	}
	@Transactional
	public int ajouterVisite(Visite v, int idBi) {
		
		return agenceDAO.ajouterVisite(v, idBi);
	}
	@Transactional
	public List<Visite> getVisiteByAgent(int idAgent) {
		
		return agenceDAO.getVisiteByAgent(idAgent);
	}
	@Transactional
	public List<Visite> getVisiteByBienImmo(int idBI) {
		
		return agenceDAO.getVisiteByBienImmo(idBI);
	}

}