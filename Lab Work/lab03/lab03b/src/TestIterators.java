import java.util.Iterator;
/*
 * TestIterators, which is a class that tests IntBagIterators
 * @author Ege Ozan Özyedek
 * @version v1.0
 * @date 12/03/18
 */
public class TestIterators {
    public static void main(String[] args)
    {
        Iterator i, j;
        IntBag bag;

        bag = new IntBag();

        for ( int k = 0; k < 5; k++)
        {
            bag.add(k);
        }


        i = new IntBagIterator( bag);
        while ( i.hasNext() )
        {
            System.out.println( i.next() );
            j = new IntBagIterator( bag);
            j = bag.iterator();
            while ( j.hasNext() )
            {
                System.out.println( "--" + j.next() );
            }
        }
    }
}
