package com.soumyadeep.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

    @Value("Student")
    private String title;

    @Value("STCET")
    private String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Profile [company=" + company + ", title=" + title + "]";
    }

}
