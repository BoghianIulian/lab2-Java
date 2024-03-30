package Service;

import Domain.Comanda;
import Domain.Tort;
import Repository.IRepository;
import Repository.Repository;
import Repository.RepositoryException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class ServiceComanda {
    private IRepository<Comanda> repoComanda = new Repository<Comanda>();

    public void addComanda(int id, ArrayList<Tort> lista) throws RepositoryException
    {
        Comanda c1= new Comanda(id,lista);
        repoComanda.addElem(c1);
    }

    public void removeComanda(int id) throws RepositoryException
    {
        repoComanda.removeElem(id);
    }

    public void updateComanda(int id1 , int id2 , ArrayList<Tort> lista) throws RepositoryException
    {
        Comanda c1= new Comanda(id2,lista);
        Comanda c2 = repoComanda.getById(id1);
        repoComanda.updateElem(c2,c1);
    }

    public Collection<Comanda> getAllT() throws RepositoryException
    {
        return repoComanda.getAll();
    }

    public Comanda getById(int id) throws RepositoryException
    {
        return repoComanda.getById(id);
    }


}
