package majd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, String> {
	
	public List<Project> findByDescription(String description);
}
