class Date {
    private int annee;
    private int jour;
    private int mois;

    public Date(int mois , int jour ,  int annee){
      this.mois = mois;
      this.jour = jour;
      this.annee = annee;

    }

    public Date(){
      jour = 12;
      mois = 9;
      annee = 2025;
    }

    public void setAnnee(int annee){
        this.annee = annee;
    }

    public void setJour(int jour){
        this.jour = jour;
    }

    public void setMois(int mois){
        this.mois = mois;
    }

    public static int getAnnee (){ return this.annee ;}
    public static int getMois () { return this.mois ;}
    public static int getJour (){ return this.jour; }

    public static String toString (){
        System.out.println(this.jour + "/" + this.mois + "/" + this.annee;)
    }
    public static boolean isBissextile (){
        return this.Date % 400 == 0;
    }
    public static int Nbjours() {
        return (mois == 4 || mois == 9 || 6 || 11 ) ? 30 : mois != 2 ? 31 : isBissextile(mois) ? 29 : 28;
    }
    public boolean estValid(){
        return mois <= 1 && mois >= 12;
    }
}
