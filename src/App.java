
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String []args){
		//System.out.println("Hello World!");
		Node origin,nA,nB,nC,nD,nE,nF,n;
		Arc a;

		
		/* Example :
		 * 
		 * x = 8;
		 * if(x > 8) {
		 *	  y = 6
		 * } else if(x == 8 ) {
		 *	  y = 7
		 * } else {
		 *    y = 1;
		 * }
		 * 
		 */
	/*	origin = new Instruction("x = 8");
		
		nA = new Condition();
		a = new Arc("",nA);
		origin.addArc(a);
		
		nB = new Instruction("y=6");
		a = new Arc("x>8",nB);
		nA.addArc(a);
		
		nC = new Condition();
		a = new Arc("",nC);
		nA.addArc(a);
		
		nD = new Instruction("y=7");
		a = new Arc("x==8",nD);
		nC.addArc(a);
		
		nE = new Instruction("y=1");
		a = new Arc("",nE);
		nC.addArc(a);*/
		
		origin = new Condition();
		
		nA = new Instruction("a=1");
		a = new Arc("a<10",nA);
		origin.addArc(a);
		
		nB = new Instruction("a=2");
		a = new Arc("",nB);
		origin.addArc(a);
		
		nC = new Condition();
		a = new Arc("",nC);
		nA.addArc(a);
		nB.addArc(a);
		
		nD = new Instruction("a=1");
		a = new Arc("a<10",nD);
		nC.addArc(a);
		
		nE = new Instruction("a=2");
		a = new Arc("",nE);
		nC.addArc(a);
		
		nF = new Instruction("");
		a = new Arc("",nF);
		nD.addArc(a);
		nE.addArc(a);
		
		
		
		
		Complexite comp = new Complexite(origin);
		System.out.println("CC: " + comp.complexiteCC());
		System.out.println("NPath: " + comp.complexiteNPath());
		
		
		
		// Print example
		System.out.println("Node["+origin+"]");
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(origin);
		Node cur = null;
		System.out.println("size ="+queue.size());
		while(queue.size() > 0) {
			cur = queue.remove();
			System.out.println(cur.toString());	
			for(Arc arc : cur.getArcs()) {
				queue.add(arc.getNext());
				System.out.println("Arc :"+ arc);
			}
		}
		
		for(int i=0;i<10;i++) {
			n = new Instruction("inst "+i);
			System.out.println(n.toString());
		}
	
	}
		
}
