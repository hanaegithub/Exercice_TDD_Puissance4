import java.util.List;

public class Application {

    private  String currentColor ;
    private Boolean State = false;
    private Grille grid;
    private View view;
    private Analyzer analyzer;

    public String getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(String currentColor) {
        this.currentColor = currentColor;
    }

    public Boolean getStateOne() {
        return State;
    }

    public void setStateOne(Boolean State) {
        State = State;
    }

    // start
    public void startGame(){
        currentColor ="red";
        State = true;


     do {
         view.write("joueur 1 : merci de choisir la cologne");
         int column = view.read();
         grid.fillGrid(column, currentColor);
         // change color
         view.write("joueur 2 : merci de choisir la cologne");


         //change color
     }while (analyzer.getWinner(grid).isEmpty());




    }
    //change Turn
    private String changeRole(){
        if(currentColor.equals("red")){
            currentColor = "yellow";
        }
        if(currentColor.equals("yellow")){
            currentColor = "red";
        }
      return currentColor;
    }


    // deroulement




    //finish




}
