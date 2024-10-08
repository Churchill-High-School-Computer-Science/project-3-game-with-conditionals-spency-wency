public class Methods {
  enum Level {
    DealerWin,
    PlayerWin,
    Tie
  }  
  public Integer Deal(){
      return (int)(Math.random()*11)+1;
    }
    
    
    
    public Level Winner(int DealerHand, int PlayerHand){
      if (PlayerHand >= 22){
        return Level.DealerWin;
      }
      else if (DealerHand > PlayerHand && DealerHand <= 21){
        return Level.DealerWin;
      }
      else if (DealerHand >= 22){
        return Level.PlayerWin;
      }
      else if (PlayerHand > DealerHand && PlayerHand <= 21){
        return Level.PlayerWin;
      }
      else{
        return Level.Tie;
      }
    }

  }

