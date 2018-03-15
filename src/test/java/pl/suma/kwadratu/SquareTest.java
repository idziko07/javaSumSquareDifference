package pl.suma.kwadratu;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class SquareTest {

    private Square calculator;

    @Before
    public void init(){
        this.calculator = new Square();
    }

    @Test
    public void SquareTestForTen(){
        //when
        int results = calculator.sumSquareDifference(10);

        //then
        assertThat(results, is(2640));
    }

    @Test
    public void SquareTestForHundred(){
        //when
        int results = calculator.sumSquareDifference(100);

        //then
        assertThat(results, is(25164150));
    }

    @Test
    public void SquareTestForThity(){
        //when
        int results = calculator.sumSquareDifference(30);

        //then
        assertThat(results, is(206770));
    }

    @Test
    public void SquareTestForZero(){
        //when
        int results = calculator.sumSquareDifference(5);

        //then
        assertThat(results, is(170));
    }


}