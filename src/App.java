
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
		Node origin,nA,nB,nC,nD,nE,nF,nG,nH,nI,n;
		Arc a;
		int res = 1;

		
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
		
		nG = new Instruction("a=1");
		a = new Arc("a<10",nG);
		nF.addArc(a);
		
		nH = new Instruction("a=2");
		a = new Arc("",nH);
		nF.addArc(a);
		
		nI = new Instruction("");
		a = new Arc("",nI);
		nG.addArc(a);
		nH.addArc(a);
		
		
		Complexite comp = new Complexite(origin);
		System.out.println("CC: " + comp.complexiteCC());
		System.out.println("NPath: " + comp.complexiteNPath());
		
		

}

}
		

