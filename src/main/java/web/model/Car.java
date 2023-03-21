package web.model;

public class Car {
    private int series;
    private int issueYear;
    private String model;

    public Car() {

    }

    public Car(int series, int issueYear, String model) {
        this.series = series;
        this.issueYear = issueYear;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "series=" + series +
                ", issueYear=" + issueYear +
                ", model='" + model + '\'' +
                '}';
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
