import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;

public class JSONServerAPITesting {


 //@Test
    public void Test_Post1(){



        Response res=when().get("http://localhost:3000/posts");
        System.out.println(res.getStatusCode());
        System.out.println(res.asString());
        Assert.assertEquals(200,res.getStatusCode());



    }

   // @Test
    public void Test_Post2(){


      Response res=  given().body("{\"id\":\"3\",\"title\":\"Test automation\",\"author\":\"Shivam\"}").
                when().contentType(ContentType.JSON).
                post("http://localhost:3000/posts");

        System.out.println(res.asString());

    }
  // @Test
    public void Test_Post3(){


     Post posts=new Post();
     posts.setId("4");
     posts.setAuthor("Shubhangi");
     posts.setTitle("Selenium API");

  Response res=   given().
          when().
          contentType(ContentType.JSON).
          body(posts).
          post("http://localhost:3000/posts");

        System.out.println(res.asString());




    }



   // @Test
    public void Test_Post4(){


        Post posts=new Post();
        posts.setId("4");
        posts.setAuthor("updated Shubhangi");
        posts.setTitle("updated Selenium API");

        Response res=   given().
                when().
                contentType(ContentType.JSON).
                body(posts).
                put("http://localhost:3000/posts/4");

        System.out.println(res.asString());




    }
   // @Test
    public void Test_Post7(){



        Response res=  given().
                when().
                contentType(ContentType.JSON).
                body("{\"title\":\"Updated by patch  request\"}").
                patch("http://localhost:3000/posts/1");

        System.out.println(res.asString());




    }



   // @Test
    public void Test_Post8(){

        Response res=  given().
                when().
                delete("http://localhost:3000/posts/1");

        System.out.println(res.asString());

    }





     @Test
    public void Test_Post9(){
         Response res= (Response) given().body("{\"id\":\"41\",\"title\":\"kabir singh\",\"author\":\"Shahid\"}").
                 when().contentType(ContentType.JSON).
                 post("http://localhost:3000/posts").then().assertThat()
                 .statusCode(201).
                         and().
                         contentType(ContentType.JSON).
                         and().body("status",equalTo(201));



    }









}

