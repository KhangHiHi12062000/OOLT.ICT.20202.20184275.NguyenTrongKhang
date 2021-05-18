package hust.soict.globalict.javafx;
import javafx.scene.control.RadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
	@FXML
	private Pane drawingAreaPane;
	@FXML
	private RadioButton FXPen;
	@FXML
	private RadioButton FXEraser;
	@FXML
	void clearButtonPressed(ActionEvent event) {
		drawingAreaPane.getChildren().clear();
	}
	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
		Circle newCircle;
		if(FXPen.isSelected()) {
		newCircle = new Circle(event.getX(),event.getY(),4,Color.BLACK);
		drawingAreaPane.getChildren().add(newCircle);}
		if(FXEraser.isSelected()) {
		newCircle = new Circle(event.getX(),event.getY(),4,Color.WHITE);
		drawingAreaPane.getChildren().add(newCircle);
		}
	}
}
