/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olam.score.terms.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ramachandran_N02
 */
@Entity
@Table(name = "MASTER_APPROVAL_TERMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MasterApprovalTerms.findAll", query = "SELECT m FROM MasterApprovalTerms m")})
public class MasterApprovalTerms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PK_APPROVAL_TERMS_ID")
    private Integer pkApprovalTermsId;
    @Size(max = 200)
    @Column(name = "APPROVAL_TERMS_NAME")
    private String approvalTermsName;
    @Size(max = 20)
    @Column(name = "APPROVAL_TERMS_CODE")
    private String approvalTermsCode;
    @Size(max = 1000)
    @Column(name = "APPROVAL_TERMS_DESC")
    private String approvalTermsDesc;
    @Size(max = 100)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Size(max = 100)
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Column(name = "FK_STATUS_ID")
    private Integer fkStatusId;
    @Size(max = 500)
    @Column(name = "CUSTOM_ATTRIBUTE_1")
    private String customAttribute1;
    @Size(max = 500)
    @Column(name = "CUSTOM_ATTRIBUTE_2")
    private String customAttribute2;
    @Size(max = 500)
    @Column(name = "CUSTOM_ATTRIBUTE_3")
    private String customAttribute3;
    @Size(max = 500)
    @Column(name = "CUSTOM_ATTRIBUTE_4")
    private String customAttribute4;
    @Size(max = 500)
    @Column(name = "CUSTOM_ATTRIBUTE_5")
    private String customAttribute5;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CUSTOM_ATTRIBUTE_6")
    private Double customAttribute6;
    @Column(name = "CUSTOM_ATTRIBUTE_7")
    private Double customAttribute7;
    @Column(name = "CUSTOM_ATTRIBUTE_8")
    private Double customAttribute8;

    public MasterApprovalTerms() {
    }

    public MasterApprovalTerms(Integer pkApprovalTermsId) {
        this.pkApprovalTermsId = pkApprovalTermsId;
    }

    public Integer getPkApprovalTermsId() {
        return pkApprovalTermsId;
    }

    public void setPkApprovalTermsId(Integer pkApprovalTermsId) {
        this.pkApprovalTermsId = pkApprovalTermsId;
    }

    public String getApprovalTermsName() {
        return approvalTermsName;
    }

    public void setApprovalTermsName(String approvalTermsName) {
        this.approvalTermsName = approvalTermsName;
    }

    public String getApprovalTermsCode() {
        return approvalTermsCode;
    }

    public void setApprovalTermsCode(String approvalTermsCode) {
        this.approvalTermsCode = approvalTermsCode;
    }

    public String getApprovalTermsDesc() {
        return approvalTermsDesc;
    }

    public void setApprovalTermsDesc(String approvalTermsDesc) {
        this.approvalTermsDesc = approvalTermsDesc;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getFkStatusId() {
        return fkStatusId;
    }

    public void setFkStatusId(Integer fkStatusId) {
        this.fkStatusId = fkStatusId;
    }

    public String getCustomAttribute1() {
        return customAttribute1;
    }

    public void setCustomAttribute1(String customAttribute1) {
        this.customAttribute1 = customAttribute1;
    }

    public String getCustomAttribute2() {
        return customAttribute2;
    }

    public void setCustomAttribute2(String customAttribute2) {
        this.customAttribute2 = customAttribute2;
    }

    public String getCustomAttribute3() {
        return customAttribute3;
    }

    public void setCustomAttribute3(String customAttribute3) {
        this.customAttribute3 = customAttribute3;
    }

    public String getCustomAttribute4() {
        return customAttribute4;
    }

    public void setCustomAttribute4(String customAttribute4) {
        this.customAttribute4 = customAttribute4;
    }

    public String getCustomAttribute5() {
        return customAttribute5;
    }

    public void setCustomAttribute5(String customAttribute5) {
        this.customAttribute5 = customAttribute5;
    }

    public Double getCustomAttribute6() {
        return customAttribute6;
    }

    public void setCustomAttribute6(Double customAttribute6) {
        this.customAttribute6 = customAttribute6;
    }

    public Double getCustomAttribute7() {
        return customAttribute7;
    }

    public void setCustomAttribute7(Double customAttribute7) {
        this.customAttribute7 = customAttribute7;
    }

    public Double getCustomAttribute8() {
        return customAttribute8;
    }

    public void setCustomAttribute8(Double customAttribute8) {
        this.customAttribute8 = customAttribute8;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkApprovalTermsId != null ? pkApprovalTermsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasterApprovalTerms)) {
            return false;
        }
        MasterApprovalTerms other = (MasterApprovalTerms) object;
        if ((this.pkApprovalTermsId == null && other.pkApprovalTermsId != null) || (this.pkApprovalTermsId != null && !this.pkApprovalTermsId.equals(other.pkApprovalTermsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.olam.score.terms.domain.MasterApprovalTerms[ pkApprovalTermsId=" + pkApprovalTermsId + " ]";
    }
    
}
