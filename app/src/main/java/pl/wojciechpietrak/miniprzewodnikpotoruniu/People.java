package pl.wojciechpietrak.miniprzewodnikpotoruniu;

public class People {
    private String name;
    private String description;
    private int resourceId;
    private String info;

    public static People[] peoples = {
            new People("Mikołaj Kopernik", "Nicolaus Copernicus 1473-1543 można go określić mianem człowieka renesansu był m.in.: " +
                    "  astronomem, matematykiem, ekonomistom, lekarzem, duchownym. Najbardziej znany torunianin.",
                    R.drawable.mikolaj_kopernik,
                    "Jest autorem dzieła De revolutionibus orbium coelestium (O obrotach sfer niebieskich) przedstawiającego szczegółowo " +
                            "i w naukowo użytecznej formie heliocentryczną wizję Wszechświata. " +
                            "Wprawdzie koncepcja heliocentryzmu znana była już w starożytnej Grecji, to jednak dopiero dzieło " +
                            "Kopernika dokonało przełomu i wywołało jedną z najważniejszych rewolucji naukowych od czasów starożytnych, " +
                            "nazywaną przewrotem kopernikańskim." ),
    new  People("Samuel Bogumił Linde"," twórca pierwszego 6-tomowego Słownika Języka Polskiego o charakterze historycznym. Urodził się w nieistniejącej już kamienicy przy ul. Małe Garbary 2 na Nowym Mieście.",
           R.drawable.bogumil_linde,
           "\n" +
                   "Linde urodził się w nieistniejącej dziś kamienicy przy ul. Małe Garbary 2. " +
                   "Dziś w tym miejscu stoi XIX-wieczny budynek, na którym umieszczono tablicę pamiątkową jemu poświęconą. " +
                   "Linde ma także swój pomnik stojący od 1976 roku przed gmachem Książnicy Kopernikańskiej przy ul. Słowackiego. " +
                   "Poza tym jego imię nosi jedna z ulic na Bydgoskim Przedmieściu, III Liceum Ogólnokształcące, " +
                   "a także Nagroda Literacka Miast Partnerskich Torunia i Getyngi przyznawana litearatom w czasie " +
                   "Toruńskiego Festiwalu Książki odbywającego się corocznie w listopadzie.\n" +
                   "\n" +
                   "Samuel Bogumił Linde był twórcą pierwszego, 6-tomowego Słownika Języka Polskiego o charakterze historycznym, " +
                   "zawierającego 60 tysięcy haseł z zestawu druków i języka potocznego. " +
                   "To wybitne osiągnięcie nauki polskiej doby oświecenia po raz pierwszy zostało opublikowane w latach 1807-1814.\n" +
                   "Linde studiował teologię, filozofię i języki orientalne na uniwersytecie w Lipsku, gdzie w 1791 roku został " +
                   "lektorem języka polskiego. Jako zaufany człowiek, bibliotekarz i współpracownik w latach 1795-1803 zajmował " +
                   "się gromadzeniem zbiorów bibliotek Józefa Maksymiliana Ossolińskiego, co pozwala uznać go za " +
                   "współtwórcę jednej z najznakomitszych polskich bibliotek - Ossolineum. W 1804 roku przyjął " +
                   "rektorat utworzonego Liceum Warszawskiego. Działalność publiczna Lindego miała charakter " +
                   "polityczny, oświatowy, naukowy i bibliofilski. Był m.in. członkiem Izby Edukacyjnej kierującej sprawami oświaty Księstwa Warszawskiego, radcą Komisji Rządowej Wyznań Religijnych i Oświecenia Publicznego, jednym z organizatorów i pierwszych wykładowców Uniwersytetu Warszawskiego. Jego działalność naukowa i wydawnicza koncentrowała się wokół prac o charakterze słownikowym, bibliograficznym oraz z zakresu językoznawstwa, dziejów piśmiennictwa i przekładów. W 1844 roku otrzymał tytuł Honorowego Obywatela Miasta Torunia."),

    new  People("Tony Halik","(1921-1998) - dziennikarz, podróżnik, autor książek podróżniczych i około 300 filmów dokumentalnych.",
           R.drawable.tony_halik,
           "Urodził się w Toruniu przy ul. Prostej 8 na Nowym Mieście, co upamiętnia stosowna tablica pamiątkowa. Podczas II wojny światowej członek RAF-u. Wkrótce po wojnie małżeństwo Halików rozpoczęło podróże wędrówką po Afryce i Azji, publikując serię reportaży w znanych czasopismach. W 1948 roku osiedlił się wraz z żoną w Argentynie i przyjął obywatelstwo tego kraju. Nastąpiły dalsze wyprawy podróżnicze: żegluga rzekami Ameryki Południowej i wędrówka po puszczach południowego regionu Boliwii oraz Amazonii i brazylijskiego stanu Mato Grosso. Jako korespondent sieci telewizyjnej NBC w Ameryce Łacińskiej, Halik wiele lat przebywał w Meksyku. W 1979 roku osiedlił się w Polsce na stałe.\n" +
                   "Znany jest ze swych programów telewizyjnych pod wspólnym tytułem \"Pieprz i Wanilia\", takich jak: \"180 tysięcy kilometrów\", \"Ostatni wolni Indianie\", \"Ścieżki w nieznane\", \"Tam, gdzie pieprz rośnie\", \"Tam, gdzie rośnie wanilia\", \"Nieznany kraj\".\n" +
                   "W lutym 1998 roku na domu, w którym się urodził przy ul. Prostej odsłonięto tablicę pamiątkową, ponadto 24. 01. 2003 roku otwarto w Toruniu Muzeum Podróżników im. Tony Halika."),

    new   People("Aleksander Wolszczan","(1946-  ) - astronom; absolwent Uniwersytetu Mikołaja Kopernika.",
           R.drawable.aleksander_wolszczan,
           "Urodzony w Szczecinku. Od 1982 roku przebywa w USA. Początkowo pracownik Cornell University w Ithaca oraz Princeton University, następnie profesor University of Pennsylvania w Filadelfii. W latach 1994-2008 kierował astronomią na Uniwersytecie Mikołaja Kopernika, od 1997 był dyrektorem Centrum Astronomicznego UMK w Piwnicach; od 1994 roku członek Polskiej Akademii Nauk.\n" +
                   "Prowadząc w Arecibo (Portoryko) obserwacje, za pomocą największego na świecie radioteleskopu, odkrył w 1990 roku pulsar PSR B1257+12. W 1992 roku wysunął oficjalnie twierdzenie o istnieniu wokół pulsara układu planetarnego. Doniesienie to spotkało się ze sceptycznym przyjęciem części uczonych. W 1994 roku w wyniku dalszych badań opublikował nowe dane dotyczące odkrytego przez siebie pozasłonecznego układu planetarnego, potwierdzające odkrycie.\n" +
                   "W 1992 roku otrzymał Nagrodę Fundacji na Rzecz Nauki Polskiej.\n" +
                   "Patrz też: Piernikowa Aleja Gwiazd."),
            new   People("Fryderyk Skarbek","(1792-1866) - ekonomista, publicysta, pisarz, współautor głośnych felietonów satyrycznych; czołowy przedstawiciel polskiej myśli ekonomicznej w okresie Królestwa Polskiego, profesor Uniwersytetu Warszawskiego. Ojciec chrzestny Fryderyka Chopina.",
                    R.drawable.fryderyk_skarbek,
                    "Urodził się przy ul. Mostowej 14 (patrz: Pałac Fengera), co upamiętnia stosowna tablica pamiątkowa. W Toruniu spędził pierwsze 6 lat życia w domu dziadka; po jego śmierci zamieszkał w Izbicy Kujawskiej u swego ojca. Wstępny okres edukacji odbywał pod kierunkiem Mikołaja Chopina (ojca Fryderyka Chopina, którego był ojcem chrzestnym; sam Fryderyk przebywał także w Toruniu), a w 1805 roku wstąpił do Liceum Warszawskiego, kierowanego przez torunianina Samuela Bogumiła Lindego, któremu pomagał w pracach nad Słownikiem Języka Polskiego. W latach 1809-1811 studiował w Paryżu języki obce, prawo karne, literaturę, a także chemię. Po powrocie do kraju rozpoczął karierę urzędniczą, uprawiał działalność publicystyczną, pracował jako profesor na Uniwersytecie Warszawskim wykładając ekonomię polityczną. Opublikowana i pozostawiona w rękopisie spuścizna intelektualna Skarbka jest ogromna i wszechstronna. Jedną z jego głównych zasług jest przeniesienie na grunt polski i samodzielne rozwijanie zasad ekonomii. Jego największe dzieło naukowe to Ogólne Zasady Gospodarstwa Narodowego.\n" +
                            "Jego imię nosi plac obok dworca Toruń Wschodni.")};


    public People(String name, String description, int resourceId, String info) {
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

