package com.singtel.assignment.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.singtel.assignment.Animal;
import com.singtel.assignment.Bird;
import com.singtel.assignment.IFlyable;
import com.singtel.assignment.ISingable;
import com.singtel.assignment.ISwimmable;
import com.singtel.assignment.IWalkable;

public class BirdTest {

	@Test
	public void testWalking() {
		Bird bird = new Bird();
		assertThat(bird, instanceOf(Animal.class));
		assertTrue(bird instanceof IWalkable);
	}
	
	@Test
	public void testSinging() {
		Bird bird = new Bird();
		assertThat(bird, instanceOf(Animal.class));
		assertTrue(bird instanceof ISingable);
	}
	
	@Test
	public void testSwimming() {
		Bird bird = new Bird();
		assertThat(bird, instanceOf(Animal.class));
		assertFalse(bird instanceof ISwimmable);
	}
	
	@Test
	public void testFlying() {
		Bird bird = new Bird();
		assertThat(bird, instanceOf(Animal.class));
		assertTrue(bird instanceof IFlyable);
	}

}
