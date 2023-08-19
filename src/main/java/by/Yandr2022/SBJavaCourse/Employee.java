package by.Yandr2022.SBJavaCourse;

import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@ToString(exclude = "workStart")
public class Employee {

    private String name;
    private Integer salary;
    private Date workStart;




}