public class SizeUtility {

    public SizeUtility(){

    }

    public static String getSizeDescription(Object obj) throws UnsizedException {

        if (obj instanceof String || obj instanceof StringBuffer){
            return "16 characters";
        } else if (obj instanceof Sized && obj instanceof StudentRecords){
            StudentRecords myobj = (StudentRecords) obj;
            return myobj.getSize() + " records";
        } else if (obj instanceof Sized && obj instanceof SemesterSchedule){
            SemesterSchedule myobj = (SemesterSchedule) obj;
            return myobj.getSize() + " credits";
        } else if (obj instanceof Sized && obj instanceof Department){
            Department myobj = (Department) obj;
            return myobj.getSize() + " faculty members";
        } else if (obj instanceof Sized && obj instanceof Building){
            Building myobj = (Building) obj;
            return myobj.getSize() + " square feet";
        } else {
            throw new UnsizedException();
        }
    }
}