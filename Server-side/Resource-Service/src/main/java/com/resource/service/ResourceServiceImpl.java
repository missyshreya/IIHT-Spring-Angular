package com.resource.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.resource.entity.Resource;

@Service
public class ResourceServiceImpl implements IResourceService{

	List<Resource> list=List.of(
			new Resource(1L,"peter@gmail.com","peter", "React Dev", 10001L),
			new Resource(2L,"anchal@gmail.com","anchal", "Dev", 10002L),
			new Resource(3L,"isha@gmail.com","isha", "Java Dev", 10002L),
			new Resource(4L,"harish@gmail.com","harish", "Node Dev", 10003L),
			new Resource(5L,"ram@gmail.com","ram", "React Dev", 10004L),
			new Resource(6L,"vidya@gmail.com","vidya", "AWS Dev", 10004L),
			new Resource(7L,"abhi@gmail.com","abhi", "React Dev", 10005L),
			new Resource(8L,"ahana@gmail.com","ahana", "Dev", 10005L),
			new Resource(9L,"rishi@gmail.com","rishi", "Web Dev", 10006L),
			new Resource(10L,"ravi@gmail.com","ravi", "Java Dev", 10001L)
			);
	
	@Override
	public List<Resource> getResourceForUsers(Long userID){
		return list.stream().filter(resource -> resource.getUserID().equals(userID)).collect(Collectors.toList());
	}
}
