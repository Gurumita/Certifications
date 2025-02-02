package com.example.Tasks.Task.DAO;


import com.example.Tasks.Task.Models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Tasks,Integer> {
    List<Tasks> findByProject(int projectId);
}
