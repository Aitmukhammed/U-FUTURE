Ответы на теоретические вопросы:

1) Инкапсуляция - позволяет скрывать внутренние детали объекта. К примеру у нас есть класс который содержит приватные поля и публичные методы для доступа к этим полям. Это позволяет скрывать данные и предоставляет только необходимые методы для их изменения и получения.
К примеру у меня есть класс Person и него есть свойства и методы указанные модификатором доступа. Если один из этих свойств или методов указана как private оно не будет доступна для других классов и для них мы создаем методы геттеры и сеттеры чтобы обращаться к ним и получать их значение или же устанавливать

    Наследование - позволяет создавать новые классы на основе уже существующих. Это позволяет повторно использовать код и упрощает создание иерархий классов. Все это достигается с помощью ключевого слова extends. Если например у нас есть класс Person  и у него есть метод run() то с класса PersonProgrammer можем наследовать класс Person и можем использовать преобразовать этот метод.
   
     Полиморфизм - это перегрузка методов это значит что мы можем создавать методы с одним и тем же именем но с разными параметрами и эти же методы можем унаследовать для другого класса и преобразовать его.

4) В ArrayList лежит идея = динамического массива a LinkedList это как список. В ArrayList элементы хранятся в динамическом массиве, тогда как LinkedList используют двусвязный список где каждый элемент хранить в себе ссылку на предыдущий и на следующий элемент.

3)  Garbage Collection - это сборка мусора. Сборка мусора в Java автоматически выделяет и освобождает память. В Java объекты создаются и хранятся в куче = heap и могут получаться так что эти объекты со временем больше не понадобятся. И сборщик мусора, оценив кучу памяти, определит, какие объекты используются, а какие нет, и удалит неиспользуемые объекты. 

4) ConcurrentHashMap - это вид коллекции в Java. Он похоже на HashMap где тоже данные также хранятся как = ключ-значение. Он нескольким потокам позволяет одновременно добавлять, удалять и изменять данные безопасно. Отличие от HashMap в том что ConcurrentHashMap = потокобезопасной, у него встроен поддержка многопоточности. 

5) JVM - это программа который нам нужен для выполнения и запуска приложения. Это нам позволяет запускать программы, написанные на Java, на любых устройствах или операционных системах. Так реализуется принцип Java  = написал один раз, запускай везде. Запускам приложения -> далее наш исходный код обрабатываетя компиляторjм javac -> javac преобразует на код в байт код -> байт код передается на JVM(понимает только байт код) который запускает его на всех операционках где он установлен. 

   JRE это среда выполнения Java = набор программного обеспечения, необходимый для исполнения java-приложений, который обязательно включает в себя реализацию JVM и библиотеки Java-классов.

   JDK это набор программных инструментов, необходимых для разработки Java-приложений. При скачивании JDK автоматически загружается и JRE (а значит и JVM тоже).  В JDK помимо JRE также содержится ряд инструментов разработки = компиляторы, отладчики и т.д.
