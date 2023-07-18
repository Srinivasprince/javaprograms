import java.util.Scanner;

public class Demo2 {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

System.out.println("Enter Rows And Columns where Rows=no of games . columns=no of players");

float arr[][]=new float[scan.nextInt()][scan.nextInt()];

for(int i=0;i<=arr.length-1;i++)

{

for(int j=0;j<=arr[i].length-1;j++)

{

System.out.println("Enter Heights of Game "+i+" Player "+j);

arr[i][j]=scan.nextFloat();

}

}

System.out.println("Array Contents Are.....");

for(int i=0;i<=arr.length-1;i++)

{

for(int j=0;j<=arr[i].length-1;j++)

{

System.out.print(arr[i][j]+" ");

}

System.out.println();

}

}

}
