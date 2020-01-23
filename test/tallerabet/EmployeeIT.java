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
 * @author CORE I7
 */
public class EmployeeIT {
    
    public EmployeeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     /*Primera Prueba, probando las instancias en null, se espera que el programa de un valor y no se caiga
        Segunda Prueba, probando con Employee(300, "A", (float) 0.4, EmployeeType.President), por el nuevo tipo se espera que arroje
        un valor de cero
        Tercera Prueba, robando con Employee(-300, "A", (float) 0.4, EmployeeType.Manager), por el valor negativo se espera que arroje
        un valor de cero porque no deberia trabajar con esos valores.
        Cuarta prueba, con string "usd", se espera que realice la misma logica que "USD" ya que es la misma moneda, por lo cual deberia
        arrojar el valor esperado por el metodo
        */

    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Primera Prueba, probando con un porcentaje negativo, se espera que el programa de un valor de 0
     */
    @Test
    public void testCalculateYearBonus() {
        System.out.println("CalculateYearBonus-0");
        Employee instance = new Employee(300, "USD", (float) 0.4, EmployeeType.Manager);
        float expResult = 300 + 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Segunda Prueba, probando con Employee(300, "A", (float) 0.4, EmployeeType.President), por el nuevo tipo se espera que arroje
        un valor de cero
     */
    @Test
    public void testCalculateYearBonus1() {
        System.out.println("CalculateYearBonus-1");
        Employee instance = new Employee(300, "usd", (float) 0.4, EmployeeType.President);
        float expResult = 0.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Tercera Prueba, robando con Employee(-300, "A", (float) 0.4, EmployeeType.Manager), por el valor negativo se espera que arroje
        un valor de cero porque no deberia trabajar con esos valores.
     */
    @Test
    public void testCalculateYearBonus2() {
        System.out.println("CalculateYearBonus-2");
        Employee instance = new Employee(-300, "usd", (float) 0.4, EmployeeType.Manager);
        float expResult = 0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Cuarta prueba, con string "usd", se espera que realice la misma logica que "USD" ya que es la misma moneda, por lo cual deberia
        arrojar el valor esperado por el metodo
     */
    @Test
    public void testCalculateYearBonus3() {
        System.out.println("CalculateYearBonus-3");
        Employee instance = new Employee(300, "usd", (float) 0.4, EmployeeType.Manager);
        float expResult = 300 + 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of CalculateYearBonus method, of class Employee.
     * Quinta Prueba, probando con un salario que tenga el maximo valor posible
     */
    @Test
    public void testCalculateYearBonus4() {
        System.out.println("CalculateYearBonus-4");
        Employee instance = new Employee(Integer.MAX_VALUE, "usd", (float) 0.4, EmployeeType.Manager);
        float expResult = Integer.MAX_VALUE + 386.0f;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
