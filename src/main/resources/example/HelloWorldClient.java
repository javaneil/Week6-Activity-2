package example;/**
 * Created by Neil on 2/20/2017.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      com.daehosting.TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
      //invoke business method
      service.celsiusToFahrenheit();  
  }
}
