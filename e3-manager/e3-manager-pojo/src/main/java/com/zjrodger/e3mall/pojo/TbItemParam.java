package com.zjrodger.e3mall.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemParam implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 商品类目ID
     */
    private Long itemCatId;

    /**
     * 
     */
    private Date created;

    /**
     * 
     */
    private Date updated;

    /**
     * 参数数据，格式为json格式
     */
    private String paramData;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商品类目ID
     * @return item_cat_id 商品类目ID
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * 商品类目ID
     * @param itemCatId 商品类目ID
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    /**
     * 
     * @return created 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 
     * @param created 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 
     * @return updated 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 参数数据，格式为json格式
     * @return param_data 参数数据，格式为json格式
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * 参数数据，格式为json格式
     * @param paramData 参数数据，格式为json格式
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }

	@Override
	public String toString() {
		return "TbItemParam [id=" + id + ", itemCatId=" + itemCatId
				+ ", created=" + created + ", updated=" + updated
				+ ", paramData=" + paramData + "]";
	}
}