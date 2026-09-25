import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op1, op2;
        double s, p;
        System.out.println("Gostaria de calcular a resistência de um Circuito? 1.Sim 2.Não");
        Scanner scanner = new Scanner(System.in);
        op1 = scanner.nextInt();
        while(op1==1){
            System.out.println("Que tipo de circuito você gostaria de calcular?\n1. Serial\n2.Paralelo\n3.Misto\nDigite aqui: ");
            op2 = scanner.nextInt();
            if(op2==1){
                int op3;
                Serial circuitoSerial = new Serial();
                do{
                    System.out.println("Digite a resitência do resistor: ");
                    s = scanner.nextDouble();
                    circuitoSerial.add(new Resistor(s));
                    System.out.println("Gostaria de somar mais um resistor?\n1.Sim\n2.Não\nDigite aqui: ");
                    op3 = scanner.nextInt();
                }while(op3 == 1);
                 System.out.println("A resistência do circuito Serial é: "+circuitoSerial.getResistance() + " Ohms");
            } if (op2 == 2) {
                int op3;
                Parallel circuitoParallel = new Parallel();
                do{
                    System.out.println("Digite a resitência do resistor: ");
                    p = scanner.nextDouble();
                    circuitoParallel.add(new Resistor(p));
                    System.out.println("Gostaria de somar mais um resistor?\n1.Sim\n2.Não\nDigite aqui: ");
                    op3 = scanner.nextInt();
                }while(op3 == 1);
                 System.out.println("A resistência do circuito Paralelo é: "+circuitoParallel.getResistance() + " Ohms");
            } if (op2 == 3) {
                Serial circuitoMisto = new Serial();
                System.out.println("Vamos começar com os Seriais:\n");
                int op3;
                Serial circuitoSerial2 = new Serial();
               do{
                    System.out.println("Digite a resitência do resistor: ");
                    s = scanner.nextDouble();
                    circuitoSerial2.add(new Resistor(s));
                    System.out.println("Gostaria de somar mais um resistor?\n1.Sim\n2.Não\nDigite aqui: ");
                    op3 = scanner.nextInt();
                }while(op3 == 1);
                op3 = 1;
                System.out.println("Agora os paralelos:\n ");
                 Parallel circuitoParallel2 = new Parallel();
                do{
                    System.out.println("Digite a resitência do resistor: ");
                    p = scanner.nextDouble();
                    circuitoParallel2.add(new Resistor(p));
                    System.out.println("Gostaria de somar mais um resistor?\n1.Sim\n2.Não\nDigite aqui: ");
                    op3 = scanner.nextInt();
                }while(op3 == 1);
                
                circuitoMisto.add(circuitoParallel2);
                circuitoMisto.add(circuitoSerial2);
                System.out.println("A resistência do circuito Misto é: "+circuitoMisto.getResistance() + " Ohms");
            }
             System.out.println("Gostaria de calcular a resistência de outro Circuito? 1.Sim 2.Não");
             op1 = scanner.nextInt();
        }

        scanner.close();
    }
}
