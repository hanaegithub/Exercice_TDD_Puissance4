import com.jparams.verifier.tostring.NameStyle;
import com.jparams.verifier.tostring.ToStringVerifier;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GrilleTest {

    @Test
    public void shouldReturnTrueWhenGridIsEmpty(){
        Grille grille=new Grille();
        Assert.assertTrue(grille.isFilledWithPoints());

    }

    @Test
    public void shouldReturnGridWithLineIs6WhenInstantiate(){
        Grille grille=new Grille();
        assertEquals(6,
                grille.getRowsLength());
    }

    @Test
    public void shouldReturnGridWithColumnIs7WhenInstantiate(){
        Grille grille=new Grille();
        assertEquals(7,
                grille.getColumnsLength());
    }
    @Test
    public void shouldReturnGridWithColumnIs7AndLineIs6WhenInstantiate(){
        Grille grille=new Grille();
        List<Integer> expected=new ArrayList<>();
        expected.add(6);
        expected.add(7);
        List<Integer> result=new ArrayList<>();
        result.add(grille.getRowsLength());
        result.add(grille.getColumnsLength());
        assertEquals(expected,result);
    }

    @Test
    public void shouldReturnColumn0WhenInsertWithColumnIs0(){
        Grille grille=new Grille();
        int[] expectedPosition = {0,0};
        int[] position = grille.fillGrid(0, "R");
        Assert.assertArrayEquals(expectedPosition,position);
    }

    @Test
    public void shouldThrowExceptionWhenColumnIs7(){
        Grille grille=new Grille();
        RuntimeException exception =
                assertThrows(RuntimeException.class, () -> grille.fillGrid(7,"R"));
        assertEquals("Column Number Invalid",exception.getMessage());
    }

    @Test
    public void shouldReturnTrueWhenEmptyTheGrid(){
        Grille grille=new Grille();
        grille.emptyGrid();
        Assert.assertTrue(grille.isFilledWithPoints());
    }

    @Test
    public void shouldVerifyToString(){
        //ToStringVerifier.forClass(Grille.class)
          //      .withClassName(NameStyle.SIMPLE_NAME)
            //    .verify();
    }



}
