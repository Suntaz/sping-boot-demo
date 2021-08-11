package tw.com.suntaz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.suntaz.dao.CustomerRepository;
import tw.com.suntaz.entity.Customer;

//@Controller
@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepo;
     
    @GetMapping("/customer")
    public List<Customer> listAll(Model model) {
    	System.out.println("list all~~~");
        List<Customer> listCustomers = customerRepo.findAll();
        model.addAttribute("listCustomers", listCustomers);
        
        listCustomers.forEach(e -> {
      	System.out.println(e.getName());
      	System.out.println(e.getContractAddr()); 
      });
         
        return listCustomers;
    }
}