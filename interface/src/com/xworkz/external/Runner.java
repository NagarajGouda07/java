package com.xworkz.external;

import com.xworkz.internal.ApolloHospitals;
import com.xworkz.internal.BangaloreRailwayStation;
import com.xworkz.internal.BangaloreTrafficRules;
import com.xworkz.internal.BankRule;
import com.xworkz.internal.CollegeRule;
import com.xworkz.internal.CollegeRuleImpl;
import com.xworkz.internal.HospitalRule;
import com.xworkz.internal.IskconTemple;
import com.xworkz.internal.RailwayStationRule;
import com.xworkz.internal.SBIBankRule;
import com.xworkz.internal.TempleRule;
import com.xworkz.internal.TrafficRule;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HospitalRule
		HospitalRule hospital = new ApolloHospitals();
		System.out.println(hospital.maintainSilence());
		System.out.println(hospital.followVisitingHours());
		System.out.println(hospital.noSmoking());

		System.out.println("******************************");
		

		// TrafficRule
		TrafficRule traffic = new BangaloreTrafficRules();
		traffic.stopAtRedLight();
		traffic.wearHelmet();
		traffic.useSeatBelt();
		traffic.obeySpeedLimits();
		traffic.noMobilePhone();
		traffic.useIndicators();
		traffic.followLaneDiscipline();
		traffic.noDrunkDriving();
		traffic.followPedestrianSignals();
		traffic.useHornResponsibly();
		traffic.yieldToEmergencyVehicles();
		traffic.parkLegally();
		traffic.obeySchoolZoneRules();
		traffic.followConstructionZoneSigns();
		traffic.avoidRoadRage();
		System.out.println("******************************");

		// CollegeRule
		CollegeRule college = new CollegeRuleImpl();
		college.attendClasses();
		college.submitAssignments();
		college.maintainDiscipline();
		college.noPlagiarism();
		college.respectFaculty();
		college.respectClassmates();
		college.maintainAttendance();
		college.followLibraryRules();
		college.participateInExtracurriculars();
		college.obeyCollegeTimings();
		System.out.println("******************************");

		// TempleRule
		TempleRule temple = new IskconTemple();
		System.out.println(temple.removeShoes());
		System.out.println(temple.maintainCleanliness());
		System.out.println(temple.LoudTalking());
		System.out.println(temple.noPhotography());
		System.out.println(temple.respectPriests());
		System.out.println(temple.followTempleQueue());
		System.out.println(temple.donateGenerously());
		System.out.println(temple.followRituals());
		System.out.println(temple.dressModestly());
		System.out.println(temple.noEatingInside());
		System.out.println("******************************");

		// RailwayStationRule
		RailwayStationRule railwayStation = new BangaloreRailwayStation();
		railwayStation.buyTicketBeforeEntry();
		railwayStation.followTrainSchedule();
		railwayStation.waitInQueue();
		railwayStation.noSpitting();
		railwayStation.noLittering();
		railwayStation.noSmoking();
		railwayStation.obeySecurityCheck();
		railwayStation.followPlatformRules();
		railwayStation.useFootOverBridge();
		railwayStation.listenToAnnouncements();
		railwayStation.helpDisabledPeople();
		railwayStation.giveWayToBoardingPassengers();
		railwayStation.respectRailwayStaff();
		railwayStation.maintainSilenceInWaitingArea();
		railwayStation.noHawkingWithoutPermission();
		System.out.println("******************************");

		// BankRule
		BankRule bank = new SBIBankRule();
		bank.maintainQueue();
		bank.provideIDProof();
		bank.followWithdrawalLimits();
		bank.useATMsResponsibly();
		bank.noBribery();
		bank.respectBankStaff();
		bank.fillFormsCorrectly();
		bank.updateKYCDetails();
		bank.maintainAccountBalance();
		bank.noLoitering();
		bank.followLockerRules();
		bank.noSmoking();
		bank.obeyTimings();
		bank.keepPersonalBelongingsSecure();
		bank.respectConfidentiality();
		System.out.println("******************************");
	}
}
