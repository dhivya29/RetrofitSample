package com.example.dhiviya.dhivya;

import com.google.gson.annotations.SerializedName;

import java.util.List;


class MyJson {
    @SerializedName("sitter")
    public Sitter sitter;

    public static class Category {
        @SerializedName("name")
        public String name;
    }

    public static class VideoThumb {
        @SerializedName("url")
        public String url;
        @SerializedName("width")
        public String width;
        @SerializedName("height")
        public String height;
    }

    public static class Images {
        @SerializedName("url")
        public String url;
        @SerializedName("width")
        public String width;
        @SerializedName("height")
        public String height;
    }

    public static class Comment_count {
        @SerializedName("totalCount")
        public String totalCount;
    }

    public static class User_name {
        @SerializedName("display_name")
        public String display_name;
    }

    public static class Profile_image {
        @SerializedName("IMAGE")
        public String IMAGE;
    }

    public static class Data {
        @SerializedName("id")
        public String id;
        @SerializedName("title")
        public String title;
        @SerializedName("description")
        public String description;
        @SerializedName("user_id")
        public String user_id;
        @SerializedName("post_date")
        public String post_date;
        @SerializedName("category")
        public List<Category> category;
        @SerializedName("typeMode")
        public String typeMode;
        @SerializedName("videoThumb")
        public List<VideoThumb> videoThumb;
        @SerializedName("sourceMode")
        public String sourceMode;
        @SerializedName("videoMode")
        public String videoMode;
        @SerializedName("youtube_url")
        public String youtube_url;
        @SerializedName("images")
        public List<Images> images;
        @SerializedName("userrespondstatus")
        public String userrespondstatus;
        @SerializedName("comment_count")
        public List<Comment_count> comment_count;
        @SerializedName("user_name")
        public List<User_name> user_name;
        @SerializedName("profile_image")
        public List<Profile_image> profile_image;
    }

    public static class Response {
        @SerializedName("status")
        public String status;
        @SerializedName("status_code")
        public int status_code;
        @SerializedName("status_message")
        public String status_message;
        @SerializedName("data")
        public List<Data> data;
    }

    public static class Sitter {
        @SerializedName("response")
        public Response response;
    }
//    @SerializedName("Item")
//    public Item Item;
//
//    public static class Content {
//        @SerializedName("Name")
//        public String Name;
//        @SerializedName("URL")
//        public String URL;
//    }
//
//    public static class Item {
//        @SerializedName("Content")
//        public List<Content> Content;
//    }

}