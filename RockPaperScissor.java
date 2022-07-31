import java.util.*;

public class ch4RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("5 MATCH SERIES");
        //0->Rock
        //1->Paper
        //2->Scissor
        int cScore=0,uScore=0,draw=0;
        Scanner in=new Scanner(System.in);
        Random r=new Random();
        for (int i=0;i<5;i++)
        {
            long auto=r.nextInt(3 );
            //System.out.println(auto);
            System.out.println("0->Rock\n" + "1->Paper\n" + "2->Scissor");
            System.out.print("Enter number:");
            int choice=in.nextInt();
            System.out.println("Computer input: "+auto);
            if(choice>=0 && choice<=2)
            {
                if(choice==auto)
                {
                    // cScore=cScore+0;
                    //uScore=uScore+0;
                    draw++;
                    System.out.println("Computer Score="+cScore+"\tUser Score="+uScore);
                }
                if(choice==0 && auto==1 || choice==1 && auto==2 || choice==2 && auto==0 ){
                    cScore++;
                    System.out.println("Computer Score="+cScore+"\tUser Score="+uScore);
                }
                if(choice==0 && auto==2 || choice==1 && auto==0 || choice==2 && auto==1){
                    uScore++;
                    System.out.println("Computer Score="+cScore+"\tUser Score="+uScore);
                }
                /*if(choice==1 && auto==0){
                    uScore++;
                    System.out.println("Computer Score="+cScore+"\tUser Score="+uScore);
                }
                 if(choice==1 && auto==2){
                    cScore++;
                    System.out.println("Computer Score="+cScore+"\tUser Score="+uScore);
                }
                if(choice==2 && auto==0){
                    cScore++;
                    System.out.println("Computer Score="+cScore+"\tUser Score="+uScore);
                }
                if(choice==2 && auto==1){
                    uScore++;
                    System.out.println("Computer Score="+cScore+"\tUser Score="+uScore);
                }

                 */

            }
            else
            {
                System.out.println("invalid Choice Enter number between (0-2)");
                i--;
            }


        }
        if(uScore==cScore)
        {
            System.out.println("Series Draw");
            System.out.println("SCORE:");
            System.out.println("Draw="+draw);
            System.out.println("Computer="+cScore);
            System.out.println("User="+uScore);


        }
        if (uScore>cScore)
        {
            System.out.println("You won this series");
            System.out.println("SCORE:");
            System.out.println("Draw="+draw);
            System.out.println("Computer="+cScore);
            System.out.println("User="+uScore);
        }
        if (cScore>uScore)
        {
            System.out.println("Computer won this series");
            System.out.println("SCORE:");
            System.out.println("Draw="+draw);
            System.out.println("Computer="+cScore);
            System.out.println("User="+uScore);
        }


    }
}
