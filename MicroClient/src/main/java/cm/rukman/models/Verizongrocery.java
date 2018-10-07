package cm.rukman.models;

public class Verizongrocery 
{
private String title;
private int Verizongroceryid;

public int getVerizongroceryid() {
	return Verizongroceryid;
}
public void setVerizongroceryid(int verizongroceryid) {
	Verizongroceryid = verizongroceryid;
}
public Verizongrocery() {}
public Verizongrocery(String title) {
	this.title=title;
}

public Verizongrocery(int Verizongroceryid , String title) {
	this.Verizongroceryid= Verizongroceryid;
	this.title= title;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

}
