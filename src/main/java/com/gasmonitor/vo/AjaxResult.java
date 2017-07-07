package com.gasmonitor.vo;

import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saplmm on 2017/6/23.
 */
public class AjaxResult<T> {
    public static Integer PAGE_SIZE = 5;
    public final static int CODE_ERROR = -1;
    public final static int CODE_SUCC = 1;
    public final static String MSG_ERROR = "失败";
    public final static String MSG_SUCC = "成功";

    private int code;
    private String msg;
    private long total;
    private int page;
    private long totalPage;
    private List<T> data;


    public AjaxResult() {
        this.setCode(CODE_SUCC);
        this.setMsg(MSG_SUCC);
    }

    public AjaxResult(T data) {
        this();
        this.data = new ArrayList<T>();
        if (data != null) {
            this.data.add(data);
        }
        this.setTotal(this.data.size());
        this.setPage(1);
        this.setTotalPage(1);
    }


    public AjaxResult(List<T> data) {
        this();
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

    //返回一个默认的错误信息
    public static AjaxResult ErrorAjaxResult() {
        AjaxResult a = new AjaxResult();
        a.setCode(CODE_ERROR);
        a.setMsg(MSG_ERROR);
        return a;
    }

    public static AjaxResult ErrorAjaxResult(String msg) {
        AjaxResult a = new AjaxResult();
        a.setCode(CODE_ERROR);
        a.setMsg(msg);
        return a;
    }

    //返回一个默认的成功信息
    public static AjaxResult SuccAjaxResult() {
        AjaxResult a = new AjaxResult();
        a.setCode(CODE_SUCC);
        a.setMsg(MSG_SUCC);
        return a;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
