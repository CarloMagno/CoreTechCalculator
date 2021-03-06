CREATE TABLE USERINFO 
(
  ID VARCHAR2(20 BYTE) 
, GB_HP NUMBER 
, PERCENTAGE_HP NUMBER 
, PRICE_PER_GB_GP NUMBER 
, GB_MP NUMBER 
, PERCENTAGE_MP NUMBER 
, PRICE_PER_GB_MP NUMBER 
, GB_ROP NUMBER 
, PERCENTAGE_ROP NUMBER 
, PRICE_PER_GB_ROP NUMBER 
, FACTOR NUMBER 
) 
LOGGING 
TABLESPACE "USERS" 
PCTFREE 10 
INITRANS 1 
STORAGE 
( 
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1 
  MAXEXTENTS 2147483645 
  BUFFER_POOL DEFAULT 
);
