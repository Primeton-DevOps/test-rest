INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', 'dev', 'dev', 'Development zone', 1, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', 'sit', 'sit', 'Sit zone', 2, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', 'uat', 'uat', 'Uat zone', 3, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('4', 'lab', 'lab', 'Lab zone', 4, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('5', 'stage', 'stage', 'Stage zone', 5, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_datacenter` (`AGGREGATE_ID`, `AGGREGATE_NAME`, `ZONE`, `DESCRIPTION`, `DISPLAY_ORDER`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('6', 'prod', 'prod', 'Prod zone', 6, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');



INSERT INTO `dps_dlv_cloud_service_type` (`SERVICE_TYPE_ID`, `SERVICE_TYPE_NAME`, `CATALOG`, `DISPLAY_ORDER`, `DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', 'PM', 'PM', 1, 'PM', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_cloud_service_type` (`SERVICE_TYPE_ID`, `SERVICE_TYPE_NAME`, `CATALOG`, `DISPLAY_ORDER`, `DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', 'CONTAINER', 'CONTAINER', 2, 'CONTAINER', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_cloud_service_type` (`SERVICE_TYPE_ID`, `SERVICE_TYPE_NAME`, `CATALOG`, `DISPLAY_ORDER`, `DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', 'VM', 'VM', 3, 'VM', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');



INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('4', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('4', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('4', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('5', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('5', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('5', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('6', '1', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('6', '2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_r_datacenter_cloud_service_type` (`AGGREGATE_ID`, `SERVICE_TYPE_ID`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('6', '3', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');


