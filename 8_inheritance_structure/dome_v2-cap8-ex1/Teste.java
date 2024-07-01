

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste Teste.
 *
 * @author  (seu nome)
 * @version (um n�mero da vers�o ou uma data)
 */
public class Teste
{
    /**
     * Construtor default para a classe de teste Teste
     */
    public Teste()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada m�todo de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado ap�s cada m�todo de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test()
    {
        Videogame videogam2 = new Videogame("Jogo", "UTFPR", 10);
        videogam2.setComment("testando");
        videogam2.setOwn(true);
        assertEquals("UTFPR", videogam2.getCompany());
        assertEquals(true, videogam2.getOwn());
        assertEquals("testando", videogam2.getComment());
        videogam2.print();
    }
}

