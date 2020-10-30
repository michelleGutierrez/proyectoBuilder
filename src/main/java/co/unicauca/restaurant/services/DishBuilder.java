
package co.unicauca.restaurant.services;

import co.unicauca.restaurant.domain.Dish;
import co.unicauca.restaurant.accces.IProductRepository;

/**
 *
 * @author Michel Gutierrez Vallejo, Mannuel Fernando Granoble
 */
public abstract class DishBuilder {
    
    protected Dish myDish;
    protected IProductRepository myRepository;
    
    Dish getDish() {
        return myDish;
    }
    
    public void setDish(Dish myDish)
    {
        this.myDish = myDish;
    }

    public abstract DishBuilder init();

    public abstract DishBuilder setCore();

    public abstract boolean addPart();

    public abstract DishBuilder setSize();
    
}
