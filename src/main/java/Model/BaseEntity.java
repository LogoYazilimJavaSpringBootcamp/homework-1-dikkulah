package Model;

import lombok.Getter;

import java.util.UUID;


@Getter
public class BaseEntity {
    /**
     * Tüm sınıfların id sini üretir.
     */
    private final String id;

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
    }


}
