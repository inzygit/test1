package com.example.demo.repositoryInt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bucketList.BucketList;

@Repository
public interface RepositoryInt extends JpaRepository<BucketList, Integer> {
	
}
