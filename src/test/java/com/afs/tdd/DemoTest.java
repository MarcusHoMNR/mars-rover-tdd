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
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 E", result);
    }

    @Test
    void should_direct_change_to_S_when_rotate_Mars_Rover_given_direction_E_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "R";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 S", result);
    }

    @Test
    void should_direct_change_to_W_when_rotate_Mars_Rover_given_direction_S_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "R";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 W", result);
    }

    @Test
    void should_direct_change_to_N_when_rotate_Mars_Rover_given_direction_W_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "R";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 N", result);
    }

    // Rotate to left
    @Test
    void should_direct_change_to_W_when_rotate_Mars_Rover_given_direction_N_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "L";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 W", result);
    }

    @Test
    void should_direct_change_to_S_when_rotate_Mars_Rover_given_direction_W_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "L";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 S", result);
    }

    @Test
    void should_direct_change_to_E_when_rotate_Mars_Rover_given_direction_S_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "L";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 E", result);
    }

    @Test
    void should_direct_change_to_N_when_rotate_Mars_Rover_given_direction_E_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "L";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 0 N", result);
    }

    // Move
    @Test
    void should_coordinateY_change_to_1_when_move_Mars_Rover_given_direction_N_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "M";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 1 N", result);
    }

    @Test
    void should_coordinateX_change_to_1_when_move_Mars_Rover_given_direction_E_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "M";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("1 0 E", result);
    }

    @Test
    void should_coordinateY_change_to_minus_1_when_move_Mars_Rover_given_direction_S_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "M";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("0 -1 S", result);
    }

    @Test
    void should_coordinateX_change_to_minus_1_when_move_Mars_Rover_given_direction_W_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "M";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("-1 0 W", result);
    }

    @Test
    void should_change_to_minus_1_And_1_And_N_when_batch_control_mars_rover_given_0_And_0_And_N_command_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "MLMR";

        //when
        String result = marsRover.batchControlMarsRover(command);

        //return
        assertEquals("-1 1 N", result);
    }


}
