package ftn.isa.team12.pharmacy.domain.common;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name="CITIES")
@Getter
@Setter
@NoArgsConstructor
public class City implements Serializable {
   @Id
   @GeneratedValue(generator = "uuid2")
   @GenericGenerator(name = "uuid2", strategy = "uuid2")
   @Column(name = "city_id", nullable = false, unique = true)
   private UUID cityId;

   @Column(name = "name", nullable = false, unique=false)
   private String name;

   @Column(name = "zip_code", nullable = false, unique = false)
   private int zipCode;


   @ManyToOne
   @JoinColumn(name = "country_id", referencedColumnName = "country_id", nullable = false)
   private Country country;


}