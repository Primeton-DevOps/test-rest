INSERT INTO `dps_dlv_platform` (`PLATFORM_ID`, `PLATFORM_NAME`, `ASSEMBLY_ID`, `PLATFORM_TP_ID`, `DESCRIPTION`, `TO_PLATFORMS`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('1', 'mysql', '1', '1', 'MySQL', '', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_platform` (`PLATFORM_ID`, `PLATFORM_NAME`, `ASSEMBLY_ID`, `PLATFORM_TP_ID`, `DESCRIPTION`, `TO_PLATFORMS`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('3', 'tomcat', '1', '3', 'Tomcat', '1,2', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');
INSERT INTO `dps_dlv_platform` (`PLATFORM_ID`, `PLATFORM_NAME`, `ASSEMBLY_ID`, `PLATFORM_TP_ID`, `DESCRIPTION`, `CREATE_USER`, `CREATE_TIME`, `UPDATE_USER`, `UPDATE_TIME`, `TENANT_ID`) 
	VALUES ('2', 'redis', '1', '2', 'Redis', 'sysadmin', now(), 'sysadmin', now(), 'sysadmin');

