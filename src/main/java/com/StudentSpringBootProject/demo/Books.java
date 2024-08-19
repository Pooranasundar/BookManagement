package com.StudentSpringBootProject.demo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Books {
		
		@Id
		private int id;
		private String name;
		private String desc;
		private String author;
		private int price;
		
		public Books()
		{
			
		}
		
		public Books(int id, String name, String desc, String author, int price) 
		{
			super();
			this.id = id;
			this.name = name;
			this.desc = desc;
			this.author = author;
			this.price = price;
		}

		public int getId()
		{
			return id;
		}
		
		public void setId(int id) 
		{
			this.id = id;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getDesc() 
		{
			return desc;
		}
		
		public void setDesc(String desc)
		{
			this.desc = desc;
		}
		
		public String getAuthor() 
		{
			return author;
		}
		
		public void setAuthor(String author) 
		{
			this.author = author;
		}
		
		public int getPrice()
		{
			return price;
		}
		
		public void setPrice(int price)
		{
			this.price = price;
		}

		@Override
		public String toString()
		{
			return "Books [id=" + id + ", name=" + name + ", desc=" + desc + ", author=" + author + ", price=" + price
					+ "]";
		}
		
}
