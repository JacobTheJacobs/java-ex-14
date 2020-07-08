
public class PointNode
{
    Point _point;
    PointNode _next;

    public PointNode(Point p){
        this._point=p;
        this._next=null;
    }

    public PointNode(Point p,PointNode n){
        this._point=p;
        this._next=n;
    }

    public PointNode(PointNode p){
        this._point=p._point;
        this._next=p._next;
    }

    public Point getPoint(){
        return this._point;
    }

    public PointNode getNext(){
        return this._next;
    }

    public void setNext(PointNode next){
        this._next=_next;
    }

    public void setPoint(Point p){
        this._point=_point;
    }

}
