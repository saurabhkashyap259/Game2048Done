package Game2048Demo;
 
import java.awt.event.ActionEvent;
 
import javax.swing.AbstractAction;
 
import Game2048Demo.Game2048Model;
import Game2048Demo.Game2048Frame;
 
public class UpArrowAction extends AbstractAction {
 
    private static final long serialVersionUID = -2851527479086591525L;
     
    private Game2048Frame frame;
     
    private Game2048Model model;
 
    public UpArrowAction(Game2048Frame frame, Game2048Model model) {
        this.frame = frame;
        this.model = model;
    }
 
    @Override
    public void actionPerformed(ActionEvent event) {       
        if (model.isArrowActive()) {
            if (model.moveCellsUp()) {
                if (model.isGameOver()) {
                    model.setArrowActive(false);
                } else {
                    addNewCell();
                }
            }
        }
    }
 
    private void addNewCell() {
        model.addNewCell();
         
        frame.repaintGridPanel();
        frame.updateScorePanel();
    }
 
 
 
}