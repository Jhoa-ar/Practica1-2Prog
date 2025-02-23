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
        return new float[]{x, y};
    } 

    public float[] coord_polares() {
        return new float[]{r, theta}; 
    }

    public String toString() {
        return "Punto{" +
               "coordenadas cartesianas=(" + x + ", " + y + ")" +
               ", coordenadas polares=(" + r + ", " + theta + ")" +
               '}';
    }
    public static void main(String[] args) { 
        Punto r1 = new Punto(2, 3); 
        float[] cartesianas = r1.coord_cartesianas();
        System.out.println("Coordenadas cartesianas = (" + cartesianas[0] + ", " + cartesianas[1] + ")");
        float[] polares = r1.coord_polares();
        System.out.println("Coordenadas polares = (" + polares[0] + ", " + polares[1] + ")");
        
        System.out.println(r1); 
    }
} 