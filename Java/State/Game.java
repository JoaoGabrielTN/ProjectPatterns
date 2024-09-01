package State;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        PhaseState phase = new FortificationState();
        Scanner in = new Scanner(System.in);
        boolean gameOn = true;
        Integer action;

        System.out.println("Select:\n   0 to take action. \n   1 to skip to the next phase. \n   neither to end ");
        while (gameOn) {
            System.out.println(phase.currPhase());
            action = in.nextInt();
            switch (action) {
                case 0:
                    phase.takeAction();
                    break;

                case 1:
                    phase = phase.endPhase();
                    break;

                default:
                    gameOn = false;
                    break;
            }
        }

        in.close();
    }
}
