package Pages;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.apache.commons.lang3.ArrayUtils;

public class Publishqponsobj {

	public String[] GetMonth() {

		String[] monthName = {"January", "February",
				"March", "April", "May", "June", "July",
				"August", "September", "October", "November",
		"December"};

		Calendar cal = Calendar.getInstance();
		String month = monthName[cal.get(Calendar.MONTH)];
		int monthIndex = ArrayUtils.indexOf(monthName, month);
		int BeforeMonthIndex=monthIndex-1;
		int AfterMonthIndex=monthIndex+1;
		String[] monthXpath = {"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='0']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='1']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='2']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='3']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='4']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='5']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='6']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='7']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='8']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='9']",
				"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='10']",
		"//android.app.Dialog[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.Button[@index='11']"};
		String[] i={monthXpath[monthIndex],monthXpath[BeforeMonthIndex],monthXpath[AfterMonthIndex]};
		return(i);

	}
	//Xpath
	public String TypeCupon_Xpth="//android.view.View[@text='Type']/android.widget.Button[@index='2']";
	public String Button_Flash_Xpath="//android.widget.RadioButton[@text='Flash']";
	public String Button_Special_Xpath="//android.widget.RadioButton[@text='Special']";
	public String Button_Promo_Xpath="//android.widget.RadioButton[@text='Promo']";
	public String RedeemFrom_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String ValidFrom_Button_Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='1']";
	public String ValidFrom_Cancle_Button_Xpath="//android.widget.Button[@text='CANCEL']";
	public String ValidFrom_Done_Button_Xpath="//android.widget.Button[@text='DONE']";
	public String ExpireAt_Button_Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='1']";
	public String Limit_Button_Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String Limit_5_Button_Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Limit_10_Button_Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Limit_20_Button_Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Limit_30_Button_Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Limit_40_Button_Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Limit_50_Button_Xpath="//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Button_Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String Discount_Persent_Number_Button_Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.widget.Button[@index='2']";
	public String Discount_Persent_Number_10_Button_Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_15_Button_Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_20_Button_Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_25_Button_Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_30_Button_Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_35_Button_Xpath="//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_40_Button_Xpath="//android.view.View[@index='6']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_45_Button_Xpath="//android.view.View[@index='7']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Persent_Number_50_Button_Xpath="//android.view.View[@index='8']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MinOrder_Button_Xpath="//android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String MinOrder_Button_10_Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MinOrder_Button_15_Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MinOrder_Button_20_Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Howoften_Button_Xpath="//android.view.View[@index='0']/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String Howoften_Weekely_Button_Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Howoften_Daily_Button_Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Howoften_None_Button_Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurence_Button_Xpath="//android.view.View[@index='0']/android.view.View[@index='3']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String Occurence_1_Button_Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurence_2_Button_Xpath="//android.view.View[@text='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurence_3_Button_Xpath="//android.view.View[@text='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurence_4_Button_Xpath="//android.view.View[@text='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Banner_selection_1_Button_Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String Banner_selection_2_Button_Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String Info_Fine_print_Button_Xpath="//android.view.View[@index='5']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='0']";
	public String Info_Fine_print_Details_Button_Xpath="//android.view.View[@index='5']/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='0']";
	public String Preview_Button_Xpath="//android.view.View[@index='6']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String Publish_Button_Xpath="//android.view.View[@index='7']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String Discard_Button_Xpath="//android.view.View[@index='8']/android.view.View[@index='0']/android.widget.Button[@index='0']";

	//keywords
	public String Print_Info_Name_Keys="Code1";
	public String Print_Info_description_keywords="Code1";


	//Flash Cupon Xpath
	public String RedeemFrom_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	
	public String EmptyTables_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String EmptyTables_2_Flash_Button__Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String EmptyTables_3_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String EmptyTables_4_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String EmptyTables_5_Flash_Button__Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String EmptyTables_10_Flash_Button__Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String EmptyTables_15_Flash_Button__Xpath="//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	
	public String MaxPartySize_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String MaxPartySize_3_Flash_Button__Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MaxPartySize_5_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MaxPartySize_7_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MaxPartySize_10_Flash_Button__Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	
	public String Discount_Type_Percentage_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	
	public String Discount_Type_Percentage_Number_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.widget.Button[@index='2']";
	public String Discount_Type_Percentage_Number_15_Flash_Button__Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_20_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_25_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_30_Flash_Button__Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_35_Flash_Button__Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_40_Flash_Button__Xpath="//android.view.View[@index='5']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_45_Flash_Button__Xpath="//android.view.View[@index='6']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_50_Flash_Button__Xpath="//android.view.View[@index='7']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_70_Flash_Button__Xpath="//android.view.View[@index='8']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Discount_Type_Percentage_Number_Cuts_Flash_Button__Xpath="//android.view.View[@index='9']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	
	public String MinOrder_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String MinOrder_None_Flash_Button__Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MinOrder_10_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MinOrder_15_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String MinOrder_20_Flash_Button__Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	
	public String HowOften_Flash_Button__Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String HowOften_Weekly_Flash_Button__Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String HowOften_Daily_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String HowOften_Flash_None_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
			
	public String Occurences_Flash_Button__Xpath="//android.view.View[@index='3']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.widget.Button[@index='2']";
	public String Occurences_2_Flash_Button__Xpath="//android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurences_4_Flash_Button__Xpath="//android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurences_8_Flash_Button__Xpath="//android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurences_12_Flash_Button__Xpath="//android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	public String Occurences_16_Flash_Button__Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.RadioButton[@index='1']/android.widget.Button[@index='1']";
	
	public String BanerSelection_1_Flash_Button__Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='1']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String BanerSelection_2_Flash_Button__Xpath="//android.view.View[@index='4']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='2']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	
	public String InfoFinePrint_AllDay_Flash_Button__Xpath="//android.view.View[@index='5']/android.view.View[@index='1']/android.view.View[@index='0']/android.widget.Button[@index='0']";
	public String InfoFinePrint_HappyHours_Flash_Button__Xpath="//android.view.View[@index='5']/android.view.View[@index='1']/android.view.View[@index='1']/android.widget.Button[@index='0']";
	
	public String InfoFinePrint_Name_Flash_Button__Xpath="//android.view.View[@index='5']/android.view.View[@index='2']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='0']";
	public String InfoFinePrint_Description_Flash_Button__Xpath="//android.view.View[@index='5']/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.view.View[@index='0']/android.widget.EditText[@index='0']";
	
	
	
	
	
	//Flash Cupon SendKeys
	public String InfoFinePrint_Name_Flash_Button__Keys="Flash Cupon 1";
	public String InfoFinePrint_Description_Flash_Button__Keys="Have the  Some minds are like soup in a poor restaurant better left unstirred. In a restaurant one is both observed and unobserved. It's easier to be faithful to a restaurant than it is to a woman. Never eat in a restaurant that ha ";
	
	
	
}
