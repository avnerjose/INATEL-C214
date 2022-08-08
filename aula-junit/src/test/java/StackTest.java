import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

public class StackTest {
    @Test
    public void shouldBeAbleToDetectIfStackIsEmpty() {
        Stack<Integer> integerStack = new Stack<Integer>();
        boolean isEmpty = integerStack.isEmpty();
        assertTrue(isEmpty);
    }

    @Test
    public void shouldBeAbleToControlSize() {
        Stack<Integer> integerStack = new Stack<Integer>();
        boolean hasSizeZero = integerStack.size() == 0;
        assertTrue(hasSizeZero);
    }

    @Test
    public void shouldBeAbleToPush() {
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(1);

        assertEquals(1, integerStack.size());
    }

    @Test
    public void shouldBeAbleToPop() {
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(1);
        integerStack.pop();
        assertEquals(0, integerStack.size());
    }

    @Test(expected = EmptyStackException.class)
    public void shouldThrowExceptionWhenPoppingFromEmptyStack() {
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.pop();
    }

    @Test()
    public void shouldBeAbleToReturnValueFromPop() {
        Stack<Integer> integerStack = new Stack<Integer>();
        int value = 13;
        integerStack.push(value);
        int returnedValue = integerStack.pop();

        assertEquals(value, returnedValue);

    }
}
