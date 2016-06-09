package org.model;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ModelTest extends TestCase {
	private Model model;

	@Override
	@Before
	public void setUp() throws Exception {
		this.model = new Model();
	}

	@Test
	public void testGetHelloWorld() {
		assertEquals("Hello World", this.model.getHelloWorld());
	}
}
