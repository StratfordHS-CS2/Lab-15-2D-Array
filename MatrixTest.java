import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing the Matrix class.
 *
 * @author  Dave Avis
 * @version 1.7.2019
 */
public class MatrixTest
{
    private int[][] mat1 = { 
        {1,2,1},
        {7,2,31},
        {56,2,31} 
    };
    private int[][] mat2 = { 
        {3,1,6,3,1,4,6},
        {5,7,3,2,4,3,5},
        {1,3,5,7,9,2,6},
        {7,3,0,0,7,8,4},
        {0,9,8,7,6,5,4},
        {1,2,3,4,5,6,7},
        {8,8,8,8,8,8,8}
    };
    
    /**
     * Test the method Matrix.matrixSum().
     */
    @Test(timeout=2000)
    public void matrixSumTest()
    {
        assertEquals( "matrixSum failed: ", Matrix.matrixSum( mat1 ), 133 );
        assertEquals( "matrixSum failed: ", Matrix.matrixSum( mat2 ), 238 );
    }
    
    /**
     * Test the method Matrix.countAppearances().
     */
    @Test(timeout=2000)
    public void countAppearancesTest()
    {
        assertEquals( "countAppearances failed: ", Matrix.countAppearances( mat1, 31 ), 2 );
        assertEquals( "countAppearances failed: ", Matrix.countAppearances( mat2, 8 ), 9 );
    }
}
