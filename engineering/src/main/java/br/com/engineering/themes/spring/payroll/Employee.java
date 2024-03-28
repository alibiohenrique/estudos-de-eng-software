package br.com.engineering.themes.spring.payroll;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

//  Boilerplate annotations (for some reason I wasn't able to use @AllArgsConstructor)
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Employee {


    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;


    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
