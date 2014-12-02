import java.util.ArrayList;
import java.util.LinkedList;


public class Complexite {

	public Node origin;
	public LinkedList<Node> endNodes;
	
	public Complexite(Node origin){
		this.origin = origin;
		endNodes = FinalNode(origin);		
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
	

	/* FinalNode permet de récuperer tout les noeuds de sorties du graphe. Ainsi chaque noeud ne possédant 
	 * pas de branche ( qui termine donc le programme ) sera ajouté dans une liste de noeuds */
	 
	
	public LinkedList<Node> FinalNode(Node current){
		LinkedList<Node> res = new LinkedList<Node>();
		//On continu tant qu'on est pas sur un noeud final
		while((!(current.isFinal()))){
			//Un nombre d'arc supérieur a un indique une condition
			if(current.getArcs().size() > 1)
			{
				//On effectue un traitement pour chaque arc partant du noeud courant
				for(int i = 0 ; i < current.getArcs().size();i++)
				{
					//On réaplique la fonction pour chaque noeud suivant la condition ( et sur chaque branche de la condition)
					for(Node r : FinalNode(current.getArcs().get(i).getNext()))
					{
						if(!(res.contains(r)))
						{
							res.add(r);
						}
					}
				}
				return res;
			}
			else
			{
				//Si le noeud courant est une instruction on avance au noeud suivant
				current = current.getArcs().get(0).getNext();
			}
		}
		if(!(res.contains(current)))
		{
			res.add(current);
		}
		return res;
	}


/* La fonction CCNPATH permet de calculer la complexite cyclomatique NPATH pour un graphe donne 
 * Elle prend en parametre un entier contenant le resultat (le premier appel ce fait de 0)
 * et un noeud (le premier appel ce fait sur l'origine du graphe)*/
	public int CCNPATH(int res, Node current){
		Boolean ok = false;
		//On boucle tant qu'on ne trouve pas de noeud final ou de condition
		while(!ok && !(endNodes.contains(current)))
		{
			if(current instanceof Condition)
			{
				ok = true;
			}else{
				current = current.getArcs().get(0).getNext();
				ok = false;
			}
		}
		if(ok)
		{
			//On recupere le nombre d'arcs sortants de la condition
			int nbcond =  current.getArcs().size();
			while(nbcond >0)
			{
				//On réapplique la fonction sur chaque noeud suivant la condition
				res = CCNPATH(res,current.getArcs().get(nbcond-1).getNext());
				nbcond--;
			}
			//On diminue le resultat de 1 pour ne pas compter des possibilitees en trop
			res--;
		}
		//On ajoute un au nombre de chemin possible
		return res = res+1;
	}
}
