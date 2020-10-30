/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.accces;

/**
 *
  * @author Mannuel Fernando Granoble Pino   cod: 104616021474
 * @author Michel Andrea Gutierrez Vallejo  cod: 104616020302
 */
public class Factory 
{
    public IProductRepository getRepository(String dishType)
    {
        IProductRepository objDishRepository = null;
        if("Oriental".equals(dishType))
        {
            objDishRepository = new OrientalRepositoryImplArrays();
        }
        else if("Italian".equals(dishType))
        {
            objDishRepository = new ItalianRepositoryImplArrays();
        }
        return objDishRepository;
    }
  
    
}
