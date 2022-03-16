import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;


@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

    @InjectMocks
    Application application ;

    @Mock
    View view ;
    @Mock
    Analyzer analyzer;
    @Mock
    Grille grid ;

    @Test
    public void shouldStartTheGame(){

        application.startGame();

        Mockito.verify(view, times(1)).write("joueur 1 : merci de choisir la cologne");
    }


    @Test
    public void shouldReturn(){

        Mockito.when(view.read()).thenReturn(4);
        Mockito.when(analyzer.getWinner(grid)).thenReturn(Optional.ofNullable(null));
        application.startGame();

        Mockito.verify(grid, times(1)).fillGrid(4, "red");


        Mockito.verify(analyzer, times(1)).getWinner(grid);

        Mockito.verify(view, times(1)).write("joueur 1 : merci de choisir la cologne");

    }








}
