package de.lubowiecki.aufgaben.a11;

import java.awt.*;

public class Roboter {

    private Point pos;

    public Roboter() {
        pos = new Point(0,0);
    }

    public void moveUp() {
        if(pos.y > 0)
            pos.y--;
    }

    public void moveDown() {
        pos.y++;
    }

    public void moveLeft() {
        if(pos.x > 0)
            pos.x--;
    }

    public void moveRight() {
        pos.x++;
    }

    public Point getPos() {
        return pos;
    }
}
