import java.util.*;

public class Main {
    private static int solve(int start, int end, int m, int []niza){
        if(start>end)return -1;
        int mid=(start+end)/2;
        if(niza[mid]==m)return mid;
        else if(niza[mid]<m)return solve(mid+1,end,m,niza);
        else return solve(start,mid-1,m,niza);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int niza[]=new int[n];
        for(int i=0;i<n;i++)
        {
            niza[i]=sc.nextInt();
        }

        int najden=solve(0,n-1,m,niza);

        if (najden==-1)System.out.println("Ne postoi");
        else  System.out.println(najden);
    }
}
