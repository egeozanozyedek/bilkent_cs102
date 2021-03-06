import java.util.ArrayList;

/*
 * A Class which tests the recursive  methods of the class Lab06
 * @author Ege Ozan �zyedek
 * @version v1.5
 * @date 17/04/18
 */
public class TestLab06 {
  public static void main( String[] args) {
    
    Lab06 l = new Lab06();
    
    System.out.println( l.occurrenceE( "ege ege ege ege ege") );
    System.out.println( l.toBinary( 6));
    
    ArrayList<String> list;
    
    list = new ArrayList<String>();
    
    list.add("aa");
    list.add("ac");
    list.add("b");
    list.add("c");
    list.add("d");
    
    System.out.println( l.isLexicographic( list));
    
    list.add("x");
    list.add("ya");
    list.add("yd");
    list.add("el");
    list.add("ec");
    
    System.out.println( l.isLexicographic( list));
    
    System.out.println( l.printNDigitEvenNumbers( 3));
    
    ArrayList<Integer> intList;
    
    intList = new ArrayList<Integer>();
    
    intList.add(21);
    intList.add( 3);
    intList.add( 3);
    intList.add( 55);
    intList.add( 42);
    intList.add( 24);
    intList.add( -125);
    intList.add( -105);
    intList.add( -15);
    
    System.out.println( l.order( intList));
    
    System.out.println( l.toDecimal( 110));
    
    
    
  }
}
