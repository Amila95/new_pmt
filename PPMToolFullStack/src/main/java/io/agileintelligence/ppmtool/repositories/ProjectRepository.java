package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Iterable<Project> findAll();
    
    Project findByProjectIdentifier(String projectid);
    
    Iterable<Project> findAllByProjectLeader(String username);
    
    
}
