import java.awt.*;

public class Grid {
    Cell [][] cells;
    int x = 10;
    int y = 35;
    
    
    public Grid(){
        cells = new Cell [20][20];
        
        for(int i=0; i < cells.length; i++){            
            if(i != 0){
                x += 35;
            }                                       
            for(int j=0; j < cells[i].length; j++){
                if(j == 0){
                    y = 35;
                } else {
                    y += 35;
                }
                cells[i][j] = new Cell(x,y);              
            }
        }
    }
    
    public void paint(Graphics g){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                g.setColor(Color.WHITE);
                g.fillRect(cells[i][j].x, cells[i][j].y, 35, 35);
                g.setColor(Color.BLACK);
                g.drawRect(cells[i][j].x, cells[i][j].y, 35, 35);
            }
        }
    }
}
