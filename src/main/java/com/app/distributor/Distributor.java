package com.app.distributor;



import jakarta.persistence.*;


@Entity
@Table
public class Distributor {
    @Id
    @SequenceGenerator(
            name = "distributor_sequence",
            sequenceName = "distributor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "distributor_sequence"
    )

    private Long distributorID;
    private String name;
    private String province;
    private String email;
    private String password;

    public Distributor() {
    }

    public Distributor(Long distributorID,
                       String name,
                       String province,
                       String email,
                       String password) {
        this.distributorID = distributorID;
        this.name = name;
        this.province = province;
        this.email = email;
        this.password = password;
    }

    public Distributor(String name,
                       String province,
                       String email,
                       String password) {
        this.name = name;
        this.province = province;
        this.email = email;
        this.password = password;
    }

    public Long getDistributorID() {
        return distributorID;
    }



    public void setDistributorID(Long distributorID) {
        this.distributorID = distributorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    @Override
    public String toString() {
        return "Distributor{" +
                "distributorID=" + distributorID +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}