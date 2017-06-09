CREATE DATABASE gasmonitor;
#所有客户，其中system,admin为初始化用户，其tenant_id =‘0000000000’
# 表示
CREATE TABLE user (
  id        INT(11)      NOT NULL AUTO_INCREMENT,
  login_id  VARCHAR(100) NOT NULL,
  name      VARCHAR(100) NOT NULL,
  password  VARCHAR(40)  NOT NULL,
  status    INT          NOT NULL, #0,disable >1 enable 1:enable 2:logined
  tenant_id VARCHAR(16)  NOT NULL, #0:sysadmin
  site_id   VARCHAR(16),
  lastLogin DATE,
  PRIMARY KEY (id)
)
  ENGINE = myisam
  DEFAULT CHARSET utf8;
#对应于每个客户,对应的测量数据为measurement+id
CREATE TABLE tenant (
  id           INT(11)      NOT NULL AUTO_INCREMENT,
  name         VARCHAR(100) NOT NULL,
  address      VARCHAR(400) NOT NULL,
  contact      VARCHAR(400) NOT NULL,
  phone        VARCHAR(100) NOT NULL,
  create_date  DATE,
  user_upper   INT, #upper limited number of users
  device_upper INT, #upper limited number of devices
  site_upper   INT, #upper limited number of site those 3 limited number are checked when create a tenant,device,site.
  status       INT, #0:disable 1:enable
  PRIMARY KEY (id)
)
  ENGINE = myisam
  DEFAULT CHARSET utf8;
#对应于原有的地点
CREATE TABLE site (
  id        INT(11)        NOT NULL AUTO_INCREMENT,
  name      VARCHAR(400)   NOT NULL,
  longitude DECIMAL(10, 7) NOT NULL,
  latitude  DECIMAL(10, 7) NOT NULL,
  # parent     VARCHAR(16),
  PRIMARY KEY (id)
)
  ENGINE = myisam
  DEFAULT CHARSET utf8;
#specification 对应原有的工艺参数
CREATE TABLE specification (
  id                INT(11)      NOT NULL AUTO_INCREMENT,
  name              VARCHAR(400) NOT NULL,
  sampleInterval    INT          NOT NULL, #interval second of sample
  workFlowUpper     INT          NOT NULL, #upper flow of operating condition
  standardFlowUpper INT          NOT NULL, #upper flow of standard condtion
  temperatureUpper  INT          NOT NULL, #upper temperature
  pressureUpper     INT          NOT NULL, #upper pressure
  PRIMARY KEY (id)
)
  ENGINE = myisam
  DEFAULT CHARSET utf8;

CREATE TABLE device (
  id          VARCHAR(32)  NOT NULL, #对应出厂ID号码
  tokenId     VARCHAR(32)  NOT NULL, #对应原有的密码
  name        VARCHAR(400) NOT NULL,
  logic       INT          NOT NULL, #logic =1 ,physical=0
  watcher     VARCHAR(400) NOT NULL,
  phone       VARCHAR(40)  NOT NULL, #watcher's phone
  created     DATE,
  status      INT          NOT NULL, #running =1 ,stop=0
  parent      VARCHAR(16), #parent id of  device
  specication INT(11)      NOT NULL,
  siteId      INT(11),
  #warning threshold

  PRIMARY KEY (id)
)
  ENGINE = myisam
  DEFAULT CHARSET utf8;
#threshold of warning  ,一个设备可以多个记录，created最近的 且status 有效
#的为实际应用规则
CREATE TABLE threshold (
  id                INT         NOT NULL,
  hardware          VARCHAR(32) NOT NULL, #device id
  standardFlowUpper INT         NOT NULL, #
  temperatureUpper  INT         NOT NULL, #
  temperatureLow    INT         NOT NULL, #
  pressureUpper     INT         NOT NULL, #
  pressureLow       INT         NOT NULL, #
  status            INT         NOT NULL, #enable =1 ,disable=0
  created           DATE, #parent id of  device
  PRIMARY KEY (id)
)
  ENGINE = myisam
  DEFAULT CHARSET utf8;
#measurement,测量数据，如果采用 mysql，建议每个tenant生成一个measurement+id表
#如果tenant id=1,则生成以下表;influxdb,每个tenant也生成一个表
CREATE TABLE measurement1 (
  id           INT         NOT NULL,
  hardware     VARCHAR(32) NOT NULL, #device id
  workFlow     FLOAT       NOT NULL,
  standardFlow FLOAT       NOT NULL, #
  temperature  FLOAT       NOT NULL, #
  pressure     FLOAT       NOT NULL, #
  sumFlow      FLOAT       NOT NULL,
  pointTime    DATETIME    NOT NULL, #测量时间
  PRIMARY KEY (id)
)
  ENGINE = myisam
  DEFAULT CHARSET utf8;