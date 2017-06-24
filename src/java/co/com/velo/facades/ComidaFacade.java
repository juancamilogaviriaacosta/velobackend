package co.com.velo.facades;

import co.com.velo.entidades.Comida;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juan
 */
@Stateless
public class ComidaFacade extends AbstractFacade<Comida> {

    @PersistenceContext(unitName = "velobackendPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComidaFacade() {
        super(Comida.class);
    }
    
}
