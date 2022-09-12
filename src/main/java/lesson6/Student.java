package lesson6;

import java.util.Map;

public class Student {

  private final String name;

  private final String group;

  private final int course;

  private final Map<String, Integer> marks;

  public Student(int course, String name, String group, Map<String, Integer> marks) {
    this.course = course;
    this.name = name;
    this.group = group;
    this.marks = marks;
  }

  public Map<String, Integer> getMarks() {
    return marks;
  }

  public int getCourse() {
    return course;
  }

  public String getName() {
    return name;
  }
}
