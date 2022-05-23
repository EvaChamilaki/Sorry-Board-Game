package Model;

public abstract class StartSlideSquare extends SlideSquare{
	
	private String image; 

	abstract String getImage();
	/**
	 * Accessor: returns the card's image
	 * Precondition: card's image has been setted.
	 * Postcondition: card's image has been returned
	 */

    abstract void setImage(String image);
    /**
	 * Transformer: sets card's image
	 * PostCondition: card's image has been set.
	 * parameter->String image.
	 */
    
    public abstract void Slide();
    /**
     *If a player can get to the slide, this method will move his pawn
     *to the last square of the slide.
     */
    
    public abstract boolean isBetween();
    /**
     * If an opponent's pawn is in between the slide, then it will return true
     * else it will return false.
     */
    
    public abstract void Eliminate();
    /**
     * Precondition: isBetween()==true
     * In that case, the player that is will do the slide, will eliminate
     * the opponent's pawn and send it back to the StartSquare.
     */

}
