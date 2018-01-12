/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.employeeservice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juneau
 */
@Entity
@Table(name = "ACME_EMPLOYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AcmeEmployee.findAll", query = "SELECT a FROM AcmeEmployee a")
    , @NamedQuery(name = "AcmeEmployee.findById", query = "SELECT a FROM AcmeEmployee a WHERE a.id = :id")
    , @NamedQuery(name = "AcmeEmployee.findByFirstName", query = "SELECT a FROM AcmeEmployee a WHERE a.firstName = :firstName")
    , @NamedQuery(name = "AcmeEmployee.findByLastName", query = "SELECT a FROM AcmeEmployee a WHERE a.lastName = :lastName")
    , @NamedQuery(name = "AcmeEmployee.findByStartDate", query = "SELECT a FROM AcmeEmployee a WHERE a.startDate = :startDate")
    , @NamedQuery(name = "AcmeEmployee.findByAge", query = "SELECT a FROM AcmeEmployee a WHERE a.age = :age")
    , @NamedQuery(name = "AcmeEmployee.findByJobId", query = "SELECT a FROM AcmeEmployee a WHERE a.jobId = :jobId")
    , @NamedQuery(name = "AcmeEmployee.findByStatus", query = "SELECT a FROM AcmeEmployee a WHERE a.status = :status")})
public class AcmeEmployee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 50)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "JOB_ID")
    private Integer jobId;
    @Size(max = 20)
    @Column(name = "STATUS")
    private String status;

    public AcmeEmployee() {
    }

    public AcmeEmployee(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcmeEmployee)) {
            return false;
        }
        AcmeEmployee other = (AcmeEmployee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.employeeservice.entity.AcmeEmployee[ id=" + id + " ]";
    }
    
}
