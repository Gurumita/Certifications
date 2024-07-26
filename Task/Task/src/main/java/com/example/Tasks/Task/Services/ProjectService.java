package com.example.Tasks.Task.Services;

import com.example.Tasks.Task.DAO.ProjectRepository;
import com.example.Tasks.Task.Models.Projects;
import com.example.Tasks.Task.Models.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Projects createProject(Projects projects) {
        projectRepository.save(projects);
        return projects;

    }

    public List<Projects> getallProjects(){
        return projectRepository.findAll();
    }

}
