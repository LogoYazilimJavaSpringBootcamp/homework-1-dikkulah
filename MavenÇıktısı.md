# Maven çıktısı:
1. mvn clean: proje derlenirken oluşan target klasörünü siler.
   ![](image/clean.png)
2. mvn validate : projenin target dosyasını siler ve hatalı kısımları tarar.
   ![](image/validate.png)
3. mvn compile :projeyi clean ve validate eder ardından derler.
   ![](image/compile.png)
4. mvn test : projeyi derler ve test sınıflarını çalıştırır.
   ![](image/test.png)
5. mvn package : projenin testlerini yapar ve hata yok ise kodları paletler -> .jar
   ![](image/package.png)
6. mvn verify projeyi paketler ve bu paketleri kontrol eder
   ![](image/verify.png)
7. mvn install projeyi doğruladıktan sonra yerel depoya yükler.
   ![](image/install.png)
8. mvn deploy : projeyi uygulama sunucusuna gönderir
   -- uzak sunucu yok hata veriyor
9. mvn site  : projeye ait dökümantasyon üretir.
    1. site ![](image/site.png)
    2. site:run ![](image/site:run.png)

