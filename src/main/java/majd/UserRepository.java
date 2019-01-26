package majd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import majd.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
		public List<User> findByName(String name);
}
