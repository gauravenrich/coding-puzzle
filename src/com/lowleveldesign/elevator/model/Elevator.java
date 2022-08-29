package com.lowleveldesign.elevator.model;

import com.lowleveldesign.elevator.enums.Direction;
import com.lowleveldesign.elevator.enums.State;

/**
 * https://www.javastructures.com/design/elevator
 */
public class Elevator {
    private int currentFloor=0;
    private Direction direction=Direction.UP;
    private State state=State.IDLE;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
