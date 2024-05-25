package eu.epfc.c1158.holiday.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class HolidayRequest {
    @Id @GeneratedValue
    private Long id;
    private String status;

    public HolidayRequest() {
    }

    public HolidayRequest(String status) {
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

    @Override
    public String toString() {
        return "HolidayRequest{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
