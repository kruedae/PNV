package MainPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);
    	int vacunas = reader.nextInt();
    	FreezerStack freezerStack = new FreezerStack();
    	for(int i = 0; i<vacunas; i++) {
    		String tipo = reader.next();
    		int cantVac =  Integer.parseInt(reader.next());
    		freezerStack.push(new Congelador(tipo, cantVac));
    	}    	
    	freezerStack.sort();
    	ColombiaList colombia = new ColombiaList();
    	int regiones = reader.nextInt();
    	for(int j = 0; j<regiones; j++) {
    		String nombre = reader.next();
    		int poblacion =  Integer.parseInt(reader.next());
    		colombia.pushFront(new Region(nombre, poblacion));
    	}
    	colombia.sort();
    	Congelador vac;
    	for(int k = 0; k<colombia.size();k++){
    		Region region = colombia.Get(k);
    		
        	while(region.getPoblaccion() > 0) {
        		vac = freezerStack.pop();
        		if(vac != null) {
	        		if(region.getPoblaccion() > vac.cantDeVacunas ) {
	        			region.getFreezerStack().push(vac);
	        			region.setPoblaccion(region.getPoblaccion()-vac.cantDeVacunas);

	        		}else {
	        			region.getFreezerStack().push(new Congelador(vac.tipoVacuna, region.getPoblaccion()));
	        			vac.setCantDeVacunas(vac.getCantDeVacunas()-region.getPoblaccion());
	        			freezerStack.push(vac);
	        			region.setPoblaccion(0);
	        		}
        		}else {
        			region.setPoblaccion(0);
        		}
        	}
        	System.out.print(region.region+" ");
        	region.getFreezerStack().print();
        	System.out.println();
        	
        }
    }
}
