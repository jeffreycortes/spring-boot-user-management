package com.nisum.jeffreycortes.userManagement.aplication.services;

import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserCreatedResponse;
import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserRequestCreateDto;
import com.nisum.jeffreycortes.userManagement.domain.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private PasswordPolicyValidator passwordPolicyValidator;

    private final UserRepository _userRepository;

    public UserService(UserRepository userRepository){
        _userRepository = userRepository;
    }

    public UserCreatedResponse create(UserRequestCreateDto userDto) {
        User userResult = _userRepository.findUserByEmail(new Email(userDto.getEmail()));
        if (userResult != null)
           throw new DuplicateKeyException("El correo ya se encuentra registrado");

        Boolean isPasswordValid = passwordPolicyValidator.isPasswordValid(userDto.getPassword());
        if (!isPasswordValid)
            throw new InvalidPasswordException();

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDto, User.class);

        return modelMapper.map(_userRepository.save(user), UserCreatedResponse.class);
    }

    public List<User> getAll(){
        return  _userRepository.findAll();
    }
}
