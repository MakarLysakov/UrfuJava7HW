package ru.lysakov.MyUrfuRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lysakov.MyUrfuRestDbService.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
