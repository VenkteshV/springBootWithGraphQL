package com.example.DemoGraphQL.models;
import javax.persistence.*;


@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String isbn;
  private int pageCount;

  @ManyToOne
  @JoinColumn(name="author_id", updatable=false, nullable=false)
  private Author author;




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
	* Returns value of title
	* @return
	*/
	public String getTitle() {
		return title;
	}

	/**
	* Sets new value of title
	* @param
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	* Returns value of isbn
	* @return
	*/
	public String getIsbn() {
		return isbn;
	}

	/**
	* Sets new value of isbn
	* @param
	*/
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	* Returns value of pageCount
	* @return
	*/
	public int getPageCount() {
		return pageCount;
	}

	/**
	* Sets new value of pageCount
	* @param
	*/
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	* Returns value of author
	* @return
	*/
	public Author getAuthor() {
		return author;
	}

	/**
	* Sets new value of author
	* @param
	*/
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	* Default empty Book constructor
	*/
	public Book() {
	}

	/**
	* Default Book constructor
	*/
	public Book( String title, String isbn, int pageCount, Author author) {
		this.title = title;
		this.isbn = isbn;
		this.pageCount = pageCount;
		this.author = author;
	}

  @Override
  public boolean equals(Object o) {
    if (this == o) return true; if (o == null || getClass() != o.getClass())
    return false;
    Book book = (Book) o;
    return id.equals(book.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public String toString() {
    return "Book{" + "id=" + id + ", title='" + title + '\'' + ", isbn='" + isbn + '\'' + ", pageCount=" + pageCount + ", author=" + author + '}';
  }
}
