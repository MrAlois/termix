package cz.monetplus.transport.termix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class TermixApplication extends Application {

    public static void main(String[] args) {
        Application.launch().run(TermixApplication.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
