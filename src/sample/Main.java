package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("DATA MAHASISWA");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 320, 350);
        primaryStage.setScene(scene);

        Label nim = new Label("NIM:");
        grid.add(nim, 0, 1);

        TextField NIM = new TextField();
        grid.add(NIM, 1, 1);

        Label nama = new Label("Nama:");
        grid.add(nama, 0, 2);

        TextField Nama = new TextField();
        grid.add(Nama, 1, 2);

        Label fakultas = new Label("Fakultas:");
        grid.add(fakultas, 0, 3);

        TextField Fakultas = new TextField();
        grid.add(Fakultas, 1, 3);

        Label jurusan = new Label("Jurusan:");
        grid.add(jurusan, 0, 4);

        TextField Jurusan = new TextField();
        grid.add(Jurusan, 1, 4);

        Label alamat = new Label("Alamat:");
        grid.add(alamat, 0, 5);

        TextField Alamat = new TextField();
        grid.add(Alamat, 1, 5);

        Label kota = new Label("Kota:");
        grid.add(kota, 0, 6);

        TextField Kota = new TextField();
        grid.add(Kota, 1, 6);

        Label hobby = new Label("Hobby:");
        grid.add(hobby, 0, 7);

        TextField Hobby = new TextField();
        grid.add(Hobby, 1, 7);

        Button btn = new Button("CREATE");
        HBox hbtn = new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().add(btn);
        grid.add(hbtn, 1, 9);

        btn.setOnAction(actionEvent -> {
            String nim1 = NIM.getText();
            String nama1 = Nama.getText();
            String fakultas1 = Fakultas.getText();
            String jurusan1 = Jurusan.getText();
            String alamat1 = Alamat.getText();
            String kota1 = Kota.getText();
            String hobby1 = Hobby.getText();

            TextField nim2 = new TextField(nim1);
            grid.add(nim2, 3, 1);
            TextField nama2 = new TextField(nama1);
            grid.add(nama2, 3, 2);
            TextField fakultas2 = new TextField(fakultas1);
            grid.add(fakultas2, 3, 3);
            TextField jurusan2 = new TextField(jurusan1);
            grid.add(jurusan2, 3, 4);
            TextField alamat2 = new TextField(alamat1);
            grid.add(alamat2, 3, 5);
            TextField kota2 = new TextField(kota1);
            grid.add(kota2, 3, 6);
            TextField hobby2 = new TextField(hobby1);
            grid.add(hobby2, 3, 7);

        });

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}