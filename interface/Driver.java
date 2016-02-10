public class Driver {

    public static void main(String[] args){

        SizeUtility su = new SizeUtility();
        Sized myStudentRecord = new StudentRecords();
        Sized myBuilding = new Building();
        Sized myDepartment = new Department();
        Sized mySemesterSchedule = new SemesterSchedule();

        try {
            System.out.println(su.getSizeDescription(myStudentRecord));
            System.out.println(su.getSizeDescription(myBuilding));
            System.out.println(su.getSizeDescription(myDepartment));
            System.out.println(su.getSizeDescription(mySemesterSchedule));
        } catch (UnsizedException e) {
            System.out.println(e);
        }
    }
}