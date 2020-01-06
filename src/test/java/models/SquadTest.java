package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void CreateNewSquadInstance_true() {
        Squad newSquad = new Squad("Marvel", 8, "Space Wars");
        assertTrue(newSquad instanceof Squad);
    }

    @Test
    public void CorrectNumberOfSquadsAdded_true() {
        Squad firstSquad = new Squad("Marvel", 8, "Space Wars");
        Squad secondSquad = new Squad("DC", 10, "Super Human");
        assertEquals(2, Squad.getSquadInstance().size());
    }

    @After
    public void tearDown() throws Exception {
    }

}