package marwahadriani.simplejavaAPIProjectEntity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class addresses {

    @Id
    private String id;

    private String name;

    private String street;

    private String city;

    private String province;

    private String country;

    @Column(name = "postcode")
    private String postcode;
    
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private product product;

    @OneToMany
    private List<addresses> address;
}
