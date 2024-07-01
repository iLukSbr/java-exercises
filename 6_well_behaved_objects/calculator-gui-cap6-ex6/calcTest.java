

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste calcTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class calcTest
{
    /**
     * Construtor default para a classe de teste calcTest
     */
    public calcTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void plus()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(2);
        calcEngi1.plus();
        calcEngi1.numberPressed(1);
        calcEngi1.numberPressed(9);
        calcEngi1.equals();
        assertEquals(21, calcEngi1.getDisplayValue(), 0.1);
    }

    @Test
    public void minus()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(5);
        calcEngi1.minus();
        calcEngi1.numberPressed(1);
        calcEngi1.numberPressed(5);
        calcEngi1.equals();
        assertEquals(-10, calcEngi1.getDisplayValue(), 0.1);
    }

    @Test
    public void multiply()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(9);
        calcEngi1.multiply();
        calcEngi1.numberPressed(3);
        calcEngi1.equals();
        assertEquals(27, calcEngi1.getDisplayValue(), 0.1);
    }

    @Test
    public void divide()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(1);
        calcEngi1.divide();
        calcEngi1.numberPressed(3);
        calcEngi1.equals();
        assertEquals(0.333, calcEngi1.getDisplayValue(), 0.1);
    }

    @Test
    public void percentage()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(8);
        calcEngi1.percentage();
        assertEquals(0.08, calcEngi1.getDisplayValue(), 0.1);
    }

    @Test
    public void square()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(4);
        calcEngi1.square();
        assertEquals(16, calcEngi1.getDisplayValue(), 0.1);
    }

    @Test
    public void squareRoot()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.numberPressed(2);
        calcEngi1.squareRoot();
        assertEquals(1.4, calcEngi1.getDisplayValue(), 0.1);
    }
}








