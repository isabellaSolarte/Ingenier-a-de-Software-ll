/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.travelagency.server.access;

import co.unicauca.server.domain.entity.Customer;
import java.util.List;

/**
 * @author Isabella Solarte
 * @author Daniela Riascos
 */
public interface ICustomerRepository {
    public Customer findCustomer(String id);
    public boolean createCustomer(Customer customer);
    public List<Customer> findALLCustomers();
}
