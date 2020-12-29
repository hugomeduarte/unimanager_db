package pt.iade.unimanager_db.models;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    Course findById(int id);
    
    
}
