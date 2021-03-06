package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.Evaluation;
import model.Medicine;
import model.Patient;
import model.PatientModel;
import model.Visit;
import view.*;
/**
 * 
 * The controllor class of our project. 
 * This is for our MVC pattern implementation
 *
 */
public class PatientController {

	private static JFrame frame;
	private static PatientModel patientModel;
	/**
	 * constructor for patient controller
	 * @param frame frame to draw the pages
	 * @param model the model to keep track of information 
	 */

	public PatientController(JFrame frame, PatientModel model) {
		this.frame = frame;
		patientModel = model;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PatientModel model = new PatientModel();
		PatientController control = new PatientController(frame, model);
		MenuPage menu = new MenuPage(frame);
		GotoReqInputListener r = new GotoReqInputListener();
		GotoDatabaseListener d = new GotoDatabaseListener();
		menu.addRegisterListener(r);
		menu.addViewListener(d);

	}

	/**
	 * Sends to Page 2(ReqInfoPage)
	 * Adds what the model should do with the information for each actionlistener
	 * Calls the approrpiate actionlisteners for each page it goes to
	 * should check if the previous page's text is filled out b4 letting it advance to Page 3(OptInfoPage)
	 * Can return to Page 1(MenuPage)
	 */
	static class GotoReqInputListener implements ActionListener {
	

		public void actionPerformed(ActionEvent e) {
			ReqInfoPage reqInfo = new ReqInfoPage(frame);
			GotoMenuListener b = new GotoMenuListener();
			GotoOptInfoListener n = new GotoOptInfoListener(reqInfo); // maybe take previous page a parameter for action
																		// listeners to see if fields put in
			reqInfo.addBackListener(b);
			reqInfo.addNextListener(n);
		}
	}
 	/**
	 * Starts Page 1(MenuPage)
	 * 
	 * options to go to Page 2(ReqInfoPage) or Page 7(PatientDataPage)
	 *
	 */
	static class GotoMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			MenuPage menu = new MenuPage(frame);
			if (menu.isUndo()) {
				menu.hideUndo();
			}

