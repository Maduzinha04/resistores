public class Resistor extends Circuit {
    private double resistance;

    public Resistor(double r){
        this.resistance=r;
    }

    @Override 

    public double getResistance(){
        return this.resistance;
    }
}
