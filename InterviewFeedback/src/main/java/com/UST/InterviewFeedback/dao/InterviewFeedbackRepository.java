package com.UST.InterviewFeedback.dao;

import com.UST.InterviewFeedback.Entity.InterviewFeedback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewFeedbackRepository extends PagingAndSortingRepository<InterviewFeedback, Long> {
}