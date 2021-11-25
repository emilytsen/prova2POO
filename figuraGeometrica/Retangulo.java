public class Retangulo implements FiguraGeometrica{

    private int base;
    private int altura;


    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }


    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }


    @Override
    public String getNomeFigura(){
        return "retângulo";
    }

    @Override
    public int getArea(){
        int area;
        area = this.base * this.altura;
        return area;
    }

    @Override
    public int getPerimetro(){
        int perimetro;
        perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }

}