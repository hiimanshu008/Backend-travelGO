package com.Travellgo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travellgo.Entity.Feedback;

public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

}
