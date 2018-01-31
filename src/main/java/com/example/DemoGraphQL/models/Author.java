package com.example.DemoGraphQL.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;





	/**
	* Returns value of id
	* @return
	*/
	public Long getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(Long id) {
		this.id = id;
	}

	/**
	* Returns value of firstName
	* @return
	*/
	public String getFirstName() {
		return firstName;
	}

	/**
	* Sets new value of firstName
	* @param
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	* Returns value of lastName
	* @return
	*/
	public String getlastName() {
		return lastName;
	}

	/**
	* Sets new value of lastName
	* @param
	*/
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	* Default empty Author constructor
	*/
	public Author() {

	}

	/**
	* Default Author constructor
	*/
	public Author( String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

  public Author(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Author author = (Author) o;
    return id.equals(author.id);
   }

  @Override
  public int hashCode() {
    return id.hashCode();

   }

  @Override
  public String toString() {
    return "Author{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
  }
}
