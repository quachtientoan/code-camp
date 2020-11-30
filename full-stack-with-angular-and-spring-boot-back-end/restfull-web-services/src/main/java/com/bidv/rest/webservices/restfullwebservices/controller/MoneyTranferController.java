package com.bidv.rest.webservices.restfullwebservices.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidv.rest.webservices.restfullwebservices.entity.BankEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.MoneyTranferEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.RecipientAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.entity.SourceAccountEntity;
import com.bidv.rest.webservices.restfullwebservices.model.MoneyTranferModel;
import com.bidv.rest.webservices.restfullwebservices.service.BankService;
import com.bidv.rest.webservices.restfullwebservices.service.MoneyTranferService;
import com.bidv.rest.webservices.restfullwebservices.service.RecipientAccountService;
import com.bidv.rest.webservices.restfullwebservices.service.SourceAccountService;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class MoneyTranferController {

	@Autowired
	MoneyTranferService service;

	@Autowired
	SourceAccountService sourceAccountService;

	@Autowired
	BankService bankService;

	@Autowired
	RecipientAccountService recipientAccountService;

	public static final String START_STATUS = "Đang soạn";
	public static final String APPROVE_STATUS = "Phê duyệt";
	public static final String REJECT_STATUS = "Từ chối";

	@GetMapping("/api/user/{username}/money-tranfer")
	public List<MoneyTranferModel> getAll(@PathVariable("username") String username) {
		List<MoneyTranferModel> lst = new ArrayList<MoneyTranferModel>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<MoneyTranferEntity> moneyTranferLst = service.findAll();
		if (moneyTranferLst.size() > 0) {
			for (MoneyTranferEntity entity : moneyTranferLst) {
				SourceAccountEntity sourceAccountEntity = sourceAccountService.findById(entity.getSourceAccountId());
				RecipientAccountEntity recipientAccountEntity = recipientAccountService
						.findById(entity.getRecipientAccountId());
				BankEntity bankEntity = bankService.findById(entity.getReceivingBank());
				String moneyTranferDateStr = "";
				if (entity.getMoneyTranferDate() != null) {
					moneyTranferDateStr = sdf.format(entity.getMoneyTranferDate());
				}

				MoneyTranferModel model = new MoneyTranferModel(entity.getId(), entity.getMoneyTranferDate(),
						sourceAccountEntity, recipientAccountEntity, bankEntity, entity.getAmount(),
						entity.getContent(), entity.getPayer(), moneyTranferDateStr, entity.getStatus());
				lst.add(model);
			}
		}

//		SourceAccountEntity sourceAccountEntity = sourceAccountService.findById(10001);
//		RecipientAccountEntity recipientAccountEntity = recipientAccountService.findById(10001);
//		BankEntity bankEntity = bankService.findById(1001);
//		for (int i = 0; i < 1000; i++) {
//
//			MoneyTranferModel model = new MoneyTranferModel(i, new Date(), sourceAccountEntity, recipientAccountEntity,
//					bankEntity, i, "1", "Payer", sdf.format(new Date()), "Khởi tạo");
//			lst.add(model);
//		}

		return lst;
	}

	@GetMapping("/api/user/{username}/money-tranfer/{id}")
	public MoneyTranferModel getTodo(@PathVariable("username") String username, @PathVariable("id") Integer id) {
		MoneyTranferEntity entity = service.findById(id);
		SourceAccountEntity sourceAccountEntity = sourceAccountService.findById(entity.getSourceAccountId());
		RecipientAccountEntity recipientAccountEntity = recipientAccountService
				.findById(entity.getRecipientAccountId());
		BankEntity bankEntity = bankService.findById(entity.getReceivingBank());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String moneyTranferDateStr = "";
		if (entity.getMoneyTranferDate() != null) {
			moneyTranferDateStr = sdf.format(entity.getMoneyTranferDate());
		}
		MoneyTranferModel model = new MoneyTranferModel(entity.getId(), entity.getMoneyTranferDate(),
				sourceAccountEntity, recipientAccountEntity, bankEntity, entity.getAmount(), entity.getContent(),
				entity.getPayer(), moneyTranferDateStr, entity.getStatus());
		return model;

	}

	@PostMapping("/api/user/{username}/money-tranfer")
	public MoneyTranferEntity create(@PathVariable("username") String username, @RequestBody MoneyTranferModel model) {

		System.out.println("go here");
		MoneyTranferEntity entity = new MoneyTranferEntity();
		entity.setId(model.getId());
		entity.setAmount(model.getAmount());
		entity.setContent(model.getContent());
		entity.setMoneyTranferDate(model.getMoneyTranferDate());
		entity.setPayer(model.getPayer());
		entity.setStatus(model.getStatus());

		SourceAccountEntity sourceAccountEntity = sourceAccountService.findById(model.getSourceAccountEntity().getId());
		RecipientAccountEntity recipientAccountEntity = recipientAccountService
				.findById(model.getRecipientAccountEntity().getId());
		BankEntity bankEntity = bankService.findById(model.getBankEntity().getId());

		entity.setRecipientAccountId(recipientAccountEntity.getId());
		entity.setReceivingBank(bankEntity.getId());
		entity.setSourceAccountId(sourceAccountEntity.getId());
		return service.create(entity);
	}

	@DeleteMapping("/api/user/{username}/money-tranfer/{id}")
	public ResponseEntity<Void> deleteTrans(@PathVariable("username") String username, @PathVariable("id") Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

//	@PostMapping("/api/user/{username}/delete/money-tranfer")
//	public ResponseEntity<Void> deleteMultipleTrans(@PathVariable("username") String username, @RequestBody List<Integer> ids) {
//		System.out.println("go here");
//		service.deleteMultiple(ids);
//		return ResponseEntity.noContent().build();
//	}

}
