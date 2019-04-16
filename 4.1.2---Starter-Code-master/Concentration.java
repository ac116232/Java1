




public class Concentration extends Board
{
    public static final int CONCENTRATION = 100;
    public static final int SEVENS = 200;
    private Tile[][] gameboard = makeBoard();
    private int gamerules;

    public Concentration() {
        String[] cards = getCards();
        int numCards = cards.length-1;

        gamerules = CONCENTRATION;

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++)
            {
                int r = (int)( Math.random() * numCards);
                gameboard[i][j] = new Tile(cards[r]);
                cards[r] = cards[numCards];
                numCards--;
            }
        }
    }
    public boolean allTilesMatch() {
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++) {
                if (!gameboard[i][j].matched()) return false;
            }
        }
        return true;
    }
    public String checkForMatch(int row1, int column1, int row2, int column2) {
        boolean tilesMatch = false;
        String msg = "";
        Tile tile1 = gameboard[row1][column1];
        Tile tile2 = gameboard[row2][column2];

        if (gamerules == CONCENTRATION) tilesMatch = tile1.equals(tile2);
        if (gamerules == SEVENS) tilesMatch = tile1.addsTo7(tile2);
        if (tilesMatch) {
            tile1.foundMatch();
            tile2.foundMatch();
            msg = "Matched!";
        }
        else {
            tile1.faceUp(false);
            tile2.faceUp(false);
        }
        return msg;
    }
    public void showFaceUp (int row, int column)
    {
        Tile tile = gameboard[row][column];
        tile.faceUp(true);
        tile.faceUp(true);
    }
    public String toString()
    {
        String boardValues = "";
        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length; j++) {
                Tile t = gameboard[i][j];
                if (t.isFaceUp())  boardValues = t.getFace() + boardValues;
                else boardValues += t.getBack();
                boardValues += "\t";
            }
            boardValues += "\n";
        }
        return boardValues;
    }
    public boolean validSelection(int i, int j) {
        if (i < gameboard.length) {
            if (j < gameboard[0].length) {
                if(!gameboard[i][j].matched()) return true;
            }
        }
        return false;
    }
}


