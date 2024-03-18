import College.College;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import CourseSchedule.Seat;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Faculty.FacultyDirectory;
import Persona.Faculty.FacultyProfile;
import Persona.Faculty.FacultyAssignment;



public class UniversityExample {

    
    public static void main(String[] args) {
        // TODO code application logic here

        //Part 1
        // create a college and two departments under this college
        College northeastern = new College("Northeastern University");
        Department MSIS = northeastern.newDepartment("Information Systems");
        Department MSDA = northeastern.newDepartment("Data Architecture");
        

        // create a course catalog for each department
        CourseCatalog msisCatalog = MSIS.getCourseCatalog(); // method inside department class
        CourseCatalog msdaCatalog = MSDA.getCourseCatalog(); // method inside department class

        // create courses for MSIS department
        Course info5001 = msisCatalog.newCourse("Application Modeling and Design", "INFO5001", 4); // method inside coursecatalog class
        Course info5002 = msisCatalog.newCourse("Introduction to Python for Information Systems", "INFO5002", 4); 
        Course info5100 = msisCatalog.newCourse("Application Engineering and Development", "INFO5100", 4);
        Course info6150 = msisCatalog.newCourse("Web Design and User Experience Engineering", "INFO6150", 4);
        Course info6205 = msisCatalog.newCourse("Program Structure and Algorithms", "INFO6205", 4);

        // create courses for MSDA department

        Course DAMG6105 = msdaCatalog.newCourse("Data Science Engineering with Python", "DAMG6105", 4);
        Course DAMG6210 = msdaCatalog.newCourse("Data Management and Database Design", "DAMG6210", 4);
        Course DAMG7105 = msdaCatalog.newCourse(" Intelligent Data Modeling and Presentation for Engineers", "DAMG7105", 4);
        Course DAMG7250 = msdaCatalog.newCourse("Big Data Architecture and Governance", "DAMG7250", 4);
        Course DAMG7275 = msdaCatalog.newCourse("Advanced Database Management Systems", "DAMG7275", 4);

        // create faculty dierctory for each department
        PersonDirectory msisPersonDirectory = MSIS.getPersonDirectory(); // method inside department class
        PersonDirectory msdaPersonDirectory = MSDA.getPersonDirectory(); 

        // create student directory for each department
        StudentDirectory msisStudentDirectory = MSIS.getStudentDirectory(); // method inside department class
        StudentDirectory msdaStudentDirectory = MSDA.getStudentDirectory();

         // create faculty directory for each department
        FacultyDirectory msisFacultyDirectory = MSIS.getFacultydirectory(); // method inside department class
        FacultyDirectory msdaFacultyDirectory = MSDA.getFacultydirectory();

        // create faculty instances under MSIS department and add them into the person directory
        Person kal = msisPersonDirectory.newPerson("001", "Kal Bugrara");
        Person Archil = msisPersonDirectory.newPerson("002", "Archil Mays");
        Person Yu_Chen_Hsiang = msdaPersonDirectory.newPerson("003", "Yu, Chen-Hsiang");
        Person Pettiford_Shannon = msisPersonDirectory.newPerson("014", "Pettiford, Shannon");
        Person Handan_Liu = msisPersonDirectory.newPerson("035", "Handan Liu");

        // student instances in person directory - MSIS
        Person Joshua = msisPersonDirectory.newPerson("101", "Joshua");
        Person Paul = msisPersonDirectory.newPerson("102", "Paul");
        Person Darius = msisPersonDirectory.newPerson("103", "Darius");
        Person Theresa = msisPersonDirectory.newPerson("104", "Theresa");
        Person Jessica = msisPersonDirectory.newPerson("105", "Jessica"); 
        Person Heather = msisPersonDirectory.newPerson("106", "Heather");
        Person Luke = msisPersonDirectory.newPerson("107", "Luke");
        Person Christopher = msisPersonDirectory.newPerson("108", "Christopher");
        Person Scott = msisPersonDirectory.newPerson("109", "Scott");
        Person Christina = msisPersonDirectory.newPerson("110", "Christina");

        // assign faculty profile into faculty directory - MSIS
        FacultyProfile kalProfile = msisFacultyDirectory.newFacultyProfile(kal);
        FacultyProfile ArchilProfile = msisFacultyDirectory.newFacultyProfile(Archil);
        FacultyProfile Yu_Chen_HsiangProfile = msisFacultyDirectory.newFacultyProfile(Yu_Chen_Hsiang);
        FacultyProfile Pettiford_ShannonProfile = msisFacultyDirectory.newFacultyProfile(Pettiford_Shannon);
        FacultyProfile Handan_LiuProfile = msisFacultyDirectory.newFacultyProfile(Handan_Liu);

        // assign student profile into student directory - MSIS
        StudentProfile JoshuaProfile = msisStudentDirectory.newStudentProfile(Joshua);
        StudentProfile PaulProfile = msisStudentDirectory.newStudentProfile(Paul);
        StudentProfile DariusProfile = msisStudentDirectory.newStudentProfile(Darius);
        StudentProfile TheresaProfile = msisStudentDirectory.newStudentProfile(Theresa);
        StudentProfile JessicaProfile = msisStudentDirectory.newStudentProfile(Jessica);
        StudentProfile HeatherProfile = msisStudentDirectory.newStudentProfile(Heather);
        StudentProfile LukeProfile = msisStudentDirectory.newStudentProfile(Luke);
        StudentProfile ChristopherProfile = msisStudentDirectory.newStudentProfile(Christopher);
        StudentProfile ScottProfile = msisStudentDirectory.newStudentProfile(Scott);
        StudentProfile ChristinaProfile = msisStudentDirectory.newStudentProfile(Christina);





        // create person instances under MSDA department and add them into the person directory - MSDA
        Person Konstantopoulos = msdaPersonDirectory.newPerson("414", "Konstantopoulos");
        Person Brown = msdaPersonDirectory.newPerson("305", "Brown");
        Person Shi_Shiaoming = msdaPersonDirectory.newPerson("206", "Shi, Shiaoming");
        Person Sabbouh_Marwan = msdaPersonDirectory.newPerson("037", "Sabbouh, Marwan");
        Person Zhao_Yizhen = msdaPersonDirectory.newPerson("408", "Zhao, Yizhen");

        // student instances in person directory - MSDA
        Person Courtney = msdaPersonDirectory.newPerson("111", "Courtney");
        Person Ross = msdaPersonDirectory.newPerson("112", "Ross");
        Person Donald = msdaPersonDirectory.newPerson("113", "Donald");
        Person Katherine = msdaPersonDirectory.newPerson("114", "Katherine");
        Person Ian = msdaPersonDirectory.newPerson("115", "Ian");
        Person Philip = msdaPersonDirectory.newPerson("116", "Philip");
        Person Hull = msdaPersonDirectory.newPerson("117", "Hull");
        Person Hernandez = msdaPersonDirectory.newPerson("118", "Hernandez");
        Person Johnson = msdaPersonDirectory.newPerson("119", "Johnson");
        Person Blackburn = msdaPersonDirectory.newPerson("120", "Blackburn");

        // assign faculty profile into faculty directory - MSDA
        FacultyProfile KonstantopoulosProfile = msdaFacultyDirectory.newFacultyProfile(Konstantopoulos);
        FacultyProfile BrownProfile = msdaFacultyDirectory.newFacultyProfile(Brown);
        FacultyProfile Shi_ShiaomingProfile = msdaFacultyDirectory.newFacultyProfile(Shi_Shiaoming);
        FacultyProfile Sabbouh_MarwanProfile = msdaFacultyDirectory.newFacultyProfile(Sabbouh_Marwan);
        FacultyProfile Zhao_YizhenProfile = msdaFacultyDirectory.newFacultyProfile(Zhao_Yizhen);

        // assign student profile into student directory - MSDA
        StudentProfile CourtneyProfile = msdaStudentDirectory.newStudentProfile(Courtney);
        StudentProfile RossProfile = msdaStudentDirectory.newStudentProfile(Ross);
        StudentProfile DonaldProfile = msdaStudentDirectory.newStudentProfile(Donald);
        StudentProfile KatherineProfile = msdaStudentDirectory.newStudentProfile(Katherine);
        StudentProfile IanProfile = msdaStudentDirectory.newStudentProfile(Ian);
        StudentProfile PhilipProfile = msdaStudentDirectory.newStudentProfile(Philip);
        StudentProfile HullProfile = msdaStudentDirectory.newStudentProfile(Hull);
        StudentProfile HernandezProfile = msdaStudentDirectory.newStudentProfile(Hernandez);
        StudentProfile JohnsonProfile = msdaStudentDirectory.newStudentProfile(Johnson);
        StudentProfile BlackburnProfile = msdaStudentDirectory.newStudentProfile(Blackburn);


        //Part 2
        // create a course schedule for each department
        CourseSchedule msisSpring2024 = MSIS.newCourseSchedule("Spring2024"); // method inside department class
        CourseSchedule msdaSpring2024 = MSDA.newCourseSchedule("Spring2024");

        // creat course offers for each course schedule - MSIS and store them in a course schedule list
        CourseOffer info5001Offer = msisSpring2024.newCourseOffer("INFO5001"); // method inside courseschedule class
        CourseOffer info5002Offer = msisSpring2024.newCourseOffer("INFO5002");
        CourseOffer info5100Offer = msisSpring2024.newCourseOffer("INFO5100");
        CourseOffer info6150Offer = msisSpring2024.newCourseOffer("INFO6150");
        CourseOffer info6205Offer = msisSpring2024.newCourseOffer("INFO6205");

        // creat course offers for each course schedule - MSDA and store them in a course schedule list
        CourseOffer DAMG6105Offer = msdaSpring2024.newCourseOffer("DAMG6105");
        CourseOffer DAMG6210Offer = msdaSpring2024.newCourseOffer("DAMG6210");
        CourseOffer DAMG7105Offer = msdaSpring2024.newCourseOffer("DAMG7105");
        CourseOffer DAMG7250Offer = msdaSpring2024.newCourseOffer("DAMG7250");
        CourseOffer DAMG7275Offer = msdaSpring2024.newCourseOffer("DAMG7275");

        // generate seats list for each course offer - MSIS
        info5001Offer.generatSeats(15); // seat:(couse offer, seat number) 
        info5002Offer.generatSeats(15); 
        info5100Offer.generatSeats(15);
        info6150Offer.generatSeats(15);
        info6205Offer.generatSeats(15);
        // generate seats for each course offer - MSDA
        DAMG6105Offer.generatSeats(15);
        DAMG6210Offer.generatSeats(15);
        DAMG7105Offer.generatSeats(15);
        DAMG7250Offer.generatSeats(15);
        DAMG7275Offer.generatSeats(15);

        //seat assignment for each student - MSIS
        // Joshua
        // create a course load for a student 
        CourseLoad Joshua_spring2024 = JoshuaProfile.newCourseLoad("Spring2024");

        //get an empty seat from the seat list in course offer
        Seat Joshua_info5001Seat = info5001Offer.getEmptySeat();
        
        // create a seat assignment for a student
        // use seatassignment to link a student's seat in the course offer
        SeatAssignment Joshua_info5001_Assignment = Joshua_info5001Seat.newSeatAssignment(Joshua_spring2024);

        // connect the seat assignment to the student's course load
        // add the seat assignment to the SeatAssignment list in student's course load
        Joshua_spring2024.registerStudent(Joshua_info5001_Assignment);

        // Paul
        CourseLoad Paul_spring2024 = PaulProfile.newCourseLoad("Spring2024");
        Seat Paul_info5001Seat = info5001Offer.getEmptySeat();
        SeatAssignment Paul_info5001_Assignment = Paul_info5001Seat.newSeatAssignment(Paul_spring2024);
        Paul_spring2024.registerStudent(Paul_info5001_Assignment);

        // Darius
        CourseLoad Darius_spring2024 = DariusProfile.newCourseLoad("Spring2024");
        Seat Darius_info5002Seat = info5002Offer.getEmptySeat();
        SeatAssignment Darius_info5002_Assignment = Darius_info5002Seat.newSeatAssignment(Darius_spring2024);   
        Darius_spring2024.registerStudent(Darius_info5002_Assignment);

        // Theresa
        CourseLoad Theresa_spring2024 = TheresaProfile.newCourseLoad("Spring2024");
        Seat Theresa_info5002Seat = info5002Offer.getEmptySeat();
        SeatAssignment Theresa_info5002_Assignment = Theresa_info5002Seat.newSeatAssignment(Theresa_spring2024);
        Theresa_spring2024.registerStudent(Theresa_info5002_Assignment);

        // Jessica
        CourseLoad Jessica_spring2024 = JessicaProfile.newCourseLoad("Spring2024");
        Seat Jessica_info5100Seat = info5100Offer.getEmptySeat();
        SeatAssignment Jessica_info5100_Assignment = Jessica_info5100Seat.newSeatAssignment(Jessica_spring2024);
        Jessica_spring2024.registerStudent(Jessica_info5100_Assignment);

        // Heather
        CourseLoad Heather_spring2024 = HeatherProfile.newCourseLoad("Spring2024");
        Seat Heather_info5100Seat = info5100Offer.getEmptySeat();
        SeatAssignment Heather_info5100_Assignment = Heather_info5100Seat.newSeatAssignment(Heather_spring2024);
        Heather_spring2024.registerStudent(Heather_info5100_Assignment);

        // Luke
        CourseLoad Luke_spring2024 = LukeProfile.newCourseLoad("Spring2024");
        Seat Luke_info6150Seat = info6150Offer.getEmptySeat();
        SeatAssignment Luke_info6150_Assignment = Luke_info6150Seat.newSeatAssignment(Luke_spring2024);
        Luke_spring2024.registerStudent(Luke_info6150_Assignment);

        // Christopher
        CourseLoad Christopher_spring2024 = ChristopherProfile.newCourseLoad("Spring2024");
        Seat Christopher_info6150Seat = info6150Offer.getEmptySeat();
        SeatAssignment Christopher_info6150_Assignment = Christopher_info6150Seat.newSeatAssignment(Christopher_spring2024);
        Christopher_spring2024.registerStudent(Christopher_info6150_Assignment);

        // Scott
        CourseLoad Scott_spring2024 = ScottProfile.newCourseLoad("Spring2024");
        Seat Scott_info6205Seat = info6205Offer.getEmptySeat();
        SeatAssignment Scott_info6205_Assignment = Scott_info6205Seat.newSeatAssignment(Scott_spring2024);
        Scott_spring2024.registerStudent(Scott_info6205_Assignment);

        // Christina
        CourseLoad Christina_spring2024 = ChristinaProfile.newCourseLoad("Spring2024");
        Seat Christina_info6205Seat = info6205Offer.getEmptySeat();
        SeatAssignment Christina_info6205_Assignment = Christina_info6205Seat.newSeatAssignment(Christina_spring2024);
        Christina_spring2024.registerStudent(Christina_info6205_Assignment);

        //seat assignment for each student - MSDA
        // Courtney
        CourseLoad Courtney_spring2024 = CourtneyProfile.newCourseLoad("Spring2024");
        Seat Courtney_DAMG6105Seat = DAMG6105Offer.getEmptySeat();
        SeatAssignment Courtney_DAMG6105_Assignment = Courtney_DAMG6105Seat.newSeatAssignment(Courtney_spring2024);
        Courtney_spring2024.registerStudent(Courtney_DAMG6105_Assignment);

        // Ross
        CourseLoad Ross_spring2024 = RossProfile.newCourseLoad("Spring2024");
        Seat Ross_DAMG6105Seat = DAMG6105Offer.getEmptySeat();
        SeatAssignment Ross_DAMG6105_Assignment = Ross_DAMG6105Seat.newSeatAssignment(Ross_spring2024);
        Ross_spring2024.registerStudent(Ross_DAMG6105_Assignment);

        // Donald
        CourseLoad Donald_spring2024 = DonaldProfile.newCourseLoad("Spring2024");
        Seat Donald_DAMG6210Seat = DAMG6210Offer.getEmptySeat();
        SeatAssignment Donald_DAMG6210_Assignment = Donald_DAMG6210Seat.newSeatAssignment(Donald_spring2024);
        Donald_spring2024.registerStudent(Donald_DAMG6210_Assignment);

        // Katherine
        CourseLoad Katherine_spring2024 = KatherineProfile.newCourseLoad("Spring2024");
        Seat Katherine_DAMG6210Seat = DAMG6210Offer.getEmptySeat();
        SeatAssignment Katherine_DAMG6210_Assignment = Katherine_DAMG6210Seat.newSeatAssignment(Katherine_spring2024);
        Katherine_spring2024.registerStudent(Katherine_DAMG6210_Assignment);

        // Ian
        CourseLoad Ian_spring2024 = IanProfile.newCourseLoad("Spring2024");
        Seat Ian_DAMG7105Seat = DAMG7105Offer.getEmptySeat();
        SeatAssignment Ian_DAMG7105_Assignment = Ian_DAMG7105Seat.newSeatAssignment(Ian_spring2024);
        Ian_spring2024.registerStudent(Ian_DAMG7105_Assignment);

        // Philip
        CourseLoad Philip_spring2024 = PhilipProfile.newCourseLoad("Spring2024");
        Seat Philip_DAMG7105Seat = DAMG7105Offer.getEmptySeat();
        SeatAssignment Philip_DAMG7105_Assignment = Philip_DAMG7105Seat.newSeatAssignment(Philip_spring2024);
        Philip_spring2024.registerStudent(Philip_DAMG7105_Assignment);

        // Hull
        CourseLoad Hull_spring2024 = HullProfile.newCourseLoad("Spring2024");
        Seat Hull_DAMG7250Seat = DAMG7250Offer.getEmptySeat();
        SeatAssignment Hull_DAMG7250_Assignment = Hull_DAMG7250Seat.newSeatAssignment(Hull_spring2024);
        Hull_spring2024.registerStudent(Hull_DAMG7250_Assignment);

        // Hernandez
        CourseLoad Hernandez_spring2024 = HernandezProfile.newCourseLoad("Spring2024");
        Seat Hernandez_DAMG7250Seat = DAMG7250Offer.getEmptySeat();
        SeatAssignment Hernandez_DAMG7250_Assignment = Hernandez_DAMG7250Seat.newSeatAssignment(Hernandez_spring2024);
        Hernandez_spring2024.registerStudent(Hernandez_DAMG7250_Assignment);

        // Johnson
        CourseLoad Johnson_spring2024 = JohnsonProfile.newCourseLoad("Spring2024");
        Seat Johnson_DAMG7275Seat = DAMG7275Offer.getEmptySeat();
        SeatAssignment Johnson_DAMG7275_Assignment = Johnson_DAMG7275Seat.newSeatAssignment(Johnson_spring2024);
        Johnson_spring2024.registerStudent(Johnson_DAMG7275_Assignment);

        // Blackburn
        CourseLoad Blackburn_spring2024 = BlackburnProfile.newCourseLoad("Spring2024");
        Seat Blackburn_DAMG7275Seat = DAMG7275Offer.getEmptySeat();
        SeatAssignment Blackburn_DAMG7275_Assignment = Blackburn_DAMG7275Seat.newSeatAssignment(Blackburn_spring2024);
        Blackburn_spring2024.registerStudent(Blackburn_DAMG7275_Assignment);



        // assign teacher to course offer - MSIS
        // kal-info5001
        //connect faculty to course offer
        FacultyAssignment kal_info5001 = kalProfile.AssignAsTeacher_facultyprofile(info5001Offer); // method inside facultyprofile class
        
        // assign a faculty assignment to course offer
        info5001Offer.AssignAsTeacher_courseoffer(kalProfile);

        // Archil-info5002
        FacultyAssignment Archil_info5002 = ArchilProfile.AssignAsTeacher_facultyprofile(info5002Offer);
        info5002Offer.AssignAsTeacher_courseoffer(ArchilProfile);

        // Yu_Chen_Hsiang-info5100
        FacultyAssignment Yu_Chen_Hsiang_info5100 = Yu_Chen_HsiangProfile.AssignAsTeacher_facultyprofile(info5100Offer);
        info5100Offer.AssignAsTeacher_courseoffer(Yu_Chen_HsiangProfile);

        // Pettiford_Shannon-info6150
        FacultyAssignment Pettiford_Shannon_info6150 = Pettiford_ShannonProfile.AssignAsTeacher_facultyprofile(info6150Offer);
        info6150Offer.AssignAsTeacher_courseoffer(Pettiford_ShannonProfile);

        // Handan_Liu-info6205
        FacultyAssignment Handan_Liu_info6205 = Handan_LiuProfile.AssignAsTeacher_facultyprofile(info6205Offer);
        info6205Offer.AssignAsTeacher_courseoffer(Handan_LiuProfile);

        // assign teacher to course offer - MSDA    
        // Konstantopoulos-DAMG6105
        FacultyAssignment Konstantopoulos_DAMG6105 = KonstantopoulosProfile.AssignAsTeacher_facultyprofile(DAMG6105Offer);
        DAMG6105Offer.AssignAsTeacher_courseoffer(KonstantopoulosProfile);

        // Brown-DAMG6210
        FacultyAssignment Brown_DAMG6210 = BrownProfile.AssignAsTeacher_facultyprofile(DAMG6210Offer);
        DAMG6210Offer.AssignAsTeacher_courseoffer(BrownProfile);

        // Shi_Shiaoming-DAMG7105
        FacultyAssignment Shi_Shiaoming_DAMG7105 = Shi_ShiaomingProfile.AssignAsTeacher_facultyprofile(DAMG7105Offer);
        DAMG7105Offer.AssignAsTeacher_courseoffer(Shi_ShiaomingProfile);

        // Sabbouh_Marwan-DAMG7250
        FacultyAssignment Sabbouh_Marwan_DAMG7250 = Sabbouh_MarwanProfile.AssignAsTeacher_facultyprofile(DAMG7250Offer);
        DAMG7250Offer.AssignAsTeacher_courseoffer(Sabbouh_MarwanProfile);

        // Zhao_Yizhen-DAMG7275
        FacultyAssignment Zhao_Yizhen_DAMG7275 = Zhao_YizhenProfile.AssignAsTeacher_facultyprofile(DAMG7275Offer);
        DAMG7275Offer.AssignAsTeacher_courseoffer(Zhao_YizhenProfile);

        // assign grades to students
        // Joshua
        Joshua_info5001_Assignment.assignGrade(3.4f);
        // Paul
        Paul_info5001_Assignment.assignGrade(3.6f);
        // Darius
        Darius_info5002_Assignment.assignGrade(3.8f);
        // Theresa
        Theresa_info5002_Assignment.assignGrade(3.3f);
        // Jessica
        Jessica_info5100_Assignment.assignGrade(3.5f);
        // Heather
        Heather_info5100_Assignment.assignGrade(3.7f);
        // Luke
        Luke_info6150_Assignment.assignGrade(3.1f);
        // Christopher
        Christopher_info6150_Assignment.assignGrade(3.2f);
        // Scott
        Scott_info6205_Assignment.assignGrade(3.9f);
        // Christina
        Christina_info6205_Assignment.assignGrade(3.4f);
        // Courtney
        Courtney_DAMG6105_Assignment.assignGrade(3.6f);
        // Ross
        Ross_DAMG6105_Assignment.assignGrade(3.7f);
        // Donald
        Donald_DAMG6210_Assignment.assignGrade(3.8f);
        // Katherine
        Katherine_DAMG6210_Assignment.assignGrade(3.9f);
        // Ian
        Ian_DAMG7105_Assignment.assignGrade(3.5f);
        // Philip
        Philip_DAMG7105_Assignment.assignGrade(3.6f);
        // Hull
        Hull_DAMG7250_Assignment.assignGrade(3.7f);
        // Hernandez
        Hernandez_DAMG7250_Assignment.assignGrade(3.8f);
        // Johnson
        Johnson_DAMG7275_Assignment.assignGrade(3.9f);
        // Blackburn
        Blackburn_DAMG7275_Assignment.assignGrade(3.4f);

        //Part 3
        //  print the Course schedu
        msisSpring2024.printallCourses();
        msdaSpring2024.printallCourses();
    
        // calculate the total revenue for each department
        int totalMSIS = MSIS.calculateRevenuesBySemester("Spring2024");
        int totalMSDA = MSDA.calculateRevenuesBySemester("Spring2024");
        System.out.println("Total revenue for each department:\n");
        System.out.println("Total revenue for MSIS: " + totalMSIS);
        System.out.println("Total revenue for MSDA: " + totalMSDA);


    }

}
