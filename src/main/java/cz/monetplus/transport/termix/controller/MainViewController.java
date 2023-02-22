package cz.monetplus.transport.termix.controller;

import java.security.NoSuchAlgorithmException;

import cz.monetplus.transport.termix.utils.DataUtils;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

/**
 * @author Alois Šenkyřík asenkyrik@monetplus.cz
 * @version 1.0
 * Created: 22.02.2023
 */

@Slf4j
public class MainViewController {

    @FXML
    public Canvas mCanvas;

    public void doMove(MouseEvent mouseEvent) throws NoSuchAlgorithmException {
        val gc = mCanvas.getGraphicsContext2D();

//        gc.setFill(Color.WHITE);
//        gc.fillRect(0, 0, mCanvas.getWidth(), mCanvas.getHeight());

        gc.setFill(
                Color.rgb(
                        DataUtils.getRandomNumber(0, 255),
                        DataUtils.getRandomNumber(0, 255),
                        DataUtils.getRandomNumber(0, 255)
                )
        );

        gc.fillArc(
                DataUtils.getRandomNumber(0, (int) mCanvas.getWidth()),
                DataUtils.getRandomNumber(0, (int) mCanvas.getHeight()),
                DataUtils.getRandomNumber(0, (int) mCanvas.getWidth()),
                DataUtils.getRandomNumber(0, (int) mCanvas.getHeight()),
                DataUtils.getRandomNumber(0, 180),
                DataUtils.getRandomNumber(0, 360),
                ArcType.OPEN
        );
    }
}

