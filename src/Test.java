import static org.junit.Assert.*;

import java.util.LinkedList;


public class Test {

	@org.junit.Test
	public void testCompleciteCC() throws Exception{
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
	}
	
	@org.junit.Test
	public void testCompleciteNPath() throws Exception{
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
	}
	
	@org.junit.Test
	public void testCompleciteCCNull() throws Exception{
		Node origin = null;
		Complexite comp = new Complexite(origin);
		
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
}
