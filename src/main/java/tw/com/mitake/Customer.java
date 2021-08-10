package tw.com.mitake;

public class Customer {

    private Long id;
    private String name;
    private int age;
    private String contractAddr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public String getContractAddr() {
		return contractAddr;
	}

	public void setContractAddr(String contractAddr) {
		this.contractAddr = contractAddr;
	}


}