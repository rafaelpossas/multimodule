package br.com.multimodule.repository;

import br.com.multimodule.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rafaelpossas on 5/11/14.
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
