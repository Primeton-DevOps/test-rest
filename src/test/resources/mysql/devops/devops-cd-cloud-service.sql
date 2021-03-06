INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', 'name', 'devops', 'devops', 'sysadmin', 'SUBMITTED', 'email', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', 'name', 'devops', 'devops', 'sysadmin', 'OPEND', 'sms', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', 'name', 'devops', 'devops', 'sysadmin', 'OPEND', 'email', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('4', 'name', 'devops', 'devops', 'sysadmin', 'SUBMITTED', 'sms', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('5', 'name', 'devops', 'devops', 'sysadmin', 'REJECTED', 'email', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('6', 'name', 'devops', 'devops', 'sysadmin', 'REJECTED', 'sms', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('7', 'name', 'devops', 'devops', 'sysadmin', 'SUBMITTED', 'email', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('8', 'name', 'devops', 'devops', 'sysadmin', 'DELETED', 'sms', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('9', 'name', 'devops', 'devops', 'sysadmin', 'DELETED', 'email', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('10', 'name', 'devops', 'devops', 'sysadmin', 'SUBMITTED', 'sms', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service` (`CLOUD_SERVICE_ID`, `SERVICE_NAME`, `PROJECT_ID`, `DESCRIPTION`, `OWNER_ID`, `SERVICE_STATUS`, `NOTIFY_MODE`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('11', 'name', 'devops', 'devops', 'sysadmin', 'SUBMITTED', 'email', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');


