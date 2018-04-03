import java.util.Random;
public class Cave {
//
    private String name;
    private int caveNum;
    private int adj1;
    private int adj2;
    private int adj3;
    private String caveContent;
    private boolean visited;
    //
    private Cave currentCave;
    //
    public Cave(String name, int cave, int adj1, int adj2, int adj3, String content, boolean visit){
        name = name;
        caveNum = cave;
        adj1 = adj1;
        adj2 = adj2;
        adj3 = adj3;
        caveContent = content;
        visited = visit;
        currentCave =
        currentCave = maze[0];
        currentCave.markAsVisited();
    }
    //
    public String getCaveName(){
        return name;
    }
    //
    public int getCaveNum(){
        return caveNum;
    }
    //
    public String getCaveContent(){
        return caveContent;
    }
    //
    public int getAdjNumber(int num){
        if(num == 1){
            return adj1;
        }
        else if(num == 2){
            return adj2;
        }
        else{
            return adj3;
        }
        return 0;
    }
    //
    public void markAsVisited(){
        currentCave.caveContent.equals(true);
    }
    //
    public boolean hasBeenVisited(){
        if (currentCave.caveContent.equals(true)){
            return true;
        }
        return false;
    }
    //
    public boolean stillAlive(){
        if (currentCave.getCaveContent.equals("wumpus") || currentCave.getCaveContent.equals("pit")){
            return false;
        }
        return true;
    }
    //
    public boolean stillWumpi(){
        for (int i = 0; i <= maze.length; i++){
            if (maze[i].getCaveContent.equals("wumpus")){
                return true;
            }
            return false;
        }
    }
    //
    public String showLocation() {
        String message = "You are currently in " + currentCave.getCaveName();
        for (int i = 1; i <= 3; i++) {
      	  Cave adjCave = maze[currentCave.getAdjNumber(i)];
      	  if (adjCave.hasBeenVisited()) {
      	      message += "\n    (" + i + ") " + adjCave.getCaveName();
      	  }
      	  else {
      	      message += "\n    (" + i + ") unknown";
              continue;
      	  }
        }
        for (int a = 1; a <= 3; a ++){
            if (adjCave.getCaveContent.equals("wumpus")){
                message += "\n You smell an awful stench coming from somewhere nearby.";
            }
            else if (adjCave.getCaveContent.equals("pit")){
                message += "\n You feel a draft coming from somewhere nearby.";
            }
            else if (adjCave.getCaveContent.equals("bats")){
                message += "\n You hear screeching coming from somewhere nearby.";
            }
            else {
                message += "\n ";
        }
        return message;
    }
    //
    public String toss(int tunnel){
        return "Not implemented";
    }
    //
    public String move(int tunnel){
        currentCave = maze[currentCave.getAdjNumber(tunnel)];
        currentCave.markAsVisited();
        return "ok";
    }
    //
    public static void main(String[] args) {
        Cave[] maze = new Cave[20];
        maze[0] = new Cave("The Fountainhead",0, 1, 4, 9, "empty", false);
        maze[1] = new Cave("The Rumpus Room",1, 0, 2, 5, "empty", false);
        maze[2] = new Cave("Buford's Folly",2, 1, 3, 6, "empty", false);
        maze[3] = new Cave("The Hall of Kings",3, 2, 4, 7, "empty", false);
        maze[4] = new Cave("The Silver Mirror",4, 0, 3, 14, "empty", false);
        maze[5] = new Cave("The Gallimaufry",5, 1, 9, 11, "empty", false);
        maze[6] = new Cave("The Den of Iniquity",6, 2, 4, 12, "empty", false);
        maze[7] = new Cave("The Findledelve",7, 3, 6, 8, "empty", false);
        maze[8] = new Cave("The Page of the Deniers",8, 7, 3, 13, "empty", false);
        maze[9] = new Cave("The Final Tally",9, 0, 5, 10, "empty", false);
        maze[10] = new Cave("Ess four",10, 9, 11,14 , "empty", false);
        maze[11] = new Cave("The Trillion",11, 5, 10, 12, "empty", false);
        maze[12] = new Cave("The Scrofula",12, 6, 11, 13, "empty", false);
        maze[13] = new Cave("Epemeron",13, 8, 12, 18, "empty", false);
        maze[14] = new Cave("Shelob's Lair",14, 4, 10, 15, "empty", false);
        maze[15] = new Cave("The Lost Caverns of the Wyrm",15, 15, 16, 19, "empty", false);
        maze[16] = new Cave("The Lost Caverns of the Wyrm",16, 15, 17, 19, "empty", false);
        maze[17] = new Cave("The Lost Caverns of the Wyrm",17, 16, 17, 28, "empty", false);
        maze[18] = new Cave("The Lost Caverns of the Wyrm",18, 13, 17, 19, "empty", false);
        maze[19] = new Cave("The Lost Caverns of the Wyrm",19, 15, 16, 17, "empty", false);
        // Cave[] currentCave = new Cave[1];
        // currentCave[0] = new Cave("Nowhere",0,0,0,0,"empty",false);
    }
    //
}
