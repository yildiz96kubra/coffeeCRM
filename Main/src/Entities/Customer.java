package Entities;

import java.time.LocalDateTime;

import Abstract.IEntity;

public class Customer implements IEntity {

	public int Id;
	public String FirstName;
	public String LastName;
	public LocalDateTime DateOfBirth;
	public String NationalityId;
}
