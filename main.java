public class main{
   public static void main(String[] args){
   
      Movie movie1 = new Movie();
      Movie movie2 = new Movie();
      Movie movie3 = new Movie();
      
      movie1.Title = "Spider-Man: Brand New Day";
      movie1.genre = "Superhero, Action, Adventure";
      movie1.duration = 117;
      movie1.displayInfo();
      
      movie2.Title = "Swapped";
      movie2.genre = "Animation, Fantasy, Comedy";
      movie2.duration = 102;
      movie2.displayInfo();
      
      movie3.Title = "Deadpool & Wolverine";
      movie3.genre = "Comedy, Superhero, Action";
      movie3.duration = 127;
      movie3.displayInfo();
   }
}