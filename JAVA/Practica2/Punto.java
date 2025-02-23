public class Punto {
    public float x;
    public float y;
    public float r;
    public float theta;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
        this.r = (float) Math.sqrt(x * x + y * y);
        this.theta = (float) Math.atan2(y, x);
    }

    public float[] coord_cartesianas() {
        return new float[] { x, y };
    }

    public float[] coord_polares() {
        return new float[] { r, theta };
    }

    public String toString() {
        return "Punto{" +
                "coordenadas cartesianas=(" + x + ", " + y + ")" +
                ", coordenadas polares=(" + r + ", " + theta + ")" +
                '}';
    }
}