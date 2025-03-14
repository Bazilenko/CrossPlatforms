public class Menu {
    public void menu(String command){
        do {
            System.out.println("""
                    1.Show games list.
                    2.Show full match history.
                    3.Search match history by filter.
                    4.Add match.
                    5.Delete match.
                    6.Sort by parameter match history.
                    To stop the program enter exit
                    """);

        }
        while (true);
    }

}