package com.zjrodger.e3mall.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemCat implements Serializable {
    /**
     * 类目ID
     */
    private Long id;

    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    private Long parentId;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 状态。可选值:1(正常),2(删除)
     */
    private Integer status;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    private Integer sortOrder;

    /**
     * 该类目是否为父类目，1为true，0为false
     */
    private Byte isParent;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 创建时间
     */
    private Date updated;

    /**
     * 类目ID
     * @return id 类目ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 类目ID
     * @param id 类目ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 父类目ID=0时，代表的是一级的类目
     * @return parent_id 父类目ID=0时，代表的是一级的类目
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 父类目ID=0时，代表的是一级的类目
     * @param parentId 父类目ID=0时，代表的是一级的类目
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 类目名称
     * @return name 类目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 类目名称
     * @param name 类目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 状态。可选值:1(正常),2(删除)
     * @return status 状态。可选值:1(正常),2(删除)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态。可选值:1(正常),2(删除)
     * @param status 状态。可选值:1(正常),2(删除)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     * @return sort_order 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     * @param sortOrder 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 该类目是否为父类目，1为true，0为false
     * @return is_parent 该类目是否为父类目，1为true，0为false
     */
    public Byte getIsParent() {
        return isParent;
    }

    /**
     * 该类目是否为父类目，1为true，0为false
     * @param isParent 该类目是否为父类目，1为true，0为false
     */
    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
    }

    /**
     * 创建时间
     * @return created 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 创建时间
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 创建时间
     * @return updated 创建时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 创建时间
     * @param updated 创建时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

	@Override
	public String toString() {
		return "TbItemCat [id=" + id + ", parentId=" + parentId + ", name="
				+ name + ", status=" + status + ", sortOrder=" + sortOrder
				+ ", isParent=" + isParent + ", created=" + created
				+ ", updated=" + updated + "]";
	}
    
}