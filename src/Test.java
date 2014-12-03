import static org.junit.Assert.*;

import java.util.LinkedList;




public class Test {
	
	//test sur deux graphes random CC
	@org.junit.Test
	public void testComplexiteCC() throws Exception{
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,nJ,nK,nL,nM,nN,nO;
		Arc a;
		
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
		nN .addArc(a);
		
		Complexite comp = new Complexite(origin);
		assertEquals(6,comp.complexiteCC());
		
		/* Example :
		 * 
		 * x = 8;
		 * if(x > 8) {
		 *	  y = 6;
		 * } else if(x == 8 ) {
		 *	  y = 7;
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
		
		comp = new Complexite(origin);
		assertEquals(3,comp.complexiteCC());
	}
	
	//test sur deux graphes random complexite NPath
	@org.junit.Test
	public void testComplexiteNPath() throws Exception{
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,nJ,nK,nL,nM,nN,nO;
		Arc a;
		
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
		nN .addArc(a);
		
		Complexite comp = new Complexite(origin);

		assertEquals(32,comp.CCNPATH(0, origin,comp.memElem = new LinkedList<Integer>()));

		
		/* Example :
		 * 
		 * x = 8;
		 * if(x > 8) {
		 *	  y = 6;
		 * } else if(x == 8 ) {
		 *	  y = 7;
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
		
		comp = new Complexite(origin);
		assertEquals(3,comp.CCNPATH(0, origin,comp.memElem = new LinkedList<Integer>()));
	}
	
	//graphe vide + calcul CC
	@org.junit.Test
	public void testComplexiteCCNull(){
		Node origin = null;
		Complexite comp = new Complexite(origin);
		assertEquals(0,comp.complexiteCC());

	}
	
	//graphe vide + calcul complexite NPath
	@org.junit.Test
	public void testComplexiteNPathNull(){
		Node origin = null;
		Complexite comp = new Complexite(origin);
		assertEquals(0,comp.CCNPATH(0, origin,comp.memElem = new LinkedList<Integer>()));
	}
	
	//test d'un graphe contenant switch case
	@org.junit.Test
	public void testComplexiteCCase() throws Exception {
		
		/* Example : 
		 * x=8;
		 * switch(x){
		 * case 1 : x=6;
		 * break;
		 * case 2 : x=7;
		 * break;
		 * default:
		 * x=9;
		 * }
		 * y=0
		 */
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI;
		Arc a;
		
		origin = new Instruction("x=8");
		
		nA = new Condition();
		a = new Arc("",nA);
		origin.addArc(a);
		
		nB = new Instruction("x=6");
		a = new Arc("x=1",nB);
		nA.addArc(a);
		
		nC = new Condition("");
		a = new Arc("",nC);
		nA.addArc(a);
		
		nD = new Instruction("x=7");
		a = new Arc("x=7",nD);
		nC.addArc(a);
		
		nE = new Condition("");
		a = new Arc("",nE);
		nC.addArc(a);
		
		nF = new Instruction("x=9");
		a = new Arc("default",nF);
		nE.addArc(a);
		
		nG = new Instruction("y=0");
		a = new Arc("",nG);
		nB.addArc(a);
		a = new Arc("",nG);
		nD.addArc(a);
		a = new Arc("",nG);
		nE.addArc(a);
		a = new Arc("",nG);
		nF.addArc(a);
		
		Complexite comp = new Complexite(origin);
		assertEquals(4,comp.complexiteCC());		
	}
	
