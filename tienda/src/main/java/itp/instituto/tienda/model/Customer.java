package itp.instituto.tienda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
@Data
@Builder
public class Customer {

    private Long id;

    private String numberID;

    private String firstName;

    private String lastName;

    private String email;

    private String photoUrl;

    private Region region;

    private String state;
}
