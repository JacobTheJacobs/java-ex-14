
/**
 * Write a description of class Polygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Polygon
{
    private Point point;
    private PointNode node;
    private Points
    
    public Polygon(){
     this.point=null;
    }
    
    public boolean addVertex(Point p, int pos){
        
        
        
    if(node.getNext()==null){
     return false;
    }
       PointNode pr = new PointNode(p,node);
       this.node=pr;
       return true;
    }
}
