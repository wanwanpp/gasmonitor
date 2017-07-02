package com.gasmonitor.vo;

import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saplmm on 2017/6/23.
 */
public class AjaxResult<T> {
    public static Integer PAGE_SIZE = 2;
    private long total;
    private int page;
    private long totalPage;
    private List<T> data;


    public AjaxResult() {
    }

    public AjaxResult(T data) {
        this.data = new ArrayList<T>();
        if (data != null) {
            this.data.add(data);
        }

        this.setTotal(this.data.size());
        this.setPage(1);
        this.setTotalPage(1);
    }


    public AjaxResult(List<T> data) {
        this.data = data;
        if (data == null) {
            this.setTotal(0);
        } else {
            this.setTotal(data.size());
        }
        this.setPage(1);
        this.setTotalPage(1);
    }

    public static <M> AjaxResult<M> NewAjaxResult(List<M> t, long total, int page) {
        AjaxResult<M> r = new AjaxResult<M>();
        r.setData(t);
        r.setTotal(total);
        r.setPage(page);
        return r;
    }


    public static <M> AjaxResult<M> NewAjaxResult(Page<M> page) {
        AjaxResult<M> r = new AjaxResult<M>();
        r.setData(page.getContent());
        r.setPage(page.getNumber());
        r.setTotalPage(page.getTotalPages());
        r.setTotal(page.getTotalElements());
        return r;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "total=" + total +
                ", page=" + page +
                ", totalPage=" + totalPage +
                ", data=" + data +
                '}';
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

}
