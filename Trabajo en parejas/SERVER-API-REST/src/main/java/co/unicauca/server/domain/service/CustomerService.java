/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.server.domain.service;
import co.unicauca.server.domain.entity.Customer;
import co.unicauca.travelagency.server.access.ICustomerRepository;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
/**
 * @author Isabella Solarte
 * @author Daniela Riascos
 */
public class CustomerService {
    @Inject
    @Default
    ICustomerRepository repo;
    
    public CustomerService() {
    }

    /**
     * Buscar un cliente
     *
     * @param id cedula
     * @return objeto tipo Customer
     */
    public Customer findCustomer(String id) {
        return repo.findCustomer(id);
    }
    
    public List<Customer> findALLCustomers(){
        return repo.findALLCustomers();
    }
    /**
     * Crea un nuevo customer. Aplica validaciones de negocio
     *
     * @param customer cliente
     * @return devuelve la cedula del customer creado
     */
    public boolean createCustomer(Customer customer) {
        // Validaciones y reglas de negocio                   
        return repo.createCustomer(customer);
    }
}
