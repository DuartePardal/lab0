package test;

import com.pa.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetId(){
        Person p= new Person(1,"Duarte");
        assertEquals(p.getId() ,1);
    }


}
