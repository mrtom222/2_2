class Main {

  public static void draw(int w){
    for(int i = 1;i<=w;i++){
      for(int j=0;j<(w-i);j++)
        System.out.print(" ");
      
      for(int j=0;j<i;j++)
        System.out.print("*");
      
      System.out.println("");
    }
  }
  
  public static void main(String[] args) {
    int w = 4,p=3;
    for(int i = 0;i<p;i++)
      draw(w);
  }
}