package com.example.demo.serviceImp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bucketList.BucketList;
import com.example.demo.dao.RepositoryImp;
import com.example.demo.serviceInt.ServiceInt;
@Service
public class ServiceImp implements ServiceInt{
	@Autowired
	public RepositoryImp repositoryImp;

	@Override
	public List<BucketList> getallBucketList() {
		return repositoryImp.findAll();//why there is no getall ()
	}

	@Override
	public BucketList saveList(BucketList testModel) {
		return repositoryImp.save(testModel);
	}

	@Override
	public BucketList getList(int id) {
		return repositoryImp.findById(id).get();// is this get() for to show the data in that id
	}

	@Override
	public void deleteList(int id) {
		repositoryImp.deleteById(id);
	}
	

}
