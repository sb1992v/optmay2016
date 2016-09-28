package com.two95.mvn.soap.book.shelf;


import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "com.two95.mvn.soap.book.shelf.BookShelfService",
		serviceName="bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {
	
	private Map<String, BookVO> bookMap = new HashMap<String, BookVO>();
    public String insertBook(BookVO bookVO) {
    	String bookName = bookVO.getBookName();
    	bookMap.put(bookName, bookVO);
		return "Book with name : " + bookName + " is now available on the shelf";  //To change body of implemented methods use File | Settings | File Templates.
    }

    public BookVO getBook(String title) {

        return bookMap.get(title);  //To change body of implemented methods use File | Settings | File Templates.
    }
}