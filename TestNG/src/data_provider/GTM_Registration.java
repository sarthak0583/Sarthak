package data_provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GTM_Registration 
{
	WebDriver driver;
@Test(dataProvider="logindetails")
public void test1(String un,String psw,String fname, String lname,String address,String paddress,String pincode)
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://grotechminds.com/registration/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("1")).sendKeys(un);
	driver.findElement(By.id("3")).sendKeys(psw);
	driver.findElement(By.id("4")).sendKeys(fname);
	driver.findElement(By.id("5")).sendKeys(lname);
	driver.findElement(By.name("paddress")).sendKeys(address);
	driver.findElement(By.name("permanentaddress")).sendKeys(paddress);
	driver.findElement(By.name("pincode")).sendKeys(pincode);
}
@DataProvider(name="logindetails")
public Object[][] login()
{
	Object[][]data =new Object[10][7];
	data[0][0]="Sathakdas";
	data[0][1]="Sathak@123";
	data[0][2]="Sathak";
	data[0][3]="das";
	data[0][4]="bbsr";
	data[0][5]="Bhubaneswar";
	data[0][6]="751024";
	data[1][0]="123";
	data[1][1]="hs";
	data[1][2]="";
	data[1][3]="22";
	data[1][4]="4566";
	data[1][5]="888";
	data[1][6]="Sathakdas";
	data[2][0]="";
	data[2][1]="Sathakdas";
	data[2][2]="@#$R";
	data[2][3]="";
	data[2][4]="@#$$#";
	data[2][5]="____";
	data[2][6]="@#GA$";
	data[3][0]="7875544";
	data[3][1]="1";
	data[3][2]="@dgg";
	data[3][3]="@$RRR";
	data[3][4]="25225";
	data[3][5]="@HDBFJSKJ";
	data[3][6]="Sathakdas1255";
	data[4][0]="1223sarthak";
	data[4][1]="1223sarthak";
	data[4][2]="@___((*";
	data[4][3]="*%W)";
	data[4][4]="1234568";
	data[4][5]="12345688";
	data[4][6]="75102456666666666666666";
	data[5][0]="#R**R*((E(!124";
	data[5][1]="";
	data[5][2]="2555555";
	data[5][3]="----";
	data[5][4]="124455555555555555555555555555555555555555555555555555555555555555555555";
	data[5][5]="lmgxmlxmglxmglm;gmxmgxmg;lgmmgl;ml;zmgl;m;m;n;lgw;nt5ent;ent;ekny5;knye";
	data[5][6]="kkkkkkkkkkkkkkkkkkkkkk2222222222222222222kkkkkkkkkkkkkkk55555555555555kkkkkkkk@(((((&&#*(@";
	data[6][0]="sssssssssssssssssssssssssssjkbjkbbbjjjbjkbjbbjbjbu;igosbfjsdjfbzdoifbsdl fjzfbzbfzf z";
	data[6][1]="[skfojzfmzjfohgpn;gkhiwghwnt0934t6u340ntksngkshgi0hgtnwk;gtnw09gthpwgw";
	data[6][2]="mfojojfopjfojzofusfjw4op;4nt.wtw5t4wt45554578454646464646#$R";
	data[6][3]="+9+9++97897779eo-0ie0-ieejae.and,lhjoapfna;f ;anfa";
	data[6][4]="9r48889303i";
	data[6][5]="9r48889303i";
	data[6][6]="mz;v;z;vnksgwk;ngiw4tht92004909090-090000000000000,kcm;lzmc;nsichioahfinaf afboafaflabfougbls falfba";
	data[7][0]="123sarthak&======";
	data[7][1]="";
	data[7][2]=")(R*()(*(R)(*()(E)(";
	data[7][3]="5555JBGJBJGB///lkdjmmd;00000";
	data[7][4]=";;N;nnvvvvvvvvvvvvvvvvvvvvvvxnlvhgosbglnsbouxfbnlxb nxboixnz/ckd;zjdmzf zvnk   nnz;v/  vz  mn;j; vz. vlz v  zvv z.v zvz vzklvnzkvnzkv";
	data[7][5]="m;zmv;zv";
	data[7][6]="Satha   kda s1 25 5  ';ak;fk'   ";
	data[8][0]="";
	data[8][1]="Sathakdas";
	data[8][2]="@#$R";
	data[8][3]="";
	data[8][4]="@#$$#";
	data[8][5]="____";
	data[8][6]="@#GA$";
	data[9][0]="7875544";
	data[9][1]="1";
	data[9][2]="@dgg";
	data[9][3]="@$RRR";
	data[9][4]="25225";
	data[9][5]="@HDBFJSKJ";
	data[9][6]="Sathakdas1255";
	return data;
}
}
