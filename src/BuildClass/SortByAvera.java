package BuildClass;

import java.util.Comparator;

public class SortByAvera implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return (int) (s1.getAverage() - s2.getAverage());
    }
}