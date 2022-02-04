package web.shop.customermanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String customerId;
    private String name;
    private String fname;
    private String emailaddresses;
    private String category;
    private String city;
    private String country;


    public Customer() {}
        public Customer(String customerId, String name, String fname, String emailaddresses, String category, String city, String country) {

            this.customerId = customerId;
            this.name = name;
            this.fname = fname;
            this.emailaddresses = emailaddresses;
            this.category = category;
            this.city = city;
            this.country = country;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmailaddresses() {
        return emailaddresses;
    }

    public void setEmailaddresses(String emailaddresses) {
        this.emailaddresses = emailaddresses;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", emailaddresses='" + emailaddresses + '\'' +
                ", category='" + category + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
