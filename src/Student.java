public class Student extends Human{
    private double mathscore;
    private double physicalscore;
    private double chemicalscore;

    public Student(){
    }

    public Student(double mathscore, double physicalscore, double chemicalscore) {
        this.mathscore = mathscore;
        this.physicalscore = physicalscore;
        this.chemicalscore = chemicalscore;
    }

    public Student(int id, String name, int age, double mathscore, double physicalscore, double chemicalscore) {
        super(id, name, age);
        this.mathscore = mathscore;
        this.physicalscore = physicalscore;
        this.chemicalscore = chemicalscore;
    }

    public double getMathscore() {
        return mathscore;
    }

    public void setMathscore(double mathscore) {
        this.mathscore = mathscore;
    }

    public double getPhysicalscore() {
        return physicalscore;
    }

    public void setPhysicalscore(double physicalscore) {
        this.physicalscore = physicalscore;
    }

    public double getChemicalscore() {
        return chemicalscore;
    }

    public void setChemicalscore(double chemicalscore) {
        this.chemicalscore = chemicalscore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mathscore=" + mathscore +
                ", physicalscore=" + physicalscore +
                ", chemicalscore=" + chemicalscore +
                '}';
    }
}
