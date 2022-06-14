package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import javax.validation.constraints.NotNull;
import com.example.Project.model.Employeee;


@Repository
public interface EmployeeeRepository extends JpaRepository<Employeee,String> {

//Query to search details of an Employee

@Query("SELECT e FROM Employeee e WHERE e.firstName like %?1%" + "OR e.lastName like %?1%" + "OR e.email like %?1%" + "OR CONCAT(e.id, '') like %?1%" + "OR e.location like %?1%" + "OR e.department like %?1%" + "OR e.designation like %?1%")
@NotNull
public List<Employeee> search(@NotNull String keyword); 
Employeee findByEmail(String email);
}
