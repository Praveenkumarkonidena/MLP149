public class a{

    private int a;
    private string b;


    public a() {
    }


    public a(int a, string b) {
        this.a = a;
        this.b = b;
    }


    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public string getB() {
        return this.b;
    }

    public void setB(string b) {
        this.b = b;
    }


    @Override
    public String toString() {
        return "{" +
            " a='" + getA() + "'" +
            ", b='" + getB() + "'" +
            "}";
    }

}