/**
 * Created by hongboing on 5/7/16.
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class testApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Hello world");
        int[] myList = {2, 5, 9, 3, 12, 6};

        // Print all the array elements
        for (int i = 0; i < myList.length-1; i ++) {
            for (int j = 0; j < myList.length-1-i; j++){
                if(myList[j] > myList[j+1]){
                    int temp = myList[j+1];
                    myList[j+1] = myList[j];
                    myList[j] = temp;
                }
            }
        }
        for(int x = 0; x < myList.length; x++){
            System.out.println(myList[x]);
        }

    }
}
