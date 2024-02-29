import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testPersonNameShouldNotChangeWhenNameIsNotSet() {
        Person person = new Person("Juan", 19, true, 0);
        assertEquals("Juan", person.getName());
    }
    @Test
    public void testPersonAgeShouldNotChangeWhenAgeIsNotSet() {
        Person person = new Person("Juan", 49, true, 6);
        assertEquals(49, person.getAge());
    }
    @Test
    public void testPersonIdShouldNotChangeWhenIdIsNotSet() {
        Person person = new Person("Juan", 19, true, 3);
        assertEquals(3, person.getId());
    }
    @Test
    public void testPersonNameShouldChangeWhenSetName()
    {
        Person person = new Person ("Juan", 19, true, 0);
        person.setName("Maria");
        assertEquals(person.getName(), "Maria");
    }
    @Test
    public void testPersonAgeShouldChangeWhenSetAge()
    {
        Person person = new Person ("Juan", 49, true, 6);
        person.setAge(25);
        assertEquals(person.getAge(), 25);
    }
    @Test
    public void testPersonIdChangeWhenSetId()
    {
        Person person = new Person ("Juan", 19, true, 3);
        person.setId(30);
        assertEquals(person.getId(), 30);
    }
    @Test
    public void testPersonIsNotAStudent()
    {
        Person person = new Person ("Juan", 33, true, 2);
        person.setIsStudent(false);
        assertFalse(person.getIsStudent());
    }
    @Test
    public void testPersonIsAStudent()
    {
        Person person = new Person ("Juan", 18, true, 9);
        person.setIsStudent(true);
        assertTrue(person.getIsStudent());
    }
}
