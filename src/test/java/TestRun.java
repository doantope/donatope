
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.ice4.Contact;
import com.mycompany.ice4.ConatctManager;
 
/**
 *
 * @author gabi_
 */
public class TestRun {
    private ConatctManager contactManager;

    @BeforeEach
    public void setUp() {        
        Contact contact = new Contact("Gabriela", "Pereira", "Gabi@sheridan.ca");
        Contact contact1 = new Contact("cont2", "donato", "cont2@sheridan.ca");
        Contact contact2 = new Contact("cont3", "hazim", "cont3@sheridan.ca");
        contactManager = new ConatctManager(new Contact[]{contact, contact1, contact2});
    }

    
    @Test
    public void test() {
        String email = "Gabi@sheridan.ca";
        Contact result = contactManager.findContact(email);
        assertNotNull(result); 
        assertEquals("Gabriela", result.getFirstName());
    }

    
    @Test
    public void test0() {
        String emailAddress = "Gabi@sheridan.ca";
        Contact result0 = contactManager.findContact(emailAddress);
        assertNotNull(result0); 
        assertEquals("Pereira", result0.getLastName());
    }

    
    @Test
    public void test1() {
        String email = "cont3@sheridan.ca";
        Contact result1 = contactManager.findContact(email);
        assertNotNull(result1); 
        assertEquals("hazim", result1.getLastName());
    }

@Test
    public void test2() {
        String email = "cont2@sheridan.ca";
        Contact result2 = contactManager.findContact(email);
        assertNotNull(result2); 
        assertEquals("donato", result2.getLastName());
    }

    @Test
    public void test3() {
        String email = "cont3@sheridan.ca";
        Contact result3 = contactManager.findContact(email);
        assertNotNull(result3); 
        assertEquals("cont3", result3.getFirstName());
    }

    @Test
    public void test4() {
        String email = "Gabi@sheridan.ca";
        Contact result4 = contactManager.findContact(email);
        assertNotNull(result4); 
        assertEquals("Gabriela", result4.getLastName());
    }

}
