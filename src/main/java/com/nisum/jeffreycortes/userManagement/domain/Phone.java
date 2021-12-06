package com.nisum.jeffreycortes.userManagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.Instant;

@Entity
@Table(name="users_phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @NotNull(message = "El número de teléfono es obligatorio")
    Long number;
    @NotNull(message = "El código de ciudad es obligatorio")
    @JsonProperty("citycode")
    Integer cityCode;
    @NotNull(message = "El código de país es obligatorio")
    @JsonProperty("countrycode")
    Integer countryCode;

    @ManyToOne(cascade={ CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name="user_id")
    private User user;

    public Long getNumber() {
        return number;
    }
    public void setNumber(Long number) {
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
