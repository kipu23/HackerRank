package day12;

class Student extends Person{

    private int[] scores;

    private static double getAvg(int[] numbers){
        Integer sumNumbers = 0;
        for (Integer currNum : numbers){
            sumNumbers += currNum;
        }

        return sumNumbers.doubleValue()/numbers.length;
    }
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */

    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.scores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        double avg = getAvg(this.scores);

        if (90 <= avg && avg <= 100) return 'O';
        else if (80 <= avg && avg < 90) return 'E';
        else if (70 <= avg && avg < 80) return 'A';
        else if (55 <= avg && avg < 70) return 'P';
        else if (40 <= avg && avg < 55) return 'D';
        else return 'T';

    }
}