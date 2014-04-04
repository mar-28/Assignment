package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import pack.Calculator;

public class Testin {

@Test
public void additionTest(){
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.add(2, 2));
	}

}
