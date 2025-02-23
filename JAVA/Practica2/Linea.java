import javafx.scene.chart.XYChart;

class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dibujarLinea(XYChart<Number, Number> lineChart) {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Línea");
        series.getData().add(new XYChart.Data<>(p1.x, p1.y));
        series.getData().add(new XYChart.Data<>(p2.x, p2.y));
        lineChart.getData().add(series);
    }

    @Override
    public String toString() {
        return "Linea{" +
                "punto1=" + p1 +
                ", punto2=" + p2 +
                '}';
    }
}