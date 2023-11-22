package business;

import org.junit.jupiter.api.Test;
import service.CourseService;
import service.CouserServiceStub;

import static org.junit.jupiter.api.Assertions.*;

class CourseBusinessTest {

    @Test
    void testCoursesRelatedToSpring_When_UsingAStub() {

        // Given
        CourseService stubService = new CouserServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);
        // When
        var filteredCourses = business.retrieveCourserelatedToSpring("Leandro");
        // Then
        assertEquals(4, filteredCourses.size());


    }
}