import java.util.ArrayList;

public class Serial extends Circuit {
    private ArrayList<Circuit> circuitos;
    
    public Serial(){
        this.circuitos = new ArrayList<>();
    }

    public void add(Circuit c){
        this.circuitos.add(c);
    }

    @Override 
    public double getResistance(){
        double soma=0;
        for(Circuit c : circuitos){
            soma+=c.getResistance();
        }
        return soma;
    }
}
