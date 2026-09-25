import java.util.ArrayList;

public class Parallel extends Circuit {
    private ArrayList<Circuit> circuitos;

    public Parallel(){
        this.circuitos = new ArrayList<>();
    }

    public void add(Circuit c){
        this.circuitos.add(c);
    }

    @Override 
    public double getResistance(){
        double Req=0;
        for(Circuit c : circuitos){
            Req+=1/(c.getResistance());
        }
        Req= 1/Req;

        return Req;
    }
}
