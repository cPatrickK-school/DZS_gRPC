public class SimulationsPool {

    public static String[] standorte = {
            "Wien", "Graz", "Linz", "Salzburg", "Innsbruck", "Klagenfurt", "Villach", "Wels", "St. Pölten", "Dornbirn",
            "Steyr", "Feldkirch", "Bregenz", "Leonding", "Klosterneuburg", "Baden", "Wolfsberg", "Leoben", "Krems", "Traun",
            "Amstetten", "Kapfenberg", "Mödling", "Hallein", "Lustenau", "Perchtoldsdorf", "Schwechat", "Tulln", "Spittal",
            "Hohenems", "Kufstein", "Traiskirchen", "Saalfelden", "Stockerau", "Ansfelden", "Braunau", "Bludenz", "Bruck",
            "Eisenstadt", "Gmunden", "Vöcklabruck", "Zwettl", "Neunkirchen", "Knittelfeld", "Feldbach", "Marchtrenk",
            "Enns", "Hard", "Bad Ischl", "Götzis", "Seekirchen", "Ried", "Rankweil", "Wörgl", "Hollabrunn", "Ebreichsdorf",
            "Bad Vöslau", "Lienz", "Völkermarkt", "St. Johann", "Gänserndorf", "Bischofshofen", "Mittersill", "Schwaz",
            "Waidhofen", "St. Valentin", "Weiz", "Korneuburg", "Ternitz", "Wals-Siezenheim", "Freistadt", "Melk",
            "St. Veit", "Bad Hall", "Gleisdorf", "Neusiedl", "Deutschlandsberg", "Hainburg", "Ferlach", "Eisenerz",
            "Bruckneudorf", "Laa", "Pinkafeld", "Ybbs", "Wieselburg", "St. Andrä", "Oberwart", "Gloggnitz", "Zell am See",
            "Mariazell", "Althofen", "Schladming", "St. Georgen", "Wolkersdorf", "St. Michael", "Mattersburg", "Judenburg",
            "Hartberg", "Murau", "Bad Aussee", "Radstadt", "St. Johann im Pongau", "Mondsee", "Seefeld", "Fügen",
            "St. Gilgen", "Velden", "Pörtschach", "Krumpendorf", "Ebensee", "Hallstatt", "Oberndorf", "St. Wolfgang",
            "Golling", "Werfen", "Admont", "Liezen", "Schruns", "Telfs", "Imst", "Landeck", "Reutte", "Matrei", "Kitzbühel",
            "St. Anton", "Mayrhofen", "Serfaus", "Fiss", "Ischgl", "Sölden", "Obergurgl", "Hintertux", "Kaprun", "Lech",
            "Zell am Ziller", "Ellmau", "Alpbach", "Wildschönau", "Kirchberg", "Hopfgarten", "Brixen", "Westendorf",
            "St. Jakob", "St. Leonhard", "St. Ulrich", "St. Johann in Tirol", "St. Martin", "St. Peter", "St. Paul"
    };

    public static String[] addresses = {
            "Wiener Straße 1", "Grazer Straße 2", "Linzer Straße 3", "Salzburger Straße 4", "Innsbrucker Straße 5",
            "Klagenfurter Straße 6", "Villacher Straße 7", "Welser Straße 8", "St. Pöltner Straße 9", "Dornbirner Straße 10",
            "Steyrer Straße 11", "Feldkircher Straße 12", "Bregenzer Straße 13", "Leondinger Straße 14", "Klosterneuburger Straße 15",
            "Badener Straße 16", "Wolfsberger Straße 17", "Leobener Straße 18", "Kremser Straße 19", "Trauner Straße 20",
            "Amstettner Straße 21", "Kapfenberger Straße 22", "Mödlinger Straße 23", "Halleiner Straße 24", "Lustenauer Straße 25",
            "Perchtoldsdorfer Straße 26", "Schwechater Straße 27", "Tullner Straße 28", "Spittaler Straße 29", "Hohenemser Straße 30",
            "Kufsteiner Straße 31", "Traiskirchener Straße 32", "Saalfeldener Straße 33", "Stockerauer Straße 34", "Ansfeldener Straße 35",
            "Braunauer Straße 36", "Bludenzer Straße 37", "Brucker Straße 38", "Eisenstädter Straße 39", "Gmundener Straße 40",
            "Vöcklabrucker Straße 41", "Zwettler Straße 42", "Neunkirchner Straße 43", "Knittelfelder Straße 44", "Feldbacher Straße 45",
            "Marchtrenker Straße 46", "Ennser Straße 47", "Harder Straße 48", "Bad Ischler Straße 49", "Götziser Straße 50",
            "Seekirchener Straße 51", "Rieder Straße 52", "Rankweiler Straße 53", "Wörgler Straße 54", "Hollabrunner Straße 55",
            "Ebreichsdorfer Straße 56", "Bad Vöslauer Straße 57", "Lienzer Straße 58", "Völkermarkter Straße 59", "St. Johanner Straße 60",
            "Gänserndorfer Straße 61", "Bischofshofener Straße 62", "Mittersiller Straße 63", "Schwazer Straße 64", "Waidhofener Straße 65",
            "St. Valentiner Straße 66", "Weizer Straße 67", "Korneuburger Straße 68", "Ternitzer Straße 69", "Wals-Siezenheimer Straße 70",
            "Freistädter Straße 71", "Melker Straße 72", "St. Veiter Straße 73", "Bad Haller Straße 74", "Gleisdorfer Straße 75",
            "Neusiedler Straße 76", "Deutschlandsberger Straße 77", "Hainburger Straße 78", "Ferlacher Straße 79", "Eisenerzer Straße 80",
            "Bruckneudorfer Straße 81", "Laaber Straße 82", "Pinkafelder Straße 83", "Ybbser Straße 84", "Wieselburger Straße 85",
            "St. Andräer Straße 86", "Oberwarter Straße 87", "Gloggnitzer Straße 88", "Zell am See Straße 89", "Mariazeller Straße 90",
            "Althofener Straße 91", "Schladminger Straße 92", "St. Georgener Straße 93", "Wolkersdorfer Straße 94", "St. Michaeler Straße 95",
            "Mattersburger Straße 96", "Judenburger Straße 97", "Hartberger Straße 98", "Murauer Straße 99", "Bad Ausseer Straße 100",
            "Radstädter Straße 101", "St. Johann im Pongauer Straße 102", "Mondseer Straße 103", "Seefelder Straße 104", "Fügener Straße 105",
            "St. Gilgener Straße 106", "Velden Straße 107", "Pörtschacher Straße 108", "Krumpendorfer Straße 109", "Ebenseer Straße 110",
            "Hallstätter Straße 111", "Oberndorfer Straße 112", "St. Wolfgang Straße 113", "Gollinger Straße 114", "Werfener Straße 115",
            "Admonter Straße 116", "Liezener Straße 117", "Schrunser Straße 118", "Telfser Straße 119", "Imster Straße 120",
            "Landecker Straße 121", "Reuttener Straße 122", "Matreier Straße 123", "Kitzbüheler Straße 124", "St. Antoner Straße 125",
            "Mayrhofener Straße 126", "Serfauser Straße 127", "Fisser Straße 128", "Ischgler Straße 129", "Söldener Straße 130",
            "Obergurgler Straße 131", "Hintertuxer Straße 132", "Kapruner Straße 133", "Lecher Straße 134", "Zell am Ziller Straße 135",
            "Ellmauer Straße 136", "Alpbacher Straße 137", "Wildschönauer Straße 138", "Kirchberger Straße 139", "Hopfgartener Straße 140",
            "Brixener Straße 141", "Westendorfer Straße 142", "St. Jakober Straße 143", "St. Leonharder Straße 144", "St. Ulricher Straße 145",
            "St. Johann in Tiroler Straße 146", "St. Martiner Straße 147", "St. Peterer Straße 148", "St. Pauler Straße 149", "St. Jakob im Walde Straße 150"
    };
    public static String[] cities = {
            "Wien", "Graz", "Linz", "Salzburg", "Innsbruck", "Klagenfurt", "Villach", "Wels", "St. Pölten", "Dornbirn",
            "Steyr", "Feldkirch", "Bregenz", "Leonding", "Klosterneuburg", "Baden", "Wolfsberg", "Leoben", "Krems", "Traun",
            "Amstetten", "Kapfenberg", "Mödling", "Hallein", "Lustenau", "Perchtoldsdorf", "Schwechat", "Tulln", "Spittal",
            "Hohenems", "Kufstein", "Traiskirchen", "Saalfelden", "Stockerau", "Ansfelden", "Braunau", "Bludenz", "Bruck",
            "Eisenstadt", "Gmunden", "Vöcklabruck", "Zwettl", "Neunkirchen", "Knittelfeld", "Feldbach", "Marchtrenk",
            "Enns", "Hard", "Bad Ischl", "Götzis", "Seekirchen", "Ried", "Rankweil", "Wörgl", "Hollabrunn", "Ebreichsdorf",
            "Bad Vöslau", "Lienz", "Völkermarkt", "St. Johann", "Gänserndorf", "Bischofshofen", "Mittersill", "Schwaz",
            "Waidhofen", "St. Valentin", "Weiz", "Korneuburg", "Ternitz", "Wals-Siezenheim", "Freistadt", "Melk",
            "St. Veit", "Bad Hall"
    };
    public static String[] zipCodes = {
            "1010", "8010", "4020", "5020", "6020", "9020", "9500", "4600", "3100", "6850",
            "4400", "6800", "6900", "4060", "3400", "2500", "9400", "8700", "3500", "4050",
            "3300", "8605", "2340", "5400", "6890", "2380", "2320", "3430", "9800", "6845",
            "6330", "2514", "5760", "2000", "4052", "5282", "4900", "8605", "7000", "4810",
            "3910", "2620", "2624", "2625", "8073", "4910", "5310", "4021", "6300", "2102",
            "2700", "6371", "9201", "6136", "5602", "9021", "3340"
    };
}