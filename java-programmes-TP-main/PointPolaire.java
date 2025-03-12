class PointPolaire implements IPoint{
    private double y;
    private double x;

    public PointPolaire(double x , double y){
        this.y = y;
        this.x = x;
    }

    public PointPolaire(){
        y = 2.0;
        x = 30.3;
    }

    public double getX(){
        Math.cos();
        return x;
    }
    public double getY(){
        Math.sin();
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void afficher(){
    System.out.println("Coordonnee polaire X : " + x  + " Coordonnee  polaire Y " + y);
    }
}
