
abstract class Carro {
    
    public double kph(double km, double gals) {
        return km / gals;
    }
    
    public abstract void configuracionComputadora();
    public abstract void tamanoLlantas(int anio, String modelo);
}