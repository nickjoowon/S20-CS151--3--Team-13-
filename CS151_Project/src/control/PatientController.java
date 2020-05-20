package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.Medicine;
import model.Patient;
import model.PatientModel;
import view.*;

public class PatientController {

	private static JFrame frame;
	private static PatientModel patientModel;

	public PatientController(JFrame frame, PatientModel model) {
		this.frame = frame;
		patientModel = model;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PatientModel model = new PatientModel();
		PatientController control = new PatientController(frame, model);
		MenuPage menu = new MenuPage(frame);
		gotoReqInputListener r = new gotoReqInputListener();
		gotoDatabaseListener d = new gotoDatabaseListener();
		menu.addRegisterListener(r);
		menu.addViewListener(d);

	}

	// add what the model should do with the information for each actionlistener
	// call the approrpiate actionlisteners for each page it goes to
	// should check if the previous page's text is filled out
	static class gotoReqInputListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			ReqInfoPage reqInfo = new ReqInfoPage(frame);
			gotoMenuListener b = new gotoMenuListener();
			gotoOptInfoListener n = new gotoOptInfoListener(reqInfo); // maybe take previous page a parameter for action
																		// listeners to see if fields put in
			reqInfo.addBackListener(b);
			reqInfo.addNextListener(n);
		}
	}

	static class gotoMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			MenuPage menu = new MenuPage(frame);
			if (menu.isUndo()) {
				menu.hideUndo();
			}

			gotoReqInputListener r = new gotoReqInputListener();
			gotoDatabaseListener d = new gotoDatabaseListener();
			menu.addRegisterListener(r);
			menu.addViewListener(d);

		}

	}

	static class gotoOptInfoListener implements ActionListener {
		ReqInfoPage reqInfo;
		boolean isCheckReqInfo;

		public gotoOptInfoListener(ReqInfoPage reqInfo) {
			this.reqInfo = reqInfo;
			isCheckReqInfo = true;
		}

		public gotoOptInfoListener() {
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
			gotoReqInputListener b = new gotoReqInputListener();
			gotoTinHypStatusListener n = new gotoTinHypStatusListener(optInfo);

			// adding the rest of optional information of a patient

			optInfo.addBackListener(b);
			optInfo.addNextListener(n);

		}

	}

	static class gotoTinHypStatusListener implements ActionListener {
		OptInfoPage optInfo;
		boolean isCheckOptional;

		public gotoTinHypStatusListener() {
			isCheckOptional = false;
		}

		public gotoTinHypStatusListener(OptInfoPage optInfo) {
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
			gotoOptInfoListener b = new gotoOptInfoListener();
			gotoInputMedListener n = new gotoInputMedListener(tinHyp);
			tinHyp.addBackListener(b);
			tinHyp.addNextListener(n);

		}

	}

	static class gotoInputMedListener implements ActionListener {
		private InputMedPage inputMedPage;
		private boolean isCheckMedicine;
		private TinHypInputPage page;
		private boolean isCheckStatus;

		public gotoInputMedListener() {
			isCheckMedicine = false;
			isCheckStatus = false;
		}

		public gotoInputMedListener(InputMedPage page) {
			inputMedPage = page;
			isCheckMedicine = true;
			isCheckStatus = false;
		}

		public gotoInputMedListener(TinHypInputPage page) {
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
			gotoTinHypStatusListener b = new gotoTinHypStatusListener();
			gotoInputMedListener m = new gotoInputMedListener(inputMedPage);
			// figure out how do to do undo button
			gotoUndoMenuListener f = new gotoUndoMenuListener();
			inputMedPage.addBackListener(b);
			inputMedPage.addNextListener(m);
			inputMedPage.addFinishListener(f);
		}

	}

	static class gotoUndoMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MenuPage undoMenu = new MenuPage(frame, true);
			gotoReqInputListener r = new gotoReqInputListener();
			gotoDatabaseListener d = new gotoDatabaseListener();
			UndoPatientListener m = new UndoPatientListener();

			undoMenu.addRegisterListener(r);
			undoMenu.addViewListener(d);
			undoMenu.addUndoListener(m);
		}

	}

	static class UndoPatientListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			MenuPage undoMenu = new MenuPage(frame);
			patientModel.undoPatient();
			gotoReqInputListener r = new gotoReqInputListener();
			gotoDatabaseListener d = new gotoDatabaseListener();
			undoMenu.addRegisterListener(r);
			undoMenu.addViewListener(d);

		}
	}

	static class gotoInfoListener implements ActionListener {
		PatientDataPage db;
		boolean isCheckSelected;
		Patient patient;

		public gotoInfoListener(PatientDataPage db) {
			this.db = db;
			isCheckSelected = true;
		}
		public gotoInfoListener(Patient p)
		{
			patient =p; 
		}

		public void actionPerformed(ActionEvent e) {
			if (isCheckSelected == true) {
				if (db.isPatientSelected() == true) // then button will work
				{
					Patient patient = db.whichPatient();
					PatientInfoPage infoPage = new PatientInfoPage(frame, patient.getInfo());
					gotoDatabaseListener gotoData = new gotoDatabaseListener();
					GotoMedicationListener gotoMedication = new GotoMedicationListener(patient);
					infoPage.addBackListener(gotoData);
					infoPage.addNextListener(gotoMedication);

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
				gotoDatabaseListener gotoData = new gotoDatabaseListener();
				GotoMedicationListener gotoMedication = new GotoMedicationListener(patient);
				infoPage.addBackListener(gotoData);
				infoPage.addNextListener(gotoMedication);

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

	static class gotoVisitListener implements ActionListener {
		PatientDataPage db;

		public gotoVisitListener(PatientDataPage db) {
			this.db = db;
		}

		public void actionPerformed(ActionEvent e) {

			if (db.isPatientSelected() == true) // then button will work
			{
				// VisitInfoPage visitPage = new VisitInfoPage(frame,
				// db.whichPatient().getInfo());
			}

		}
	}

	static class gotoDeleteListener implements ActionListener {
		PatientDataPage db;

		public gotoDeleteListener(PatientDataPage db) {
			this.db = db;
		}

		public void actionPerformed(ActionEvent e) {

			if (db.isPatientSelected() == true) // then button will work
			{
				patientModel.removePatient(db.whichPatient()); // deletes patient

				PatientDataPage database = new PatientDataPage(frame, patientModel.patientList);
				gotoMenuListener m = new gotoMenuListener();
				gotoReqInputListener n = new gotoReqInputListener();
				gotoInfoListener i = new gotoInfoListener(database);
				gotoVisitListener v = new gotoVisitListener(database);
				gotoDeleteListener d = new gotoDeleteListener(database);
				gotoAddHistoryListener h = new gotoAddHistoryListener(database);
				gotoScheduleListener s = new gotoScheduleListener(database);

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

	static class gotoAddHistoryListener implements ActionListener {
		PatientDataPage db;

		public gotoAddHistoryListener(PatientDataPage db) {
			this.db = db;
		}

		public void actionPerformed(ActionEvent e) {

			if (db.isPatientSelected() == true) // then button will work
			{
				VisitHistPage historyPage = new VisitHistPage(frame, db.whichPatient().getDoneVisit(),
						db.whichPatient().getFirstName(), db.whichPatient().getLastName());

				gotoDatabaseListener d = new gotoDatabaseListener();
				gotoVisitInfoListener i = new gotoVisitInfoListener();
				gotoSpecificAudioEvalListener a = new gotoSpecificAudioEvalListener();
				gotoEditVisitHistListener ev = new gotoEditVisitHistListener();

				historyPage.addBackListener(d);
				historyPage.addEditInfoListener(ev);
				historyPage.addInfoListener(i);
				historyPage.addEvaluationListener(a);

			}

		}
	}

	static class gotoVisitInfoListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// add stuff

		}
	}

	static class gotoSpecificAudioEvalListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// add stuff

		}
	}

	static class gotoEditVisitHistListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// add stuff

		}
	}

	static class gotoScheduleListener implements ActionListener
	{
		PatientDataPage db;
		public gotoScheduleListener(PatientDataPage db)
		{
			this.db = db;
		}
		public void actionPerformed(ActionEvent e)
		{
			
			if(db.isPatientSelected() == true) //then button will work
			{
				
				db.addPopup();
				gotoEnterScheduleListener es = new gotoEnterScheduleListener(db.whichPatient());
				db.addEnterListener(es);
			}
			
		}
	}
	static class gotoEnterScheduleListener implements ActionListener
	{
		Patient p;
		public gotoEnterScheduleListener(Patient p)
		{
			this.p = p;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			//add schedule to patient in model
			
			
			//takes u back to PatientDataPage
			PatientDataPage database = new PatientDataPage(frame, patientModel.patientList);
			gotoMenuListener m = new gotoMenuListener();
			gotoReqInputListener n = new gotoReqInputListener();
			gotoInfoListener i = new gotoInfoListener(database);
			gotoVisitListener v = new gotoVisitListener(database);
			gotoDeleteListener d = new gotoDeleteListener(database);
			gotoAddHistoryListener h = new gotoAddHistoryListener(database);
			gotoScheduleListener s = new gotoScheduleListener(database);

			 

			database.addInfoListener(i);
			database.addVisitListener(v);
			database.addDeleteListener(d);
			database.addHistoryListener(h);
			database.addScheduleListener(s);

			database.addBackListener(m);
			database.addNextListener(n);
			System.out.println(patientModel);
			
		}
	}

	static class gotoDatabaseListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			PatientDataPage database = new PatientDataPage(frame, patientModel.patientList);
			gotoMenuListener m = new gotoMenuListener();
			gotoReqInputListener n = new gotoReqInputListener();
			gotoInfoListener i = new gotoInfoListener(database);
			gotoVisitListener v = new gotoVisitListener(database);
			gotoDeleteListener d = new gotoDeleteListener(database);
			gotoAddHistoryListener h = new gotoAddHistoryListener(database);
			gotoScheduleListener s = new gotoScheduleListener(database);

			database.addInfoListener(i);
			database.addVisitListener(v);
			database.addDeleteListener(d);
			database.addHistoryListener(h);
			database.addScheduleListener(s);

			database.addBackListener(m);
			database.addNextListener(n);
		}

	}

	static class GotoMedicationListener implements ActionListener {
		Patient p;

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
				gotoSpecificMedListener specMedListener = new gotoSpecificMedListener(p,
						p.getMedicine(medButton.getText()));
				medButton.addActionListener(specMedListener);

			}
			gotoInfoListener infoListener = new gotoInfoListener(p);
			medListPage.addBackListener(infoListener);

		}
	}

	static class gotoSpecificMedListener implements ActionListener {

		Patient p;
		Medicine m;

		public gotoSpecificMedListener(Patient p, Medicine m) {
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
