package Game2048Demo;

import javax.swing.SwingUtilities;

public class Game2048 implements Runnable
{
    @Override
    public void run() {
        Game2048Frame game2048Frame = new Game2048Frame(new Game2048Model());
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Game2048());
    }

}