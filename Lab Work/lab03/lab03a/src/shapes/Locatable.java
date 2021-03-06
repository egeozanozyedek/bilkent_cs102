package shapes;
/*
 * Locatable interface which extends Selectable, an intarface to make shapes locatable by giving them x and y coordinates
 * @author Ege Ozan �zyedek
 * @version v1.0
 * @date 13/03/18
 */
public interface Locatable extends Selectable{

    /*
     * Interface method to set location by getting x and y values
     * @param x, x coordinate
     * @param y, y coordinate
     */
    void setLocation( int x, int y);

    /*
     * Interface method to get the x coordinate of shape
     * @return int, x coordinate
     */
    int getX();

    /*
     * Interface method to get the y coordinate of shape
     * @return int, y coordinate
     */
    int getY();

}
