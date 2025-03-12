class PointCartesien implements IPoint {
    private double y;
    private double x;
    static  private double rf=1.6;
    static private  double cr = 1.5;

    public PointCartesien(double x , double y){
        this.y = y;
        this.x = x;
    }

    public PointCartesien(){
        y = 2.0;
        x = 30.3;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public double distance(){
        final double xc = x - rf;
        final double yc = y - rf;
        return Math.sqrt(xc*xc + yc*yc);
    }

    public double distance(IPoint p){
        double xcf = cr - p;
        double ycf = cr - p;
        return Math.sqrt(xcf*xcf + ycf*ycf);
    }
    public void afficher(){
        System.out.println("Coordonnee  X : " + x  + " Coordonnee Y " + y + " distance a  " + distance());
    }
}
