import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarCollectionTest {

    private CarCollection<Car> carCollection;

    @BeforeEach
    public void setUp(){
        carCollection = new CarHashSet<>();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void alreadyContainsCar() {
        Car car = new Car("Brand0", 0);
        assertTrue(carCollection.contains(car));
    }

    @Test
    public void notContains() {
        Car car = new Car("Brand120", 10);
        assertFalse(carCollection.contains(car));
    }

    @Test
    public void testForEach(){
        int index = 0;
        for(Car car : carCollection){
            index++;
        }
        assertEquals(100, index);
    }
}
