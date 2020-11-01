package TD1;

import java.util.Random;

public class Box implements Cloneable{
    /*private int absHG;
    private int ordHG;
    private int absBD;
    private int ordBD;*/
    private Pixel HG;
    private Pixel BD;
    private int id;
    public static int count = 1;
    public Box(int blablabal, int ordHG, int absBD, int ordBD) {
        HG = new Pixel(blablabal, ordHG);
        BD = new Pixel(absBD, ordBD);
        this.id = count;
        count += 1;
    }
    public int getId() {
        return id;
    }
    public Pixel getHG() {
        return HG;
    }
    public Pixel getBD() {
        return BD;
    }
    public String toString(){
        return "[Box id = "+id+"]"+HG.toString() + " - " + BD.toString();
        //return "(abHG :"+absHG+", "+ordHG+") - ("+absBD+", "+ordBD+")";
    }
    public void translate(int vx, int vy){
        HG.translate(vx,vy);
        BD.translate(vx,vy);
    }
   /* @Override
    public boolean equals(Object o){
        if (o instanceof Box){
            Box b = (Box) o;
            if (HG.getAbs() == b.HG.getAbs() && HG.getOrd()==b.HG.getOrd()
            && BD.getAbs()==b.BD.getAbs() && BD.getOrd()==b.BD.getOrd()){
                return true;
            }
        }
        return false;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Box b = (Box) super.clone();
        b.id = count;
        count += 1;
        b.BD = new Pixel(BD.getAbs(), BD.getOrd());
        b.HG = new Pixel(HG.getAbs(), HG.getOrd());
        return b;
    }*/
}

print 
