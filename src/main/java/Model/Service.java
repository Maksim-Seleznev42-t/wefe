package Model;

import lombok.*;

import javax.persistence.*;

@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column (name = "idservice_a_import")
    private int id;

    @NonNull
    @Column (name = "Name_uslugi")
    private String name;

    @NonNull
    @Column (name = "Dlitelnost")
    private String dlitelnost;

    @NonNull
    @Column (name = "Price")
    private String price;

    @NonNull
    @Column (name = "Skidka")
    private String skidka;

}