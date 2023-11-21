/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import problem03.Problem03;

/**
 *
 * @author Wahid
 */
public class Problem03UnitTesting {
    
    public Problem03UnitTesting() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         System.out.println("before class");
    }
    
    @AfterAll
    public static void tearDownClass() {
          System.out.println("after class");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("before");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("after");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testMatchingLength() {
        assertTrue(Problem03.isStringLengthMatch("Hello", 5));
    }
}
