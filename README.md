# Java Eğitim Rehberi

1. [Java Hakkında Genel Bilgiler ve Gerekli Ortamların Kurulması](#java-hakkında-genel-bilgiler-ve-gerekli-ortamların-kurulması)
2. [Javada Proje Oluşturma](#javada-proje-oluşturma)
3. [Değişkenler, Veri Tipleri ve Temel Operatörler](#değişkenler-veri-tipleri-ve-temel-operatörler)
4. [Koşullu Durumlar ve Kod Blokları](#koşullu-durumlar-ve-kod-blokları)
5. [Döngüler ve Karar Yapıları](#döngüler-ve-karar-yapıları)
6. [Metodlar ve Metodlarda Overloading](#metodlar-ve-metodlarda-overloading)
7. [Sınıflar, Metodlar, Constructorlar ve Inheritance](#sınıflar-metodlar-constructorlar-ve-inheritance)
8. [Composition, Encapsulation ve Polymorphism Kavramları](#composition-encapsulation-ve-polymorphism-kavramları)
9. [Arrayler, ArrayListler, String Sınıfı ve LinkedListler](#arrayler-arraylistler-string-sınıfı-ve-linkedlistler)
10. [Interfaceler, Abstract Sınıflar, Inner Classlar](#interfaceler-abstract-sınıflar-inner-classlar)
11. [Genericler](#genericler)
12. [Java Naming Convention, Paketler ve Erişim Belirleyiciler](#java-naming-convention-paketler-ve-erişim-belirleyiciler)
13. [Java Collection Framework](#java-collection-framework)
14. [Exception Handling (İstisna Yakalama)](#exception-handling-istisna-yakalama)
15. [Java I / O](#java-i-o)
16. [Java Multithreading ve Concurrency](#java-multithreading-ve-concurrency)
17. [Swing ile Arayüz Geliştirme](#swing-ile-arayüz-geliştirme)
18. [Swing ile 2 Boyutlu Uzay Oyunu Geliştirme](#swing-ile-2-boyutlu-uzay-oyunu-geliştirme)
19. [Swing ile Çekiliş Uygulaması Geliştirme](#swing-ile-çekiliş-uygulaması-geliştirme)
20. [JDBC ve MySQL Veritabanı](#jdbc-ve-mysql-veritabanı)
21. [Swing ile Şirket Çalışanları Projesi Geliştirme](#swing-ile-şirket-çalışanları-projesi-geliştirme)

## Java Hakkında Genel Bilgiler ve Gerekli Ortamların Kurulması

Java, platformdan bağımsız, nesne yönelimli bir programlama dilidir. Java programları genellikle JDK (Java Development Kit) kullanılarak geliştirilir. Gerekli araçlar:
- **JDK:** [İndir](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **IDE:** Eclipse, IntelliJ IDEA, NetBeans

## Javada Proje Oluşturma

Yeni bir Java projesi oluştururken IDE kullanarak proje oluşturma adımlarını takip edebilirsiniz. Proje, genellikle "Java Project" olarak tanımlanır ve sınıflar ile metodlar eklenir.

## Değişkenler, Veri Tipleri ve Temel Operatörler

- **Değişkenler:** Verileri saklar. Örnek: `int age = 30;`
- **Veri Tipleri:** Temel veri tipleri (`int`, `double`, `char`, `boolean`), referans veri tipleri (`String`, `Arrays`, `Objects`).
- **Temel Operatörler:** Toplama (`+`), çıkarma (`-`), çarpma (`*`), bölme (`/`), modül (`%`).

## Koşullu Durumlar ve Kod Blokları

- **Koşullu Durumlar:** `if`, `else if`, `else`, `switch`
- **Kod Blokları:** `{}` ile kullanılır.

## Döngüler ve Karar Yapıları

- **Döngüler:** `for`, `while`, `do-while`
- **Karar Yapıları:** Koşul kontrolü ve akış yönlendirme işlemleri.

## Metodlar ve Metodlarda Overloading

- **Metodlar:** İşlevleri gerçekleştiren kod blokları. Örnek:
  ```java
  public int add(int a, int b) {
      return a + b;
  }
  ```
- **Overloading:** Aynı isimde farklı parametre listelerine sahip metodlar.

## Sınıflar, Metodlar, Constructorlar ve Inheritance

- **Sınıflar:** Nesne oluşturmak için kullanılan yapılar. Örnek:
  ```java
  public class Person {
      String name;
      int age;
  }
  ```
- **Constructorlar:** Sınıf örneği oluşturulurken çağrılan metodlar.
- **Inheritance:** Bir sınıfın başka bir sınıftan özellik ve metodları miras alması.

## Composition, Encapsulation ve Polymorphism Kavramları

- **Composition:** Bir sınıfın diğer bir sınıfın örneğini içermesi.
- **Encapsulation:** Verileri koruma ve erişimi sınırlama.
- **Polymorphism:** Aynı metodun farklı sınıflarda farklı davranışlar sergilemesi.

## Arrayler, ArrayListler, String Sınıfı ve LinkedListler

- **Arrayler:** Sabit boyutlu veri koleksiyonları.
- **ArrayList:** Dinamik boyutlu veri koleksiyonları.
- **String Sınıfı:** Metin manipülasyonu.
- **LinkedList:** Dinamik veri yapısı.

## Interfaceler, Abstract Sınıflar, Inner Classlar

- **Interfaceler:** Bir sınıfın uyması gereken metodları tanımlar.
- **Abstract Sınıflar:** Tamamlanmamış sınıflar, diğer sınıflar tarafından genişletilir.
- **Inner Classlar:** Bir sınıfın içinde tanımlanan sınıflar.

## Genericler

- **Genericler:** Tür güvenliğini artıran özelliklerdir. Örnek:
  ```java
  public class Box<T> {
      private T content;
      public void setContent(T content) { this.content = content; }
      public T getContent() { return content; }
  }
  ```

## Java Naming Convention, Paketler ve Erişim Belirleyiciler

- **Naming Convention:** Kodun okunabilirliğini artıran adlandırma kuralları.
- **Paketler:** Sınıfları ve diğer bileşenleri düzenler. Örnek:
  ```java
  package com.example;
  ```
- **Erişim Belirleyiciler:** `public`, `private`, `protected` gibi erişim kontrolü sağlar.

## Java Collection Framework

- **Collection Framework:** Koleksiyonlar üzerinde işlem yapmayı sağlar. İçerir: `List`, `Set`, `Map`, `Queue`, vb.

## Exception Handling (İstisna Yakalama)

- **Exception Handling:** Hataları kontrol etme ve ele alma. `try`, `catch`, `finally` blokları içerir.

## Java I / O

- **Java I/O:** Dosyalar ve akışlarla veri okuma ve yazma işlemleri. Örnek:
  ```java
  FileReader fr = new FileReader("file.txt");
  BufferedReader br = new BufferedReader(fr);
  ```

## Java Multithreading ve Concurrency

- **Multithreading:** Aynı anda birden fazla iş parçacığının çalışmasını sağlar.
- **Concurrency:** İş parçacıkları arasında koordinasyon sağlar.

## Swing ile Arayüz Geliştirme

- **Swing:** Java'nın GUI kütüphanesi. Örnek:
  ```java
  JFrame frame = new JFrame("My Frame");
  JButton button = new JButton("Click Me");
  frame.add(button);
  frame.setSize(300, 200);
  frame.setVisible(true);
  ```

## Swing ile 2 Boyutlu Uzay Oyunu Geliştirme

- **2D Oyun Geliştirme:** Swing kullanarak basit 2D oyunlar oluşturabilirsiniz.

## Swing ile Çekiliş Uygulaması Geliştirme

- **Çekiliş Uygulaması:** Swing kullanarak kullanıcı arayüzü oluşturabilir ve çekiliş uygulamaları geliştirebilirsiniz.

## JDBC ve MySQL Veritabanı

- **JDBC (Java Database Connectivity):** Java uygulamalarının veritabanlarıyla etkileşim kurmasını sağlar.
- **MySQL:** Popüler bir veritabanı yönetim sistemidir. JDBC ile MySQL'e bağlanabilir ve veri yönetimi gerçekleştirebilirsiniz.

## Swing ile Şirket Çalışanları Projesi Geliştirme

- **Proje Geliştirme:** Swing ile şirket çalışanlarını yöneten, listeleyen ve düzenleyen bir uygulama geliştirebilirsiniz.
