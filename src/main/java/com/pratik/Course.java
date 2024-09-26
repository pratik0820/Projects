package com.pratik;


import lombok.*;

@Data
//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    private int courseId;
    private String courseName;
    private int coursePrice;

    @Override
    public String toString() {
        return "courseId = " + courseId + ", " +
                "courseName = " + courseName + ", " +
                "coursePrice = " + coursePrice;
    }
}
