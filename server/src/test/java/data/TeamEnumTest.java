package data;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeamEnumTest {

    @Test
    public void getTeam() {
        assertTrue(TeamEnum.CHICKEN.getTeam());
    }
}