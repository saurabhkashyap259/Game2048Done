package Game2048Demo;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import Game2048Demo.Game2048Model;
import Game2048Demo.Game2048Frame;
 
public class StartGameActionListener implements ActionListener {
     
    private Game2048Frame frame;
     
    private Game2048Model model;
     
    public StartGameActionListener(Game2048Frame frame,
            Game2048Model model) {
        this.frame = frame;
        this.model = model;
    }
 
    @Override
    public void actionPerformed(ActionEvent event) {
        model.setHighScores();
        model.initializeGrid();
        model.setArrowActive(true);
        model.addNewCell();
        model.addNewCell();
         
        frame.repaintGridPanel();
        frame.updateScorePanel();
    }
 
}