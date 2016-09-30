package pl.wojciechpietrak.miniprzewodnikpotoruniu;

public class Monument {


    private String monName;
    private String monDescription;
    private int monResourceId;
    private String monInfo;
    private double monLon;
    private double monLat;


    public static Monument[] dates = {
            new Monument("Krzywa Wieża", "średniowieczna baszta miejska, która swą nazwę zawdzięcza znacznemu odchyleniu od pionu (1,46 m)",
                    R.drawable.krzywa_wieza,
                    "Wybudowana została w 2. poł. XIII wieku jako prosta, 15-metrowa baszta obronna wtopiona w system murów obronnych i ustawiona na fundamentach czterościennych, lecz z niedociągniętą do końca ścianą od strony miasta. Przez otwory w jej bocznych ścianach przebiegał ganek strażniczy, łączący ją z murami obronnymi, zaś brak ściany wewnętrznej ułatwiał wciąganie amunicji. Już w średniowieczu z piaszczysto-gliniastego podłoża, na którym baszta została ustawiona, pod wpływem jej ciężaru osunęły się piaski, powodując równocześnie pochylanie się wieży do momentu, aż oparła się ona na gruncie bardziej trwałym[2].\n" +
                            "\n" +
                            "Odchylenie zmierzone na przełomie 2006 i 2007 roku wynosiło 5°13'15\". Odchylenie szczytu wieży od pionu wyniosło wówczas 146,171 cm.\n" +
                            "\n" +
                            "W XVIII wieku wieża przestała pełnić funkcje obronne. Podciągnięto wówczas do końca czwartą ścianę, wyrównano stropy i przeznaczono ją na karcer dla kobiet. W XIX wieku basztę przebudowano na kuźnię i mieszkanie dla rusznikarza, a w drugiej połowie tego stulecia całkowicie przeznaczono ją na potrzeby mieszkalne. Zastąpiono wówczas gotycki czterospadowy dach nowym – pulpitowym.\n" +
                            "\n" +
                            "W latach 60. XX wieku mieściło się w niej kilka stowarzyszeń kulturalnych. W latach 70. i 80. - oddział Polskiego Stowarzyszenia Jazzowego oraz Kujawsko-Pomorskie Towarzystwo Kulturalne. Wieża mieściła też kawiarnię i kiosk z pamiątkami. Obecnie w wieży mieści się Toruńska Agenda Kulturalna oraz Galeria Przy dasię Fundacji Feniks[3]. Wieża stanowi dziś jeden z najbardziej charakterystycznych akcentów Starego Miasta. ",
                    18.602155, 53.008440),
            new Monument("Ratusz", "gotycki budynek powstały etapami w ciągu XIII i XIV w., przebudowany w XVII w. i odbudowany po zniszczeniach w XVIII w., jeden z najznakomitszych przykładów średniowiecznej architektury mieszczańskiej w środkowej Europie",
                    R.drawable.ratusz,
                    "Przez wieki w Ratuszu, tym najbardziej znanym i reprezentacyjnym świeckim gmachu Torunia, koncentrował się handel oraz życie publiczne i polityczne miasta. Ratusz był głównym ośrodkiem sądowym i siedzibą rady miejskiej. Podejmowano tu władców: wielkich mistrzów zakonu krzyżackiego a także królów Polski, którym wówczas gmach ten służył za czasową rezydencję, stąd jedna z sal pierwszego piętra nosi nazwę Królewskiej. To właśnie w niej zmarł król Jan Olbracht (1501 r.). W Ratuszu miały miejsce także inne ważne wydarzenia historyczne: w 1454 r. wysłannicy króla polskiego odebrali przysięgę wierności od przedstawicieli stanów ziem pruskich, a w 1645 r., z inicjatywy króla Władysława IV, odbyła się „braterska rozmowa” pomiędzy katolikami i protestantami (Colloquium Charitativum). Obradowały tu sejmiki pruskie, a nawet sejmy polskie w latach 1520, 1576 i 1626 oraz sądy ziemskie chełmińskie.\n" +
                    "\n" +
                    "Obecny kształt Ratusza Staromiejskiego jest wynikiem stopniowej ewolucji zabudowy śródrynkowej. W roku 1259 powstał dom kupiecki (od strony zachodniej), a w 1274 równolegle do domu kupieckiego zbudowano ławy chlebowe (od strony wschodniej). W narożniku południowo-wschodnim powstała wieża (o połowę niższa od obecnej), połączona z budynkiem i ze ścianą parawanową, łączącą ją z kolei z domem kupieckim. Za ścianą usytuowano właściwy ratusz – siedzibę rady. Następnie od północy powstał dom, a raczej zapewniający jawność rozpraw, podcień sądowy, a przy północno-zachodnim narożniku, budynek wagi. W 1343 r. obudowano istniejące gmachy od zewnątrz budami kramarskimi, następnie podwyższono wieżę, zaopatrzoną w jedyny wówczas zegar w mieście. ",
                    18.604535,  53.010620),
            new Monument("Bazylika św. Janów", "gotycki, ceglany kościół, dawna fara toruńskiego Starego Miasta",
                    R.drawable.bazylika_janow,
                    "W okresie średniowiecza miejsce wyboru władz miasta i pochówku patrycjatu. Miejsce najważniejszych uroczystości miejskich, w tym związanych z wizytami królów polskich w Toruniu. Do schyłku XX w. tradycyjnie określana była jako kościół Świętego Jana, od 1935 ma tytuł bazyliki mniejszej, od 1992 jest katedrą diecezji toruńskiej. Świątynię budowano w kilku etapach od II połowy XIII wieku, w rezultacie powstał kościół o niskim prezbiterium kontrastującym z masywnym trójnawowym halowym korpusie nawowym z niższymi kaplicami i potężną wieżą zachodnią. Wewnątrz zachował szereg cennych dzieł sztuki średniowiecznej i nowożytnej, m.in. zespół malowideł ściennych, krucyfiks mistyczny, nagrobek rodziny von Soest, kompozycja rzeźbiarska ukazująca świętą Marię Magdalenę z aniołami, ołtarz Świętego Wolfganga. Część wystroju zaginęła (m.in. figura Pięknej Madonny, zastąpiona kopią z 1956 roku) lub została przeniesiona do muzeów (m.in. obrazy Cierniem Koronowanie i Zdjęcie z Krzyża). W kościele pochowane jest serca króla Jana Olbrachta, znajdują się także pamiątki związane z Mikołajem Kopernikiem - chrzcielnica, epitafium jemu poświęcone i XVIII-wieczny pomnik. Na wieży kościoła znajduje się drugi co do wielkości średniowieczny dzwon w Polsce, Tuba Dei, odlany w 1500 r.",
                    18.606209, 53.009415),
            new Monument("Kościół św Ducha", " zabytkowa świątynia katolicka w jurysdykcji zakonu jezuitów w Toruniu.\n" +
                    "\n" +
                    "Do 1945 budynek służył jako kościół ewangelicko-unijny, po czym przeszedł w ręce zakonu jezuitów",
                    R.drawable.kosciol_ducha,
                    "Potrzeba budowy nowej świątyni dla staromiejskiej gminy ewangelickiej w Toruniu zrodziła się w wyniku następstw rozruchów religijnych między katolikami a protestantami, jakie wybuchły w mieście w lipcu 1724 (tumult toruński). W ramach sankcji karnych gmina ewangelicka pozbawiona została swej głównej dotąd świątyni – dawnego kościoła franciszkańskiego pw. Najświętszej Marii Panny i nabożeństwa odprawiano w ciasnej sali Dworu Artusa.\n" +
                            "\n" +
                            "Po zebraniu funduszy w kraju i zagranicą, w tym na terenie Niemiec, w Anglii i w Danii, dokąd w tym celu udał się osobiście senior duchowieństwa toruńskiego ks. Krzysztof Andrzej Henryk Geret Rada Miasta rozpisała konkurs na opracowanie projektu nowej świątyni, w wyniku którego w 1741 wybrano ostatecznie pracę drezdeńskiego architekta Andreasa Adama zwanego Bähr. Prace budowlane rozpoczęto dwa lata później, szybko jednak zostały one przerwane w wyniku niesprzyjającej sytuacji polityczno-społecznej, budowa świątyni poczęła bowiem budzić sprzeciw w szerszych kołach radykalnego obozu katolickiego – katolicy traktowali kwestię powstania nowej świątyni luterańskiej jako złamanie sankcji karnych nałożonych na Toruń po tumulcie. Tym sposobem król August III wydał zakaz budowy kościoła, bojąc się wybuchu nowych starć na tle religijnym. W 1754 królewską decyzją zezwolono na wykorzystanie istniejących już fundamentów świątyni, w celu wzniesienia domu modlitwy. Budynek ten – by nie drażnić katolików – nie mógł jednak przypominać kościoła, a jedynie skromną kamienicę mieszczańską. Jako że twórca poprzedniej koncepcji architektonicznej świątyni już nie żył, powstała potrzeba znalezienia nowego architekta. Został nim młody, wówczas 26-letni, budowniczy – pochodzący z Torunia Efraim Schroeger. Opracowany przez niego projekt zatwierdzono w 1755, już 18 lipca 1756 nastąpiło uroczyste poświęcenie kościoła. Pracami budowlanymi kierował August Konrad Hoffmann. Ponieważ w międzyczasie wyczerpały się fundusze, przeprowadzono kwestę w Gdańsku, Elblągu, Malborku i w Grudziądzu, a ponieważ nie wystarczała, na dwuletnią kwestę zagraniczną udał się Samuel Luter Geret. Od 1817 r., po wprowadzeniu unii kościelnej w Prusach, był to Ewangelicki Kościół Unii Staropruskiej.",
                    18.603190, 53.010179),
            new Monument("Ruiny Zamku Krzyżackiego", "najwcześniejszy zamek krzyżacki na ziemi chełmińskiej, zbudowany na planie podkowy.",
                    R.drawable.zamek_krzyzacki,
                    "Toruński zamek należał do najstarszych budowli tego typu wzniesionych przez Krzyżaków na prawym brzegu Wisły. Zaczęto budować go około połowy XIII wieku. Wykorzystano w tym celu umocnienia starszego, wcześniej zniszczonego grodu, co miało wpływ na nietypowy kształt toruńskiej warowni, przypominający podkowę.\n" +
                            "\n" +
                            "Zamek, początkowo drewniany, później wznoszony z kamienia i cegły, był rozbudowywany aż do połowy XV wieku. Wraz z przedzamczem i znajdującymi się na nim budynkami gospodarczymi zajmował przestrzeń między Starym i Nowym Miastem Toruniem.\n" +
                            "\n" +
                            "Leżąc w pobliżu polsko-krzyżackiej granicy, toruński zamek miał duże znaczenie strategiczne i związane z tym silne fortyfikacje. Za wysokim murem głównego zamku znajdował się kilkupiętrowy budynek z kaplicą, refektarzem i dormitorium, w którym mieszkali krzyżaccy rycerze. Podziemia tego gmachu wykorzystywane były jako magazyny żywności, niezbędnej w razie oblężenia. Pośrodku dziedzińca stała wysoka, wolnostojąca wieża wykorzystywana jako miejsce ostatniej obrony, ale także jako punkt obserwacyjny, z którego ogniem lub dymem można było dać sygnał o zbliżającym się niebezpieczeństwie. Wodę dostarczała zamkowa studnia. W obawie przed jej zanieczyszczeniem zbudowano Gdanisko - umiejscowioną poza murami wysoką wieżę, która używana była jako toaleta i baszta broniąca zamkowych bram.",
                    18.610527, 53.009326),
            new Monument("Brama Mostowa", "jedna z 3 zachowanych bram miejskich Torunia od strony Wisły, znajdująca się na zamknięciu ulicy Mostowej. Jej nazwa wiąże się z tym, że prowadziła do drewnianego mostu przez Wisłę, zbudowanego w końcu XV w. i istniejącego do XIX w.",
                    R.drawable.brama_mostowa,
                    "Brama została zbudowana w 1432 roku [1] przez budowniczego miejskiego Hansa Gotlanda na miejscu wcześniejszej. Przy przebudowie w latach 50. XIX w. wprowadzono m.in. strop przeciwbombowy o grubości 1,5 m i zmniejszono otwory strzelnicze od strony Wisły, umieszczając w niej jedno działo[2]. W latach 70. Bramę Mostową wybrano na centrum tyczenia pierścienia twierdzy (punkt w stosunku do którego wyznaczano położenie poszczególnych dzieł twierdzy)[3].\n" +
                            "\n" +
                            "Jest to dwupiętrowy budynek na planie prostokąta z zaokrąglonymi narożami, zbudowany z cegły, od strony miasta otynkowany. Na parterze znajduje się ostrołukowy przejazd, od strony Wisły umieszczony w wysokiej ostrołukowej wnęce. Elewacja od strony miasta dekorowana jest trzema ostrołukowymi blendami. Brama jest zwieńczona krenelażem, poniżej którego znajduje się fryz z malarską dekoracją maswerkową.\n" +
                            "\n" +
                            "Obecnie budynek pełni funkcję biura miejskiego konserwatora zabytków.",
                    18.363258, 53.003089),
            new Monument("Brama Klasztorna", " jedna z trzech bram średniowiecznego Torunia, jakie przetrwały do dnia dzisiejszego.",
                    R.drawable.brama_klasztorna,
                    "Brama została wzniesiona w stylu flandryjskiego gotyku, charakteryzującym się masywną konstrukcją. Ze względu na swoją przysadzistość Brama Klasztorna przypomina inną, nieistniejącą już, bramę Starego Miasta – Bramę Paulińską. Ukończenie budowy Bramy Mniszek datuje się na 1. połowę XIV wieku. Rozwój techniki wojennej, przede wszystkim upowszechnienie się broni palnej, wymógł nadbudowę bramy, której dokonano około roku 1420.\n" +
                            "\n" +
                            "W ostrołukowej wnęce znajdującej się po zewnętrznej stronie bramy mieściła się opuszczana brona. Kolejną przeszkodą był tak zwany kaszownik, czyli otwór znajdujący się w stropie prześwitu bramy, z którego obrońcy wylewali na ewentualnego napastnika między innymi gorącą kaszę, czy olej. Kolejnym elementem były właściwe wrota, które w razie potrzeby mogły być wsparte od strony miasta dodatkowymi belkami. Belki te unieruchamiano poprzez zablokowanie ich w specjalnie przygotowanych otworach w murze bramy.\n" +
                            "\n" +
                            "W XIX wieku, pozbawiona już właściwie funkcji obronnych, brama została przebudowana i odtąd jej pomieszczenia przeznaczone były na cele mieszkalne.\n" +
                            "\n" +
                            "Nazwa bramy pochodzi od znajdującego się tuż poza murami miejskimi klasztoru sióstr Benedyktynek, przy którym powstał szpital i kościół. Kościół ten nosił wezwanie Świętego Ducha i istniał do XVII wieku. To właśnie od niego swoją zamienną nazwę wzięła zarówno brama, jak i cała ulica Ducha Świętego. Pochodzenie nazwy ulicy wiąże się nieraz mylnie ze współczesnym kościołem o tym samym wezwaniu, znajdującym się na drugim końcu ulicy, który jednak został wzniesiony w 1756 roku jako zbór luterański pw. Świętego Krzyża.\n" +
                            "\n" +
                            "Od października 1943 pod Bramą znajduje się schron przeciwlotniczy na 100 osób (wybudowany prawdopodobnie dla pracowników portu lub gazowni), obecnie udostępniony do zwiedzania[1].",
                    18.603624, 53.008312),
            new Monument("Brama Żeglarska", "jedna z ośmiu bram toruńskiego Starego Miasta",
                    R.drawable.brama_zeglarska,
                    "Brama Żeglarska jest jedną z trzech zachowanych bram staromiejskich i jednocześnie jedną z czterech pierwotnie znajdujących się w nadwiślańskim fragmencie murów miejskich. Pozostałe to bramy: Klasztorna, Łazienna i Mostowa.\n" +
                            "\n" +
                            "Budowę bramy prowadzącej na nabrzeże portowe rozpoczęto prawdopodobnie jeszcze w końcu XIII wieku[1]; ukończono natomiast w połowie wieku XIV[1]. Brama została zbudowana na planie prostokąta z czerwonej cegły. Obecnie, w murze bezpośrednio przylegającym do bramy, po obu jej stronach, znajdują się furty dla pieszych.\n" +
                            "\n" +
                            "Początkowo były to najważniejsze ze wszystkich wrót miasta. To tu rozpoczynała się toruńska Via Regia (Droga Królewska), która prowadziła reprezentacyjną ulicą Żeglarską, obok fary śś. Janów, wschodnią pierzeją Rynku Staromiejskiego (obok ratusza Starego Miasta), ulicą Chełmińską aż do Bramy Chełmińskiej[2]. To przed Bramą Żeglarską burmistrzowie i rada miejska witali królów i najznakomitszych gości[1].\n" +
                            "\n" +
                            "Znaczenie obronne brama utraciła po zdobyciu miasta przez wojska szwedzkie Karola XII w 1703 roku[3].\n" +
                            "\n" +
                            "Początkowo podobna do innych bram nadwiślańskich (Łaziennej i pierwotnej Mostowej), Żeglarska była kilkakrotnie przebudowywana. Skutkiem tych prac była niemal całkowita zmiana charakteru bramy. Jeszcze pod koniec XVIII wieku Brama Żeglarska mieściła więzienie, później zaadaptowane na pomieszczenia mieszkalne[3]. W 1820 roku[4] miała miejsce najpoważniejsza przeróbka. Wówczas to część bramy rozebrano, a pozostawiono pozbawione wnętrz wrota[1]. To również w XIX wieku bramę nadbudowano o nowy hełm",
                    18.606269, 53.008201),
            new Monument("Kościół św Jakuba", "dawna fara Nowego Miasta Torunia, położona jest przy wschodnim narożniku Rynku Nowomiejskiego",
                    R.drawable.kosciol_jakuba,
                    "Świątynię wzniesiono od roku 1309 do XV stulecia. Wpierw otrzymała prezbiterium, a następnie korpus nawowy z wieżą zachodnią. Jeszcze w XIV wieku farą zaczęły zarządzać cysterki, potem benedyktynki. W latach 1557-1667 fara należała do gminy ewangelickiej, następnie odzyskały go benedyktynki, które do XIX wieku zarządzały świątynią. Odtąd do dnia obecnego kościół parafialny.\n" +
                            "\n" +
                            "Ze względu na charakterystyczną bryłę, bogactwo detalu architektonicznego i wysublimowany układ przestrzenny wnętrza kościół należy do najważniejszych przykładów ceglanej architektury basenu Morza Bałtyckiego. Wewnątrz zachował się bardzo cenny wystrój wnętrza - liczne malowidła ścienne z XIV-XV wieku, XIV-wieczny krucyfiks, tzw. mistyczny, tzw. Czarny Krucyfiks z XV wieku, figura Matki Boskiej z początku XVI wieku, a ponadto późnogotycki obraz - Pasja Toruńska. Spośród zabytków nowożytnych wyróżniają się: ołtarz główny, zespół ołtarzy bocznych z cennymi obrazami, manierystyczna chrzcielnica",
                    18.612607, 53.011818),
            new Monument("Kościół NMP", "Jedna z trzech zachowanych gotyckich świątyń w zespole staromiejskim Torunia",
                    R.drawable.kosciol_nmp,
                    "pierwotnie franciszkański, w latach 1557-1724 w rękach protestantów, w latach 1724-1821 bernardynów, od 1830 parafialny. Jedna z trzech zachowanych gotyckich świątyń w zespole staromiejskim Torunia. Wznosi się na Starym Mieście, w zachodniej części północnego bloku przyrynkowego ograniczonego ulicami Panny Marii, Piekary i Franciszkańską. Powszechnie zwany kościołem Marii Panny, niekiedy Mariackim. W średniowieczu być może nosił wezwanie Narodzenia NMP (co jest kwestionowane), w okresie bernardyńskim - Zwiastowania NMP.",
                    18.602211, 53.010991),
            new Monument("Mury obronne", "zespół średniowiecznych obwarowań Torunia, na które składają się mury odrębnych miast: Starego Miasta Torunia (prawa miejskie 1233 r.), Nowego Miasta Torunia (1264 r.)",
                    R.drawable.mury_obronne,
                    "Toruń już w pierwszej połowie XIII posiadał umocnienia, jak powszechnie przyjmuje się w formie drewniano-ziemnych wałów, gdyż oparł się najazdowi Świętopełka w 1242 r. Ceglane mury Starego Miasta zaczęto budować około połowy XIII w. - zachowany odcinek murów z tego czasu wzdłuż ul. Pod Krzywą Wieżą jest najstarszym zachowanym fragmentem muru miejskiego w Polsce, datowanym na lata 1246-1262. Mury te otaczały miasto podwójnym obwodem składającym się z muru wysokiego do strony miasta i muru niskiego rozdzielonych międzymurzem (parchamem), dodatkowo poprzedzonych fosą. Od zachodu zbudowano trzecią linię murów obronnych. Od południa, gdzie naturalną obroną była Wisła, zastosowano mur pojedynczy bez fosy. Na wyjściach głównych szlaków komunikacyjnych ze Starego Miasta Torunia umieszczono 8 bram, z których do dzisiaj zachowały się 3 bramy od strony Wisły (Mostowa, Żeglarska i Klasztorna). Ponadto obronność Starego Miasta Torunia wzmacniały ok. 33 baszty, z których zachowały się Krzywa Wieża, Gołębnik, Żuraw, Wartownia, Monstrancja i 3 bezimienne baszty przy ulicy Podmurnej.",
                    18.604217, 53.007954),
            new Monument("Pomnik Flisaka", "fontanna stojąca na Rynku Staromiejskim zwieńczona statuetką flisaka grającego na skrzypcach",
                    R.drawable.pomnik_flisak,
                    "Autorem rzeźby jest urodzony w Toruniu artysta początku XX wieku – Georg Wolf, mieszkający później w Berlinie. Pomnik został ufundowany przez mieszczan i oficjalnie odsłonięty 18 czerwca 1914 roku na dziedzińcu ratusza. Na swoim pierwotnym miejscu pomnik przetrwał do 1943 roku, kiedy to został zdemontowany przez władze okupacyjne. Po wojnie flisak był ustawiany w kilku lokalizacjach. Najpierw stanowił element fontanny przed Collegium Minus (popularna Harmonijka), później stał przed budynkiem urzędu miasta, a w roku 1954 trafił do alpinarium – parku powstałego w bezpośrednim sąsiedztwie Krzywej Wieży i pozostałości systemu obronnego Bramy Starotoruńskiej. W 1983 roku pomnik-fontanna powrócił niemalże na swoje pierwotne miejsce. Został bowiem ustawiony po zachodniej stronie Rynku Staromiejskiego – mniej więcej w miejscu wywiezionego w 1919 roku pomnika cesarza Wilhelma I.",
                    18.604029, 53.010246),
            new Monument("Pomnik M. Kopernika", "pomnik najsłynniejszego torunianina zlokalizowany na Rynku Staromiejskim w Toruniu",
                    R.drawable.pomnik_kopernik,
                    "Monument przedstawia Mikołaja Kopernika ubranego w togę profesorską, który w swojej lewej ręce trzyma astrolabium, a palcem prawej ręki wskazuje niebo, co ma wskazywać na powiązania Kopernika z astronomią i badaniami nieba. Pomnik znajduje się na cokole, wokół którego znajdują się połączone z nim kamienne ławki, natomiast przed nim znajduje się kamienna studzienka.\n" +
                            "\n" +
                            "Na cokole z przedniej strony znajduje się napis w języku łacińskim Nicolaus Copernicus Thorunensis. Terrae motor, Solis Caelique stator (pol. \"Mikołaj Kopernik Torunianin. Ruszył Ziemię, wstrzymał Słońce i Niebo\"). Autorem tego tekstu jest toruński profesor Rudolf Brohm. Na tylnej części cokołu znajduje się data urodzin i śmierci astronoma. Użyte słowo Thorunensis jest poprawnym, regularnym przymiotnikiem od łacińskiej nazwy Torunia T(h)orunia, T(h)orunium. Na karcie tytułowej pierwszego wydania De revolutionibus orbium coelestium użyto jednak innej jego formy: Torinensis",
                    18.605011, 53.010301)
    };

    public Monument(String monName, String monDescription, int monResourceId, String monInfo, double lat,double lon) {
        this.monResourceId = monResourceId;
        this.monName = monName;
        this.monDescription = monDescription;
        this.monInfo = monInfo;
        this.monLon = lon;
        this.monLat = lat;
    }

    public String getMonName() {
        return monName;
    }

     public String getMonDescription() {
        return monDescription;
    }

    public int getMonResourceId() {
        return monResourceId;
    }

    public String getMonInfo() {
        return monInfo;
    }

    public double getMonLon() {
        return monLon;
    }

    public double getMonLat() {
        return monLat;
    }

    @Override
    public String toString() {
        return this.monName;
    }
}