package tn.esprit.spring.service;

import java.util.List;
import java.util.Set;


import tn.esprit.spring.entities.likes;



public interface LikeService {
	List<likes> retrieveAllRates();

	likes addRate(likes e,int id1i,int id2);

	void deletePosts(int id);

	likes updateComment(likes e);

	/*Post retrievePostWithMostlikess();
	List<likes> retrieveListPostWithMostlikess();*/


}