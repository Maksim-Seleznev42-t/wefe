package Model;

import lombok.*;

import javax.persistence.*;

@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "ClientService")
public class ClientService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column(name = "idclientservice_a_import")
    private int id;

    @NonNull
    @Column(name = "Client")
    private String Client;

    @NonNull
    @Column(name = "Nachalo_okazaniya_uslugi")
    private String nachaloUslugi;

    @NonNull
    @Column(name = "Usluga")
    private String usluga;


}

