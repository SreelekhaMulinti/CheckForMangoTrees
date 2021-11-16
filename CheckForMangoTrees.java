import java.util.*;
public class CheckForMangoTrees{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		//Input
		int noOfRows = sc.nextInt();
		int noOfCols = sc.nextInt();
		int treeNo = sc.nextInt();
		if(checkWhetherTreeIsMango(noOfRows,noOfCols,treeNo)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	public static boolean checkWhetherTreeIsMango(int rows,int cols,int TreeNum){
	      //Check for first row
		if(TreeNum >= 1 && TreeNum <= cols){
			return true;
		}
	     //Check for first column and last column
		for(int i=0;i<rows;i++){
			cols = cols*2;
			if(TreeNum == cols || TreeNum == cols+1 ){
				return true;
			}
		}
		return false;
	}
}
