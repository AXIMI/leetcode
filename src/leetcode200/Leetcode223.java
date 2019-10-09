package leetcode200;

public class Leetcode223 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}

}


/*
class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int s1=(C-A)*(D-B);
        int s2=(G-E)*(H-F);
        int s3;
        
//        int[] range1x= {A,C};
//        int[] range1y= {B,D};
//        int[] range2x= {E,G};
//        int[] range2y= {F,H};
        
        int overlapx=0,overlapy=0;
        if((A<=E&&E<=C)||(E<=A&&A<=G))
        	overlapx=1;
        else if((A<=E&&G<=C)||(E<=A&&C<=G))
        	overlapx=2;
        
        if((B<=F&&F<=D)||(F<=B&&B<=H))
        	overlapy=1;
        else if((F<=B&&D<=H)||(B<=F&&H<=D))
        	overlapy=2;
        
        if(overlapx*overlapy==0)
        	return s1+s2;
        else if(overlapx*overlapy==1) {
        	s1=A<E?(E-A)*(D-B):(A-E)*(H-F);
        	s2=A<E?(C-E)*(Math.max(H,D)-Math.min(B, F)):(G-A)*(Math.max(H,D)-Math.min(B, F));
        	s3=A<E?(G-C)*(H-F):(C-G)*(D-B);
        	return s1+s2+s3;
        }else if(overlapx*overlapy==2) {
        	if(overlapx==2) {
        		s3=A<E?(G-E)*(Math.min(D, H)-Math.max(B, F)):(C-A)*(Math.min(D, H)-Math.max(B, F));
        	}else {
        		s3=H>D?(D-B)*(Math.min(C, G)-Math.max(A, E)):(H-F)*(Math.min(C, G)-Math.max(A, E));
        	}
        	return s1+s2-s3;
        }else {
        	if(A<E&&G<C&&B<F&&H<D)
        		return s1;
        	else if(E<A&&C<G&&F<B&&D<H)
        		return s2;
        	else {
        		s3=(Math.min(C, G)-Math.max(A, E))*(Math.min(D, H)-Math.max(B, F));
        		return s1+s2-s3;
        	}
        		
        }
        	
    }
}

*/