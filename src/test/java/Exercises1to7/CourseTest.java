package Exercises1to7;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CourseTest {
    private Course course1;
    private Course course2;
    private Course course3;
    private Course course4;
    private Course course5;
    private List<Course> courses;
    private List<Course> courses1;
    private Map<String, Integer> coursesMap;
    int[] courseArray;

    @BeforeEach
    public void setUp() {
    course1 = new Course("Java", 2023);
    course2 = new Course("PHP", 2024);
    course3 = new Course("Python", 2023);
    course4 = course1;
    course5 = new Course("SQL", 2025);


    courses = new ArrayList<Course>();

    courses.add(course1);
    courses.add(course2);
    courses.add(course3);
    courses.add(course4);

    courses1 = new ArrayList<Course>();

    courses1.add(course1);
    courses1.add(course2);
    courses1.add(course3);
    courses1.add(course4);

    coursesMap = new HashMap<>();
    coursesMap.put("Java", 2023);
    coursesMap.put("Python", 2022);
    coursesMap.put("PHP", 2021);

    courseArray = new int[]{1, 2, 3, 4};
    }

    @Test
    void testAssertJInt() {
        assertThat(course1.code()).isEqualTo(course3.code());
        assertThat(course1.code()).isNotEqualTo(course2.code());
    }

    @Test
    void testAssertJReference() {
        assertThat(course1).isSameAs(course4);

        assertThat(course1).isNotSameAs(course2);
    }

    @Test
    void testAssertJIdenticalArrays() {
        assertThat(courses).isEqualTo(courses1);
    }

    @Test
    void testAssertJOrderObjectsArrayList() {
        assertThat(courses).containsExactly(course1, course2, course3, course4);
        assertThat(courses).containsExactlyInAnyOrder(course2, course1, course3, course4);
        assertThat(courses).containsOnlyOnce(course2);
        assertThat(courses).doesNotContain(course5);
    }

    @Test
    void testMapContainsKey() {
        assertThat(coursesMap).containsKey("Java");
    }

    @Test
    void testArrayIndexOutOfBoundsException() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    System.out.println(courseArray[5]);
                })
                .withMessageContaining("Index 5 out of bounds for length 4");
    }

    @Test
    void testCourseIsConstructed() {
        assertThat(course1).isNotNull();
    }


}