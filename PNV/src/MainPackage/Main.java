package MainPackage;

public class Main {

    public static void main(String[] args) {
        
        ColombiaList colombia = new ColombiaList();
        Region bog = new Region("Bogotá", 500000);
        Region ant = new Region("Antioquia", 320000);
        Region atl = new Region("Atlántico", 100000);
        Region gua = new Region("Guaviare", 15000);
        Region ama = new Region ("Amazonas", 500000);
        
        colombia.pushFront(bog);
        colombia.pushFront(ant);
        colombia.pushFront(atl);
        colombia.pushFront(gua);
        colombia.pushFront(ama);
        
        System.out.print("Antes de hacer sort: ");
        colombia.print();
        colombia.sort();
        System.out.print("Después de hacer sort: ");
        colombia.print();

    }
}
