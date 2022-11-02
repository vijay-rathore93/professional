package org.vijaycode.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "professional")
public class Professional {

    @Id
    //@GeneratedValue
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // +1
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professional_seq_generator")
    @SequenceGenerator(name = "professional_seq_generator", sequenceName = "professional_seq", initialValue = 1000)

    private Integer id;
    private Integer empId;
    private String managerName;
    private Integer projectNumber;
    private boolean isActive;
    private Date joiningDate;
}
