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
    public void AllPostsAreCorrectlyReturned_true() {
        Hero hero = new Hero("Number 1: Superman");
        Hero otherHero = new Hero ("How to pair successfully");
        assertEquals(2, Hero.getAll().size());
    }
    @After
    public void tearDown() throws Exception {
    }
}