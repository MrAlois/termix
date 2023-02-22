package cz.monetplus.transport.termix;

import java.io.IOException;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Alois Šenkyřík asenkyrik@monetplus.cz
 * @version 1.0
 * Created: 22.02.2023
 */

public class TermixUiApplication extends Application {
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(TermixBootApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws IOException {
        applicationContext.publishEvent(new StageReadyEvent(stage));

        FXMLLoader fxmlLoader = new FXMLLoader(TermixBootApplication.class.getResource("/fxml/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("TermiX - Monet+ Terminal simulator v");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }

    static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return ((Stage) getSource());
        }
    }
}
