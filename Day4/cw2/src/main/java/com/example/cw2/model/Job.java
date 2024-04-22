<<<<<<< HEAD
package com.example.cw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    private int jobId;
    private String jobTitle;
    private int minSalary;
    private String jobDescription;
    private int maxSalary;
}

=======
package com.example.cw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    private int jobId;
    private String jobTitle;
    private int minSalary;
    private String jobDescription;
    private int maxSalary;
}

>>>>>>> 31af81c26196f8455dee2e81a03742efec086004
