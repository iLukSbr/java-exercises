

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste test.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class test
{
    /**
     * Construtor default para a classe de teste test
     */
    public test()
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
    public void tester()
    {
        CalcEngine c = new CalcEngine();
        c.numberPressed(2);
        c.plus();
        c.numberPressed(3);
        c.equals();
        assertEquals(5, c.getDisplayValue());
        c.clear();
        c.numberPressed(7);
        c.minus();
        c.numberPressed(2);
        c.numberPressed(1);
        c.equals();
        assertEquals(-14, c.getDisplayValue());
    }
}

