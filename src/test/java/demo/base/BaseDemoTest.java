package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void shouldReturnNinetyNineWhenGivenSixtySixAndThirtyThree(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(99, baseDemo.sum(66, 33));
    }

    @Test
    public void shouldReturnTwentyFourWhenGivenSixteenAndEight(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(24, baseDemo.sum(16, 8));
    }
}