			GotoReqInputListener r = new GotoReqInputListener();
			GotoDatabaseListener d = new GotoDatabaseListener();
			menu.addRegisterListener(r);
			menu.addViewListener(d);

		}

	}
	
	/**
	 * Sends to Page 3(OptInfoPage)
	 * 
	 * options to go to Page 4(TinHypInputPage) or Page 2(ReqInfoPage)
	 *
	 */
	static class GotoOptInfoListener implements ActionListener {
		ReqInfoPage reqInfo;
		boolean isCheckReqInfo;
		/**
		 * constructor for taking in the required info 
		 * @param reqInfo the reqInfoPage to extract information 
		 */
		public GotoOptInfoListener(ReqInfoPage reqInfo) {
			this.reqInfo = reqInfo;
			isCheckReqInfo = true;
		}

		public GotoOptInfoListener() {
			isCheckReqInfo = false;
		}

		public void actionPerformed(ActionEvent e) {

			if (isCheckReqInfo) {
				String[] info = reqInfo.getRequiredInfo();

				for (String a : info) {
					System.out.println(a);
					if (a.isEmpty()) {
						return;
						// error message
					}
				}

				// adding a new patient into the patient list
				// what if you go next next and then come back again? Maybe have it delete the
				// first patient everytime because if you dont
				// need to check if texts are empty, then you are going back. Going back means
				// you already created a new patient but now want to go back.
				Patient patient = new Patient(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7],
						info[8], info[9], info[10], info[11], info[12], info[13], info[14]);

				patientModel.addPatient(patient);

			}

			OptInfoPage optInfo = new OptInfoPage(frame);
			GotoReqInputListener b = new GotoReqInputListener();
			GotoTinHypStatusListener n = new GotoTinHypStatusListener(optInfo);

			// adding the rest of optional information of a patient

			optInfo.addBackListener(b);
			optInfo.addNextListener(n);

		}

	}

	/**
	 * Sends to Page 4(TinHypInputPage)
	 * 
	 * options to go to Page 5(InputMedPage) or Page 3(OptInfoPage)
	 *
	 */
	static class GotoTinHypStatusListener implements ActionListener {
		OptInfoPage optInfo;
		boolean isCheckOptional;

		public GotoTinHypStatusListener() {
			isCheckOptional = false;
		}
		/**
		 * constructor to signal to extract information from OptInfoPage
		 * @param optInfo the page
		 */
		public GotoTinHypStatusListener(OptInfoPage optInfo) {
			this.optInfo = optInfo;
			isCheckOptional = true;
		}

		public void actionPerformed(ActionEvent e) {
			if (isCheckOptional) {
				Patient patient = patientModel.getPatient(patientModel.getSize() - 1);
				patient.setOccupation(optInfo.getOccupation());
				patient.setWorkStatus(optInfo.getWorkStatus());
				patient.setEduDeg(optInfo.getEducationDegree());

			}
			TinHypInputPage tinHyp = new TinHypInputPage(frame);
			GotoOptInfoListener b = new GotoOptInfoListener();
			GotoInputMedListener n = new GotoInputMedListener(tinHyp);
			tinHyp.addBackListener(b);
			tinHyp.addNextListener(n);

		}

	}

	/**
	 * Sends to Page 5(InputMedPage)
	 * 
	 * options to go to Page 6(MenuPage with undo) or Page 4(TinHypInputPage)
	 *
	 */
	static class GotoInputMedListener implements ActionListener {
		private InputMedPage inputMedPage;
		private boolean isCheckMedicine;
		private TinHypInputPage page;
		private boolean isCheckStatus;

		public GotoInputMedListener() {
			isCheckMedicine = false;
			isCheckStatus = false;
		}
		/**
		 * constructor to check extract infromation from InputMedPage
		 * @param page InputMedPage
		 */
		public GotoInputMedListener(InputMedPage page) {
			inputMedPage = page;
			isCheckMedicine = true;
			isCheckStatus = false;
		}
		/**
		 * constructor to check extract infromation from TinHypInputPage
		 * @param page the page to extract info 
		 */
		public GotoInputMedListener(TinHypInputPage page) {
			isCheckMedicine = false;
			isCheckStatus = true;
			this.page = page;
		}

		public void actionPerformed(ActionEvent e) {
			if (isCheckMedicine) {
				String[] medInfo = inputMedPage.getRequiredInfo();
				for (String a : medInfo) {
					if (a.isEmpty()) {
						// error
						return;
					}

				}
				Medicine med = new Medicine(medInfo[0], medInfo[1], medInfo[2], medInfo[3], medInfo[4], medInfo[5],
						medInfo[6], medInfo[7], medInfo[8]);
				System.out.println(medInfo[0] + medInfo[1] + medInfo[2] + medInfo[3] + medInfo[4] + medInfo[5]
						+ medInfo[6] + medInfo[7] + medInfo[8]);
				Patient patient = patientModel.getPatient(patientModel.getSize() - 1);

				patient.addMedicine(med);
				for (Medicine a : patient.getMedicine()) {
					System.out.println(a);
				}

			}
			if (isCheckStatus) {
				Patient patient = patientModel.getPatient(patientModel.getSize() - 1);
				patient.setTinAndCusDesc(page.getTinHypStatus());
				System.out.print(patient);
			}
			InputMedPage inputMedPage = new InputMedPage(frame);
			GotoTinHypStatusListener b = new GotoTinHypStatusListener();
			GotoInputMedListener m = new GotoInputMedListener(inputMedPage);
			// figure out how do to do undo button
			GotoUndoMenuListener f = new GotoUndoMenuListener();
			inputMedPage.addBackListener(b);
			inputMedPage.addNextListener(m);
			inputMedPage.addFinishListener(f);
		}

	}

	/**
	 * 
	 * sends to Page 6(MenuPage with undo)
	 * You can only hit undo once.
	 *
	 * options to go to Page 2(ReqInfoPage) or Page 7(PatientDataPage), or Page 1(MenuPage without undo button)
	 */
	static class GotoUndoMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MenuPage undoMenu = new MenuPage(frame, true);
			GotoReqInputListener r = new GotoReqInputListener();
			GotoDatabaseListener d = new GotoDatabaseListener();
			UndoPatientListener m = new UndoPatientListener();

			undoMenu.addRegisterListener(r);
			undoMenu.addViewListener(d);
			undoMenu.addUndoListener(m);
		}

	}

	/**
	 * Once you undo a patient in Page 1(MenuPage)
	 * 
	 * acts like normal Page 1(MenuPage). 
	 * 
	 * options to go to Page 2(ReqInfoPage) or Page 7(PatientDataPage)
	 *
	 */
	static class UndoPatientListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MenuPage undoMenu = new MenuPage(frame);
			patientModel.undoPatient();
			GotoReqInputListener r = new GotoReqInputListener();
			GotoDatabaseListener d = new GotoDatabaseListener();
			undoMenu.addRegisterListener(r);
			undoMenu.addViewListener(d);

		}
	}

	/**
	 * sends to Page 8(PatientInfoPage)
	 * 
	 * options to go to Page 9(PatientMedListPage) or Page 7(PatientDataPage)
	 *
	 */
		static class GotoInfoListener implements ActionListener {
		PatientDataPage db;
		boolean isCheckSelected;
		Patient patient;
		/**
		 * constructor to check extract infromation from PatientDataPage
		 * @param page the page 
		 */
		public GotoInfoListener(PatientDataPage db) {
			this.db = db;
			isCheckSelected = true;
		}
		/**
		 * Constructor that takes in patient to display its information 
		 * @param p the patient displayed 
		 */
		public GotoInfoListener(Patient p)
		{
			patient =p; 
		}

		public void actionPerformed(ActionEvent e) {
			if (isCheckSelected == true) {
				if (db.isPatientSelected() == true) // then button will work
				{
					Patient patient = db.whichPatient();
					PatientInfoPage infoPage = new PatientInfoPage(frame, patient.getInfo());
					GotoDatabaseListener GotoData = new GotoDatabaseListener();
					GotoMedicationListener GotoMedication = new GotoMedicationListener(patient);
					infoPage.addBackListener(GotoData);
					infoPage.addNextListener(GotoMedication);

					infoPage.addUpdateListener((a) -> {
						String[] info = infoPage.getEditedInfo();
						patient.setPatientID(info[0]);
						patient.setDateAdded(info[1]);
						patient.setFirstName(info[2]);
						patient.setLastName(info[3]);
						patient.setBirthDay(info[4]);
						patient.setGender(info[5]);
						patient.setPhoneNum(info[6]);
						patient.setSocialSecureNum(info[7]);
						patient.setAddress(info[8]);
						patient.setAddress2(info[9]);
						patient.setCity(info[10]);
						patient.setState(info[11]);
						patient.setZip(info[12]);
						patient.setCountry(info[13]);
						patient.setInsuranceNum(info[14]);
						patient.setOccupation(info[15]);
						patient.setWorkStatus(info[16]);
						patient.setEduDeg(info[17]);
						patient.setTinAndCusDesc(info[18]);
					}

					// make medication listener
					// infoPage.addNextListener(medicationP);
					);
				}
			}
			else
			{
				
				PatientInfoPage infoPage = new PatientInfoPage(frame, patient.getInfo());
				GotoDatabaseListener GotoData = new GotoDatabaseListener();
				GotoMedicationListener GotoMedication = new GotoMedicationListener(patient);
				infoPage.addBackListener(GotoData);
				infoPage.addNextListener(GotoMedication);

				infoPage.addUpdateListener((a) -> {
					String[] info = infoPage.getEditedInfo();
					patient.setPatientID(info[0]);
					patient.setDateAdded(info[1]);
					patient.setFirstName(info[2]);
					patient.setLastName(info[3]);
					patient.setBirthDay(info[4]);
					patient.setGender(info[5]);
					patient.setPhoneNum(info[6]);
					patient.setSocialSecureNum(info[7]);
					patient.setAddress(info[8]);
					patient.setAddress2(info[9]);
					patient.setCity(info[10]);
					patient.setState(info[11]);
					patient.setZip(info[12]);
					patient.setCountry(info[13]);
					patient.setInsuranceNum(info[14]);
					patient.setOccupation(info[15]);
					patient.setWorkStatus(info[16]);
					patient.setEduDeg(info[17]);
					patient.setTinAndCusDesc(info[18]);
				
				});
			}
			

		}
	}
	/**
	 * sends to Page 11(VisitInfoPage)
	 * 
	 * options to go to Page 12(AudioEvalPage) or Page 7(PatientDataPage)
	 *
	 */	
	static class GotoAddVisitListener implements ActionListener {
		PatientDataPage db;
		/**
		 * Constructor for going to addVisit 
		 * @param db the database so we can get the selected patient 
		 */
		public GotoAddVisitListener(PatientDataPage db) {
			this.db = db;
		}

		public void actionPerformed(ActionEvent e) {

			if (db.isPatientSelected() == true) // then button will work
			{
				VisitInfoPage visitInfoPage = new VisitInfoPage(frame, db.whichPatient().getLastName());
				GotoDatabaseListener databaseListener = new GotoDatabaseListener(); 
				visitInfoPage.addBackListener(databaseListener); 
				GotoInputAudEvalListener b = new GotoInputAudEvalListener(db, visitInfoPage);
				visitInfoPage.addNextListener(b);
				// VisitInfoPage visitPage = new VisitInfoPage(frame,
				// db.whichPatient().getInfo());
			}

		}
	}
	/**
	 * sends to Page 12(AudioEvalPage)
	 * 
	 * options to go to Page 13(CategoryPage) or Page 11(VisitInfoPage)
	 *
	 */
	static class GotoInputAudEvalListener implements ActionListener{
		private boolean isAddVisit; 
		private PatientDataPage db; 
		VisitInfoPage visitInfoPage; 
		/**
		 * Constructor for going to AudioEvalPage when previous page needs to be processed
		 * @param db the patient data page to get patient 
		 * @param visitInfoPage visit info page to get the visit 
		 */
		public GotoInputAudEvalListener(PatientDataPage db, VisitInfoPage visitInfoPage)
		{
			isAddVisit = true; 
			this.db = db; 
			this.visitInfoPage = visitInfoPage; 

		}
		/**
		 * Constructor where previous page need not be processed
		 * @param db to get selected patient 
		 */
		public GotoInputAudEvalListener(PatientDataPage db)
		{
			this.db = db; 
			isAddVisit = false; 
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (isAddVisit)
			{
				String[] visitInfo = visitInfoPage.getInfo(); 
				Visit visit = new Visit(visitInfo[0], visitInfo[1], visitInfo[2], visitInfo[3], visitInfoPage.isSoundTherapyChecked(), visitInfoPage.isEarMeasureChecked(), visitInfoPage.isCounselChecked());
				db.whichPatient().addVisit(visit); 
			}
			AudioEvalPage audioEvalPage = new AudioEvalPage(frame, db.whichPatient().getLastName());
			GotoAddVisitListener addVisitListener = new GotoAddVisitListener(db); 
			audioEvalPage.addBackListener(addVisitListener);
			GotoAssignCategoryListener categoryListener = new GotoAssignCategoryListener(db, audioEvalPage);
			audioEvalPage.addNextListener(categoryListener); 
			
		}
	}
	
	
	/**
	 * sends to page 13(CategoryPage)
	 * 
	 *options to go to Page 7(PatientDataPage), 8(PatientInfoPage), 9(PatientMedListPage), 12(AudioEvalPage)
	 *
	 */
	static class GotoAssignCategoryListener implements ActionListener{
		PatientDataPage db; 
		boolean isAddEval; 
		AudioEvalPage audioEvalPage; 
		/**
		 * Constructor to process previous page 
		 * @param db for selected patient 
		 * @param audioEvalPage the previous page 
		 */
		public GotoAssignCategoryListener(PatientDataPage db, AudioEvalPage audioEvalPage)
		{
			this.db = db; 
			this.audioEvalPage = audioEvalPage;
			this.isAddEval = true;
		}
		/**
		 * constructor with no need to process previous page 
		 * @param db the database page with the selected patient 
		 */
		public GotoAssignCategoryListener(PatientDataPage db)
		{
			this.db = db;
			isAddEval = false; 
			
		}
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (isAddEval)
			{
				String[] evalInfo = audioEvalPage.getInfo(); 
				Evaluation eval = new Evaluation(evalInfo[0],evalInfo[1],evalInfo[2],evalInfo[3],evalInfo[4],evalInfo[5],evalInfo[6],evalInfo[7],evalInfo[8],evalInfo[9],evalInfo[10],evalInfo[11], evalInfo[12]);
				db.whichPatient().getLastVisit().setEvaluation(eval);
				
				
			}
			CategoryPage catPage = new CategoryPage(frame, db.whichPatient().getLastName()); 
			GotoInputAudEvalListener b = new GotoInputAudEvalListener(db);
			GotoDatabaseListener f = new GotoDatabaseListener(catPage, db.whichPatient());
			GotoMedicationListener m  = new GotoMedicationListener(db.whichPatient());
			GotoInfoListener mh = new GotoInfoListener(db.whichPatient());
			
			catPage.addBackListener(b);
			catPage.addFinishListener(f);
			catPage.addMedicationListener(m);
			catPage.addMedHistoryListener(mh);
			
		}
	}
	
	/**
	 * sends to Page 7(PatientDataPage)
	 * deletes patient from the selected list in Page 7(PatientDataPage)
	 * 
	 * refer to GotoDatabaseListener for options
	 *
	 */
	static class GotoDeleteListener implements ActionListener {
		PatientDataPage db;
		/**
		 * constructor to delete patient 
		 * @param db the patient data  page 
		 */
		public GotoDeleteListener(PatientDataPage db) {
			this.db = db;
		}

		public void actionPerformed(ActionEvent e) {

			if (db.isPatientSelected() == true) // then button will work
			{
				patientModel.removePatient(db.whichPatient()); // deletes patient

				PatientDataPage database = new PatientDataPage(frame, patientModel.patientList);
				GotoMenuListener m = new GotoMenuListener();
				GotoReqInputListener n = new GotoReqInputListener();
				GotoInfoListener i = new GotoInfoListener(database);
				GotoAddVisitListener v = new GotoAddVisitListener(database);
				GotoDeleteListener d = new GotoDeleteListener(database);
				GotoAddHistoryListener h = new GotoAddHistoryListener(database);
				GotoScheduleListener s = new GotoScheduleListener(database);

				database.addInfoListener(i);
				database.addVisitListener(v);
				database.addDeleteListener(d);
				database.addHistoryListener(h);
				database.addScheduleListener(s);

				database.addBackListener(m);
				database.addNextListener(n);
			}

		}
	}
	/**
	 * sends to Page 14(VisitHistPage)
	 * 
	 * options to go to Page 15(SpecificVisitInfoPage), Page 7(PatientDataPage) ,and Page 16 (SpecificAudioEvalPage)
	 *
	 */
	static class GotoAddHistoryListener implements ActionListener {
		PatientDataPage db;
		boolean isCheckSelected; 
		/**
		 * constructor to process previous page 
		 * @param db the datapage 
		 */
		public GotoAddHistoryListener(PatientDataPage db) {
			this.db = db;
			isCheckSelected = true; 
		}
		/**
		 * constructor with no need to check previous page 
		 * @param db the data page 
		 * @param isCheckSelected if need to check previous page 
		 */
		public GotoAddHistoryListener(PatientDataPage db, boolean isCheckSelected)
		{
			this.db = db; 
			isCheckSelected = false; 
		}

		public void actionPerformed(ActionEvent e) {
			if (isCheckSelected == true)
			{

				if (db.isPatientSelected() == true) // then button will work
				{
					VisitHistPage historyPage = new VisitHistPage(frame, db.whichPatient().getDoneVisit(),
						db.whichPatient().getFirstName(), db.whichPatient().getLastName());

					GotoDatabaseListener d = new GotoDatabaseListener();
					GotoVisitInfoListener i = new GotoVisitInfoListener( db,  historyPage);
					GotoSpecificAudioEvalListener a = new GotoSpecificAudioEvalListener(db, historyPage);
					

					historyPage.addBackListener(d);
					
					historyPage.addInfoListener(i);
					historyPage.addEvaluationListener(a);

				}
			}
			else
			{
				VisitHistPage historyPage = new VisitHistPage(frame, db.whichPatient().getDoneVisit(),
						db.whichPatient().getFirstName(), db.whichPatient().getLastName());

					GotoDatabaseListener d = new GotoDatabaseListener();
					GotoVisitInfoListener i = new GotoVisitInfoListener( db,  historyPage);
					GotoSpecificAudioEvalListener a = new GotoSpecificAudioEvalListener(db, historyPage);
					

					historyPage.addBackListener(d);
					historyPage.addInfoListener(i);
					historyPage.addEvaluationListener(a);
				
			}
			

		}
	}
	/**
	 * sends to Page 15(SpecificVisitInfoPage)
	 * 
	 * options to go to Page 14(VisitHistPage)
	 *
	 */
	static class GotoVisitInfoListener implements ActionListener {
		PatientDataPage db; 
		VisitHistPage historyPage; 
		/**
		 * constructor to take in info to display a visit. 
		 * @param db the patient data page 
		 * @param historyPage the visit history page 
		 */
		public GotoVisitInfoListener(PatientDataPage db, VisitHistPage historyPage)
		{
			this.db = db;
			this.historyPage = historyPage; 
		}

		public void actionPerformed(ActionEvent e) {
			if (historyPage.isVisitSelected() == true)
			{
				Patient patient = db.whichPatient();
				Visit visit = historyPage.whichVisit(); 
				SpecificVisitInfoPage specVisInfoPage = new SpecificVisitInfoPage(frame, patient.getLastName(), visit.getSeqNum(), visit.getDate(), visit.getSeqNum(), visit.getTreatmentProgress(), 
						visit.getInterviewForm(), visit.isSoundTherapy(), visit.isRealEarMeasurement(), visit.isCounseling()); 
				GotoAddHistoryListener aDListener = new GotoAddHistoryListener(db, false); 
				specVisInfoPage.addBackListener(aDListener);
				
				specVisInfoPage.addNextListener((a) -> {
					
					String[] info = specVisInfoPage.getInfo(); 
					visit.setDate(info[0]);
					visit.setSeqNum(info[1]);
					visit.setTreatmentProgress(info[2]);
					visit.setInterviewForm(info[3]);
					visit.setSoundTherapy(specVisInfoPage.isSoundTherapyChecked());
					visit.setRealEarMeasurement(specVisInfoPage.isEarMeasureChecked());
					visit.setCounseling(specVisInfoPage.isCounselChecked());
					
				});
				
					
				
						
						
						
			
			}

			// add stuff

		}
	}
	


	/**
	 * 
	 * Sends to Page 16(SpecificAudioEvalPage)
	 * 
	 * options to go to Page 14(VisitHistPage) or edit Information.
	 *
	 */
	static class GotoSpecificAudioEvalListener implements ActionListener {
		private PatientDataPage db;
		private VisitHistPage vh; 
		/**
		 * constructor to go to specific audio evaluation
		 * @param db the data page 
		 * @param vh the visit history page 
		 */
		public GotoSpecificAudioEvalListener(PatientDataPage db, VisitHistPage vh )
		{
			this.db = db;
			this.vh = vh; 
		}

		public void actionPerformed(ActionEvent e) {

			
			if (vh.isVisitSelected() == true)
			{
				Patient patient = db.whichPatient();
				Visit visit = vh.whichVisit(); 
				Evaluation eval = visit.getEvaluation(); 
				SpecificAudioEvalPage evalPage = new SpecificAudioEvalPage(frame, patient.getLastName(),
						eval.getLeftLDL(), eval.getRightLDL(), eval.getTinPitch(),eval.getTinMatch(),eval.getMatchType(), eval.getHearingThreshold(),
						eval.getlMinMasking(), eval.getrMinMasking(), eval.getAudioComment(), eval.getStartX(), eval.getStartY(), eval.getEndX(), eval.getEndY(),eval.getCategoryLvl());
				GotoAddHistoryListener aDListener = new GotoAddHistoryListener(db, false); 
				evalPage.addBackListener(aDListener);
				evalPage.addNextListener((h)-> 
				{
					String[] info = evalPage.getInfo(); 
					eval.setLeftLDL(info[0]);
					eval.setRightLDL(info[1]);
					eval.setTinPitch(info[2]);
					eval.setTinMatch(info[3]);
					eval.setMatchType(info[4]);
					eval.setHearingThreshold(info[5]);
					eval.setlMinMasking(info[6]);
					eval.setrMinMasking(info[7]);
					eval.setAudioComment(info[8]);
					eval.setStartX(info[9]);
					eval.setStartY(info[10]);
					eval.setEndX(info[11]);
					eval.setEndY(info[12]);
					eval.setCategoryLvl(info[13]);
					
				});
			}

		}
	}



	/**
	 * 
	 * Handles Page 7 (PatientDataPage's popup)
	 * 
	 * popup deletes itself upon entering info.
	 * resends to updated Page 7(refer to GotoDatabaseListener for options) if conditions met
	 *
	 */
	static class GotoScheduleListener implements ActionListener
	{
		PatientDataPage db;
		/**
		 * constructor for scheduling pop up 
		 * @param db the data page 
		 */
		public GotoScheduleListener(PatientDataPage db)
		{
			this.db = db;
		}
		public void actionPerformed(ActionEvent e)
		{
			
			if(db.isPatientSelected() == true) //then button will work
			{
				
				db.addPopup();
				GotoEnterScheduleListener es = new GotoEnterScheduleListener(db.whichPatient());
				 JFrame popup= db.addEnterListener(es);
				 es.retrieveJFrame(popup);
				
			}
			
		}
	}
	
	/**
	 * sends to Page 7
	 * 
	 * refer to GotoDatabaseListener for options
	 *
	 */
	static class GotoEnterScheduleListener implements ActionListener
	{
		Patient p;
		JFrame popup;
		/**
		 * constructor to enter schedule 
		 * @param p the patient 
		 */
		public GotoEnterScheduleListener(Patient p)
		{
			this.p = p;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			//add schedule to patient in model
			//we weren't asked to worry about future scheduling being stored
			
			//closes popup
			popup.dispose();
			
			//takes u back to PatientDataPage
			PatientDataPage database = new PatientDataPage(frame, patientModel.patientList);
			GotoMenuListener m = new GotoMenuListener();
			GotoReqInputListener n = new GotoReqInputListener();
			GotoInfoListener i = new GotoInfoListener(database);
			GotoAddVisitListener v = new GotoAddVisitListener(database);
			GotoDeleteListener d = new GotoDeleteListener(database);
			GotoAddHistoryListener h = new GotoAddHistoryListener(database);
			GotoScheduleListener s = new GotoScheduleListener(database);

			 

			database.addInfoListener(i);
			database.addVisitListener(v);
			database.addDeleteListener(d);
			database.addHistoryListener(h);
			database.addScheduleListener(s);

			database.addBackListener(m);
			database.addNextListener(n);
			System.out.println(patientModel);
			
		}
		public void retrieveJFrame(JFrame popup)
		{
			this.popup = popup;
		}
	}
	/**
	 * sends to Page 7 (PatientDataPage)
	 * 
	 * options to go to Page 10(PatientInfoPage), 8(VisitInfoPage), 14(VisitHistPage), 15 (PatientDataPage's popup),
	 *  1 (MenuPage), 2 (OptInfoPage) , and 7(after deleting a patient)
	 *
	 */
	static class GotoDatabaseListener implements ActionListener {
		private boolean isAssignCat; 
		private CategoryPage catPage; 
		private Patient patient; 
		/**
		 * constructor for no need to process previous page 
		 */
		public GotoDatabaseListener()
		{
			
		}
		/**
		 * constructor for coming back from assigning a category
		 * @param catPage
		 */
		public GotoDatabaseListener(CategoryPage catPage, Patient patient)
		{
			isAssignCat = true; 
			this.catPage = catPage; 
			this.patient = patient; 
		}
		public void actionPerformed(ActionEvent e) {
			if (isAssignCat)
			{
				patient.getLastVisit().getEvaluation().setCategoryLvl(catPage.whichCheckBox());
				
				//information of catPage and add it to the last visit of the patient. 
			}
			PatientDataPage database = new PatientDataPage(frame, patientModel.patientList);
			GotoMenuListener m = new GotoMenuListener();
			GotoReqInputListener n = new GotoReqInputListener();
			GotoInfoListener i = new GotoInfoListener(database);
			GotoAddVisitListener v = new GotoAddVisitListener(database);
			GotoDeleteListener d = new GotoDeleteListener(database);
			GotoAddHistoryListener h = new GotoAddHistoryListener(database);
			GotoScheduleListener s = new GotoScheduleListener(database);

			database.addInfoListener(i);
			database.addVisitListener(v);
			database.addDeleteListener(d);
			database.addHistoryListener(h);
			database.addScheduleListener(s);

			database.addBackListener(m);
			database.addNextListener(n);
		}

	}

	/**
	 * 
	 * sends to Page 9(MedListPage)
	 *
	 * options to go to Page 8(PatientInfoPage) or Page 10(SpecificMedPage)
	 *
	 */
	static class GotoMedicationListener implements ActionListener {
		Patient p;
		/**
		 * constructor to goto medication info  
		 * @param p the patient taking medicine 
		 */
		public GotoMedicationListener(Patient p) {
			this.p = p;
		}

		public void actionPerformed(ActionEvent e) {
			Object[] medList = p.getMedicine().toArray();

			String[] medNameList = new String[medList.length];
			for (int i = 0; i < medList.length; i++) {
				medNameList[i] = ((Medicine) medList[i]).getMedicineName();
			}

			PatientMedListPage medListPage = new PatientMedListPage(frame, p.getLastName(), medNameList);
			ArrayList<JButton> medButtons = medListPage.getMedButtons();

			for (int i = 0; i < medButtons.size(); i++) {
				JButton medButton = medButtons.get(i);
				GotoSpecificMedListener specMedListener = new GotoSpecificMedListener(p,
						p.getMedicine(medButton.getText()));
				medButton.addActionListener(specMedListener);

			}
			GotoInfoListener infoListener = new GotoInfoListener(p);
			medListPage.addBackListener(infoListener);

		}
	}

	/**
	 * sends to Page 10(SpecificMedPage)
	 * 
	 * options to go to Page 9(MedListpage) or edit information
	 *
	 */
	static class GotoSpecificMedListener implements ActionListener {

		Patient p;
		Medicine m;
		/*
		 * constructor to go to specific med info 
		 * @param p the patient
		 * @param m the medication 
		 */
		public GotoSpecificMedListener(Patient p, Medicine m) {
			this.p = p;
			this.m = m;
		}

		public void actionPerformed(ActionEvent e) {
			SpecificMedPage specMedPage = new SpecificMedPage(frame, m.getInfo());
			GotoMedicationListener medListListener = new GotoMedicationListener(p);

			specMedPage.addBackListener(medListListener);
			specMedPage.addUpdateListener((s) -> {
				String[] medInfo = specMedPage.getEditedInfo();
				m.setMedicineName(medInfo[0]);
				m.setMedicantName(medInfo[1]);
				m.setDoseSize(medInfo[2]);
				m.setDuration(medInfo[3]);
				m.setChemCategoryName(medInfo[4]);
				m.setAction(medInfo[5]);
				m.setApplication(medInfo[6]);
				m.setUsualDose(medInfo[7]);
				m.setSideEffect(medInfo[8]);

			});

		}

	}

}
