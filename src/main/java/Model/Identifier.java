package Model;

import lombok.Getter;

import java.util.UUID;


@Getter
public class Identifier {
    /**
     * Tüm sınıfların id'sini üretir.
     */
    private final String id;


    public Identifier() {
        this.id = UUID.randomUUID().toString();
    }



}
