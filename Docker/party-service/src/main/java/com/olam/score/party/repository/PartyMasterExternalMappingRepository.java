package com.olam.score.party.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.olam.score.party.domain.MasterPartyExternalMapping;

@Repository
public interface PartyMasterExternalMappingRepository extends JpaRepository<MasterPartyExternalMapping, Integer>,JpaSpecificationExecutor<MasterPartyExternalMapping> {

	@Query(value = "select externalMapping from MasterPartyExternalMapping externalMapping where "
			+ " externalMapping.fkExternalSystemRefId = :externalSystemRefId",nativeQuery=false)
	public List<MasterPartyExternalMapping> getSAPExternalSystemRef(@Param("externalSystemRefId") Integer externalSystemRefId);

}
