
package dao;
import java.io.Serializable;
import modelo.Itemvenda;

public class ItemvendaDAO extends GenericDAO<Itemvenda, Integer>{
    
    public ItemvendaDAO()
    {
        super(Itemvenda.class);
    }
}
