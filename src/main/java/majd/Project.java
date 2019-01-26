package majd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  projectId;
	private String description;
	
	/*@ManyToOne
	private User user;*/
	
	
	public Project(Integer projectId, String description/*, User user*/) {
		super();
		this.projectId = projectId;
		this.description = description;
		/*this.user = user;*/
	}


	/*public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
*/

	public Project() {
		
	}


	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




	
	
	
	
	
}
