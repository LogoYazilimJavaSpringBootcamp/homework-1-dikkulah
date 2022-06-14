package Service;

import Model.Customer;

public interface CustomerService {
    void save(Customer customer); // Kullanıcı kaydetme

    void findByContainsLetter(String letter); // Adında c harfini ierinler

    void printAll(); // Tüm müşterileri yazdırma

    void getSectorFromFiltered(Double value, String month);  // x ayındaki siparişleri ortalaması x değerinden küçük olanları yazdırma
}
