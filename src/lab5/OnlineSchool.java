package lab5;

public class OnlineSchool {
	// TODO: implement this class
    int count = 0;
    Participant[] participantList = new Participant[0];
    public OnlineSchool() {

    }
    public void addParticipant(Participant name) {
        Participant[] listCopy = participantList;
        if (participantList.length < 100) {

            participantList= new Participant[count + 1];
            participantList[count] = name;
            for (int i = 0; i < listCopy.length; i++) {
                participantList[i] = listCopy[i];
            }
            count ++;
            if (count == 100) {
                this.count = 0;
            }
        }

    }

     public Participant[] addParticipant(Participant[] array, Participant name) {
         Participant[] listCopy = array;
         array = new Participant[array.length+1];
         array[array.length-1] = name;
         for (int i = 0; i < listCopy.length; i++) {
             array[i] = listCopy[i];
         }

        return array;
     }

    public Participant[] getParticipants(String title) {
        Participant[] returnArray = new Participant[0];
        for (int i = 0; i < participantList.length; i++) {
            Registration[] participant = participantList[i].registrationsList2;
            for (int j = 0; j < participant.length; j++){
                if (participant[j].getTitle().equals(title)) {
                returnArray = addParticipant(returnArray, participantList[i]);
                }
            }
        }
        return returnArray;
    }
}
