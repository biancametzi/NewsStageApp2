package com.example.bianc.newsstageapp1;

import java.util.Date;

public class News {
    /**
     * Title of the news
     */
    private String mTitle;

    /**
     * Section of the news
     */
    private String mSectionName;

    /**
     * Author of the news
     */
    private String mAuthor;

    /**
     * Publication date of the news
     */
    private Date mDateTime;

    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title       is the title of the news
     * @param sectionName is the section where the news happened
     * @param author      is the author's name
     * @param dateTime    is the publication date
     * @param url         is the website URL to find more details about the news
     */

    public News(String title, String sectionName, String author, Date dateTime, String url) {
        mTitle = title;
        mSectionName = sectionName;
        mAuthor = author;
        mDateTime = dateTime;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public Date getDateTime() {
        return mDateTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
