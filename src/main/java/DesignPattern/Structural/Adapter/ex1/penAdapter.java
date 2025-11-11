package DesignPattern.Structural.Adapter.ex1;

public class penAdapter implements BallPen {

    TrimaxGel trimaxPen;
    penAdapter(TrimaxGel trimaxPen){
        this.trimaxPen=trimaxPen;
    }

    @Override
    public void write(String content) {
        trimaxPen.writewithtrimax(content);
    }
}
