package com.company;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
      get("/hello", (req, res) -> "Hello World");
      get("/math",(req,res) -> (4+4));
    }
}
