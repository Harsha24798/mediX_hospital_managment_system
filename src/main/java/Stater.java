import com.google.inject.Guice;
import com.google.inject.Injector;
import config.AppModule;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Stater extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Injector injector = Guice.createInjector(new AppModule());

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/admin_dashboard_form.fxml"));
        fxmlLoader.setControllerFactory(injector::getInstance);

        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
}
