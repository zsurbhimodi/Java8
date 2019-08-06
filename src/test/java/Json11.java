import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.*;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class Json11 {

    @Test
    public void JsonPathUsage() throws MalformedURLException
    {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/books/getallbooks";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");

        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Read all the books as a List of String. Each item in the list
        // represent a book node in the REST service Response
        List<Book> allBooks = jsonPathEvaluator.getList("books", Book.class);


        // Iterate over the list and print individual book item
        // Note that every book entry in the list will be complete Json object of book
        for(Book book : allBooks)
        {
            System.out.println("Book: " + book.title);
        }
    }
}
