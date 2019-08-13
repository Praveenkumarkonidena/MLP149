public class Car{

    private String model;
    private String year;


    public Car() {
        this.model = null;
        this.year = null;
    }
    

    public Car(String model, String year) {
        this.model = model;
        this.year = year;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "{" +
            " model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }
   
}