package com.westernacher.internal.feedback.repository;

import com.westernacher.internal.feedback.domain.Appraisal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AppraisalRepository extends MongoRepository<Appraisal, String> {
    List<Appraisal> findAllByCycleId(String cycleId);
    Appraisal findOneByCycleIdAndUserId(String cycleId, String userId);
    List<Appraisal> findAllByCycleIdAndStatus(String cycleId, String status);
    Appraisal findByCycleIdAndUserId(String cycleId, String userId);

}
