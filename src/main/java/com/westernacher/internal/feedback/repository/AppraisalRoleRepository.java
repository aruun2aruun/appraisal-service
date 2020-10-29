package com.westernacher.internal.feedback.repository;


import com.westernacher.internal.feedback.domain.AppraisalGoal;
import com.westernacher.internal.feedback.domain.AppraisalRole;
import com.westernacher.internal.feedback.domain.AppraisalStatusType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AppraisalRoleRepository extends MongoRepository<AppraisalRole, String> {

    List<AppraisalRole> findAllByCycleId(String cycleId);
    AppraisalRole findByReviewerIdAndEmployeeIdAndCycleIdAndReviewerType(String reviewerId, String employeeId, String cycleId, AppraisalStatusType type);
    List<AppraisalRole> findByEmployeeIdAndCycleIdAndReviewerType(String employeeId, String cycleId, AppraisalStatusType type);
    List<AppraisalRole> findByEmployeeIdAndCycleId(String employeeId, String cycleId);

    List<AppraisalRole> findByEmployeeIdAndCycleIdAndReviewerTypeAndCompleteIs(String employeeId, String cycleId, AppraisalStatusType type, boolean isComplete);


}
