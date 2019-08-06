import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.hasSize;


public class WeatherGetRequest {



    //Simple get
   // @Test
    public void Test_01(){


        Response res=when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=c6e95d8d3aa5622408987cd2a69ea698");
        System.out.println(res.getStatusCode());






        Assert.assertEquals(200,res.getStatusCode());

    }

  //  https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=c6e95d8d3aa5622408987cd2a69ea698
//Access Token=c6e95d8d3aa5622408987cd2a69ea698

    //Get with parameters
   // @Test
    public void Test_02(){


      Response res=given().
              param("appid","c6e95d8d3aa5622408987cd2a69ea698").
              param("q","London").
              when().
              get("https://samples.openweathermap.org/data/2.5/weather");
        Assert.assertEquals(200,res.getStatusCode());

        if(res.getStatusCode()==200){

            System.out.println("API is working Fine");
        }

        else{


            System.out.println("API is not working Fine");

        }

    }








  //  @Test
    public void Test_03(){


         given().
                param("appid","c6e95d8d3aa5622408987cd2a69ea698").
                param("q","London").
                when().
                get("https://samples.openweathermap.org/data/2.5/weather").
                then().assertThat().statusCode(200);




    }



    //@Test
    public void Test_04(){


        Response res= (Response) given().
                param("appid","c6e95d8d3aa5622408987cd2a69ea698").
                param("q","London").
                when().
                get("https://samples.openweathermap.org/data/2.5/weather");

        System.out.println( res.asString());;




    }

   // @Test
    public void FilterTest(){


        Response res= (Response) given().
                param("appid","c6e95d8d3aa5622408987cd2a69ea698").
                param("q","London").
                when().
                get("https://samples.openweathermap.org/data/2.5/weather");

        System.out.println( res.asString());;




    }



   @Test
    public void Test_05(){


       Response res= (Response) given().
               param("appid","c6e95d8d3aa5622408987cd2a69ea698").
               param("q","London").
               when().
               get("https://samples.openweathermap.org/data/2.5/weather");


        String WhetherReport=String.valueOf(res.then().contentType(ContentType.JSON).
                extract().path("coord.lon"));

       System.out.println("Whether lan is "+WhetherReport);










                /* given().
                param("appid","c6e95d8d3aa5622408987cd2a69ea698").
                param("q","London").
                when().
                get("https://samples.openweathermap.org/data/2.5/weather").
                then().
                contentType(ContentType.JSON).
                extract().path("coord.lon");*/






    }


  //  @Test
    public void Test_06(){


        Response res= (Response) given().
                param("appid","c6e95d8d3aa5622408987cd2a69ea698").
                param("q","London").
                when().
                get("https://samples.openweathermap.org/data/2.5/weather");

        System.out.println( res.asString());;




    }

    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {

        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
    }


    //coord.lon
}
