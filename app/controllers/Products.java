package controllers;

import java.util.List;

import models.Product;
import play.mvc.Controller;
import play.mvc.Result;

//import views.html.products.list;

public class Products extends Controller {

   public static Result list() {
      System.out.println("01");
      List<Product> products = Product.findAll();
      return ok();
   }

   public static Result newProduct() {
      System.out.println("02");
      return TODO;
   }

   public static Result details(String ean) {
      System.out.println("03");
      return TODO;
   }

   public static Result save() {
      System.out.println("04");
      return TODO;
   }

}
