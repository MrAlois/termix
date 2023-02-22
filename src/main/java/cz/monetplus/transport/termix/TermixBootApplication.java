package cz.monetplus.transport.termix;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class TermixBootApplication {

    public static void main(String[] args) {
        Application.launch(TermixUiApplication.class, args);
    }
}
