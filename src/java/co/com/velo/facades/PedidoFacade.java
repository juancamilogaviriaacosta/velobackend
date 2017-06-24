package co.com.velo.facades;

import co.com.velo.entidades.Pedido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author juan
 */
@Stateless
public class PedidoFacade extends AbstractFacade<Pedido> {

    @PersistenceContext(unitName = "velobackendPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PedidoFacade() {
        super(Pedido.class);
    }
    
}
