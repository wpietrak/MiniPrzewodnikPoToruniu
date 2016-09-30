package pl.wojciechpietrak.miniprzewodnikpotoruniu;

public class Date {

    private String name;
    private String description;
    private int resourceId;
    private String info;

    public static Date[] dates = {
            new Date("28 grudnia 1233r.", "Wielki Mistrz Zakonu Herman von Salza i jego namiestnik pruski mistrz krajowy Herman Balk wydali przywilej lokacyjny, na mocy którego owy gród - Toruń otrzymał prawa miejskie (prawo chełmińskie)",
                    R.drawable.lokacja,
                    "Miasto zostało powołane do życia 28 grudnia 1233 r. Toruń był początkowo założony przy przeprawie przez Wisłę - w Starym Toruniu. Tam Krzyżacy zbudowali swój pierwszy gród w ziemi chełmińskiej - jak głosi legenda - na rozłożystym dębie, a następnie lokowali miasto, które jednak na skutek nękających osadników wylewów rzeki wkrótce, bo w 1236 r., przeniesiono na obecne miejsce.\n" +
                            "\n" +
                            "Początki osadnictwa na toruńskiej starówce wiążą się z rejonem tzw. \"Wyspy\", blokiem zabudowy między ul. Szeroką, Żeglarską i Łazienną, wraz z placem wokół kościoła św. Jana. \"Wyspa\" była może miejscem obronnym, otoczonym wałem, za którym kryli się w razie niebezpieczeństwa pierwsi osadnicy. Potem, kiedy powstały wały, a następnie mury obronne sama \"wyspa\" straciła sens, teren wyrównano i pobudowano na nim domy, w których ze względu na bliskość Rynku - mieszkali chętnie najbogatsi kupcy i rajcy.\n" +
                            "\n" +
                            "Miasto rozwijało się bardzo szybko, ale etapami. Najszybciej rozplanowano ulice w południowej części Starego Miasta - wokół \"wyspy\". Głównym szlakiem ulicznym była wówczas dzisiejsza ul. Kopernika (wówczas św. Anny), która prowadziła w kierunku przeprawy w Starym Toruniu. Wkrótce jednak okazało się, że założenie miasta w tym punkcie było inwestycją tak udaną, że trzeba je było natychmiast poszerzyć, by zmieścić wszystkich kupców nadciągających ze Śląska, pobliskich ziem polskich, wreszcie z dalekiej Westfalii i Lubeki - ojczyzn miast hanzeatyckich i handlu bałtyckiego. Po 1251 r. rozplanowano więc Rynek, który stał się odtąd centrum miasta, murami obwiedziono pozostający wcześniej poza ich obrębem klasztor i kościół franciszkanów. Już wkrótce, bo w 1264 r. założony został kolejny ośrodek miejski - Nowe Miasto. W przeciwieństwie do Starego, gdzie dominowali kupcy, a z rzemiosł najbogatsi - piwowarzy, piekarze i rzeźnicy, Nowe Miasto zostało założone jako centrum rzemiosła toruńskiego."),
            new Date("przed 1280 r.","Stare Miasto Toruń było członkiem Hanzy gdzie w tutejszym Ratuszu Staromiejskim mieściło się archiwum Hanzy kwartału pruskiego",
                    R.drawable.hanza,
                    "W XIII i XIV w. Toruń był jednym z największych w Europie ośrodków handlowych (wywożono towary leśne i miedź, przywożono śledzie, sól, korzenie, sukna) przy szlakach handlowych z Węgier, Rusi i Litwy na Zachód, głównie do Flandrii, Westfalii i Śląska. Toruński port wiślany przyjmował statki morskie. W końcu XIV w. miasto przeżywało swój największy rozkwit, zamieszkiwało około 13 tys. mieszkańców i po królewskim Krakowie było największym miastem ziem polskich. Było jedynym pośrednikiem w handlu między Polską a Europą Zachodnią, wielkim ośrodkiem sztuki artystycznej i rzemiosła"),
            new Date("1410r.","pierwszy wyraźny konflikt toruńsko-bydgoski",
                    R.drawable.konflikt,
                    "wywołany wydanym przez starostę bydgoskiego zakazem pojawiania się torunian na jego terytorium, rozpoczął nieustanne waśnie między miastami, trwające do dziś"),
            new Date("1 lutego 1411r,","Pierwszy pokój torunski",
                    R.drawable.pierwszy_pokoj,
                    "Traktat pokojowy zawarty 1. lutego 1411 roku na wiślanej wyspie Kępa Bazarowa w Toruniu, między Polską i Litwą a Krzyżakami, kończący tzw. wielką wojnę z lat 1409-1411. Ustalono m.in., że ziemie, miasta i zamki zdobyte przez obie strony wrócą pod poprzednią władzę. Zakon krzyżacki zrezygnował ze Żmudzi na okres życia Władysława Jagiełły i Witolda, Mazowsze odzyskało Ziemię Dobrzyńską. Toruń, po pięciomiesięcznej przynależności do Polski, na mocy traktatu przeszedł ponownie pod panowanie Krzyżaków, podobnie jak cała Ziemia Chełmińska. Obie strony postanowiły też, że kupcy obu państw mogą swobodnie i bez przeszkód, wg dawnych zwyczajów, używać dróg wodnych i lądowych.\n" +
                            "Uroczystego zaprzysiężenia i opieczętowania traktatu dokonał Władysław Jagiełło i Witold ze strony polskiej i litewskiej, a następnie wielki mistrz Zakonu Krzyżackiego, Heinrich von Plauen. Do wymiany w pełni opieczętowanych dokumentów pokoju doszło ostatecznie w maju 1411 roku w Złotorii.\n" +
                            "Traktat nie doprowadził do trwałego pokoju między państwem krzyżackim a królestwem polsko-litewskim. Już w 1414 roku rozgorzały walki."),
            new Date("19 października 1466","W Dworze Artusa zawarto drugi pokój toruński, kończący wojnę trzynastoletnią. Na mocy pokoju Polska odzyskała zachodnią część państwa krzyżackiego ",
                    R.drawable.drugi_pokoj,
                    "Z punktu widzenia Torunia zwycięstwo Polski w wojnie 13-letniej i II pokój toruński nie przyniosły na dłuższą metę polepszenia sytuacji gospodarczej tego miasta.\n" +
                            "Mieszczanie finansujący wojnę uważali, że zrzucenie zależności od Krzyżaków zapewni im lepsze warunki ekonomiczne, otworzy dostęp do rynków i terytoriów Królestwa Polskiego, zapewni większą samodzielność polityczną. Toruń wspierając króla polskiego wydał na wojnę bajońskie sumy (szacowane przez historyków na prawie 200 tysięcy grzywien, tj. kwotę równą dochodom ówczesnego Krakowa w ciągu 80 lat, a Poznania w ciągu 270 lat), ale zmieniona w wyniku postanowień pokoju sytuacja geopolityczna spowodowała, że oczekiwania torunian nie spełniły się - Polakom bardziej zaczęło się opłacać zrezygnować z pośrednictwa toruńskich kupców i wieźć swoje towary bezpośrednio do Gdańska, który wtedy zaczął górować nad Toruniem. Wprawdzie Toruń otrzymał - już w 1457 r. - od króla Kazimierza Jagiellończyka ważne nowe przywileje, w tym handlowe, to nie zrównoważyły one strat wynikających ze słabnącego handlu toruńskiego i rosnącego w siłę handlu gdańskiego. Podejmowano wprawdzie działania mające utrzymanie pozycji handlowej Torunia, jak np. prawo składu, przymus drogowy, rozbudowane z czasem wielkie międzynarodowe jarmarki, jednak nie zdołały one dorównać do osiągnięć z handlu w okresie XIII-XIV w.\n" +
                            "Nieporównywalny natomiast był wzrost znaczenia politycznego Torunia na arenie ogólnopaństwowej, a zwłaszcza w Prusach Królewskich"),
            new Date("1772","pierwszy rozbiór Polski, którego granica oddzieliła pozostający w Królestwie Polskim Toruń od jego dochodowych dóbr ziemskich - patrymonium; utrata połączeń komunikacyjno-handlowych, utrata wiodącej roli w regionie na rzecz Bydgoszczy - odtąd silnie rozwijanej przez pruskiego Fryderyka II",
                    R.drawable.pierwszy_rozbior,
                    "1772 r. francuski filozof Wolter w liście do króla pruskiego Fryderyka II tak uzasadniał konieczność przyłączenia Torunia i Gdańska do Prus - „ponieważ w Toruniu Kopernik odkrył prawdziwy system świata, a astronom Heweliusz pochodził z Gdańska, więc konsekwentnie Toruń i Gdańsk muszą należeć do Prus.”\n" +
                            "- zgodnie z wcześniejszą koncepcją ambasadora rosyjskiego dot. ustanowienia Torunia wolnym miastem, powołano specjalną deputację, która przedstawiła postulaty dotyczące prawnopaństwowego statusu Torunia w Rzeczypospolitej, które później miały być uwzględnione w układzie rozbiorowym"),

    };

    public Date(String name, String description, int resourceId, String info) {
        this.resourceId = resourceId;
        this.name = name;
        this.description = description;
        this.info = info;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getInfo() {
        return info;
    }


    @Override
    public String toString() {
        return this.name;
    }
}



