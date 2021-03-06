package alix.util;


/**
 * A mutable list of ints.
 *
 * @author glorieux-f
 */
public class IntList extends IntTuple
{

  /**
   * Light reset data, with no erase.
   * @return
   */
  public void reset()
  {
    size = 0;
    hash = 0;
  }

  /**
   * Add on more value at the end
   * @param value
   * @return
   */
  public void push( int value )
  {
    onWrite( size );
    data[size] = value;
    size++;
  }
  
  /**
   * Change value at a position
   * @param pos
   * @param value
   * @return
   */
  public void set( int pos, int value )
  {
    if ( onWrite( pos ) ) ;
    if ( pos >= size ) size = (short)(pos+1);
    data[pos] = value;
  }

  /**
   * Modify content an adjust to an int array
   * @param data
   * @return
   */
  public void set( int[] data )
  {
    super.set( data );
  }

  /**
   * Modify content an adjust to another tuple.
   * @param tuple
   * @return
   */
  public void set( IntTuple tuple )
  {
    super.set( tuple );
  }

}
