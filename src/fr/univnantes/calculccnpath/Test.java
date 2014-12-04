package fr.univnantes.calculccnpath;

import static org.junit.Assert.*;

import java.util.LinkedList;

import fr.univnantes.controlflowgraph.*;

/**
 * Classe de test pour la classe Complexite
 * @author Alexis Ruchaud & Julien Ouvrard & Muriel Cadiot
 *
 */
public class Test {
	
	/**
	 * Teste la compléxité cyclomatique sur deux graphes random
	 */
	@org.junit.Test
	public void testComplexiteCC() {
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
	
	/**
	 * Teste la compléxité NPath sur deux graphes random
	 */
	@org.junit.Test
	public void testComplexiteNPath() {
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
	
	/**
	 * Teste la compléxité cyclomatique d'un graphe vide
	 */
	@org.junit.Test
	public void testComplexiteCCNull(){
		Node origin = null;
		Complexite comp = new Complexite(origin);
		assertEquals(0,comp.complexiteCC());
	}
	
	/**
	 * Teste la compléxité NPath d'un graphe vide
	 */
	@org.junit.Test
	public void testComplexiteNPathNull(){
		Node origin = null;
		Complexite comp = new Complexite(origin);
		assertEquals(0,comp.CCNPATH(0, origin,comp.memElem = new LinkedList<Integer>()));
	}
	
	/**
	 * Teste la compléxité cyclomatique d'un graphe contenant un switch case
	 */
	@org.junit.Test
	public void testComplexiteCCCase() {
		
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
		
		Node origin,nA,nB,nC,nD,nE,nF,nG;
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

	/**
	 * Teste la compléxité NPath d'un graphe contenant un switch case
	 */
	@org.junit.Test
	public void testComplexiteNPathCase() {
		
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
		
		Node origin,nA,nB,nC,nD,nE,nF,nG;
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

	/**
	 * Teste la compléxité cyclomatique d'un graphe contenant un ou plusieurs while
	 */
	@org.junit.Test
	public void testComplexiteCCWhile() {
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,nJ;
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

	/**
	 * Teste le compléxité NPath d'un graphe contenant un ou plusieurs while
	 */
	@org.junit.Test
	public void testComplexiteNPATHWhile() {
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,nJ;
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
	
	/**
	 * Teste la compléxité cyclomatique d'un graphe composé d'un seul noeud
	 */
	@org.junit.Test
	public void testComplexiteCCSingle(){
		
		/* Example :
		 * a=1;
		 */
		
		Node origin;
		origin = new Instruction("a=1");
		Complexite comp = new Complexite(origin);
		assertEquals(1,comp.complexiteCC());
	}
	
	/**
	 * Teste la compléxité NPath d'un graphe composé d'un seul noeud
	 */
	@org.junit.Test
	public void testComplexiteNPathSingle(){
		
		/* Example :
		 * a=1;
		 */
		
		Node origin;
		origin = new Instruction("a=1");
		Complexite comp = new Complexite(origin);
		assertEquals(1,comp.CCNPATH(0, origin,comp.memElem = new LinkedList<Integer>()));
	}
	
	/**
	 * Teste la compléxité cyclomatique d'un graphe de séquence
	 */
	@org.junit.Test
	public void testComplexiteCCSequence(){
		
		/* Example :
		 * a=1;
		 * y=a+1;
		 * y=y-3;
		 * z=2*y;
		 */
		
		Node origin, nA, nB,nC;
		Arc a;
		origin = new Instruction("a=1");
		nA = new Instruction("y=a+1");
		a = new Arc("",nA);
		origin.addArc(a);
		
		nB = new Instruction("y=y-3");
		a = new Arc("",nB);
		nA.addArc(a);
		
		nC = new Instruction("z=2*y");
		a = new Arc("",nC);
		nB.addArc(a);
		
		Complexite comp = new Complexite(origin);
		assertEquals(1,comp.complexiteCC());

	}
		
	/**
	 * Teste la compléxité NPath d'un graphe de séquence
	 */
	@org.junit.Test
	public void testComplexiteNPathSequence(){
		
		/* Example :
		 * a=1;
		 * y=a+1;
		 * y=y-3;
		 * z=2*y;
		 */
		
		Node origin, nA, nB,nC;
		Arc a;
		origin = new Instruction("a=1");
		nA = new Instruction("y=a+1");
		a = new Arc("",nA);
		origin.addArc(a);
		
		nB = new Instruction("y=y-3");
		a = new Arc("",nB);
		nA.addArc(a);
		
		nC = new Instruction("z=2*y");
		a = new Arc("",nC);
		nB.addArc(a);
		
		Complexite comp = new Complexite(origin);
		assertEquals(1,comp.CCNPATH(0, origin,comp.memElem = new LinkedList<Integer>()));
	}	
}
