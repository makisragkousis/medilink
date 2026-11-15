package gr.aueb.cf.medilink.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String number;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    private Double latitude;

    private Double longitude;
}
