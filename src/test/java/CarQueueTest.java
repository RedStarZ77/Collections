import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarQueueTest {

    private CarQueue queue;

    @BeforeEach
    void setUp() throws Exception {
        queue = new CarLinkedList();
        for (int i = 0; i < 10; i++) {
            queue.add(new Car("Brand" + i, i));
        }
    }

    @Test
    void add() {
        assertEquals(10, queue.size());
    }

    @Test
    void peek() {
       Car car = queue.peek();
       assertEquals("Brand0", car.getBrand());
       assertEquals(10, queue.size());
    }

    @Test
    void pool() {
        Car car = queue.pool();
        assertEquals("Brand0", car.getBrand());
        assertEquals(9, queue.size());
    }
}
