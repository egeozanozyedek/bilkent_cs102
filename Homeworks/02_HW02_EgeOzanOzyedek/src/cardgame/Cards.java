package cardgame;
import java.util.Random;

//Cards - Maintains a collection of zero or more playing cards.
//         Provides facilities to create a full pack of 52 cards
//         and to shuffle the cards.
// author: Ege Ozan �zyedek
// date: 20.02.2018
public class Cards
{
	final int NOOFCARDSINFULLPACK = 52;

	// properties
	Card[] cards;
	int    valid;  // number of cards currently in collection

	// constructors
	public Cards( boolean fullPack )
	{
		cards = new Card[ NOOFCARDSINFULLPACK ];
		valid = 0;

		if ( fullPack )
			createFullPackOfCards();
	}

	// methods
	public Card getTopCard()
	{
		Card tmp;

		if ( valid <= 0 )
			return null;
		else
		{
			valid--;
			tmp = cards[ valid ];
			cards[ valid ] = null;
			return tmp;
		}
	}

	public boolean addTopCard( Card c )
	{
		if ( valid < cards.length )
		{
			cards[ valid ] = c;   // should this be cloned?
			valid++;
			return true;
		}
		return false;
	}

	private void createFullPackOfCards()
	{
		for ( int i = 0; i < NOOFCARDSINFULLPACK; i++ )
		{
			addTopCard( new Card( i ) );
		}

	}

	public void shuffle()
	{
		int index;
		Card temp;
		Random random;

		random = new Random();
		for ( int i = cards.length - 1; i > 0; i-- )
		{
			index = random.nextInt( i + 1 );
			temp = cards[ index ];
			cards[ index ] = cards[ i ];
			cards[ i ] = temp;
		}
	}

	// For testOnly... remove from production version!
	public void testOnlyPrint()
	{
		for ( int i =0; i < valid; i++ )
		{
			System.out.println( cards[i] );
		}

	}

} // end class Cards
