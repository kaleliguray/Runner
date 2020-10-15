# Runner
AverageRun

1) https://start.spring.io adresi üzerinde maven, java, spring boot sürümünü seçtim. Daha sonra project metadataları yazıp, dependencies içinde kullanmak istediklerimi seçip dosyayı indirdim.

Dependencies = -Web(web projesi ve tomcat server)
			   -DevTools(otomatik güncelleme)
			   -JPA(hibernate-jdbc)
			   -SQL(Database)

2) Eclips IDE üzerinden import-exist maven project ile dosyayı açtım

3) pom.xml de güncellemek ya da yapmak istediğim ayarlar varsa onları düzenleyip update maven yatptım

4)application.properties içerisinde gerekli olan database bağlantı ayarlarını yaptım. İstenirse port,hibernate vb ayarlarda yapılabilir

5) MVC framework ve RestFull için gerekli olan paketlerimi ayarladım. Bunlar;
	
	- Entity (model) database verimiz,tablomuz
	- Dal (data access layer) için class ve interface yaratım. İçlerinde CRUD işlemi için gerekli olan metotları, implementasyon ve annotationları yazdım.
	- Businness Logic (service) katmanını oluşturdum. İçerisinde class ve interface yazdım, annotationlar ile düzenledim.
	-Controller katmanı için classı olşuturup; içerisinde servlet, annotations ve metotları yazdım.

6) sql kısmında da bir database oluşturdum. (application.properties içerisinde bunu göstererek bağlandım)

7) springboot içerisinde tomcat server içerdiği için direkt olarak başlatabildim. Buna ek olarak Get/Post/Put/Delete requestlerini yapıp json dönen datayı görmek için postmanden yararlandım












































