import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        DLL<Integer> list=new DLL<>();
        for (int i=0; i<n;i++){
            list.insertLast(sc.nextInt());
        }
        int k=sc.nextInt();
        System.out.println(list);
        moveToFront(list,k);
        System.out.println(list);

    }
    public static void moveToFront(DLL<Integer> list,int k){
        int size = list.getSize();
        if (k <= 0 || k >= size) return;

        for (int i = 0; i < k; i++) {
            int last = list.deleteLast();
            list.insertFirst(last);


        }
    }
}
