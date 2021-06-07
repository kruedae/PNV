
import List.List;
import List.Node;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Germán Andrés L. Urbina Gutiérrez - Ing. mecatrónica
 */
public class ColombiaList extends List<Region>{
    private ColombiaList sort(){
        for(Node e = this.head; e.next!=null; e=e.next){
            Region regionActual = (Region) e.key;
            Region regionSiguiente = (Region) e.next.key;
            
            if(regionActual.poblaccion < regionSiguiente.poblaccion){
                e.prev.next=e.next;
                e.next.prev = e.prev;
                e.prev = e.next;
                e.next = e.next.next;
            }
        }
        return this;
    }
}
