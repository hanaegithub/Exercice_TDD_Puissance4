import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;


import java.util.List;

import static org.mockito.Mockito.mock;


public class AnalyzerTest {



@Test
public void shouldReturnRedWhenGridHas4RedTokenVertical(){

    //given
    Grille grid = mock(Grille.class);
    //grid = new Grille();
    Analyzer analyzer = new Analyzer();
    List<List<String>> theReturnColumns = List.of(List.of("red","red","yellow","red","yellow","red")
            ,List.of("yellow","red","yellow","red","yellow","red"),List.of("red","red","red","red","yellow","red"),
            List.of(".",".",".",".",".","."),List.of(".",".",".",".",".","."),List.of(".",".",".",".",".","."),
            List.of(".",".",".",".",".",".")) ;
    //when

    Mockito.when(grid.getColumns()).thenReturn(theReturnColumns);
    //then

    Assert.assertEquals("red",analyzer.getWinner(grid).get());

}
    @Test
    public void shouldReturnYellowWhenGridHas4YellowTokenVertical(){

        //given
        Grille grid = mock(Grille.class);
        //grid = new Grille();
        Analyzer analyzer = new Analyzer();
        List<List<String>> theReturnColumns = List.of(List.of("red","red","yellow","red","yellow","red")
                ,List.of("yellow","red","yellow","red","yellow","red"),List.of("yellow","yellow","yellow","yellow","red","red"),
                List.of("red",".",".",".",".","."),List.of(".",".",".",".",".","."),List.of(".",".",".",".",".","."),
                List.of(".",".",".",".",".",".")) ;
        //when

        Mockito.when(grid.getColumns()).thenReturn(theReturnColumns);
        //then

        Assert.assertEquals("yellow",analyzer.getWinner(grid).get());

    }

    @Test
    public void shouldReturnRedWhenGridHas4RedTokenHorizontal(){

        //given
        Grille grid = mock(Grille.class);
        //grid = new Grille();
        Analyzer analyzer = new Analyzer();
        List<List<String>> theReturnColumns = List.of(List.of("red","red","yellow","red","yellow","red")
                ,List.of("yellow","red","yellow","red","yellow","red"),List.of("red","red","red","red","yellow","red"),
                List.of(".",".",".",".",".","."),List.of(".",".",".",".",".","."),List.of(".",".",".",".",".","."),
                List.of(".",".",".",".",".",".")) ;
        //when

        Mockito.when(grid.getColumns()).thenReturn(theReturnColumns);
        //then

        Assert.assertEquals("red",analyzer.getWinner(grid).get());

    }





    @Test
    public void shouldReturnYellowWhenGridHas4YellowTokenHorizontal(){

        //given
        Grille grid = mock(Grille.class);
        //grid = new Grille();
        Analyzer analyzer = new Analyzer();
        List<List<String>> theReturnRows = List.of(List.of("red","red","yellow","red","yellow","red",".")
                ,List.of("yellow","red","yellow","red","yellow","red","."),List.of("yellow","yellow","yellow","yellow","red","red","."),
                List.of("red",".",".",".",".",".","."),List.of(".",".",".",".",".",".","."),List.of(".",".",".",".",".",".",".")) ;
        //when

        Mockito.when(grid.getRows()).thenReturn(theReturnRows);
        //then

        Assert.assertEquals("yellow",analyzer.getWinner(grid).get());

    }











}
