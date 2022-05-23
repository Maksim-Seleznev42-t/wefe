package Model;

import lombok.*;


import javax.persistence.*;

@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Client")
public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @NonNull
        @Column (name = "idclient_import")
        private int id;

        @NonNull
        @Column (name = "Familiya")
        private String familiya;

        @NonNull
        @Column (name = "Name")
        private String name;

        @NonNull
        @Column (name = "Otchestvo")
        private String otchestvo;

        @NonNull
        @Column (name = "Pol")
        private String pol;

        @Column(name = "Phone")
        private String phone;

        @NonNull
        @Column (name = "Photo_client")
        private String photo;

        @NonNull
        @Column (name = "Date_of_birth")
        private int dateBirth;

        @NonNull
        @Column (name = "Email")
        private String email;

        @NonNull
        @Column(name = "Date_registration")
        private long dateRegistration;

}
