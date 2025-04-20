// package basic_details.demo.model;

// import jakarta.persistence.*;

// @Entity
// @Table(name = "drivers")
// public class Driver {

//     @Id
//     private String email;

//     private String name;
//     private String password;

//     // Getters and Setters
//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }
// }

package basic_details.demo.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;

    // Generate UUID before saving
    @PrePersist
    public void generateId() {
        this.id = UUID.randomUUID().toString();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
