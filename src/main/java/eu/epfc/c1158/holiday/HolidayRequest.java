package eu.epfc.c1158.holiday;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class HolidayRequest {
    @Id @GeneratedValue
    private Long id;
    private String employee;
    private String status;

    public HolidayRequest() {
    }

    public HolidayRequest(String employee, String status) {
        this.employee = employee;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "HolidayRequest{" +
                "id=" + id +
                ", employee='" + employee + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
