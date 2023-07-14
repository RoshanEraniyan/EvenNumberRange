import java.util.*;
class Solution
{
    public void evenrange(int[] array, int[][] qarray) {
        int[]solution=new int[qarray.length];
        for(int i=0;i<qarray.length;i++){
            int l=qarray[i][0];
            int r=qarray[i][1];
            int counter=0;
            for(int j=l;j<=r;j++){
                if(array[j]%2==0){
                    counter++;
                }
            }
            solution[i]=counter;
        }
        for(int x:solution)
        {
            System.out.print(x+" ");
        }
    }
}

class EvenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        int q=scanner.nextInt();
        int[][] qarray=new int[q][2];
        for (int i=0;i<q;i++) {
            for (int j=0;j<2;j++) {
                qarray[i][j]= scanner.nextInt();
            }
        }
        Solution solution=new Solution();
        solution.evenrange(array, qarray);

    }

}


