package MainPackage;

import List.Node;
import List.Stack;

public class FreezerStack extends Stack<Congelador>{
	
	
	public void print() {
		Stack<Congelador> aux = new Stack();
		while (!this.isEmpty()) {
			Congelador freezer = this.pop();
			System.out.println(freezer.getCantDeVacunas());
			aux.push(freezer);
		}
		while (!aux.isEmpty()) {
			Congelador freezer = aux.pop();
			this.push(freezer);
		}
		
		
	}
	
	public void sort() {
		Congelador[] freezers = new Congelador[this.size()];
		int size = this.size();
		int i = 0;
		while(!this.isEmpty()) {
			Congelador c =this.pop();
			freezers[i] = c;
			i++;
		}
		int maxI = 0;
		int max = Integer.MIN_VALUE;
		for(int j=size-1; j>=0; j--){
			for(i = 0;i<=j;i++) {
				if(freezers[i].getCantDeVacunas()>max) {
					max = freezers[i].getCantDeVacunas();
					maxI = i;
				}
			}
			this.push(freezers[maxI]);
			freezers[maxI] = freezers[j];
			max = Integer.MIN_VALUE;
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
