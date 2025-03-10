package Game;

import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;

    }
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.setFont(new Font("Arial", Font.PLAIN,30));
        g.drawLine(GAME_WIDTH/2,0,GAME_WIDTH/2,GAME_HEIGHT);
        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10),GAME_WIDTH/2-60,50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10),GAME_WIDTH/2+30,50);
    }
}
