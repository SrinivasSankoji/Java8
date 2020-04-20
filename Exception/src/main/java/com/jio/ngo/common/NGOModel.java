<<<<<<< HEAD
package com.jio.ngo.common;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class NGOModel implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String appName;
	private String startDate;
	private String endDate;
	private String occalert;
	private String businessTicket;
	private String childTicket;
	private String environment;
	private String severity;
	private String severityType;
	private String reportType;
	private String env;
	private String month;
	private String domainName;
	private List<String> ips;
	private String ipAddress;
	private String dbName;
	private BigDecimal port;
	private String user;
	private String inTime;
	private String outTime;
	private String changeRequest;
	private String domain;
	private String platform;
	private String sevCount;
	private String application;
	private String domainId;
	private String applicationName;
	private String category;
	private String name;
	private String columnName;
	private String dateTime;
	private int selectedWeek;
	private String region;
	private String jio;
	private String firstColumn;
	private String secondColumn;
	private String thirdColumn;
	private String key;
	private String commandType;
	private String commandSubType;
	private String matrixId;
	private String deviceId;
	private String technology;
	private String product;
	private String location;
	private String hallName;
	private String hallNo;
	private String rowName;
	private String rackName;
	private String sourceip;
	private String destip;
	private String destport;
	private String hostName;
	private String sid;
	private String password;
	private String dc;
	private String dclocation;
	private String halllocation;
	private String rowlocation;
	private String racklocation;
	private String slocation;
	
	private String rca_Tower;
	private String domain_Lead;
	private String rca_Plateform_Lead;
	private String problem_Manager;
	private String rca_Owner;
	private String duration;
	private String platform_Lead;
	private String default1;
	private String isSelf;
	private String iD;
	private String managerName;
	private String techId;
	private int firstResult;
	private int maxResult;
	private String tblSpace;
	private String queryName;
	private String targetName;
	private String query;
	private String serial;
	private String instId;
	private String priorty;
	private String priortyName;
	private String dbSid;
	private String data;
	private String metricName;
	
	private BigDecimal snap_id;
	private BigDecimal beginSnapId;
	private BigDecimal endSnapId;
	private String skill;
	private String status;
	private String certificate;
	
	private String jobName;
	private String actionOwner;
	private String exceptionName;
	private String serviceType;
	private String agingBucket;
	private String osType;
	private String portal;
	private String JobRole;
	private String self;
	
	private List<Object[]> jsonData;
	private String text;
	private int selectedMonth;
	private int selectedDay;
	private String startWeek;
	private String repoteeName;
	private String momStatus;
	private String momType;
    private String openStratWeek;
    private String appLead;
    private String datastoreTech;
    private String datastoreTechSupport;
    private String hostingTech;
    private String hostingTechSupport;
    private String additionalTech;
    private String hardwareType;
    private String osVersion;
    private String hostingFacility;
    private String description;
    private String selectedYear;
    private String technologyType;
    private String selectWeek;
    private String negative;
    private String meetingId;
    private String kpiName;
    private String zone;
    private String circle;
   
}
=======
package com.jio.ngo.common;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class NGOModel implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String appName;
	private String startDate;
	private String endDate;
	private String occalert;
	private String businessTicket;
	private String childTicket;
	private String environment;
	private String severity;
	private String severityType;
	private String reportType;
	private String env;
	private String month;
	private String domainName;
	private List<String> ips;
	private String ipAddress;
	private String dbName;
	private BigDecimal port;
	private String user;
	private String inTime;
	private String outTime;
	private String changeRequest;
	private String domain;
	private String platform;
	private String sevCount;
	private String application;
	private String domainId;
	private String applicationName;
	private String category;
	private String name;
	private String columnName;
	private String dateTime;
	private int selectedWeek;
	private String region;
	private String jio;
	private String firstColumn;
	private String secondColumn;
	private String thirdColumn;
	private String key;
	private String commandType;
	private String commandSubType;
	private String matrixId;
	private String deviceId;
	private String technology;
	private String product;
	private String location;
	private String hallName;
	private String hallNo;
	private String rowName;
	private String rackName;
	private String sourceip;
	private String destip;
	private String destport;
	private String hostName;
	private String sid;
	private String password;
	private String dc;
	private String dclocation;
	private String halllocation;
	private String rowlocation;
	private String racklocation;
	private String slocation;
	
	private String rca_Tower;
	private String domain_Lead;
	private String rca_Plateform_Lead;
	private String problem_Manager;
	private String rca_Owner;
	private String duration;
	private String platform_Lead;
	private String default1;
	private String isSelf;
	private String iD;
	private String managerName;
	private String techId;
	private int firstResult;
	private int maxResult;
	private String tblSpace;
	private String queryName;
	private String targetName;
	private String query;
	private String serial;
	private String instId;
	private String priorty;
	private String priortyName;
	private String dbSid;
	private String data;
	private String metricName;
	
	private BigDecimal snap_id;
	private BigDecimal beginSnapId;
	private BigDecimal endSnapId;
	private String skill;
	private String status;
	private String certificate;
	
	private String jobName;
	private String actionOwner;
	private String exceptionName;
	private String serviceType;
	private String agingBucket;
	private String osType;
	private String portal;
	private String JobRole;
	private String self;
	
	private List<Object[]> jsonData;
	private String text;
	private int selectedMonth;
	private int selectedDay;
	private String startWeek;
	private String repoteeName;
	private String momStatus;
	private String momType;
    private String openStratWeek;
    private String appLead;
    private String datastoreTech;
    private String datastoreTechSupport;
    private String hostingTech;
    private String hostingTechSupport;
    private String additionalTech;
    private String hardwareType;
    private String osVersion;
    private String hostingFacility;
    private String description;
    private String selectedYear;
    private String technologyType;
    private String selectWeek;
    private String negative;
    private String meetingId;
    private String kpiName;
    private String zone;
    private String circle;
   
}
>>>>>>> 015877d33c416a44442258f23eac1907bde167c8
