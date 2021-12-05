package com.nisum.jeffreycortes.userManagement.aplication.services;

import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserCreatedResponse;
import com.nisum.jeffreycortes.userManagement.aplication.dtos.UserRequestCreateDto;
import com.nisum.jeffreycortes.userManagement.domain.Email;
import com.nisum.jeffreycortes.userManagement.domain.User;
import com.nisum.jeffreycortes.userManagement.domain.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository _userRepository;

    public UserService(UserRepository userRepository){
        _userRepository = userRepository;
    }

    public UserCreatedResponse Create(UserRequestCreateDto userDto) throws Exception {
        User userResult = _userRepository.findUserByEmail(new Email(userDto.getEmail()));
        if (userResult != null)
           throw new Exception("Usuario registrado");

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDto, User.class);

        return modelMapper.map(_userRepository.save(user), UserCreatedResponse.class);
    }

    public List<User> getAll(){
        return  _userRepository.findAll();
    }
}