	//test d'un graphe contenant switch case
	@org.junit.Test
	public void testComplexiteNPathCase() throws Exception {
		
		/* Example : 
		 * x=8;
		 * switch(x){
		 * case 1 : x=6;
		 * break;
		 * case 2 : x=7;
		 * break;
		 * default:
		 * x=9;
		 * }
		 * y=0
		 */
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI;
		Arc a;
		
		origin = new Instruction("x=8");
		
		nA = new Condition();
		a = new Arc("",nA);
		origin.addArc(a);
		
		nB = new Instruction("x=6");
		a = new Arc("x=1",nB);
		nA.addArc(a);
		
		nC = new Condition("");
		a = new Arc("",nC);
		nA.addArc(a);
		
		nD = new Instruction("x=7");
		a = new Arc("x=7",nD);
		nC.addArc(a);
		
		nE = new Condition("");
		a = new Arc("",nE);
		nC.addArc(a);
		
		nF = new Instruction("x=9");
		a = new Arc("default",nF);
		nE.addArc(a);
		
		nG = new Instruction("y=0");
		a = new Arc("",nG);
		nB.addArc(a);
		a = new Arc("",nG);
		nD.addArc(a);
		a = new Arc("",nG);
		nE.addArc(a);
		a = new Arc("",nG);
		nF.addArc(a);
		
		Complexite comp = new Complexite(origin);
		assertEquals(4,comp.CCNPATH(0, origin,comp.memElem = new LinkedList<Integer>()));
		
	}

	@org.junit.Test
	public void testWhileCC() throws Exception{
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,nJ,nK,nL,nM,nN,nO;
		Arc a;
		origin = new Condition();
		
		nA = new Instruction("a=1");
		a = new Arc("a<5",nA);
		origin.addArc(a);
		
		nB = new Instruction("a=2");
		a = new Arc("",nB);
		origin.addArc(a);
		
		nC = new Condition();
		a = new Arc("",nC);
		nA.addArc(a);
		
		nD = new Instruction("a=3");
		a = new Arc("while(a<3)",nD);
		nC.addArc(a);
		a = new Arc("",nC);
		nD.addArc(a);
		
		nE = new Instruction("a=4");
		a = new Arc("",nE);
		nC.addArc(a);
		
		nF = new Instruction("a=5");
		a = new Arc("",nF);
		nB.addArc(a);
		
		nG = new Condition("");
		a = new Arc("",nG);
		nF.addArc(a);
		
		nH = new Condition("");
		a = new Arc("while(a<5)",nH);
		nG.addArc(a);
		a = new Arc("",nG);
		nH.addArc(a);
		
		nI = new Instruction("a=8");
		a = new Arc("while(a<6)",nI);
		nH.addArc(a);
		a = new Arc("",nH);
		nI.addArc(a);
		
		nJ = new Instruction("a=9");
		a = new Arc("",nJ);
		nG.addArc(a);
		Complexite comp = new Complexite(origin);
		assertEquals(5,comp.complexiteCC());
		
	}

	@org.junit.Test
	public void testWhileCCNPATH() throws Exception{
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,nJ,nK,nL,nM,nN,nO;
		Arc a;
		origin = new Condition();
		
		nA = new Instruction("a=1");
		a = new Arc("a<5",nA);
		origin.addArc(a);
		
		nB = new Instruction("a=2");
		a = new Arc("",nB);
		origin.addArc(a);
		
		nC = new Condition();
		a = new Arc("",nC);
		nA.addArc(a);
		
		nD = new Instruction("a=3");
		a = new Arc("while(a<3)",nD);
		nC.addArc(a);
		a = new Arc("",nC);
		nD.addArc(a);
		
		nE = new Instruction("a=4");
		a = new Arc("",nE);
		nC.addArc(a);
		
		nF = new Instruction("a=5");
		a = new Arc("",nF);
		nB.addArc(a);
		
		nG = new Condition("");
		a = new Arc("",nG);
		nF.addArc(a);
		
		nH = new Condition("");
		a = new Arc("while(a<5)",nH);
		nG.addArc(a);
		a = new Arc("",nG);
		nH.addArc(a);
		
		nI = new Instruction("a=8");
		a = new Arc("while(a<6)",nI);
		nH.addArc(a);
		a = new Arc("",nH);
		nI.addArc(a);
		
		nJ = new Instruction("a=9");
		a = new Arc("",nJ);
		nG.addArc(a);
		Complexite comp = new Complexite(origin);
		assertEquals(5,comp.CCNPATH(0,origin,comp.memElem=new LinkedList<Integer>()));
		
	}
}
