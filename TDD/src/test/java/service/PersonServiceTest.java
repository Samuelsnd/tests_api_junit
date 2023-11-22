package service;

import model.Person;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {
    IPersonService service;
    Person person;

    @BeforeEach
    void setUp(){
        service = new PersonService();
        person = new Person(
                "Keith",
                "Moon",
                "Wembley - UK",
                "Male",
                "kmoon@erudio.com.br"
        );
    }

    @DisplayName("When Create a Person with Sucess Should Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject(){
        // Given // Arrange
        // When // Act
        Person actual = service.createPerson(person);

        // Then // Assert

        assertNotNull(actual, () -> "the createPerson() should not have returned null!");
        assertNotNull(person.getId());
        assertEquals(person.getFirstName(), actual.getFirstName(),() -> "The FirstName is Diferent");
        assertEquals(person.getLastName(), actual.getLastName(),() -> "The LastName is Diferent");
        assertEquals(person.getAddress(), actual.getAddress(),() -> "The Adress is Diferent");
        assertEquals(person.getGender(), actual.getGender(),() -> "The Gender is Diferent");
        assertEquals(person.getEmail(), actual.getEmail(),() -> "The Email is Diferent");
    }

    @DisplayName("When Create a Person with null e-mail should throw Exception")
    @Test
    void testCreatePerson_WhithNullEmail_ShouldThrowIllegalArgumentException(){
        // Given // Arrange
        person.setEmail(null);

        var expectedMessage = "The Person e-Mail is null or empty!";

        // When // Act & // Then
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> service.createPerson(person),
                        () -> "Empty e-Mail should have cause an IllegalArgumentException.class");

        // Then
        assertEquals(expectedMessage, exception.getMessage(), () -> "Exception error message is incorrect");


    }


}
