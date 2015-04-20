package Game2048Demo;
 
import java.awt.event.ActionEvent;
 
import javax.swing.AbstractAction;
 
import Game2048Demo.Game2048Model;
import Game2048Demo.Game2048Frame;
 
public class RightArrowAction extends AbstractAction {
 
    private static final long serialVersionUID = 2982995823948983992L;
 
    private Game2048Frame frame;
     
    private Game2048Model model;
 
    public RightArrowAction(Game2048Frame frame, Game2048Model model) {
        this.frame = frame;
        this.model = model;
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (model.isArrowActive()) {
            if (model.moveCellsRight()) {
                if (model.isGameOver()) {
                    model.setArrowActive(false);
                } else {
                    model.addNewCell();
                     
                    frame.repaintGridPanel();
                    frame.updateScorePanel();
                }
            }
        }
    }
 
}