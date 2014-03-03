package br.org.base.dao;

import br.org.base.facade.AbstractFacade;
import br.org.base.model.Cliente;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: Parada
 * Date: 03/03/14
 * Time: 12:39
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class ClienteDAO extends AbstractFacade{

    @PersistenceContext(unitName="NewPersistenceUnit")
    private EntityManager em;

    public void salvar(){



        Cliente cliente = new Cliente();

        cliente.setNome("sjldkjslk");

        em.merge(cliente);


    }
}
