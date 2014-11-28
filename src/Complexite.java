import java.util.ArrayList;
import java.util.LinkedList;


public class Complexite {

	public Node origin;
	
	public Complexite(Node origin){
		this.origin = origin;
	}
	
	public int complexiteCC(){
		//on commence a 1 pour le chemin principal
		int res=1;	
		//parcours du graphe
		//System.out.println("Node["+origin+"]");
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(origin);
		Node cur = null;
		ArrayList<Integer> idList = new ArrayList<Integer>();
		while(queue.size() > 0) {
			cur = queue.remove();
			if(!idList.contains(cur.getId())){
				for(Arc arc : cur.getArcs()) {
					if(arc.getName() != ""){
						res ++;
					}
					queue.add(arc.getNext());
				}
			}
			idList.add(cur.getId());		
		}
		return res;
	}
	
	public int complexiteNPath(){
		//on commence a 1 pour le chemin principal
		int res=1;
		//une condition obouti toujours sur 2 chemins
		int resTemp=2;
		Node n;
		
		//parcours du graphe
		//System.out.println("Node["+origin+"]");
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(origin);
		Node cur = null;
		ArrayList<Integer> idList = new ArrayList<Integer>();
		while(queue.size() > 0) {
			cur = queue.remove();
			if(!idList.contains(cur.getId())){
				for(Arc arc : cur.getArcs()) {
					if(cur == queue.getLast()){
						res = res *resTemp;
					}
					queue.add(arc.getNext());
				}
			}
			idList.add(cur.getId());		
		}
		return res;
	}
}
