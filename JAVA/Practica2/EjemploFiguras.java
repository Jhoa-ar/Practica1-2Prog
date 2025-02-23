import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EjemploFiguras extends Application {
    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis(-10, 10, 1);
        NumberAxis yAxis = new NumberAxis(-10, 10, 1);
        xAxis.setLabel("X");
        yAxis.setLabel("Y");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Dibujo de Línea y Círculo");

        XYChart.Series<Number, Number> lineaSerie = new XYChart.Series<>();
        lineaSerie.setName("Línea");

        double x1 = 2, y1 = 3;
        double x2 = 5, y2 = 7;

        lineaSerie.getData().add(new XYChart.Data<>(x1, y1));
        lineaSerie.getData().add(new XYChart.Data<>(x2, y2));

        lineChart.getData().add(lineaSerie);

        Pane root = new Pane();
        root.getChildren().add(lineChart);

        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double xCirculo = 1;
        double yCirculo = 7;
        double radio = 1;

        gc.setFill(javafx.scene.paint.Color.BLUE);
        gc.fillOval((xCirculo - radio) * 40 + 400, (yCirculo - radio) * -40 + 300, radio * 80, radio * 80);

        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 550, 400);
        stage.setScene(scene);
        stage.setTitle("Ejemplo de Gráfico en JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}