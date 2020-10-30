
package co.unicauca.restaurant.DishApp;

import co.unicauca.restaurant.domain.Dish;
import co.unicauca.restaurant.domain.Product;
import co.unicauca.restaurant.domain.Size;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class ItalianDish extends Dish
{
    private Product base;
    private List<Product> myOptions;
    private Size size;

    public ItalianDish(double p) 
    {
        this.price = p;
        myOptions = new Vector<>();
    }

    public void setBase(Product base)
    {
        this.base = base; 
    }

    public void addOption(Product option) 
    {
        getMyOptions().add(option);
    }

    /**
     * @return the base
     */
    public Product getBase()
    {
        return base;
    }

    /**
     * @return the myOptions
     */
    public List<Product> getMyOptions() 
    {
        return myOptions;
    }

    /**
     * @return the size
     */
    public Size getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Size size) {
        this.size = size;
    }
    
    public double getPrice()
    {
        price = base.getPrice();
        for(Product each: myOptions){
            price = price + each.getPrice();
        }
        if(size==Size.DOUBLE) price = 1.8*price;
        if(size==Size.FAMILY) price = 3*price;
        return price;
    }
    
}
