package com.example.petproject;

import android.util.Log;

public class MainVM {
   private static final MainVM instance = null;
   public static int clickCountStored = 0;

   public static int getCount() {
      return  clickCountStored;
   }

   public static void setCount(int count) {
      clickCountStored = count;
      Log.d("15 count = ", String.valueOf(count));
   }

}
