![](image/Collections.png)

1. `Set<E>`
    1. `HashSet<E>`
   ```java
    HashSet<String> cars = new HashSet<>();
    cars.add("Volvo");
    cars.add("Mercedes");
    cars.add("Ford");
    cars.add("Mercedes");
    cars.add(null);
    cars.remove("Volvo"); // kaydı siler
    cars.clear(); // Tüm itemleri siler
    cars.size();// Boyutu döndürür.
    cars.contains("Volvo"); // Girilen değer var ise true döndürür.
    cars.isEmty(); // Liste boş ise True döndürür
    cars.forEach(System.out::println); // Listeyi print eder. 
    
   Iterator<String> itr = cars.iterator(); İterator ile collectionlar içerisinde gezebiliriz.
           .hasNext() -> bir sonraki elemanı var mı?
           .next() -> bir sonraki eleman
   ```

        1. Mükerrer kayıt eklenemez ve null eklenebilir.
        2. HashSet<E> eklenen değerleri bir hash foksiyonu sonucunda bir değer üretir.
        3. Hash fonksiyonuna giren değer aynı olduğunda sonuç aynı olacağından tekrar üzerine yazar, değer yine unique
           kalır, ve sıralama garantisi vermez.
    3. `LinkedHashSet<E>` içerisinde çift bağlantılı bir liste tutar ve değerleri sıralı tutar.
    ```java
   LinkedHashSet<String> lhs = new LinkedHashSet<String>();
   lhs.add("Pataki'da");
   lhs.add("java spring");
   lhs.add("öğreniyorum");
   lhs.forEach(System.out::println); // Hep aynı sıra ile bastırır.
   lhs.remove("java spring"); // Öğe varsa, bu kümeden kaldırır.
   clear()	Bu kümedeki tüm öğeleri kaldırır.
   contains()	//Bu küme belirtilen öğeyi içeriyorsa true değerini döndürür.
   isEmpty()	//Küme hiçbir öğe içermiyorsa true değerini döndürür.
   iterator()	//Kümedeki öğeler üzerinde bir yineleyici döndürür.
   size()	//Kümedeki öğelerin sayısını  döndürür.   

   ```
    4. `TreeSet<E>` Kendimiz bir sıra belirtmek istediğimizde treeSet kullanabiliriz. Verdipimiz sıralama fonksiyonuna
       göre sıralar. örneğin Comparable'i implente edip compareTo'yu override etmek.
    ```java
    TreeSet<Integer> numbers = new TreeSet<>();
    numbers.add(2);
    numbers.add(5);
    numbers.add(6);
    int first = numbers.first();// 2 ilk sayıyı döndürür 
    int last = numbers.last();//5 son sayıyı döndürür
   higher(element) ; // girilen elementten büyük en küçük sayı
   lower(element) ; // girilen elentten küçük eb büyük sayı
   numbers.pollFirst();// ilk elemanı siler
   numbers.pollLast(); // son elemanı siler
        ```
2. `List<E>` Listeler her elemanı bellekte kendine özgü bir alanda tutar verilere indexler
   üzerinden erişir. Verileri sıralı tutar ve mükerrer elamanlara izin verir.İsteğimiz sıraya eleman ekleyebilir ve
   çıkara biliriz.
    1. `ArrayList<E> ` Liste halindeki verileri dinamik diziler olarak yapar. Array'ye çevrilebilir. Boyutu default
       olarak 10dur ve eklendikçe artar.Bir eleman silindiğinde otomatik kaydırır. Esnek ancak maliyetlidir.
   ```java
   ArrayList<String> animals = new ArrayList<>();

    // add elements in the arraylist
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Cow");
    System.out.println("ArrayList: " + animals);

    // get the element from the arraylist
    String str = animals.get(1);

    ```
    2. `LinkedList<E>` Çift yönlü bağlı liste algoritmasını kullanır. her eleman kendinden önceki ve sonraki elemanı
       işaret eder.Silme ve araya eleman ekleme durumunda kaydırma işlemi yapmaz.Aynı zamanda kuyruk görevi görür
   ```java
   LinkedList<String> ccc = new LinkedList<>();
   addLast();
   removeFirst();
    ```
    3. `Vector<E>` ArrayList senkronize olmadığı için Vector sınıfına göre daha hızlıdır. Ancak vektör sınıfı ok işlem
       ortamında daha fazla veri güvenliği sağlar.
   ```java
   Vector<Integer> in = new Vector<>();  
   remove(); // ilk elemanı siler
   removeElementAt(5); // 5. sıradaki elemanı siler
    ```
   
3. `PriorityQueue<E>(,compare) ` linkedQueue den farklı olarak kuyruğa ekleme işlemini yaparken Comparator kullanır
       ve buna göre kuyruğu düzenler.
    ```java
    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
    pQueue.peek(); // ile sayıyı getirir.
    pQueue.pool(); // ile getirip siler

    ```
4. `Map<K,V>` Deponan değerler bir anahtara refere edilir ve öğreyi bulmak kolaylaşır.

    1. `HashMap<K,V>` Eşleme tablosuna eleman ekleme, çıkartma işlemlerinde ve anahtarı verilen elemanı tabloda bulma
       işlemlerinde oldukça etkilidir. Girilen sıraları garanti etmez
   ```java
    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    hm.put(1, "patika da");
    hm.put(2, "java spring");
    hm.put(3, "öğreniyorum"); // ekleme
    hm.get(1); // ile 1. sıradki elemanı getirir.
    ```
    2. `LinkedHashMap<K,V>` HashMap yapısından önemli farkı öğelerini çift yönlü bağ ile birbirlerine bağlamasıdır.
       Bağlı liste olduğu için, döngü sırası öğelerin bağlı listedeki konumlarıdır.
   ```java
        Map<String, Integer> map = new LinkedHashMap<>();

    ```
    4. `TreeMap<K,V>` TreeMap LinkedHashMap ten farkı Comperator ile sıralandırılabiliyor olmasıdır.
   ```java
        Map<String, Integer> map = new TreeMap<>();
    ```
       
