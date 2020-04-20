package com.jio.ngo.winterbe.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Writer implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private List<Book> books;

}
