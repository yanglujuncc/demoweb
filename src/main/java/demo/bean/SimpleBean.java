package demo.bean;

public class SimpleBean {

	String name;
	
	int  instanceId;
	private static int nextInstanceId=1;
	
	
	private static synchronized int getInstanceId(){
		return nextInstanceId++;
	}
	
	public SimpleBean(){
		instanceId=getInstanceId();
		System.out.println("call SimpleBean(), instanceId:"+instanceId);
	}
	public SimpleBean(String name){
		this.name=name;
		System.out.println("call SimpleBean(name), instanceId:"+instanceId);
	}
	
	public void setName(String name) {
		System.out.println("call setName(name), instanceId:"+instanceId);
		this.name = name;
	}
	public String getName(){
		return "name:"+name+" instanceId:"+instanceId;
	}
	public void init(){
		System.out.println("call init()");
	}

	public void say(String content){
		
		System.out.println("call say(content) " +name+" say:"+content);
	}
	
}
