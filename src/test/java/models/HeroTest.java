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
    public void NewHeroObjectGetsCorrectlyCreated_true() throws Exception {
        Hero hero = new Hero("Number 1:Superman");
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void HeroInstantiatesWithContent_true() throws Exception {
        Hero hero = new Hero("Number 1: Superman");
        assertEquals("Number 1: Superman", hero.getContent());

    }

    @Test
    public void AllHeroAreCorrectlyReturned_true() {
        Hero hero = new Hero("Number 1: Superman");
        Hero otherHero = new Hero ("How to pair successfully");
        assertEquals(2, Hero.getAll().size());
    }

    @Test
    public void AllHeroContainsAllHero_true() {
        Hero hero = new Hero("Number 1: Superman");
        Hero otherHero = new Hero ("How to pair successfully");
        assertTrue(Hero.getAll().contains(hero));
        assertTrue(Hero.getAll().contains(otherHero));
    }

    @After
    public void tearDown() throws Exception {
    }
}