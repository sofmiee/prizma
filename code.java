public class prizma {
    private double length; // Длина основания треугольника
    private double height;      // Высота треугольника
    private double prismHeight; // Высота призмы

    //конструктор
    public prizma(double length, double height, double prismHeight) {
        this.length = length;
        this.height = height;
        this.prismHeight = prismHeight;
    }

    //метод для вычисления площади боковой поверхности
    public double lateralSurfaceArea() {
        // Площадь боковой поверхности = периметр основания * высота призмы
        double sideLength = Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2)); // Длина стороны треугольника
        double perimeter = length + 2 * sideLength; // Периметр треугольника
        return perimeter * prismHeight; // Площадь боковой поверхности
    }
    //метод для вычисления объема
    public double volume() {
        // Объем = площадь основания * высота призмы
        double areaOfBase = (length * height) / 2; // Площадь основания (треугольника)
        return areaOfBase * prismHeight; // Объем призмы
    }
    //тест
    public static void main(String[] args) {
        prizma prizma = new prizma(1, 3, 5);

        System.out.println("Площадь боковой поверхности: " + prizma.lateralSurfaceArea());
        System.out.println("Объем: " + prizma.volume());
    }
}
