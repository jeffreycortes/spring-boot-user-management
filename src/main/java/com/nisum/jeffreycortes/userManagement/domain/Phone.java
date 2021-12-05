package com.nisum.jeffreycortes.userManagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="users_phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    Integer number;
    @JsonProperty("citycode")
    Integer cityCode;
    @JsonProperty("countrycode")
    Integer countryCode;

    @ManyToOne(cascade={ CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name="user_id")
    private User user;

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCityCode() {
        return cityCode;
    }
    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
