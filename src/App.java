
/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String []args) throws Exception{
		//System.out.println("Hello World!");
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,nJ,nK,nL,nM,nN,nO;
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
		origin = new Instruction("x = 8");
		
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
		nC.addArc(a);
		/*
		origin = new Condition();
		
		nA = new Instruction("a=1");
		a = new Arc("a<10",nA);
		origin.addArc(a);
		
		nB = new Instruction("a=2");
		a = new Arc("",nB);
		origin.addArc(a);
		
		nC = new Condition("");
		a = new Arc("",nC);
		nA.addArc(a);
		a = new Arc("",nC);
		nB.addArc(a);
		
		nD = new Instruction("a=3");
		a = new Arc("a<10",nD);
		nC.addArc(a);
		
		nE = new Instruction("a=4");
		a = new Arc("",nE);
		nC.addArc(a);
		
		nF = new Instruction("");
		a = new Arc("",nF);
		nD.addArc(a);
		a = new Arc("",nF);
		nE.addArc(a);
		
		*/

		/* Structure pdf NPATH = 6
		origin = new Condition("");
		
		nA = new Condition("");
		a = new Arc("a<10",nA);
		origin.addArc(a);

		nB = new Condition("");
		a = new Arc("",nB);
		origin.addArc(a);
		
		nC = new Condition("");
		a = new Arc("a<9",nC);
		nA.addArc(a);
		
		nD = new Condition("");
		a = new Arc("",nD);
		nA.addArc(a);
		
		nE = new Instruction("b=10");
		a = new Arc("a<8",nE);
		nC.addArc(a);
		
		nF = new Instruction("a=1");
		a = new Arc("",nF);
		nC.addArc(a);
		
		nG = new Instruction("a=2");
		a = new Arc("",nG);
		nE.addArc(a);
		a = new Arc("",nG);
		nF.addArc(a);
		
		nH = new Instruction("a=3");
		a = new Arc("a<8",nH);
		nD.addArc(a);
		
		nI = new Instruction("a=4");
		a = new Arc("",nI);
		nD.addArc(a);
		
		nJ = new Instruction("a=5");
		a = new Arc("",nJ);
		nH.addArc(a);
		a = new Arc("",nJ);
		nI.addArc(a);
		
		nK = new Instruction("a=6");
		a = new Arc("",nK);
		nG.addArc(a);
		a = new Arc("",nK);
		nJ.addArc(a);
		
		nL = new Instruction("a=7");
		a = new Arc("b<2",nL);
		nB.addArc(a);
		
		nM = new Instruction("a=8");
		a = new Arc("",nM);
		nB.addArc(a);
		
		nN = new Instruction("a=9");
		a = new Arc("",nN);
		nL.addArc(a);
		a = new Arc("",nN);
		nM.addArc(a);
		
		nO = new Instruction("a=10");
		a = new Arc("",nO);
		nK.addArc(a);
		a = new Arc("",nO);
		nN.addArc(a);
		*/
		
	/*	origin = new Condition();
		
		nA = new Instruction("a=1");
		a = new Arc("a<10",nA);
		origin.addArc(a);
		
		nB = new Instruction("a=2");
		a = new Arc("",nB);
		origin.addArc(a);
		

		nC = new Condition("");
		a = new Arc("",nC);
		nA.addArc(a);
		a = new Arc("",nC);
		nB .addArc(a);
		
		nD = new Instruction("a=3");
		a = new Arc("a<10",nD);
		nC.addArc(a);
		
		nE = new Instruction("a=4");
		a = new Arc("",nE);
		nC.addArc(a);
		
		nF = new Condition("");
		a = new Arc("",nF);
		nD.addArc(a);
		a = new Arc("",nF);
		nE.addArc(a);
		
		nG = new Instruction("a=5");
		a = new Arc("a<9",nG);
		nF.addArc(a);
		
		nH = new Instruction("a=6");
		a = new Arc("",nH);
		nF.addArc(a);
		
		nI = new Condition("");
		a = new Arc("",nI);
		nG.addArc(a);
		a = new Arc("",nI);
		nH.addArc(a);
		
		nJ = new Instruction("a=7");
		a = new Arc("a<8",nJ);
		nI.addArc(a);
		
		nK = new Instruction("a=8");
		a = new Arc("",nK);
		nI.addArc(a);
		
		nL = new Condition("");
		a = new Arc("",nL);
		nJ.addArc(a);
		a = new Arc("",nL);
		nK .addArc(a);
		
		nM = new Instruction("a=9");
		a = new Arc("a<7",nM);
		nL.addArc(a);
		
		nN = new Instruction("a=10");
		a = new Arc("",nN);
		nL.addArc(a);
		
		nO = new Instruction("");
		a = new Arc("",nO);
		nM.addArc(a);
		a = new Arc("",nO);
		nN .addArc(a);*/
		
		origin = null;
		Complexite comp = new Complexite(origin);
		
		System.out.println("CC: " + comp.complexiteCC());
		for(int i = 0 ; i < comp.endNodes.size();i++)
		{
			System.out.println(comp.endNodes.get(i).toString());
		}
	System.out.println("NPath: " + comp.CCNPATH(0,origin));
		
	
		/*
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
				//System.out.println("Arc :"+ arc);
			}
		}
		/*
		for(int i=0;i<10;i++) {
			n = new Instruction("inst "+i);
			System.out.println(n.toString());
		}
	*/
	}
		

}

		

