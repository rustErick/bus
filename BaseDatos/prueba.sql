CREATE TABLE products(
    id INT(11),
    name VARCHAR(30) NOT NULL,
    price INT(11),
    PRIMARY KEY (id)
);

CREATE TABLE stocks( 
    product_id INT(11),
    opening_stock INT(11),
    current_stock INT(11),
    PRIMARY KEY (product_id)
);

CREATE TABLE stocks_add( 
    product_id INT(11),
    entry_date DATE,
    quantity INT(11),
    PRIMARY KEY (product_id,entry_date)
);
Insert into products set id=101, name='Bag' , price=1000;
Insert into products set id=102, name='Pen' , price=100;
Insert into products set id=103, name='Pencil' , price=50;

Insert into stocks set product_id=101, opening_stock=200 , current_stock=100;
Insert into stocks set product_id=102, opening_stock=230 , current_stock=150;
Insert into stocks set product_id=103, opening_stock=220 , current_stock=300;

Insert into stocks_add set product_id=103, entry_date='2018-01-01',quantity=30;
Insert into stocks_add set product_id=103, entry_date='2018-01-02',quantity=50;
Insert into stocks_add set product_id=103, entry_date='2018-01-03',quantity=45;

DELIMITER //

CREATE TRIGGER products_after_delete
AFTER DELETE
ON products FOR EACH ROW

BEGIN
DELETE FROM stocks WHERE product_id = old.id;
END;
//

delete from products where id = 101;
select * from products;
select * from stocks;

DELIMITER //
CREATE TRIGGER stocks_before_update
BEFORE UPDATE
ON stocks_add FOR EACH ROW
BEGIN
UPDATE stocks SET current_stock=current_stock+(new.quantity-old.quantity)
WHERE product_id = old.product_id;
END;
//


update stocks_add set quantity=20 where product_id=103 and entry_date='2018-01-01';
select * from stocks;
select * from stocks_add;
