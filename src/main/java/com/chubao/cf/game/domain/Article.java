package com.chubao.cf.game.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 创建者: 程峰
 * 创建时间: 16/1/16 下午10:56
 * 任务号:
 * 创建说明: 文章bean
 */
public class Article {

    /**
     * 文章Id
     */
    private Integer articleId;
    /**
     * 用户Id
     */
    private Integer userId;
    /**
     * 标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 海报Url
     */
    private String post;
    /**
     * 添加日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date timeAdded;
    /**
     * 编辑日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date timeEdit;
    /**
     * 是否删除
     */
    private Boolean delete;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Date getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Date timeAdded) {
        this.timeAdded = timeAdded;
    }

    public Date getTimeEdit() {
        return timeEdit;
    }

    public void setTimeEdit(Date timeEdit) {
        this.timeEdit = timeEdit;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}
