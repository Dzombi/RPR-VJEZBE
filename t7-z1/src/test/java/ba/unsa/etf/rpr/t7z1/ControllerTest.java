package ba.unsa.etf.rpr.t7z1;

import static org.junit.jupiter.api.Assertions.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.w3c.dom.Text;

import java.awt.*;

@ExtendWith(ApplicationExtension.class)
class ControllerTest {
    @Start
    public void start (Stage stage) throws Exception {
        Parent mainNode = FXMLLoader.load(getClass().getResource("Korisnici.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }


    @Test
    public void testDodaj (FxRobot robot) {
        robot.clickOn("#ime");
        robot.write("Test");
        robot.clickOn("#prezime");
        robot.write("Test");
        robot.clickOn("#email");
        robot.write("Test");
        robot.clickOn("#username");
        robot.write("Test");
        robot.clickOn("#lozinka");
        robot.write("Test");
        robot.clickOn("#btn_dodaj");
        robot.moveBy(-350,-100);
        robot.clickOn();
        TextField t=robot.lookup("#ime").queryAs(TextField.class);
        assertEquals("Test",t.getText());
        /*works on my machine, ne znam drugacije klikat specificne iteme u listi :)*/
    }

    @Test
    public void testEdit (FxRobot robot) {
        robot.moveTo("#ime");
        robot.moveBy(-350,0);
        robot.clickOn();
        robot.clickOn("#ime");
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.A).
                release(KeyCode.CONTROL);
        robot.write("Test");
        robot.clickOn("#prezime");
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.A).
                release(KeyCode.CONTROL);
        robot.write("Test");
        robot.clickOn("#email");
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.A).
                release(KeyCode.CONTROL);
        robot.write("Test");
        robot.clickOn("#username");
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.A).
                release(KeyCode.CONTROL);
        robot.write("Test");
        robot.clickOn("#lozinka");
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.A).
                release(KeyCode.CONTROL);
        robot.write("Test");
        robot.moveTo("#ime");
        robot.moveBy(-350,30);
        robot.clickOn();
        robot.moveTo("#ime");
        robot.moveBy(-350,0);
        robot.clickOn();
        TextField t=robot.lookup("#ime").queryAs(TextField.class);
        assertEquals("Test",t.getText());
        /*works on my machine, ne znam drugacije klikat specificne iteme u listi :)*/
    }


}

