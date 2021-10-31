import static java.lang.System.*;
import java.util.Scanner;// if we want to get from user


public class AtCounter
{

  private String[][] atMat;
    private int rows; 
    private int cols; 
    private int totalCount = 0;
    private boolean[][] visited; 



	public AtCounter()	{
	}

  public String[][] getatMat(){
    return atMat;
  }

  public AtCounter( int rows, int cols){
//size of the matrix
        this.rows = rows;
        this.cols = cols;
        atMat = new String[rows][cols];

        //use nested loops to randomly load the matrix
        for(int r = 0; r < rows; r++){
           // System.out.println("row "+ r);
            for(int c = 0; c < cols; c++) {
              // System.out.println("col "+ c);
                int num = (int) (Math.random() * 2);
                // System.out.println("num "+ num);
                if(num == 0){
                    atMat[r][c] = "@";
                     //System.out.println("atMat[r][c] "+ atMat[r][c]);
                }
                else{
                    atMat[r][c] = "-";
                   //  System.out.println("atMat[r][c] "+ atMat[r][c]);
                }
            }
        }
       // System.out.println("befor visited");
         visited = new boolean[rows][cols];


  }
// this method is to calculate number of connected @s
	public int countAts(int r, int c)
	{
      if(!inBounds(r,c) || atMat[r][c].equals("-")) 
            return 0;

        if(!visited[r][c])
        {
            visited[r][c] = true; // r c index becomes vsited
            if(atMat[r][c].equals("@"))
            {
                totalCount+=1;

                if(inBounds(r - 1, c))//upside check
                    countAts(r - 1, c);//recursive call for upside index

                if(inBounds(r + 1, c))//downside
                    countAts(r + 1, c); //recursive call for down index

                if(inBounds(r, c + 1))//rightside
                    countAts(r , c + 1);//recursive call for right index

                if(inBounds(r, c  - 1))//left
                    countAts(r, c - 1);//recursive call for left index
            }
        }
        return totalCount;

  }

	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{

    String matrix = "";
     for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
          matrix = matrix + atMat[i][j];
        }
          matrix = matrix +"\n";
      }
      //   System.out.println ("end of toString");
		return matrix;
	}

//Check if the index in array boundry
// function chekc for  conditions to evaluate if the index is inside the matrix
  public boolean inBounds(int r, int c)
    {
              return r > -1 && r < rows && c > -1 && c < cols;
    }
}