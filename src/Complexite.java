import java.util.LinkedList;


public class Complexite {

	public Node origin;
	
	public Complexite(Node origin){
		this.origin = origin;
	}
	
	public int complexiteCC(){
		//on commence a 1 pour le chemin principal
		int res=1;
		Node n;
		
		//parcours du graphe
		//System.out.println("Node["+origin+"]");
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(origin);
		Node cur = null;
		//System.out.println("size ="+queue.size());
		while(queue.size() > 0) {
			cur = queue.remove();
		//	System.out.println(cur.toString());	
			for(Arc arc : cur.getArcs()) {
				//une instruction sur un arc correspond a une condition
				if(arc.getLabel() != ""){
					res ++;
				}
				queue.add(arc.getNext());
			}
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
		//System.out.println("size ="+queue.size());
		while(queue.size() > 0) {
			cur = queue.remove();
		//	System.out.println(cur.toString());	
			for(Arc arc : cur.getArcs()) {
				//une instruction sur un arc correspond a une condition
				if(arc.getLabel() != ""){
					res = res*resTemp;
				}
				queue.add(arc.getNext());
			}
		}
		return res;
	}
}
