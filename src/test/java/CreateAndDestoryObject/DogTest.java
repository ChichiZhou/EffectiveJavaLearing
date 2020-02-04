package CreateAndDestoryObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void testCreate(){
        Dog dog1 = Dog.createNewDog("Dog", "时琳", 29);
        assertEquals(29, dog1.age);
    }
}
