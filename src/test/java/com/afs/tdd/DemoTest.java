package com.afs.tdd;

import com.afs.tdd.Objects.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    // Change Direction
    @Test
    void should_direct_change_to_E_when_rotate_Mars_Rover_given_direction_N_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "R";

        //when
        String result = marsRover.controlMarsRover(command);

        //return
        assertEquals("0 0 E", result);
    }

    @Test
    void should_direct_change_to_S_when_rotate_Mars_Rover_given_direction_E_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "R";

        //when
        String result = marsRover.controlMarsRover(command);

        //return
        assertEquals("0 0 S", result);
    }
}
