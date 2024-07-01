

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste TwoHourTests.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class TwoHourTests
{
    private Appointment a1, a2, a3, a4, a5, a6;
    private Day d;
    /**
     * Construtor default para a classe de teste TwoHourTests
     */
    public TwoHourTests()
    {
    }

    public void makeAppointments(){
        a1 = new Appointment("inside valid interval",2);
        a2 = new Appointment("1h inside and 1h out valid interval",2);
        a3 = new Appointment("outside valid interval",2);
        a4 = new Appointment("1h after first appointment",2);
        a5 = new Appointment("between a1 and a4 but ther is only 1h between",2);
        a6 = new Appointment("negative hour",2);
    }
    
    public void checkDay(){
        d = new Day(-1);
        System.out.println(d.getDayNumber());//Check if day is validating
        d = new Day(1);
        System.out.println(d.getDayNumber());
    }
    
    public void insertAppointments(){
        System.out.println(d.makeAppointment(9,a1) ? "valid, ok" : "invalid, not ok");// Should return valid
        System.out.println(d.makeAppointment(12,a4) ? "valid, ok" : "invalid, not ok");// Should return valid
        System.out.println(d.makeAppointment(17,a2) ? "valid, not ok" : "invalid, ok");// Should return invalid
        System.out.println(d.makeAppointment(20,a3) ? "valid, not ok" : "invalid, ok");// Should return invalid
        System.out.println(d.makeAppointment(-3,a6) ? "valid, not ok" : "invalid, ok");// Should return invalid
        System.out.println(d.makeAppointment(11,a5) ? "valid, not ok" : "invalid, ok");// Should return invalid
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
    public void test()
    {
        makeAppointments();
        checkDay();
        insertAppointments();
    }
}

