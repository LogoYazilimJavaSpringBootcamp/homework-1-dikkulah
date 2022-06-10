package Model;

import lombok.Getter;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;


@Getter
public class Identifier {
    /**
     * Tüm sınıfların id'sini üretir.
     */
    private final String id;

    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    public Identifier() {

        this.id = String.valueOf(atomicInteger.getAndIncrement());
        //this.id = UUID.randomUUID().toString(); çıktıyı okunmaz yapıyor
    }

    @Override
    public String toString() {
        return "id='" + id + '\'';
    }


}
