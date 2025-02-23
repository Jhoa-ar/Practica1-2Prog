import javafx.scene.chart.XYChart;

class Circulo {
    private Punto centro;
    private float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public void dibujarCirculo(XYChart<Number, Number> lineChart) {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Círculo");

        for (int i = 0; i <= 360; i++) {
            double theta = Math.toRadians(i);
            double x = centro.x + radio * Math.cos(theta);
            double y = centro.y + radio * Math.sin(theta);
            series.getData().add(new XYChart.Data<>(x, y));
        }

        lineChart.getData().add(series);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }
}