package com.mouritech.profilemanagementexample.service;

import java.util.List;

import com.mouritech.profilemanagementexample.domain.EmployeeProfile;

public interface EmployeeProfileService {
	void addEmployeeProfile(EmployeeProfile empProfile);
	List<EmployeeProfile> getEmployeeProfiles();
}
