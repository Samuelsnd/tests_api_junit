package business;

import service.CourseService;

import java.util.ArrayList;
import java.util.List;

// business.CourseBusiness =  System Under Test (SUT)
public class CourseBusiness {

    // CourseService is a Dependency
    private CourseService service;

    public CourseBusiness(CourseService service) {
        this.service = service;
    }

    public List<String> retrieveCourserelatedToSpring(String student){
        var filteredCourses = new ArrayList<String>();
        var allCousers = service.retrieveCourse(student);

        for (String course : allCousers) {
            if (course.contains("Spring")) {
                filteredCourses.add(course);
            }
        }

        return filteredCourses;
    }
}
