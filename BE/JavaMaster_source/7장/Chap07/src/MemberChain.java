public class MemberChain {
    String firstName;
    String country;
    int age;

    public MemberChain() {        
        this("ȫ���");
    }

    public MemberChain(String mName) {      
        this(mName, 20);
    }

    public MemberChain(String mName, int mAge) {      
        this(mName, mAge, "���ѹα�");
    }

    public MemberChain(String mName, int mAge, String mCountry) {
        firstName = mName;
        age = mAge;
        country = mCountry; 
    }

    void printInfo() {
        System.out.println("�̸� : " + firstName);
        System.out.println("���� : " + country);
        System.out.println("���� : " + age); 
    }
 }