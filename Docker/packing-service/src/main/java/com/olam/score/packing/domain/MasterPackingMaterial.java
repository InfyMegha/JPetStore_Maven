/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olam.score.packing.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ramachandran_n02
 */
@Entity
@Table(name = "MASTER_PACKING_MATERIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MasterPackingMaterial.findAll", query = "SELECT m FROM MasterPackingMaterial m")})
public class MasterPackingMaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
	@SequenceGenerator(name="MASTER_PACKING_MATERIAL_PK_ID_GENERATOR", sequenceName="packing.PACKING_MATERIAL_ID_SEQ",initialValue = 10, allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MASTER_PACKING_MATERIAL_PK_ID_GENERATOR")
    @Basic(optional = false)
    @NotNull
    @Column(name = "PK_PACKING_MATERIAL_ID")
    private Integer pkPackingMaterialId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PACKING_MATERIAL_CODE")
    private String packingMaterialCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "PACKING_MATERIAL_NAME")
    private String packingMaterialName;
    @Size(max = 1000)
    @Column(name = "PACKING_MATERIAL_DESC")
    private String packingMaterialDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PACKING_MATERIAL_WEIGHT")
    private BigDecimal packingMaterialWeight;
    @Column(name = "PACKING_MATERIAL_IS_BULK")
    private String packingMaterialIsBulk;
    @Column(name = "FK_STATUS_ID")
    private Integer fkStatusId;
    @Column(name = "FK_UOM_ID")
    private Integer fkUomId;
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

    public String getPackingMaterialIsBulk() {
		return packingMaterialIsBulk;
	}

	public void setPackingMaterialIsBulk(String packingMaterialIsBulk) {
		this.packingMaterialIsBulk = packingMaterialIsBulk;
	}

	public MasterPackingMaterial() {
    }

    public MasterPackingMaterial(Integer pkPackingMaterialId) {
        this.pkPackingMaterialId = pkPackingMaterialId;
    }

    public MasterPackingMaterial(Integer pkPackingMaterialId, String packingMaterialCode, String packingMaterialName) {
        this.pkPackingMaterialId = pkPackingMaterialId;
        this.packingMaterialCode = packingMaterialCode;
        this.packingMaterialName = packingMaterialName;
    }

    public Integer getPkPackingMaterialId() {
        return pkPackingMaterialId;
    }

    public void setPkPackingMaterialId(Integer pkPackingMaterialId) {
        this.pkPackingMaterialId = pkPackingMaterialId;
    }

    public String getPackingMaterialCode() {
        return packingMaterialCode;
    }

    public void setPackingMaterialCode(String packingMaterialCode) {
        this.packingMaterialCode = packingMaterialCode;
    }

    public String getPackingMaterialName() {
        return packingMaterialName;
    }

    public void setPackingMaterialName(String packingMaterialName) {
        this.packingMaterialName = packingMaterialName;
    }

    public String getPackingMaterialDesc() {
        return packingMaterialDesc;
    }

    public void setPackingMaterialDesc(String packingMaterialDesc) {
        this.packingMaterialDesc = packingMaterialDesc;
    }

    public BigDecimal getPackingMaterialWeight() {
        return packingMaterialWeight;
    }

    public void setPackingMaterialWeight(BigDecimal packingMaterialWeight) {
        this.packingMaterialWeight = packingMaterialWeight;
    }

    public Integer getFkStatusId() {
        return fkStatusId;
    }

    public void setFkStatusId(Integer fkStatusId) {
        this.fkStatusId = fkStatusId;
    }

    public Integer getFkUomId() {
        return fkUomId;
    }

    public void setFkUomId(Integer fkUomId) {
        this.fkUomId = fkUomId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPackingMaterialId != null ? pkPackingMaterialId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasterPackingMaterial)) {
            return false;
        }
        MasterPackingMaterial other = (MasterPackingMaterial) object;
        if ((this.pkPackingMaterialId == null && other.pkPackingMaterialId != null) || (this.pkPackingMaterialId != null && !this.pkPackingMaterialId.equals(other.pkPackingMaterialId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.olam.score.packing.domain.MasterPackingMaterial[ pkPackingMaterialId=" + pkPackingMaterialId + " ]";
    }
    
}
