package com.example.demo.serviceInt;

import java.util.List;

import com.example.demo.bucketList.BucketList;


public interface ServiceInt {
	
	public List<BucketList> getallBucketList();
	
	public BucketList saveList(BucketList testModel);
	
	public BucketList getList(int id);
	
	public void deleteList(int id);
	
}
