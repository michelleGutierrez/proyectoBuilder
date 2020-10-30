
package co.unicauca.restaurant.accces;


import co.unicauca.restaurant.domain.Product;
import java.util.List;

/**
* Interface de los servicios del repositorio
*
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
*/

public interface IProductRepository 
{
    List<Product> findAll();
    Product findById(Integer id);
    boolean create(Product newProduct);
    boolean update(Product newProduct);
    boolean delete(Integer id);
}
