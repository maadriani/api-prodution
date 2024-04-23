package marwahadriani.simplejavaAPIProjectEntity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class product {
    @Id
    private String id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "jumlah")
    private String jumlah;

    private String type;

    private String address;

    @ManyToOne
    @JoinColumn(name = "username",referencedColumnName = "username" )
    private user users;
}
