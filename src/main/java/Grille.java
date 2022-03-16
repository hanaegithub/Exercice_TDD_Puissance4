import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Grille {
    public String [][] grid=new String[6][7];


    public Grille(){
        for(String [] row:grid){
            Arrays.fill(row,".");
        }
    }

    public int getColumnsLength(){
        return grid[0].length;
    }

    public int getRowsLength(){
        return grid.length;
    }

    public Boolean isFilledWithPoints(){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(!grid[i][j].equals(".")) return false;
            }
        }
        return true;
    }
    public void emptyGrid(){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                grid[i][j]=".";
            }
        }
    }

    public int [] fillGrid(int column, String jeton){
        int [] position=new int[2];
        if(column >=7 || column<0) throw new RuntimeException("Column Number Invalid");
        for(int i=0;i<6;i++){
            if(grid[i][column].equals(".")) {
                grid[i][column] = jeton;
                position[0]=i;
                position[1]=column;
                break;
            }
        }
        return position;
    }

    @Override
    public String toString(){
        String rows="";
        for (int i=0;i<6;i++){
            rows+="Row Number "+(i+1)+": ";
            for(int j=0;j<7;j++){
                rows+=grid[i][j].toString()+" ,";
            }
            rows+="\n";
        }
        return rows;
    }
    String h = "dhskls";
    List <String > hfhf = new LinkedList<>();

     public List<List<String>> getColumns (){

     return null;
     }

     public List<List<String>> getRows (){

        return null;
    }

    public List<List<String>> getDiagonal (){

        return null;
    }




}
