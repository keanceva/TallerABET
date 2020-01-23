/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerabet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davidmendozaloor
 */
public class EmployeeTest {
    
    
    /**
     * Test of cs method, of class Employee.
     */
    
    //Se comprueba que se esta calculando el salario final del empleado de forma correcta
    //dando un salario normal de 300 dolares, currency="USD" y 0.5 de bonus el resultado
    //esperado deberia ser 364 +-1 porque estamos mes impar
    @Test
    public void testCsWorkers() {
        System.out.println("cs");
        Employee instance = new Employee(300.0f, "USD", 0.5f, EmployeeType.Worker);
        float expResult = 364.3f;
        float result = instance.cs();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    //Se comprueba que se esta calculando el salario final del empleado de forma correcta
    //dando un salario normal de 300 dolares, currency="USD" y 0.5 de bonus el resultado
    //esperado deberia ser alrededor de 540 +-1 porque es mes impar
    @Test
    public void testCsSupervisors() {
        System.out.println("cs");
        Employee instance = new Employee(500.0f, "Libras", 0.5f, EmployeeType.Supervisor);
        float expResult = 540;
        float result = (int)instance.cs();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    //Se comprueba que se esta calculando el salario final del empleado de forma correcta
    //dando un salario normal de 700 dolares, currency="USD" y 0.5 de bonus el resultado
    //esperado deberia ser 1075 +-1 porque es mes impar
    @Test
    public void testCsManagers() {
        System.out.println("cs");
        Employee instance = new Employee(1000.0f, "USD", 15f, EmployeeType.Manager);
        float expResult = 1075;
        float result = instance.cs();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    //Se comprueba que si el salio de un manager es negativo en el caso de que le descuenten en este caso
    //el salario puede ser negativo
    @Test
    public void testCsManagersSalarioNefativo() {
        System.out.println("cs");
        Employee instance = new Employee(-500.0f, "USD", 0f, EmployeeType.Manager);
        float expResult = 0;
        float result = instance.cs();
        assertTrue(expResult>result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    //Se comprueba que se esta calculando el salario final del manager de forma correcta
    //dando un salario normal de 1000 dolares en "usd" , pero nos damos cuenta que falla ya 
    // que deberia dar 1075 y no da es porque USD esta en minuscula lo que se puede corregir
    @Test
    public void testCsUSDminuscula() {
        System.out.println("cs");
        Employee instance = new Employee(1000.0f, "usd", 15f, EmployeeType.Manager);
        float expResult = 1075;
        float result = instance.cs();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonus() {
       
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
