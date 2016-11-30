
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', 'dev1', 'dev1', '开发1区', '1', 'sysadmin', now(), 'anymous', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', 'dev2', 'dev2', '开发2区', '2', 'sysadmin', now(), 'anymous', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', 'dev3', 'dev3', '开发3区', '3', 'sysadmin', now(), 'anymous', now(), 'sysadmin');

INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('4', 'test1', 'test1', '测试1区', '4', 'sysadmin', now(), 'anymous', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('5', 'test2', 'test2', '测试2区', '5', 'sysadmin', now(), 'anymous', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('6', 'test3', 'test3', '测试3区', '6', 'sysadmin', now(), 'anymous', now(), 'sysadmin');

INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('7', 'product1', 'product1', '生产1区', '7', 'sysadmin', now(), 'anymous', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('8', 'product2', 'product2', '生产2区', '8', 'sysadmin', now(), 'anymous', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('9', 'product3', 'product3', '生产3区', '9', 'sysadmin', now(), 'anymous', now(), 'sysadmin');


INSERT INTO `dps_dlv_cloud_service_type` (`SERVICE_TYPE_ID`, `SERVICE_TYPE_NAME`, `CATALOG`, `DISPLAY_ORDER`, `DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', 'PM', 'PM', 1, 'PM', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_cloud_service_type` (`SERVICE_TYPE_ID`, `SERVICE_TYPE_NAME`, `CATALOG`, `DISPLAY_ORDER`, `DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', 'CONTAINER', 'CONTAINER', 2, 'CONTAINER', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_cloud_service_type` (`SERVICE_TYPE_ID`, `SERVICE_TYPE_NAME`, `CATALOG`, `DISPLAY_ORDER`, `DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', 'VM', 'VM', 3, 'VM', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');


INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('4', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('5', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('6', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('7', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('8', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('9', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

