package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.util.Callback;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

public class ListViewController
{

    @FXML private ResourceBundle resources;

    @FXML private URL location;

    @FXML private   ListView            listView;

    private List<String> stringList     = new ArrayList<>(5);
    private         ObservableList      observableList = FXCollections.observableArrayList();

    public void setListView(){

        stringList.add("String 1");
        stringList.add("String 2");
        stringList.add("String 3");
        stringList.add("String 4");

        observableList.setAll(stringList);

        listView.setItems(observableList);

        listView.setCellFactory(
                new Callback<ListView<String>, javafx.scene.control.ListCell<String>>() {
                    @Override
                    public ListCell<String> call(ListView<String> listView) {
                        return new ListViewCell();
                    }
                });
    }

    @FXML
    void initialize() {
        assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'CustomList.fxml'.";

        setListView();
    }

}//ListViewController