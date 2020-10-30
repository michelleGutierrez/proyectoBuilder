package co.unicauca.restaurant.accces;
import co.unicauca.restaurant.domain.Product;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Michel Gutierrez Vallejo, Mannuel Fernando Granoble
 */
public class ItalianRepositoryImplArrays implements IProductRepository
{
    public static List<Product> products;
    
    public ItalianRepositoryImplArrays()
    {
         products = new ArrayList<>();
        initialize();
    }
     private void initialize()
     {
        products.add(new Product(1, "Carpaccio", 4000d));
        products.add(new Product(2, "Rissotto", 4500d));
        products.add(new Product(3, "Pasta", 3000d));
        products.add(new Product(4, "Laminas de carne", 3800d));
        products.add(new Product(5, "Laminas de pescado", 6100d));
        products.add(new Product(6, "Pollo a la italiana", 6800d));
    }
     
    @Override
    public List<Product> findAll() 
    {
        return products;
    }

    @Override
    public Product findById(Integer id) 
    {
        for(Product prod:products){
            if (prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    @Override
    public boolean create(Product newProduct)
    {
        Product prod = this.findById(newProduct.getId());
        if (prod != null) 
        {
                //Ya existe
                return false;
        }
        products.add(newProduct);
        return true;
    }

    @Override
    public boolean update(Product newProduct) 
    {
        Product prod = this.findById(newProduct.getId());
        if (prod != null) 
        {
            prod.setName(newProduct.getName());
            prod.setPrice(newProduct.getPrice());
        return true;
        }
    return false;
    }

    @Override
    public boolean delete(Integer id) 
    {
        for (Product prod : products)
        {
                if (prod.getId() == id) 
                {
                    products.remove(prod);
                    return true;
                }
        }
        return false;
    }
}
