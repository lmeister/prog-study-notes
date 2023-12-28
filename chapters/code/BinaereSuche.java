public static int binaereSuche(int gesucht, int[] daten) {
    int unterGrenze = 0;
    int oberGrenze = daten.length - 1;

    while (unterGrenze < oberGrenze) {
        int median = (unterGrenze + oberGrenze) / 2;

        if (daten[median] == gesucht) {
            return median;
        } else if (daten[median] > gesucht) {
            oberGrenze = median;
        } else {
            unterGrenze = median + 1;
        }
    }
    return -1;
}