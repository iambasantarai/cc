
package Unit6;

import javafx.application.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.event.*;
public class DemoFXLayout extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        Button b4 = new Button("Button4");
        Label l1 = new Label("Result");
        //example on flowpane: put the component from left to right
//        FlowPane fp = new FlowPane();
//        fp.setHgap(10);//horizontal gap (x coordinate gap)
//        fp.setVgap(30);//vertical gap(y coordinate gap)
//        fp.getChildren().add(b1);
//        fp.getChildren().add(b2);
//        fp.getChildren().add(b3);
//        fp.getChildren().add(b4);
//        fp.getChildren().add(l1);

// grid pane: put compoent in terms of row and column
//        GridPane gp = new GridPane();
//        gp.add(b1, 0, 0);
//        gp.add(b2, 1, 0);
//        gp.add(b3, 0, 1);
//        gp.add(b4, 1, 1);
//        gp.add(l1, 0, 2);

//border pane : put ocmponent in term of direction top, left, right, button and center
        BorderPane bp = new BorderPane();
        bp.setCenter(l1);
        bp.setRight(b1);
        bp.setLeft(b2);
        bp.setTop(b3);
        bp.setBottom(b4);

        b1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
//                System.out.println("Button1 is pressed");
                l1.setText("Button1 is pressed");

            }
        });
//        //adding flow pane to window
//        Scene sc = new Scene(fp, 400, 400);
//        stage.setTitle("Layout Demo");
//        stage.setScene(sc);
//        stage.show();

////adding grid pane to window
//        Scene sc = new Scene(gp, 400, 400);
//        stage.setTitle("Layout Demo");
//        stage.setScene(sc);
//        stage.show();

//adding border pane to window
            Scene sc = new Scene(bp, 400, 400);
            stage.setTitle("Layout Demo");
            stage.setScene(sc);
            stage.show();
    }
    
}
