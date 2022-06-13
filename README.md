# Homework-1

1. Java’nın platform bağımsızlığını nasıl sağladığını anlatınız.(5 PUAN)
   1. Java JVM sayesinde platform bağımsızdır
   2. Java kodları derleyici(javac) tarafından bytecode adlı bir arakoda dönüştürülür.
   3. Bu arakodu platformların çalıştırması için JVM devreye girer ve bytecode'u platformun makine diline çevirir ve
      çalıştırır.
   4. <img height="300" src="image/jvm.png" width="300" />

2. Java neden çoklu kalıtımı desteklemez? Hangi diller bu duruma neden izin verir? (5 PUAN)
   1. Java karmaşıklığı azaltmak ve dili basitleştirmek için bunu arayüzlerle sağlar
   2. Kalıtılan sınıflar içerisinde aynı isme sahip bir metot olabilir, javac hangi yöntemi çağıracağına karar veremez
      ve belirsizlik oluşur.
   3. Bu şekilde karmaşık, yönetilmesi zor kalıtım ağaçları oluşur ve Single Responsibility prensibi ihlal edilmiş olur.
   4. C++, perl, python gibi diller çoklu kalıtıma izin verirler.
   5. Genel olarak c++ ın neden desteklediğinden çok javanın neden desteklemediği üzerine metinler var.C++ programcıya
      daha esnek bir kullanım sunuyor ancak yöneteim daha zor ve hata yapma ihtimali daha çok.
3. Build Tool nedir? Java ekosistemindeki toollar neler?
   1. Temel olarak derleme otomasyonu denebilir, kaynak koddan yürütülebilir uygulamaların oluşturulmasını sağlar, proje
      büyüdüke bağımlılıkları arttıkça takip etmesi ve yönetmesi zorlaşır build toollar ile bu yönetimi sağlarız.
      1. Bağımlıkları yönetir.
      2. Kodu derler, paketler ve test eder.
      3. Kodu sunuculara dağıtır.
   2. Java eko sisteminde Ant, Gradle ve maven en popüler toolardır.
4. Collection framework içerisindeki
   yapıları örnekleyip açıklayınız. (20 PUAN)
   1. Set<E>
      1. HashSet<E>
         1. Mükerrer kayıt eklenemez ve null eklenebilir.
         2. HashSet<E> eklenen değerleri bir hash foksiyonu sonucunda bir değer üretir.
         3. Hash fonksiyonuna giren değer aynı olduğunda sonuç aynı olacağından tekrar üzerine yazar, değer yine unique
            kalır, ve sıralama garantisi vermez.
         4. .isEmpty() boş ise true döndürür.
            .contains("20") 20 var ise true döndürür.
            .remove(10) silerken indis numarası değil içerik yazılarak silinir.

         5. Iterator<E> itr = x.iterator(); İterator ile collectionlar içerisinde gezebiliriz.
            .hasNext() -> bir sonraki elemanı var mı?
            .next() -> bir sonraki eleman
      2. LinkedHashSet<E> içerisinde çift bağlantılı bir liste tutar değerleri sıralı tutar.
      3. TreeSet<E> Kendimiz bir sıra belirtmek istediğimizde treeSet kullanabiliriz. Verdipimiz sıralama fonksiyonuna
         göre
         sıralar. örneğin Comparable'i implente edip compareTo'yu override etmek.
   2. List<E> Listeler her elemanı bellekte kendine özgü bir alanda tutar verilere indexler
         üzerinden erişir. Verileri sıralı tutar ve mükerrer elamanlara izin verir.İsteğimiz sıraya eleman ekleyebilir ve çıkara biliriz.
      1. ArrayList<E>  Liste halindeki verileri dinamik diziler olarak yapar. Array'ye çevrilebilir. Boyutu default olarak 10dur ve eklendikçe artar.Bir eleman silindiğinde otomatik kaydırır. Esnek ancak maliyetlidir.
      2. LinkedList<E> Çift yönlü bağlı liste algoritmasını kullanır. her eleman kendinden önceki ve sonraki elemanı işaret eder.Silme ve araya eleman ekleme durumunda kaydırma işlemi yapmaz.
      3. Vector<E> ArrayList senkronize olmadığı için Vector sınıfına göre daha hızlıdır. Ancak vektör sınıfı ok işlem ortamında daha fazla veri güvenliği sağlar.
      4. Queue =LinkedList<E> FIFO ve LIFO yapısını sağlamak için üretilmiştir. Girilen sayı listenin sonuna veya başına eklenir, ve çekilen eleman listenin başından ve sonundan gelir. İndex numarası yoktur.
      5. PriorityQueue<>(,compare) linkedQueue den farklı olarak kuyruğa ekleme işlemini yaparken Comparator kullanır ve buna göre kuyruğu düzenler.

   2. Map<K,V> Deponan değerler bir anahtara refere edilir ve öğreyi bulmak kolaylaşır.
      Map<Key,Value> şeklindedir
      1. HashMap<K,V> Eşleme tablosuna eleman ekleme, çıkartma işlemlerinde ve anahtarı verilen elemanı tabloda bulma işlemlerinde oldukça etkilidir. Girilen sıraları garanti etmez
      2. LinkedHashMap<K,V> HashMap yapısından önemli farkı öğelerini çift yönlü bağ ile birbirlerine bağlamasıdır. Bağlı liste olduğu için, döngü sırası öğelerin bağlı listedeki konumlarıdır.
      3. TreeMap<K,V> TreeMap LinkedHashMap ten farkı Comperator ile sıralandırılabiliyor olmasıdır.
      4. <img height="500" src="image/collection.png" width="700" />


5. Bir müşterinin, sipariş oluşturup+, faturalarını kaydedebildiği+ ve görüntüleyebildiği+ bir uygulama
   yazın.
   Final+, static+, overload+, override+, constructor+, kalıtım+
   polimorfizim+ , encapsulation+, List+, Set+, Map+ kavramlarını kullanılmalıdır.
   Sisteme eklemeler yapabilirsiniz.
   Main method üzerinde çalışması yeterlidir.
   SOLID prensiplerine uygun olarak yazmaya çalışınız.
   Kod kalitesi puanlanacaktır, isimlendirme kurallarına dikkat ediniz.
   Listeleme işlemleri stream kullanılarak yapılmalı.(70 PUAN)

   1. Maven projesi oluşturun.+
   2. Maven komutlarını çalıştırıp, çıktıyı ekleyin + MavenÇıktısı.md içerisinde
   3. Tüm müşterileri listeleyin +
   4. Yeni Müşteri oluşturabilen +
   5. İçerisinde ‘C’ harfi olan müşterileri listeleyin +
   6. Haziran ayında kayıt olan müşterilerin faturalarınının toplam tutarını listeleyin +
   7. Sistemdeki tüm faturaları listeleyin +
   8. Sistemdeki 1500TL üstündeki faturaları listeleyin+
   9. Sistemdeki 1500TL üstündeki faturaları ortalamasını hesaplayın +
   10. Sistemdeki 500TL altındaki faturalara sahip müşterilerin isimleri listeleyin +
   11. Haziran ayını faturalarını ortalaması 750 altı olan firmalarının hangi sektörde olduğunu listeleyen kodu yazın.+

Bu dosya Patika.dev - LOGO Java & Spring Boot eğitimi dışında kullanılamaz.
Cem DIRMAN
