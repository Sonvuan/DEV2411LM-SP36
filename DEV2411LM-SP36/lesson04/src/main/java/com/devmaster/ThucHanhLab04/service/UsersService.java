package com.devmaster.ThucHanhLab04.service;


import com.devmaster.ThucHanhLab04.dto.UsersDTO;
import com.devmaster.ThucHanhLab04.entity.Users;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {
  List<Users> usersList = new ArrayList<Users>();

  public UsersService() {
    usersList.addAll(
            Arrays.asList(
                    new Users(1L,"user1","pass1","John Doe", LocalDate.parse("1990-01-01"),"Jhon@example.com","1234567890",34,true),
                    new Users(2L,"user2","pass2","John De", LocalDate.parse("1990-01-01"),"Jhon@example.com","1234567890",34,false),
                    new Users(3L,"user3","pass3","John Do", LocalDate.parse("1990-01-01"),"Jhon@example.com","1234567890",34,true),
                    new Users(4L,"user4","pass4","John Du", LocalDate.parse("1990-01-01"),"Jhon@example.com","1234567890",34,false),
                    new Users(5L,"user5","pass5","John Dh", LocalDate.parse("1990-01-01"),"Jhon@example.com","1234567890",34,true)

            )
    );
  }

  public List<Users> findAll() {
    return usersList;
  }
//  public Boolean create(UsersDTO usersDTO) {
//    try{
//      Users users = Users.builder()
//              .id((long) usersList.size() + 1)
//              .username(usersDTO.getUsername())
//              .password(usersDTO.getPassword())
//              .email(usersDTO.getEmail())
//              .phone(usersDTO.getPhone())
//              .age(usersDTO.getAge())
//              .birthDate(usersDTO.getBirthDate())
//              .status(usersDTO.getStatus())
//      .build();
//      usersList.add(users);
//      return true;
//    }catch(Exception e){
//      return false;
//    }
//  }
}
