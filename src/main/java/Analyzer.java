import java.util.List;
import java.util.Optional;

public class Analyzer {







    private Optional<String> getWinnerVertical(Grille grid){
    int count = 0;
    String color ;
        for (List <String> e: grid.getColumns()) {

            color =e.get(0);
            for (String element: e) {
                if(element.equals(".")){
                    count=0;
                    continue;
                }
                if(element.equals(color)){
                    count++;
                    if(count == 4){
                        return Optional.of(color);
                    }
                }else {

                    color = element;
                    count = 1;
                }
            }
            count = 0;

        }

          return Optional.empty();


    }
    private Optional<String> getWinnerHorizontal(Grille grid){
        int count = 0;
        String color ;
        for (List <String> e: grid.getRows()) {

            color =e.get(0);
            for (String element: e) {
                if(element.equals(".")){
                    count=0;
                    continue;
                }
                if(element.equals(color)){
                    count++;
                    if(count == 4){
                        return Optional.of(color);
                    }
                }else {

                    color = element;
                    count = 1;
                }
            }
            count = 0;

        }

        return Optional.empty();


    }






    public Optional<String> getWinner(Grille grid){

       return getWinnerVertical(grid);


    }







}
