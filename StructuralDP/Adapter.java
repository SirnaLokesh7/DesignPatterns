public class Adapter {
    public static void main(String[] args) {
        Pen p=new PenAdapter();
        Assignment work=new Assignment();
        work.setP(p);
        work.writeAssignment("I am writing a new assignment for today");

    }
}

class Assignment{
    private Pen p;
    public Pen getP() {
        return this.p;
    }
    public void setP(Pen p) {
        this.p = p;
    }
    public void  writeAssignment(String str){
        p.write(str);
    }

}

interface Pen{
    public void write(String str);
}

class CelloPen{
    public void mark(String mark){
        System.out.println(mark);
    }
}

class PenAdapter implements Pen{
    private CelloPen cpen=new CelloPen();
    public void write(String str){
        cpen.mark(str);
    }
}
