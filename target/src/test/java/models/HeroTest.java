package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }



    @Test
    public void CreateInstanceOfHero_true() {
        Hero newHero = new Hero("Iron Man", 100, "Technology", "Ego", 1);
        assertTrue(newHero instanceof Hero);
    }

    @Test
    public void CorrectNumberOfHeroesAdded_true() {
        Hero newHero = new Hero("Iron Man", 100, "Technology", "Ego", 1);
        assertEquals(1, Hero.getHeroInstance().size());
    }

    @Test
    public void FindByIdReturnsCorrectHeroInstance() {
        Hero newHero = new Hero("Iron Man", 100, "Technology", "Ego", 1);
        assertEquals(newHero, Hero.findById(Hero.getHeroInstance().size()));
    }

    @After
    public void tearDown() throws Exception {
    }
}