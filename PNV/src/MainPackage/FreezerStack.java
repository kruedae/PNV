package MainPackage;

import List.List;
import List.Node;
import List.Stack;

public class FreezerStack extends Stack<Congelador>{
	
	
	public void print() {
		Stack<Congelador> aux = new Stack();
		if(!this.isEmpty()) {
			while (!this.isEmpty()) {
				Congelador freezer = this.pop();
				System.out.print(freezer.tipoVacuna+" "+freezer.getCantDeVacunas()+" ");
				aux.push(freezer);
			}
			while (!aux.isEmpty()) {
				Congelador freezer = aux.pop();
				this.push(freezer);
			}
		}else {
			System.out.print("no hay vacunas disponibles para enviar");
		}
		
		
	}
	
	public void sort() {
		List<Congelador> congeladores = new List<Congelador>();
		Congelador[] freezers = new Congelador[this.size()];
		int size = this.size();
		int i = 0;
		while(!this.isEmpty()) {
			Congelador c = this.pop();
			congeladores.pushback(c);
			//freezers[i] = c;
			//i++;
		}
		
		
		Congelador max = new Congelador("", Integer.MIN_VALUE);
		Congelador c =  new Congelador("", 0);
		List<Congelador> aux = new List<Congelador>();
		while(this.size()<size) {
			while(!congeladores.isEmpty()) {
				c = congeladores.topFront();
				congeladores.popFront();
				if(max.getCantDeVacunas() < c.getCantDeVacunas()) {
					if(max.getCantDeVacunas()!=Integer.MIN_VALUE) {
						aux.pushFront(max);
					}
					max = c; 
				}else {
					aux.pushFront(c);
				}
				
			}
			this.push(max);
			while(!aux.isEmpty()) {
				congeladores.pushFront(aux.topFront());
				aux.popFront();
			}
			max = new Congelador("", Integer.MIN_VALUE);
		}
	}
	
	public boolean isSorted(){
		boolean sorted = true; 
		Stack<Congelador> aux = new Stack();
		while (!this.isEmpty()) {
			Congelador freezer = this.pop();
			aux.push(freezer);
			if(this.top() != null && this.top().getCantDeVacunas()<=aux.top().getCantDeVacunas()) {
				sorted = false;
				break;
			}
		}
		while (!aux.isEmpty()) {
			Congelador freezer = aux.pop();
			this.push(freezer);
		}
		return sorted;
	}
	
}
