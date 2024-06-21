package Assignment5;
//
//1. Perform following operations for a website that maintains articles
//
//    1. List all the articles that were created in year 2023
//        2. List all the documents for subject "AI"
//        3. Group the articles by Subject
//    4. Count the articles by Subject
//    5. Count the articles that got more than 1k views
//    6. Group and count ARTICLES BY THE PUBLISHED YEARS
public class Articles
{
    private int year, views;
    private String sub,name;
    public Articles(String name, int year, String sub, int views)
    {
        this.name = name;
        this.year = year;
        this.sub = sub;
        this.views = views;
    }

    public int getYear() { return year;}
    public int getViews() {return views;}
    public String getSub() {return sub;}

    public String getName() {return name;}


    public String toString()
    {
        return "Name: "+name+", Year: "+year+", Subject: "+sub+", View: "+views;
    }
}
