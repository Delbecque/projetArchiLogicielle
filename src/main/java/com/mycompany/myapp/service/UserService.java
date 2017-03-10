package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.User;
import com.mycompany.myapp.repository.UserRepository;
import com.mycompany.myapp.service.dto.UserDTO;
import com.mycompany.myapp.service.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing User.
 */
@Service
public class UserService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);
    
    @Inject
    private UserRepository userRepository;

    @Inject
    private UserMapper userMapper;

    /**
     * Save a user.
     *
     * @param userDTO the entity to save
     * @return the persisted entity
     */
    public UserDTO save(UserDTO userDTO) {
        log.debug("Request to save User : {}", userDTO);
        User user = userMapper.userDTOToUser(userDTO);
        user = userRepository.save(user);
        UserDTO result = userMapper.userToUserDTO(user);
        return result;
    }

    /**
     *  Get all the users.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    public Page<UserDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Users");
        Page<User> result = userRepository.findAll(pageable);
        return result.map(user -> userMapper.userToUserDTO(user));
    }

    /**
     *  Get one user by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    public UserDTO findOne(String id) {
        log.debug("Request to get User : {}", id);
        User user = userRepository.findOne(id);
        UserDTO userDTO = userMapper.userToUserDTO(user);
        return userDTO;
    }

    /**
     *  Delete the  user by id.
     *
     *  @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete User : {}", id);
        userRepository.delete(id);
    }
}
