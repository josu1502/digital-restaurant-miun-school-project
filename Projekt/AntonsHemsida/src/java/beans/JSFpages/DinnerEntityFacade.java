/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.JSFpages;

import beans.entities.DinnerEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Joakim
 */
@Stateless
public class DinnerEntityFacade extends AbstractFacade<DinnerEntity> {

    @PersistenceContext(unitName = "AntonsHemsidaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DinnerEntityFacade() {
        super(DinnerEntity.class);
    }
    
}
