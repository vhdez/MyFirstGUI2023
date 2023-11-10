import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyFxApp extends Application {
    // Use fields so values can be updated even after start() is done
    int orders = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Construct and customize all of the Controls
        Text text1 = new Text("Who wants lasagna?");
        text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 48));
        Text text2 = new Text("Please order here:");
        text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 32));
        Text text3 = new Text("Lasagnas ordered: " + orders);
        Button button = new Button("Yes, please!");
        // ON ACTION: This is a method that gets called AFTER user presses button
        button.setOnAction(actionEvent -> {
            orders = orders + 1;
            text3.setText("A lasagna was ordered!  Ordered amount:" + orders);
        });

        // Layout all of the controls in a tree of Layouts and then place top Layout in Scene
        HBox hbox1 = new HBox(button, text3);
        VBox vbox1 = new VBox(text1, text2, hbox1);
        Scene myScene1 = new Scene(vbox1,600,300);

        // setup scene on the stage and show it
        primaryStage.setTitle("My Last Lasagna Maker");
        primaryStage.setScene(myScene1);
        primaryStage.show();
    }

}

