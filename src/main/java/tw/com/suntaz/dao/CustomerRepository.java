package tw.com.suntaz.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import tw.com.suntaz.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
