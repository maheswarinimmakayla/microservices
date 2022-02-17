package com.mouritech.profilemanagementexample.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.profilemanagementexample.domain.EmployeeProfile;


@Repository
public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long>{

}


