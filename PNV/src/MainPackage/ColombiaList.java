package MainPackage;

import List.List;
import List.Node;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Germán Andrés L. Urbina Gutiérrez - Ing. mecatrónica
 */
public class ColombiaList extends List<Region> {

    public ColombiaList sort() {

        //Se verifica si está vacía la lista
        if (this.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            //Es recorrida y organizada la lista 
            while (this.isSorted() != true) {
                for (Node e = this.head; e.next != null; e = e.next) {
                    //Regions a evaluar 
                    Region regionActual = (Region) e.key;
                    Region regionSiguiente = (Region) e.next.key;

                    //Caso general
                    if (regionActual.poblaccion < regionSiguiente.poblaccion) {
                        if (e.next.next != null) {
                            e.next.prev = e.prev;
                            e.prev.next = e.next;
                            e.prev = e.next;
                            e.next = e.next.next;
                            e.prev.next.prev = e;
                            e.prev.next = e;
                        } else {
                            e.next.prev = e.prev;
                            e.prev.next = e.next;
                            e.prev = e.next;
                            e.next = e.next.next;
                            //e.prev.next.prev = e;
                            e.prev.next = e;

                        }

                    } else if (regionActual.poblaccion == regionSiguiente.poblaccion) {     //Si son iguales en población, orden lexicográfico
                        if (regionActual.region.compareTo(regionSiguiente.region) > 0) {
                            e.next.prev = e.prev;
                            e.prev.next = e.next;
                            e.prev = e.next;
                            e.next = e.next.next;
                            e.prev.next.prev = e;
                            e.prev.next = e;
                        }
                    }
                    this.print();
                    if (e.next == null) {
                        break;
                    }
                }
            }

        }

        return this;
    }

    public void print() {
        for (Node i = this.head; i != null; i = i.next) {
            Region r = (Region) i.key;
            System.out.print(r.region + " " + r.poblaccion + " ");
        }
        System.out.println();
    }

    public boolean isSorted() {
        boolean testigo = true;
        for (Node i = this.head; i.next != null; i = i.next) {
            Region r1 = (Region) i.key;
            Region r2 = (Region) i.next.key;
            if (r1.poblaccion < r2.poblaccion) {
                testigo = false;
            }
            if (i.next == null) {
                break;
            }
        }
        return testigo;
    }
}
