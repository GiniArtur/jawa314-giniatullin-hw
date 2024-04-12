package Lesson_SET;
import java.time.LocalDateTime;
import java.util.Objects;

public class Task {
    private String name;
    private LocalDateTime time;
    private boolean isDone;
    private static int equalsCount;

    public Task(String name) {
        this.name = name;
        time = LocalDateTime.now();
    }
    public static int getEqualsCount() {
        return equalsCount;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        equalsCount++;
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(name.toLowerCase(), task.name.toLowerCase());
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", isDone=" + isDone +
                '}';
    }
}