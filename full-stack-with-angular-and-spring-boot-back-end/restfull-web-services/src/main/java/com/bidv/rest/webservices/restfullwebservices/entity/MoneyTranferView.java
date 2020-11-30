//package com.bidv.rest.webservices.restfullwebservices.entity;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//import org.hibernate.annotations.Immutable;
//import org.springframework.format.annotation.DateTimeFormat;
//
//@Table(name = "MONEY_TRANFER_VIEW")
//@Entity
//public class MoneyTranferView {
//
//		@Id
//		private Integer id;
//		
//		@Column(name = "MONEY_TRANFER_DATE")
//		private Date moneyTranferDateData;
//
//		@Column(name = "SOURCE_ACCOUNT_NAME")
//		private String sourceAccountName;
//
//		@Column(name = "RECIPIENT_ACCOUNT_NAME")
//		private String recipientAccountName;
//
//		@Column(name = "BANK_NAME")
//		private String bankName;
//
//		@Column(name = "AMOUNT")
//		private Integer amount;
//		
//		@Column(name = "CONTENT")
//		private String content;
//		
//		@Column(name = "PAYER")
//		private String payer;
//		
//		@Transient
//		private String moneyTranferDate;
//
//		public Integer getId() {
//			return id;
//		}
//
//		public void setId(Integer id) {
//			this.id = id;
//		}
//
//		public String getMoneyTranferDate() {
//			return moneyTranferDate;
//		}
//
//		public void setMoneyTranferDate(String moneyTranferDate) {
//			this.moneyTranferDate = moneyTranferDate;
//		}
//
//		public String getSourceAccountName() {
//			return sourceAccountName;
//		}
//
//		public void setSourceAccountName(String sourceAccountName) {
//			this.sourceAccountName = sourceAccountName;
//		}
//
//		public String getRecipientAccountName() {
//			return recipientAccountName;
//		}
//
//		public void setRecipientAccountName(String recipientAccountName) {
//			this.recipientAccountName = recipientAccountName;
//		}
//
//		
//
//		public Integer getAmount() {
//			return amount;
//		}
//
//		public void setAmount(Integer amount) {
//			this.amount = amount;
//		}
//
//		public String getContent() {
//			return content;
//		}
//
//		public void setContent(String content) {
//			this.content = content;
//		}
//
//		public String getBankName() {
//			return bankName;
//		}
//
//		public void setBankName(String bankName) {
//			this.bankName = bankName;
//		}
//
//		public String getPayer() {
//			return payer;
//		}
//
//		public void setPayer(String payer) {
//			this.payer = payer;
//		}
//
//		public MoneyTranferView(Integer id, String moneyTranferDate, String sourceAccountName,
//				String recipientAccountName, String bankName, Integer amount, String content, String payer) {
//			super();
//			this.id = id;
//			this.moneyTranferDate = moneyTranferDate;
//			this.sourceAccountName = sourceAccountName;
//			this.recipientAccountName = recipientAccountName;
//			this.bankName = bankName;
//			this.amount = amount;
//			this.content = content;
//			this.payer = payer;
//		}
//
//		public MoneyTranferView() {
//			super();
//		}
//		
//		
//		
//		
//
//}
