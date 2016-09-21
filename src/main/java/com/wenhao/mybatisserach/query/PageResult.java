package com.wenhao.mybatisserach.query;

import java.util.List;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class PageResult<T> {
    private int totalCount;//总条数
    private List<T> pageList;//分页后的数据
    private int pageSize;//每页多少条
    private int currentPage;//当前页

    public PageResult(int totalCount, List<T> pageList, int pageSize, int currentPage) {
        this.totalCount = totalCount;
        this.pageList = pageList;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }

    //获得总页数 计算方式 每页多少条/总共条数
    public int getTotalPage() {
        //pageSize % totalCount 如果为0  那就是刚好除尽  总页数就是pageSize / totalCount  否则 就 +1
        return pageSize % totalCount == 0 ? pageSize / totalCount : pageSize / totalCount + 1;
    }

    //获取上一页  如果当前页为1 就没有上一页 否则就是当前页-1
    public int getPrePage() {
        return currentPage > 1 ? currentPage - 1 : currentPage;
    }

    //获得下一页
    public int getNextPage() {
        return currentPage >= getTotalPage() ? currentPage : currentPage + 1;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "totalCount=" + totalCount +
                ", pageList=" + pageList +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                '}';
    }
}
