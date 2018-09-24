package com.olam.score.reference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olam.score.reference.domain.MasterDocumentTypeRef;


@Repository
public interface DocumentTypeRepository extends JpaRepository<MasterDocumentTypeRef, Integer> {

}
