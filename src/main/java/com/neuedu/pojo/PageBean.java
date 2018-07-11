package com.neuedu.pojo;

public class PageBean {
	private Integer pageSize=4;
	private Integer pageNum=1;
	private Integer withPage=1;
	private Integer startPage=0;
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		setStartPage(pageNum,pageSize);
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		setStartPage(pageNum,pageSize);
	}
	public Integer getWithPage() {
		return withPage;
	}
	public void setWithPage(Integer withPage) {
		this.withPage = withPage;
	}
	private void setStartPage(Integer pageNum,Integer pageSize) {
		this.startPage=(pageNum-1)*pageSize;
	}
}
