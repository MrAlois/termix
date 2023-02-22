package cz.monetplus.transport.termix.utils;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

import cz.monetplus.transport.termix.TermixBootApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

/**
 * @author Alois Šenkyřík asenkyrik@monetplus.cz
 * @version 1.0
 * Created: 22.02.2023
 */

@Slf4j
@UtilityClass
public class FxmlResolver {

    public Optional<Parent> getParentFor(String filename){
        try {
            val resource = TermixBootApplication.class.getResource("/" + filename);
            if(Objects.isNull(resource))
                throw new IOException();

            return FXMLLoader.load(resource);
        } catch (IOException e) {
            log.error("Cannot find FXML view for '{}' filename!", filename, e);
            return Optional.empty();
        }
    }
}
