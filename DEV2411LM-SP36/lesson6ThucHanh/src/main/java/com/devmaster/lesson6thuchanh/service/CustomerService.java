package com.devmaster.lesson6thuchanh.service;


import com.devmaster.lesson6thuchanh.dto.CustomerDTO;
import com.devmaster.lesson6thuchanh.entity.Customer;
import com.devmaster.lesson6thuchanh.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    // hien thi danh sách
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    // hien thi nguoi dung theo id

    public Optional<CustomerDTO> findById(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        CustomerDTO customerDTO =  CustomerDTO.builder()
                .id(customer.getId())
                .username(customer.getUsername())
                .password(customer.getPassword())
                .fullName(customer.getFullName())
                .address(customer.getAddress())
                .phone(customer.getPhone())
                .email(customer.getEmail())
                .birthDay(customer.getBirthDay())
                .active(customer.isActive())
                .build();
        return Optional.of(customerDTO);
    }

    public Boolean save(CustomerDTO customerDTO) {
        Customer customer = Customer.builder()
                .username(customerDTO.getUsername())
                .password(customerDTO.getPassword())
                .fullName(customerDTO.getFullName())
                .address(customerDTO.getAddress())
                .phone(customerDTO.getPhone())
                .email(customerDTO.getEmail())
                .birthDay(customerDTO.getBirthDay())
                .active(customerDTO.isActive())
                .build();
        try{
            customerRepository.save(customer);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    // sửa customers
    public Customer updateById(Long id, CustomerDTO customerDTO) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setUsername(customerDTO.getUsername());
                    customer.setPassword(customerDTO.getPassword());
                    customer.setFullName(customerDTO.getFullName());
                    customer.setAddress(customerDTO.getAddress());
                    customer.setPhone(customerDTO.getPhone());
                    customer.setEmail(customerDTO.getEmail());
                    customer.setBirthDay(customerDTO.getBirthDay());
                    customer.setActive(customerDTO.isActive());
                    return customerRepository.save(customer);
                })
                .orElseThrow(()-> new  IllegalArgumentException("Invalid customer ID "+id));
    }

    // xóa
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}
