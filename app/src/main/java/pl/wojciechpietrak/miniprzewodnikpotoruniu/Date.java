package pl.wojciechpietrak.miniprzewodnikpotoruniu;

public class Date {

    private String name;
    private String description;
    private int resourceId;
    private String info;
    private static String prawaMiejskieIntro = String.valueOf(R.string.prawa_miejskie_intro);
    private static String prawaMiejskie = String.valueOf(R.string.prawa_miejskie);
    private static String hansa_intro = String.valueOf(R.string.hansa_intro);
    private static String hansa = String.valueOf(R.string.hansa);
//    private static String hansa_intro = String.valueOf(R.string.hansa_intro);
//    private static String hansa_intro = String.valueOf(R.string.hansa_intro);
//    private static String hansa_intro = String.valueOf(R.string.hansa_intro);
//    private static String hansa_intro = String.valueOf(R.string.hansa_intro);



    public static Date[] dates = {
            new Date("Toruń uzyskał prawa miejskie 28 grudnia 1233r. " ,prawaMiejskieIntro +" kiedy to Wielki Mistrz Zakonu " +
                    "Herman von Salza i jego namiestnik pruski mistrz krajowy Herman Balk " +
                    "wydali przywilej lokacyjny",
                    R.drawable.lokacja,
                    "Toruń początkowo lokowany był nieco na zachód przy przeprawie przez Wisłę w Starym Toruniu, gdzie krzyżacy zbudowali gród. " +
                            " Jednakże ze wzgledu na wylewy rzeki lokalizację zmieniono. "+
                            "\n" +
                            "Początkowo zabudowany został obszar dzisiejszej Kępy Bazarowej (któa była znacznie większa w tamtych czasach)" +
                            "oraz blokiem zabudowy między ul. Szeroką, Żeglarską i Łazienną wliczając w to plac wokół kościoła św. Jana. " +
                            "Początkowo Kępa Bazarowa była miejscem obronnym z biegiem lat stawała się miejscem handlowym, który połączony był drewnanym mostem ze starówką" +
                            "\n" +
                            "Miasto rozwijało się bardzo szybko, początowo główną osią była dzisiejsza ulica Kopernika, prowadząca w kierunku przeprawy " +
                            "w  Starym Toruniu. Z czasem postanowiono o poszerzeniu miasta w mury włączono m.in. kościół Franciszkanów" +
                            "Toruń przyciągał kupców ze Śląska, pobliskich ziem polskich, wreszcie z dalekiej Westfalii i Lubeki - " +
                            "ojczyzn miast hanzeatyckich i handlu bałtyckiego. Kilkanaście lat po lokacji zaplanowano Rynek " +
                            "który stał się odtąd centrum miasta. W 1264 r. założone zostało Nowe Miasto, które centrum rzemiosła toruńskiego."),
            new Date("przed 1280 r.","Toruń a właściwie Stare Miasto Toruń było członkiem Hanzy, co było niezwykłe zważywszy na brak dostępu do morza",
                    R.drawable.hanza,
                    "W XIII i XIV w. Toruń był jednym z największych w Europie ośrodków handlowych " +
                            "(wywożono towary leśne i miedź, przywożono śledzie, sól, korzenie, sukna) " +
                            "towar transportowny był z Węgier, Rusi i Litwy na Zachód. Toruń posiadał port na Wiśle" +
                            " , który przyjmował statki morskie. Swe apogeum miasto miasto przeżywało w końcu XIV w. " +
                            "mieszkało tu około 13 tys. mieszkańców co wydaje się niewielką liczbą lecz w tamtych czasach było " +
                            "to drugie największe miasto ziem polskich po królewskim Krakowie. "),
            new Date("1410r.","pierwszy wyraźny konflikt toruńsko-bydgoski",
                    R.drawable.konflikt,
                    "zapoczątkowny przez starostę bydgoskiego, który wydał zakaz pojawiania się torunian na " +
                            "jego terytorium. Co ciekawe ta decyzja zapoczątkowały nieustanne waśnie między miastami, " +
                            "trwające do dziś"),
            new Date("1 lutego 1411r,","Pierwszy pokój torunski",
                    R.drawable.pierwszy_pokoj,
                    "Traktat pokojowy zawarty został 1 lutego 1411r. na Kępie Bazarowej. " +
                            "Traktat regulował kwestie między Polską i Litwą a Krzyżakami, kończąc " +
                            "wielką wojnę z lat 1409-1411. Na jego mocy Toruń, po pięciomiesięcznej przynależności " +
                            "do Polski, przeszedł ponownie pod panowanie Krzyżaków, wraz z Ziemią Chełmińską. " +
                            "Obie strony postanowiły też, że kupcy obu państw mogą swobodnie i bez przeszkód, " +
                            "wg dawnych zwyczajów, używać dróg wodnych i lądowych.\n" +
                            "Traktat został sygnowany przez Władysława Jagiełłę i Witolda ze strony polskiej " +
                            "i litewskiej, a za strony Zakonu przez mistrza Zakonu Krzyżackiego, Heinricha von Plauen. " +

                            "Traktat nie doprowadził do trwałego pokoju juz w 1414 roku walki zostały wznowione."),
            new Date("19 października 1466","W Dworze Artusa zawarto drugi pokój toruński, kończący wojnę trzynastoletnią. Na mocy pokoju Polska odzyskała zachodnią część państwa krzyżackiego ",
                    R.drawable.drugi_pokoj,
                    "Z punktu widzenia Torunia zwycięstwo Polski w wojnie 13-letniej i II pokój toruński nie " +
                            "przyniosły oczekiwanej poprawy zamożności.\n" +
                            "Mieszczanie finansujący wojnę uważali, że zrzucenie zależności od Krzyżaków " +
                            "zapewni im lepsze warunki ekonomiczne, otworzy dostęp do rynków i terytoriów " +
                            "Królestwa Polskiego. " +
                            "Warty zauważenia fakt to jak ogromne kwoty wydawał Toruń wspierając króla polskiego. " +
                            "(szacowane przez historyków na prawie 200 tysięcy grzywien, tj. kwotę równą " +
                            "dochodom ówczesnego Krakowa w ciągu 80 lat, a Poznania w ciągu 270 lat), " +
                            "jednakże zmiana sytacji geopolitycznej sprawiła, iż Polacy powoli rezygnowali " +
                            "z pośrednictwa toruńskich kupców a swoje towary transportowali do " +
                            "Gdańska, który wtedy zaczął górować nad Toruniem. " +
                            "Nawet mimo nowych przywilejów otrzymanych od króla Kazimierza Jagiellończyka straty handlowe " +
                            "nie zostały wtrównane " ),
            new Date("1772","pierwszy rozbiór Polski, spowodował odcięcie pozostający w Królestwie Polskim Toruń " +
                    "od jego dochodowych dóbr ziemskich czego konsekwencją była utrata połączeń komunikacyjno-handlowych. ",
                    R.drawable.pierwszy_rozbior,
                    "ciekawostę tamtego okresu stanowi list francuskiego filozofa Woltera do króla pruskiego Fryderyka II " +
                            "który uzasadniał konieczność " +
                            "przyłączenia Torunia i Gdańska do Prus - „ponieważ w Toruniu Kopernik odkrył prawdziwy system " +
                            "świata, a astronom Heweliusz pochodził z Gdańska, więc konsekwentnie Toruń i Gdańsk muszą należeć " +
                            "do Prus.”\n" +
                            "Jednakże sprawy potoczyły się inaczej. Dodatkowo utrata szlaków handlowych spowodowała, iż Toruń tracił na znaczeniu " +
                            "względem Bydgoszczy, która dodatkowo była wspierana przez króla Pruskiego. "),

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



