package RevaSadovnicova.inheritance;

public class Rectangle extends Shape{
    private Integer weidth;
    private Integer height;

    public Rectangle( Integer weidth,Integer height,String color){
        super(color);
        this.height = height;
        this.weidth = weidth;
    }
}
