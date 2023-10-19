class Program1 extends ConsoleProgram {

/**
*Given a number n, calculate the sum of the numbers from 1 to n.
*
* @author: E. Fabroa
*
*/

  
  public void run() {

     double dblMiles;


    for (int intKm = 10; intKm <= 100; intKm += 10){
      dblMiles = intKm * 0.621371;
      System.out.println(intKm + "km --> " + dblMiles + "mi");

   
    
  }
}
