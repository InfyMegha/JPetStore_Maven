package com.olam.score.party.util;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.olam.score.common.dto.SearchCriteria;
import com.olam.score.party.domain.MasterParty;

public class PartySpecification implements Specification<MasterParty> {
	
	private SearchCriteria criteria;
	 
    public PartySpecification(SearchCriteria criteria){
    	this.criteria=criteria;
    }

	@Override
	public Predicate toPredicate(Root<MasterParty> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

            if (root.get(criteria.getKey()).getJavaType() == String.class) {
                return builder.like(
                  root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
            } else {
                return builder.equal(root.get(criteria.getKey()), criteria.getValue());
            }
    
	}

}
