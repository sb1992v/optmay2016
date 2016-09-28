package com.two95.mvn.soap.book.shelf;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookShelfService {

    @WebMethod
    public  String insertBook(BookVO bookVO);
    @WebMethod
    public  BookVO getBook(String title);
}