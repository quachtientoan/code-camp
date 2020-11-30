-- todo
insert into todo(id, username,description,target_date,is_done)
values(10001, 'admin', 'Learn JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10002, 'admin', 'Learn Data JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10003, 'admin', 'Learn Microservices', sysdate(), false);

-- customer
insert into CUSTOMER(id, name,branch,created_date,age)
values(10001, 'toanqt', 'NHS', sysdate(), 27);

insert into CUSTOMER(id, name,branch,created_date,age)
values(10002, 'Hungnc', 'NHS', sysdate(), 27);

insert into CUSTOMER(id, name,branch,created_date,age)
values(10003, 'abc', 'NHS', sysdate(), 27);

-- user
insert into USER(id, username,password,email,role)
values(10001,'admin', '$2a$10$Iz51LzCXVqPs6idmYDFVGORITFGw5ygvTf3dZmiWQlMvaucSdLAwK', 'admin@bidv.com.vn', 'ADMIN');

insert into USER(id, username,password,email,role)
values(10002,'user', '$2a$10$o0lD.hmcCkKpssS5EVlHheRq0qiRnVCN2G3uKlxeaJLeEHKV9NiIu', 'user@bidv.com.vn', 'USER');
-- source account
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10001,'ADMIN1','19394838929292');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10002,'ADMIN2','848299294949484');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10003,'ADMIN3','848299294949484');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10004,'ADMIN4','848299294949484');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10005,'ADMIN5','848299294949484');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10006,'ADMIN6','848299294949484');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10007,'ADMIN7','848299294949484');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10008,'ADMIN8','848299294949484');


-- bank
insert into BANK(id, name)
values(10001,'BIDV');
insert into BANK(id, name)
values(10002,'VIETCOMBANK');
insert into BANK(id, name)
values(10003,'VIETINBANK');
insert into BANK(id, name)
values(10004,'TPBANK');

insert into BANK(id, name)
values(10005,'AGRIBANK');
insert into BANK(id, name)
values(10006,'VPBANK');
insert into BANK(id, name)
values(10007,'TECHCOMBANK');
insert into BANK(id, name)
values(10008,'SHINHAN BANK');
insert into BANK(id, name)
values(10009,'BAO VIET BANK');

-- recipient account
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10001,'NGUYEN VAN A1', '12349584949403');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10002,'NGUYEN VAN A2', '0003984929220949');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10003,'NGUYEN VAN A3', '12349584949403');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10004,'NGUYEN VAN A4', '12349584949403');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10005,'NGUYEN VAN A5', '12349584949403');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10006,'NGUYEN VAN A6', '12349584949403');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10007,'NGUYEN VAN A7', '12349584949403');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10008,'NGUYEN VAN A8', '12349584949403');



-- money tranfer list
--drop table if exists money_tranfer_view; 
--CREATE VIEW MONEY_TRANFER_VIEW
--AS
--SELECT m.id, m.amount,m.content,m.money_tranfer_date,m.payer, b.name as bank_name, r.name as recipient_account_name, s.name as source_account_name FROM MONEY_TRANFER m 
--LEFT JOIN BANK b  ON m.bank_id = b.id
--LEFT JOIN RECIPIENT_ACCOUNT r ON m.recipient_account_id = r.id
--LEFT JOIN SOURCE_ACCOUNT s ON m.source_account_id = s.id;

-- money tranfer
insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10001, 133333, '1', null,'Sender',10001,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10002, 133333, '2', null,'Sender',10002,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10003, 133333, '3', null,'Sender',10003,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10004, 133333, '4', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10006, 133333, '5', null,'Sender',10005,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10007, 133333, '6', null,'Sender',10006,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10008, 133333, '7', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10009, 133333, '8', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10010, 133333, '9', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10011, 133333, '10', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10012, 133333, '11', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10013, 133333, '12', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10014, 133333, '13', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10015, 133333, '14', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10016, 133333, '15', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10017, 133333, '16', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10018, 133333, '17', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10019, 133333, '18', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10020, 133333, '19', null,'Sender',10004,10001,10002,'Đang soạn');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10021, 133333, '20', null,'Sender',10004,10001,10002,'Đang soạn');
 	