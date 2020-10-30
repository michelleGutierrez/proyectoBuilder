/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.builder;
import co.unicauca.restaurant.DishApp.ItalianDish;
import co.unicauca.restaurant.DishApp.ItalianDishBuilder;
import co.unicauca.restaurant.DishApp.OrientalDish;
import co.unicauca.restaurant.DishApp.OrientalDishBuilder;
import co.unicauca.restaurant.domain.Dish;
import co.unicauca.restaurant.domain.Product;
import co.unicauca.restaurant.domain.Size;
import co.unicauca.restaurant.services.DishBuilder;
import co.unicauca.restaurant.services.DishDirector;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


/**
 *
 * @author Michel Gutierrez Vallejo, Mannuel Fernando Granoble
 */
public class DishTest {
    
    public DishTest()
    {
        
    }
/**
     * Test para el plato Oriental 
     * @throws java.text.ParseException
     */
    @Test
    public void Oriental()throws ParseException
    {
        System.out.println("Oriental Dish");
        //Elementos del plato
        OrientalDish platoOriental;
        platoOriental = new OrientalDish(0.0);
        platoOriental.setBase(new Product(1, "Shop Suey", 5000d));
        platoOriental.addOption(new Product(4, "Pollo Agridulce", 5800d));
        platoOriental.setSize(Size.FAMILY);
        
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        orientalBuilder.setDish(platoOriental);
       
        DishDirector director = new DishDirector(orientalBuilder);
        //director.create();
        Dish dish = director.getDish();
        assertEquals(32400, dish.getPrice());     
   }
   
   /**
     * Test para el plato Italian
     * @throws java.text.ParseException
     */
    @Test
    public void Italian()throws ParseException
    {
        System.out.println("Oriental Dish");
        //Elementos del palto
        ItalianDish platoItalian;
        platoItalian = new ItalianDish(0.0);
        platoItalian.setBase(new Product(2, "Carpaccio", 6000d));
        platoItalian.addOption(new Product(4, "Laminas de carne", 3800d));
        platoItalian.addOption(new Product(6, "Pollo a la italiana", 6800d));
        platoItalian.setSize(Size.PERSONAL);
        DishBuilder ItalianBuilder = new ItalianDishBuilder();
        ItalianBuilder.setDish(platoItalian);
       
        DishDirector director = new DishDirector(ItalianBuilder);
        
        Dish dish = director.getDish();
        assertEquals(16600, dish.getPrice());    
        
        //Cambiano el tamaño 
        platoItalian.setSize(Size.DOUBLE);
        ItalianBuilder.setDish(platoItalian);
        dish = director.getDish();
        assertEquals(29880, dish.getPrice());

   }
}
