package br.com.multimodule.services;

import br.com.multimodule.model.User;
import br.com.multimodule.repository.UserRepository;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by rafaelpossas on 5/9/14.
 */
@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public List<User> findAll(){
        return IteratorUtils.toList(userRepository.findAll().iterator());
    }
}
