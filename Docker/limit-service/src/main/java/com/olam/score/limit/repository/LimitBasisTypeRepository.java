package com.olam.score.limit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olam.score.limit.domain.MasterLimitBasisTypeRef;

public interface LimitBasisTypeRepository extends JpaRepository<MasterLimitBasisTypeRef, Integer> {

	/*
	 * @Query(value = "select grade from MasterLimit grade" +
	 * " where grade.gradeName = :gradeName", nativeQuery = false) MasterLimit
	 * findByName(@Param("gradeName") String gradeName);
	 * 
	 * @Query(value = "select grade from MasterLimit grade" +
	 * " where grade.gradeCode = :gradeCode", nativeQuery = false) MasterLimit
	 * findByCode(@Param("gradeCode") String gradeCode);
	 */

}
