package Lesson8.Assignments.craps;

import java.awt.Color;
import java.awt.Graphics;

public class Craps {

    private Dice dice1, dice2;
    private int rollnum, point;
    private boolean newGame;    

    Craps(Graphics g1, Graphics g2, int size1, int size2) {
        //make 2 dice for 2 panels
        dice1 = new Dice(g1, size1);
        dice2 = new Dice(g2, size2);

        dice1.setColor(Color.red, Color.white);
        dice2.setColor(Color.red, Color.white);
        rollnum = 0;
        point = 0;
        newGame = true;
    }

    public void roll() {
        newGame = false;
        rollnum++;
        dice1.roll();
        dice2.roll();
        if (rollnum == 1) {
            point = getTotal();
            dice1.draw();
            dice2.draw();
        }
    }

    public boolean isNewGame() {
        return newGame;
    }

    public int getTotal() {
        return dice1.getValue() + dice2.getValue();
    }

    public int getPoint() {
        return point;
    }

    public boolean hasWon() {        
        if (rollnum == 1 && getTotal() == 7 || rollnum == 1 && getTotal() == 11) {
            return true;
        } 
        else if(rollnum > 1 && getTotal()==point){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean hasLost() {
        if (rollnum == 1 && getTotal() == 2 || rollnum == 1 && getTotal() == 3 || rollnum == 1 && getTotal() == 12) {
            return true;
        } else if (rollnum > 1 && getTotal() == 7) {
            return true;
        } else {
            return false;
        }
    }
}
