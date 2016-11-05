package com.yoyk.bankbuddy.model;

public class BankList_Model {
   private String bank_bank_logo;
   private String bank_care;
   private String bank_fav;
   private String bank_id;
   private String bank_inquiry;
   private String bank_name;

   public BankList_Model() {
   }

   public BankList_Model(String var1, String var2, String var3, String var4, String var5, String var6) {
      this.bank_id = var1;
      this.bank_name = var2;
      this.bank_inquiry = var3;
      this.bank_care = var4;
      this.bank_fav = var5;
      this.bank_bank_logo = var6;
   }

   public String getBank_bank_logo() {
      return this.bank_bank_logo;
   }

   public String getBank_care() {
      return this.bank_care;
   }

   public String getBank_fav() {
      return this.bank_fav;
   }

   public String getBank_id() {
      return this.bank_id;
   }

   public String getBank_inquiry() {
      return this.bank_inquiry;
   }

   public String getBank_name() {
      return this.bank_name;
   }

   public void setBank_bank_logo(String var1) {
      this.bank_bank_logo = var1;
   }

   public void setBank_care(String var1) {
      this.bank_care = var1;
   }

   public void setBank_fav(String var1) {
      this.bank_fav = var1;
   }

   public void setBank_id(String var1) {
      this.bank_id = var1;
   }

   public void setBank_inquiry(String var1) {
      this.bank_inquiry = var1;
   }

   public void setBank_name(String var1) {
      this.bank_name = var1;
   }
}