INSERT INTO `dps_dlv_cloud_service_resource` (`RESOURCE_ID`, `RESOURCE_NAME`, `AGGREGATE_ID`, `CLOUD_SERVICE_ID`, `SERVICE_TYPE_ID`, `RESOURCE_DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('10001', 'resource1', '1', '1', '1'
		, '{\"items\":[{\"resourceType\":\"PM\",\"resourceSize\":2,\"attributes\":{\"ospass\":\"devops@cloud.com\",\"description\":\"紧急！紧急！紧急！！！重要的事说三遍！！！\",\"model\":\"tiny\",\"osuser\":\"zhangsan\",\"storage\":\"100GB\",\"osname\":\"CentOS-7.2-x86_64\"},\"advances\":{\"subnet\":\"11.11.11.255\",\"nettype\":\"flat\",\"cgroup\":\"default\",\"region\":\"shanghai\"},\"resources\":[{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:3e:11\",\"hostDomain\":\"domain11\",\"ipAddress\":\"192.168.2.11\",\"osUser\":\"zhangsan\",\"osName\":\"CentOS-7.2-x86_64\",\"hostModel\":\"tiny\",\"rootPass\":\"devops@cloud.com\"},{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:3e:12\",\"hostDomain\":\"domain12\",\"ipAddress\":\"192.168.2.12\",\"osUser\":\"zhangsan\",\"osName\":\"CentOS-7.2-x86_64\",\"hostModel\":\"tiny\",\"rootPass\":\"devops@cloud.com\"}]},{\"resourceType\":\"PM\",\"resourceSize\":2,\"attributes\":{\"ospass\":\"devops@cloud.com\",\"description\":\"希望申请到新采购的那批x86物理机！！！\",\"model\":\"normal\",\"osuser\":\"lisi\",\"storage\":\"200GB\",\"osname\":\"Ubuntu-16.04-x86_64\"},\"advances\":{\"subnet\":\"11.11.11.255\",\"nettype\":\"flat\",\"cgroup\":\"default\",\"region\":\"shanghai\"},\"resources\":[{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:4e:21\",\"hostDomain\":\"domain21\",\"ipAddress\":\"192.168.44.21\",\"osUser\":\"zhangsan\",\"osName\":\"Ubuntu-16.04-x86_64\",\"hostModel\":\"normal\",\"rootPass\":\"devops@cloud.com\"},{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:4e:22\",\"hostDomain\":\"domain22\",\"ipAddress\":\"192.168.44.22\",\"osUser\":\"zhangsan\",\"osName\":\"Ubuntu-16.04-x86_64\",\"hostModel\":\"normal\",\"rootPass\":\"devops@cloud.com\"}]}],\"status\":\"OPEND\"}'
		, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service_resource` (`RESOURCE_ID`, `RESOURCE_NAME`, `AGGREGATE_ID`, `CLOUD_SERVICE_ID`, `SERVICE_TYPE_ID`, `RESOURCE_DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('10002', 'resource2', '1', '1', '2'
		, '{\"items\":[{\"resourceType\":\"CONTAINER\",\"resourceSize\":1,\"attributes\":{\"flavor\":\"4C16G\",\"namespace\":\"product-region-123456\",\"description\":\"OpenShift ...\"},\"advances\":{\"region\":\"beijing\",\"cgroup\":\"default\"},\"resources\":[{\"flavor\":\"4C16G\",\"namespace\":\"product-region-123456\",\"description\":\"Kubernetes\",\"cgroup\":\"default\",\"region\":\"shanghai\"}]}],\"status\":\"OPEND\"}'
		, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

INSERT INTO `dps_dlv_cloud_service_resource` (`RESOURCE_ID`, `RESOURCE_NAME`, `AGGREGATE_ID`, `CLOUD_SERVICE_ID`, `SERVICE_TYPE_ID`, `RESOURCE_DETAIL`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('10003', 'resource3', '1', '2', '3'
		, '{\"items\":[{\"resourceType\":\"VM\",\"resourceSize\":2,\"attributes\":{\"ospass\":\"devops@cloud.com\",\"description\":\"VM, 紧急！紧急！紧急！！！重要的事说三遍！！！\",\"model\":\"tiny\",\"osuser\":\"zhangsan\",\"storage\":\"100GB\",\"osname\":\"CoreOS-Latest-x86_64\"},\"advances\":{\"subnet\":\"11.11.11.255\",\"nettype\":\"flat\",\"cgroup\":\"default\",\"region\":\"shanghai\"},\"resources\":[{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:3e:11\",\"hostDomain\":\"domain11\",\"ipAddress\":\"192.168.2.11\",\"osUser\":\"zhangsan\",\"osName\":\"CoreOS-Latest-x86_64\",\"hostModel\":\"tiny\",\"rootPass\":\"devops@cloud.com\"},{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:3e:12\",\"hostDomain\":\"domain12\",\"ipAddress\":\"192.168.2.12\",\"osUser\":\"zhangsan\",\"osName\":\"CoreOS-Latest-x86_64\",\"hostModel\":\"tiny\",\"rootPass\":\"devops@cloud.com\"}]},{\"resourceType\":\"PM\",\"resourceSize\":2,\"attributes\":{\"ospass\":\"devops@cloud.com\",\"description\":\"希望申请到新部署的云主机OpenStack！！！\",\"model\":\"normal\",\"osuser\":\"lisi\",\"storage\":\"200GB\",\"osname\":\"SUSE-12G-SP2-x86_64\"},\"advances\":{\"subnet\":\"11.11.11.255\",\"nettype\":\"flat\",\"cgroup\":\"default\",\"region\":\"shanghai\"},\"resources\":[{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:4e:21\",\"hostDomain\":\"domain21\",\"ipAddress\":\"192.168.44.21\",\"osUser\":\"zhangsan\",\"osName\":\"SUSE-12G-SP2-x86_64\",\"hostModel\":\"normal\",\"rootPass\":\"devops@cloud.com\"},{\"hostName\":\"uuid\",\"osPass\":\"devops@cloud.com\",\"macAddress\":\"02:79:60:0c:4e:22\",\"hostDomain\":\"domain22\",\"ipAddress\":\"192.168.44.22\",\"osUser\":\"zhangsan\",\"osName\":\"SUSE-12G-SP2-x86_64\",\"hostModel\":\"normal\",\"rootPass\":\"devops@cloud.com\"}]}],\"status\":\"OPEND\"}'
		, 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');